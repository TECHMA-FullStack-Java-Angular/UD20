package c4.ta20_9;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;

public class Ejercicio9 extends JFrame {

	private JPanel contentPane;
	private JToggleButton tglbtn1;
	private JToggleButton tglbtn2;
	private JToggleButton tglbtn3;
	private JToggleButton tglbtn4;
	private JToggleButton tglbtn5;
	private JToggleButton tglbtn6;
	private JToggleButton tglbtn7;
	private JToggleButton tglbtn8;
	private JToggleButton tglbtn9;
	private JToggleButton tglbtn10;
	private JToggleButton tglbtn11;
	private JToggleButton tglbtn12;
	private JToggleButton tglbtn13;
	private JToggleButton tglbtn14;
	private JToggleButton tglbtn15;
	private JToggleButton tglbtn16;
	private ArrayList<Integer> selectedButtons;
	private ArrayList<Color> colores;
	private ArrayList<JToggleButton> listaBotones;
	private int parejasEncontradas;
	private JToggleButton botonAnterior;
	private int intentos=0;

	/**
	 * Create the frame.
	 */
	public Ejercicio9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Inicializar las variables
		colores = new ArrayList<Color>();
		listaBotones = new ArrayList<JToggleButton>();
		selectedButtons = new ArrayList<>();
		parejasEncontradas = 0;
		botonAnterior = null;

		// Agregar los colores de las parejas
		colores.add(Color.RED);
		colores.add(Color.RED);
		colores.add(Color.BLUE);
		colores.add(Color.BLUE);
		colores.add(Color.GREEN);
		colores.add(Color.GREEN);
		colores.add(Color.YELLOW);
		colores.add(Color.YELLOW);
		colores.add(Color.PINK);
		colores.add(Color.PINK);
		colores.add(Color.ORANGE);
		colores.add(Color.ORANGE);
		colores.add(Color.MAGENTA);
		colores.add(Color.MAGENTA);
		colores.add(Color.CYAN);
		colores.add(Color.CYAN);

		// Barajar los colores
		Collections.shuffle(colores);

		tglbtn1 = new JToggleButton("");
		tglbtn1.setBackground(Color.LIGHT_GRAY);
		tglbtn1.setBounds(35, 46, 63, 55);
		tglbtn1.addActionListener(aL);
		contentPane.add(tglbtn1);
		listaBotones.add(tglbtn1);

		tglbtn2 = new JToggleButton("");
		tglbtn2.setBackground(Color.LIGHT_GRAY);
		tglbtn2.setBounds(122, 46, 63, 55);
		tglbtn2.addActionListener(aL);
		contentPane.add(tglbtn2);
		listaBotones.add(tglbtn2);

		tglbtn3 = new JToggleButton("");
		tglbtn3.setBackground(Color.LIGHT_GRAY);
		tglbtn3.setBounds(220, 46, 63, 55);
		tglbtn3.addActionListener(aL);
		contentPane.add(tglbtn3);
		listaBotones.add(tglbtn3);

		tglbtn4 = new JToggleButton("");
		tglbtn4.setBackground(Color.LIGHT_GRAY);
		tglbtn4.setBounds(313, 46, 63, 55);
		tglbtn4.addActionListener(aL);
		contentPane.add(tglbtn4);
		listaBotones.add(tglbtn4);

		tglbtn5 = new JToggleButton("");
		tglbtn5.setBackground(Color.LIGHT_GRAY);
		tglbtn5.setBounds(35, 123, 63, 55);
		tglbtn5.addActionListener(aL);
		contentPane.add(tglbtn5);
		listaBotones.add(tglbtn5);

		tglbtn6 = new JToggleButton("");
		tglbtn6.setBackground(Color.LIGHT_GRAY);
		tglbtn6.setBounds(122, 123, 63, 55);
		tglbtn6.addActionListener(aL);
		contentPane.add(tglbtn6);
		listaBotones.add(tglbtn6);

