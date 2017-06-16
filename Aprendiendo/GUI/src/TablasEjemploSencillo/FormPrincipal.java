package TablasEjemploSencillo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class FormPrincipal extends JFrame {

    JPanel pc;

    public FormPrincipal() {
        super("Ejemplo de tabla");

        pc = new JPanel(new BorderLayout());
        setPreferredSize(new Dimension(600, 400));
        setContentPane(pc);

        colocarTabla();

        // setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void colocarTabla() {
        String[] nombresColumnas = {"Nombre",
            "Primer apellido",
            "Segundo apellido",
            "Altura (cm)",
            "Fumador"};
        Object[][] datos = {
            {"Rigoberto1", "Gomez", "Gonzalez", 180, false},
            {"Rigoberto2", "Gomez", "Gonzalez", 180, false},
            {"Rigoberto3", "Gomez", "Gonzalez", 180, true},
            {"Rigoberto4", "Gomez", "Gonzalez", 180, true},
            {"Rigoberto5", "Gomez", "Gonzalez", 180, false},
            {"Rigoberto6", "Gomez", "Gonzalez", 180, true},
            {"Rigoberto7", "Gomez", "Gonzalez", 180, true},
            {"Rigoberto8", "Gomez", "Gonzalez", 180, false},
            {"Rigoberto9", "Gomez", "Gonzalez", 180, false},
            {"Rigoberto10", "Gomez", "Gonzalez", 180, true}
        };

        JTable tabla = new JTable(datos, nombresColumnas);
        tabla.setBackground(Color.yellow);

        JScrollPane panelDes = new JScrollPane(tabla);
        add(panelDes);
    }

}
