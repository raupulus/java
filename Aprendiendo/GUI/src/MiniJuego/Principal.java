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
    long num1,num2,valor;
    long suma_prog;
    int intentos=0,aciertos=0,fallas=0;
       
    public static void main(String[] args) {
        new Principal();
    }
    public Principal() {
        //Creo botones para activar
        btnComprueba= new JButton("Comprueba");
        btnComprueba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Principal alea=new Principal();				
                valor=Long.parseLong(JOptionPane.showInputDialog("Añadir un valor"));
                alea.setValor(valor);
                txtResultado.setText(String.valueOf(alea.getValor()));//valor del usuario
                suma_prog=Long.parseLong(txtNum1.getText())+ Long.parseLong(txtNum2.getText());

                if(suma_prog==alea.getValor()){
                    aciertos+=1;
                    intentos+=1;
                    txtIntentos.setText(String.valueOf(intentos));
                    txtAciertos.setText(String.valueOf(aciertos));
                }else{
                    fallas+=1;
                    intentos+=1;
                    txtIntentos.setText(String.valueOf(intentos));
                    txtFallas.setText(String.valueOf(fallas));
                }
            }
        });

       //Creo botones para Comprobar 
       btnComprueba= new JButton("Comprobar");
       btnComprueba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Principal alea=new Principal();				
                valor=Long.parseLong(JOptionPane.showInputDialog("Introduce valor"));
                alea.setValor(valor);
                txtResultado.setText(String.valueOf(alea.getValor()));//valor del usuario
                suma_prog=Long.parseLong(txtNum1.getText())+ Long.parseLong(txtNum2.getText());

                if(suma_prog==alea.getValor()){
                    aciertos+=1;
                    intentos+=1;
                    txtIntentos.setText(String.valueOf(intentos));
                    txtAciertos.setText(String.valueOf(aciertos));
                }else{
                    fallas+=1;
                    intentos+=1;
                    txtIntentos.setText(String.valueOf(intentos));
                    txtFallas.setText(String.valueOf(fallas));
                }
            }
        });
       
       //Creo botón para salir
       btnSalir= new JButton("Cerrar");
       btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
    
    //Método para generar números aleatorios
    public long numAleatorio(){
        return (long)(Math.random()*1000);
    }
}
