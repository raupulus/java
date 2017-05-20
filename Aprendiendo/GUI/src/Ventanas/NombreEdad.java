package Ventanas;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.awt.Dimension;

import java.awt.FlowLayout;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class NombreEdad extends JFrame implements ActionListener {

    private JButton btnAceptar;

    private JButton btnCancelar;

    JTextField txtNombre;

    JTextField txtEdad;

    public static void main(String[] args) {

        NombreEdad vp = new NombreEdad();

    }


}