		tglbtn7 = new JToggleButton("");
		tglbtn7.setBackground(Color.LIGHT_GRAY);
		tglbtn7.setBounds(220, 123, 63, 55);
		tglbtn7.addActionListener(aL);
		contentPane.add(tglbtn7);
		listaBotones.add(tglbtn7);

		tglbtn8 = new JToggleButton("");
		tglbtn8.setBackground(Color.LIGHT_GRAY);
		tglbtn8.setBounds(313, 123, 63, 55);
		tglbtn8.addActionListener(aL);
		contentPane.add(tglbtn8);
		listaBotones.add(tglbtn8);

		tglbtn9 = new JToggleButton("");
		tglbtn9.setBackground(Color.LIGHT_GRAY);
		tglbtn9.setBounds(35, 198, 63, 55);
		tglbtn9.addActionListener(aL);
		contentPane.add(tglbtn9);
		listaBotones.add(tglbtn9);

		tglbtn10 = new JToggleButton("");
		tglbtn10.setBackground(Color.LIGHT_GRAY);
		tglbtn10.setBounds(122, 198, 63, 55);
		tglbtn10.addActionListener(aL);
		contentPane.add(tglbtn10);
		listaBotones.add(tglbtn1);

		tglbtn11 = new JToggleButton("");
		tglbtn11.setBackground(Color.LIGHT_GRAY);
		tglbtn11.setBounds(220, 198, 63, 55);
		tglbtn11.addActionListener(aL);
		contentPane.add(tglbtn11);
		listaBotones.add(tglbtn11);

		tglbtn12 = new JToggleButton("");
		tglbtn12.setBackground(Color.LIGHT_GRAY);
		tglbtn12.setBounds(313, 198, 63, 55);
		tglbtn12.addActionListener(aL);
		contentPane.add(tglbtn12);
		listaBotones.add(tglbtn12);

		tglbtn13 = new JToggleButton("");
		tglbtn13.setBackground(Color.LIGHT_GRAY);
		tglbtn13.setBounds(35, 275, 63, 55);
		tglbtn13.addActionListener(aL);
		contentPane.add(tglbtn13);
		listaBotones.add(tglbtn13);

		tglbtn14 = new JToggleButton("");
		tglbtn14.setBackground(Color.LIGHT_GRAY);
		tglbtn14.setBounds(122, 275, 63, 55);
		tglbtn14.addActionListener(aL);
		contentPane.add(tglbtn14);
		listaBotones.add(tglbtn14);

		tglbtn15 = new JToggleButton("");
		tglbtn15.setBackground(Color.LIGHT_GRAY);
		tglbtn15.setBounds(220, 275, 63, 55);
		tglbtn15.addActionListener(aL);
		contentPane.add(tglbtn15);
		listaBotones.add(tglbtn15);

		tglbtn16 = new JToggleButton("");
		tglbtn16.setBackground(Color.LIGHT_GRAY);
		tglbtn16.setBounds(313, 275, 63, 55);
		tglbtn16.addActionListener(aL);
		contentPane.add(tglbtn16);
		listaBotones.add(tglbtn16);
		
		

		setVisible(true);
	}

	ActionListener aL = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
		    JToggleButton boton = (JToggleButton) e.getSource();
	        int index = listaBotones.indexOf(boton);
	        Color color = colores.get(index);

	        boton.setBackground(color);
	        boton.setEnabled(false);
	        selectedButtons.add(index);

	        if (selectedButtons.size() == 2) {
	            intentos++;
	            if (colores.get(selectedButtons.get(0)).equals(colores.get(selectedButtons.get(1)))) {
	                parejasEncontradas++;
	                if (parejasEncontradas == 8) {
	                    // Mostrar mensaje de victoria
	                    System.out.println("¡Has ganado en " + intentos + " intentos!");
	                }
	            } else {
	                botonAnterior.setEnabled(true);
	                botonAnterior.setBackground(Color.LIGHT_GRAY);
	                boton.setEnabled(true);
	                boton.setBackground(Color.LIGHT_GRAY);
	            }
	            selectedButtons.clear();
	            botonAnterior = null;
	        } else {
	            botonAnterior = boton;
	        }
	    }
	};
}