package TableDemoConHilos;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 * TableDemo is just like SimpleTableDemo, except that it uses a custom
 * TableModel.
 */
public class TableDemo extends JPanel {

    private final boolean DEBUG = true;
    private static int contador = 0;

    public TableDemo() {
        super(new GridLayout(1, 0));

        JTable table = new JTable(new MyTableModel());
        // table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }

    class MyTableModel extends AbstractTableModel {

        private String[] columnNames = {"First Name",
            "Last Name",
            "Sport",
            "# of Years",
            "Vegetarian"};
        private Object[][] data = {
            {"Kathy", "Smith",
                "Snowboarding", new Integer(5), new Boolean(false)},
            {"John", "Doe",
                "Rowing", new Integer(3), new Boolean(true)},
            {"Sue", "Black",
                "Knitting", new Integer(2), new Boolean(false)},
            {"Jane", "White",
                "Speed reading", new Integer(20), new Boolean(true)},
            {"Joe", "Brown",
                "Pool", new Integer(10), new Boolean(false)}
        };

        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            return data.length;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }

        /*
         * JTable uses this method to determine the default renderer/
         * editor for each cell.  If we didn't implement this method,
         * then the last column would contain text ("true"/"false"),
         * rather than a check box.
         */
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        /*
         * Don't need to implement this method unless your table's
         * editable.
         */
        public boolean isCellEditable(int row, int col) {
            //Note that the data/cell address is constant,
            //no matter where the cell appears onscreen.
            if (col < 2) {
                return false;
            } else {
                return true;
            }
        }

        /*
         * Don't need to implement this method unless your table's
         * data can change.
         */
        public void setValueAt(Object value, int row, int col) {
            if (DEBUG) {
                System.out.println("Setting value at " + row + "," + col
                        + " to " + value
                        + " (an instance of "
                        + value.getClass() + ")");
            }

            data[row][col] = value;
            fireTableCellUpdated(row, col);

            if (DEBUG) {
                System.out.println("New value of data:");
                printDebugData();
            }
        }

        private void printDebugData() {
            int numRows = getRowCount();
            int numCols = getColumnCount();

            for (int i = 0; i < numRows; i++) {
                System.out.print("    row " + i + ":");
                for (int j = 0; j < numCols; j++) {
                    System.out.print("  " + data[i][j]);
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    private static JTextArea createAndShowGUI(int y) {

        info();

        //Create and set up the window.
        JFrame frame = new JFrame("TableDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(0,y);

        //Create and set up the content pane.
        //TableDemo newContentPane = new TableDemo();
        //newContentPane.setOpaque(true); //content panes must be opaque
        //frame.setContentPane(newContentPane);
        JTextArea ta = new JTextArea();
        
        ta.setPreferredSize(new Dimension(300, 300));
        ta.append(getInfo());
        frame.add(ta);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        return ta;
    }

    public static void main(String[] args) {
        info();
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                info();
                createAndShowGUI(0).append("Principal");
              
            }
        });
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                info();
                createAndShowGUI(0).append("Principal");
              
            }
        });
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Primer hilo");
                JTextArea ta = createAndShowGUI(400);
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TableDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ta.append("\nContando ovejas: " + i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("Segundo hilo");
                JTextArea ta = createAndShowGUI(800);
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TableDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ta.append("\nContando ranitas: " + i);
                }
            }
        }).start();

        info();
    }

    public static void info() {
        final Thread t = Thread.currentThread();
        final StackTraceElement e = t.getStackTrace()[2];
        final String s = e.getClassName();
        System.out.println("Hilo:" + t + " "
                + s.substring(s.lastIndexOf('.') + 1, s.length())
                + "." + e.getMethodName());
    }

    public static String getInfo() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

}
