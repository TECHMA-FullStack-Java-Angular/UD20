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
	private int intentos = 0;
	private JToggleButton b;
	JToggleButton[][] cartas = new JToggleButton[4][4];

	/**
	 * Create the frame.
	 */
	public Ejercicio9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 550);
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
		
		
		//crear cartas
		int px = 60;
		int py = 60;
		final int SIZE = 90;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				cartas[j][i] = new JToggleButton("");
				cartas[j][i].setBounds(px, py, SIZE, SIZE);
				contentPane.add(cartas[j][i]);
				listaBotones.add(cartas[j][i]);
				cartas[j][i].setEnabled(true);
				cartas[j][i].addActionListener(aL);
				
				px += 95;
			}
			px = 60;
			py += 95;
		}

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
		

		//Establece colores a las cartas
		for (int i = 0; i < listaBotones.size(); i++) {
		    listaBotones.get(i).setBackground(colores.get(i));
		    listaBotones.get(i).setSelected(true);
		}
		
		

		setVisible(true);
	}

	ActionListener aL = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			b = (JToggleButton) e.getSource();
		

			if (b.isSelected()) {
				
				
				selectedButtons.add(listaBotones.indexOf(b));
				
				
					
					

				
				
				
				

			}


		}
	};
}

