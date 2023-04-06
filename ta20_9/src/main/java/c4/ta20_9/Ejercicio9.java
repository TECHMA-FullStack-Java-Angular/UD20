package c4.ta20_9;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Ejercicio9 extends JFrame {

	private JPanel contentPane;
	private int selectedButtons;
	private ArrayList<Color> colores;
	private ArrayList<JToggleButton> listaBotones;

	//ArrayList<Icon> iconList = new ArrayList<Icon>();
	private JToggleButton botonSeleccionado1 = new JToggleButton();
	private JToggleButton botonSeleccionado2 = new JToggleButton();
	private int parejasEncontradas;
	private Timer timer = new Timer();
	private int intentos = 0;
	private JToggleButton b;
	private JLabel lblIntentos = new JLabel();
	JToggleButton[][] cartas = new JToggleButton[4][4];

	// Crear el borde
	Border blackBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.GRAY);

	/**
	 * Create the frame.
	 */
	public Ejercicio9() {
		setTitle("Memory Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 682);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232, 232, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblIntentos = new JLabel("Intentos: " + intentos);
		lblIntentos.setFont(new Font("Calibri", Font.BOLD, 16));
		lblIntentos.setBounds(34, 458, 404, 33);
		contentPane.add(lblIntentos);

		JLabel lblNewLabel = new JLabel("Encontra las parejas de colores");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(80, 30, 346, 14);
		contentPane.add(lblNewLabel);

		// Inicializar las variables
		colores = new ArrayList<Color>();
		listaBotones = new ArrayList<JToggleButton>();
		selectedButtons = 0;
		parejasEncontradas = 0;

		// crear cartas
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
				cartas[j][i].setBackground(Color.lightGray);
				cartas[j][i].setBorder(blackBorder);
				

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
		
		//Añadir icono a los botones
//		iconList = new ArrayList<Icon>();
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/binoculars.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/for-you.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/idea.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/user-female.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/hand-cursor.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/icons8-cup.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/key.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/music.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/binoculars.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/for-you.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/idea.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/user-female.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/hand-cursor.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/icons8-cup.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/key.png"));
//		iconList.add(new ImageIcon("https://img.icons8.com/arcade/64/null/music.png"));

		// Asigno colores a los botones y quito visibilidad de background
		for (int i = 0; i < listaBotones.size(); i++) {
			listaBotones.get(i).setBackground(colores.get(i));
			listaBotones.get(i).setOpaque(false);
			
//			listaBotones.get(i).setIcon(iconList.get(i));
		}

		setVisible(true);
	}

	ActionListener aL = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			b = (JToggleButton) e.getSource();

			// hago visible el background
			b.setOpaque(true);
			b.setSelected(false);
			
			
			selectedButtons++;
			if (selectedButtons < 2) {
				botonSeleccionado1 = b;
				botonSeleccionado1.setEnabled(false);
			}

			// TODO no dejar seleccionar dos veces el mismo boton
			if (selectedButtons == 2 ) {
				botonSeleccionado2 = b;
				intentos++;
				lblIntentos.setText("Intentos: " + intentos);
				// Desabilita los botones mientras los seleccionados estan abiertos
				for (int i = 0; i < listaBotones.size(); i++) {
					listaBotones.get(i).setEnabled(false);
				}

				if (botonSeleccionado1.getBackground().equals(botonSeleccionado2.getBackground())) {
					
					botonSeleccionado2.setEnabled(false);

//					botonSeleccionado1.setText("¡Match!");
//					botonSeleccionado2.setText("¡Match!");

					botonSeleccionado1.setBorder(null);
					botonSeleccionado2.setBorder(null);
					botonSeleccionado1.setOpaque(false);
					botonSeleccionado2.setOpaque(false);

					botonSeleccionado1 = null;
					botonSeleccionado2 = null;
					selectedButtons = 0;
					parejasEncontradas++;
					// Desabilita los botones mientras los seleccionados estan abiertos
					for (int i = 0; i < listaBotones.size(); i++) {
						listaBotones.get(i).setEnabled(true);
					}

					if (parejasEncontradas == 8) {
						lblIntentos.setText("¡Felicidades! ¡Ganaste en " + intentos + " intentos!");
						JOptionPane.showMessageDialog(rootPane, "¡Enhorabuena!");
					}
				} else {

					
					timer.schedule(new TimerTask() {
						@Override
						public void run() {
							botonSeleccionado1.setSelected(false);
							botonSeleccionado2.setSelected(false);
							botonSeleccionado1.setOpaque(false);
							botonSeleccionado2.setOpaque(false);

							botonSeleccionado1.setEnabled(true);
							botonSeleccionado2.setEnabled(true);
							botonSeleccionado1 = null;
							botonSeleccionado2 = null;
							selectedButtons = 0;
							// Desabilita los botones mientras los sseleccionados estan abiertos
							for (int i = 0; i < listaBotones.size(); i++) {
								listaBotones.get(i).setEnabled(true);
							}
						}
					}, 1500);

				}
				
			}

		}
	};
}