package Videos;

import javax.swing.SwingUtilities;

/**
 * BorderLayout y TextArea
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class App {

    public static void main(String[] args) {

        //Con Runnable agregamos otro hilo
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });
    }
}
