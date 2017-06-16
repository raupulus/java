package Ejemplos.Layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class MiVentana extends JFrame {

    static final ArrayList<String> titulos;
    static final int ANCHOBOTON=100;
    static final int ALTOBOTON=100;
    static final int MARGEN=50;
    private JButton[] botones;
    private JTextArea t;
    private JPanel p;
    Dimension d;
    
    
    static {
         titulos = new ArrayList<>();
         titulos.addAll(Arrays.asList(  "A","B","C","D",
                                        "E", "F","G","H",
                                        "I","J","K","L",
                                        "M","N","O","P"));
    }
            
    public MiVentana() {

        super("BOGGLE");
        setLayout(new FlowLayout());
        
        // setPreferredSize();
        setBounds(0, 0, (ANCHOBOTON*4)+MARGEN, (ALTOBOTON*4)+MARGEN);
        setMinimumSize( new Dimension(ANCHOBOTON*4, ALTOBOTON*4) );
        
        // Panel para los botones
        p=new JPanel();
        
        // Tamaño botones
        Dimension d = new Dimension(ANCHOBOTON,ALTOBOTON);

        botones = new JButton[titulos.size()];
        for (int i = 0; i < botones.length; i++) {
            botones[i] = new JButton(titulos.get(i));  
            botones[i].setPreferredSize(d); 
            Font font = botones[i].getFont();
            float size = font.getSize() + ANCHOBOTON/2;
            botones[i].setFont( font.deriveFont(size) );
            add(botones[i]);
        } 
           
        t = new JTextArea();

        
        // add(p, BorderLayout.NORTH);
        // add(new JScrollPane(t), BorderLayout.CENTER);
        
        // Listener para todos los botones
        ActionListener al = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton b = (JButton)e.getSource();
                    b.setBackground(Color.pink);
                    b.setOpaque(true);
                    b.setEnabled(false);
                }
            };
        
        for (JButton b:botones)
            b.addActionListener(al);

    }

}
