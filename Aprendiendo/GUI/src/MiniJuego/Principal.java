package MiniJuego;

/**
 * Juego de adivinar la suma de dos números generados aleatoriamente Constará
 * generar dos números y luego pedir un valor introducido
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal extends JFrame {

    //Los atributos para controles, campos de texto y botones
    final private JTextField txtNum1, txtNum2, txtResultado, txtIntentos, txtAciertos, txtFallas;
    private JButton btnActiva, btnComprueba;
    private JButton btnSalir;
    
    //Atributos para suma,intentos y valores
    private long num1,num2,valor;
    private long suma_prog;
    private int intentos=0,aciertos=0,fallas=0;
    
    public Principal() {

    }
}
