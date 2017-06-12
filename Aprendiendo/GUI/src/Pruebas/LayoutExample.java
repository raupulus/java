package Pruebas;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Ejemplo de Layout
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class LayoutExample extends JPanel {
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JTextField text4;
    private JTextField text5;
    
    public LayoutExample() {
        initComponents();
        setupLayoutManager();
    }
    
    public void initComponents() {
        text1 = new JTextField("texto1", 10);
        text1 = new JTextField("texto2", 10);
        text1 = new JTextField("texto3", 10);
        text1 = new JTextField("texto4", 10);
        text1 = new JTextField("texto5", 10);
    }
    
    public void setupLayoutManager() {
        this.add(text1);
        this.add(text2);
        this.add(text3);
        this.add(text4);
        this.add(text5);
    }
}
