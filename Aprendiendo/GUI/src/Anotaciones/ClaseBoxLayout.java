package Anotaciones;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */
public class ClaseBoxLayout {

    private void setupLayoutManager() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(text1);
        this.add(text2);
        this.add(text3);
        this.add(text4);
        this.add(text5);
    }
    
    private void setupLayoutManager() {
	this.setLayout(new BorderLayout());
	this.add(text1, BorderLayout.PAGE_START);
	this.add(text2, BorderLayout.LINE_START);
	this.add(text3, BorderLayout.CENTER);
	this.add(text4, BorderLayout.LINE_END);
	this.add(text5, BorderLayout.PAGE_END);
}
}
