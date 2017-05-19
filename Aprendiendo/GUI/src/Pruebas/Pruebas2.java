package Pruebas;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

private JButton btn;
private JTextArea textarea;

public class Pruebas2 extends JPanel{
    super("Hello World");
        
    setLayout(new BorderLayout());
    
    btn = new JButton("click me");
    textArea = new JtextArea();
    
    btn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            textArea.append("Hello\n");
        }
    });

    add(textArea, BorderLayout.CENTER);
    add(btn, BorderLayout.SOUTH);

    setSize(600,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(True);
}
