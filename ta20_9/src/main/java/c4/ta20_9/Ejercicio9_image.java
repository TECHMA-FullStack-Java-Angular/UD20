package c4.ta20_9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.MalformedURLException;
import java.net.URL;
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

public class Ejercicio9_image extends JFrame {

	private JPanel contentPane;
	private int selectedButtons;

	private ArrayList<JToggleButton> listaBotones;

	ArrayList<Icon> iconList = new ArrayList<Icon>();
	ArrayList<Icon> iconListDoble = new ArrayList<Icon>();

	private JToggleButton botonSeleccionado1 = new JToggleButton();
	private JToggleButton botonSeleccionado2 = new JToggleButton();
	private int parejasEncontradas;
	private Timer timer = new Timer();
	private int intentos = 0;
	private JToggleButton b;
	private JLabel lblIntentos = new JLabel();
	JToggleButton[][] cartas = new JToggleButton[4][4];

	private URL url1;
	private URL url2;
	private URL url3;
	private URL url4;
	private URL url5;
	private URL url6;
	private URL url7;
	private URL url8;


	// Crear el borde
	Border blackBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.GRAY);

	/**
	 * Create the frame.
	 */
	public Ejercicio9_image() {
		setTitle("Memory Game");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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

		JLabel lblNewLabel = new JLabel("Encontra las parejas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(80, 24, 346, 20);
		contentPane.add(lblNewLabel);

		// Inicializar las variables

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
				cartas[j][i].setBorder(blackBorder);

				px += 95;
			}
			px = 60;
			py += 95;
		}

		// añado los enlaces de los iconos con un try/catch por si no estan disponibles
		try {
			url1 = new URL("https://img.icons8.com/arcade/64/null/binoculars.png");
			url2 = new URL("https://img.icons8.com/arcade/64/null/for-you.png");
			url3 = new URL("https://img.icons8.com/arcade/64/null/idea.png");
			url4 = new URL("https://img.icons8.com/arcade/64/null/user-female.png");
			url5 = new URL("https://img.icons8.com/arcade/64/null/hand-cursor.png");
			url6 = new URL("https://img.icons8.com/arcade/64/null/icons8-cup.png");
			url7 = new URL("https://img.icons8.com/arcade/64/null/key.png");
			url8 = new URL("https://img.icons8.com/arcade/64/null/music.png");
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Como no puedo añadir iconos por enlace, los establezco como imageIcon y
		// despues lo paso a la lista
		ImageIcon icon1 = new ImageIcon(url1);
		iconList.add(icon1);
		ImageIcon icon2 = new ImageIcon(url2);
		iconList.add(icon2);
		ImageIcon icon3 = new ImageIcon(url3);
		iconList.add(icon3);
		ImageIcon icon4 = new ImageIcon(url4);
		iconList.add(icon4);
		ImageIcon icon5 = new ImageIcon(url5);
		iconList.add(icon5);
		ImageIcon icon6 = new ImageIcon(url6);
		iconList.add(icon6);
		ImageIcon icon7 = new ImageIcon(url7);
		iconList.add(icon7);
		ImageIcon icon8 = new ImageIcon(url8);
		iconList.add(icon8);
		

		// duplico la lista
		iconListDoble.addAll(iconList);
		iconListDoble.addAll(iconList);

		// Mezclo los iconos
		Collections.shuffle(iconListDoble);
		

		//Añado los iconos como SelectedIcon
		for (int i = 0; i < iconListDoble.size(); i++) {
			listaBotones.get(i).setSelectedIcon(iconListDoble.get(i));
			
	
		}

		setVisible(true);
	}

	ActionListener aL = new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			b = (JToggleButton) e.getSource();
			
			//TODO quedo pendiente lograr sobrescribir el metodo setEnabled para que no cambie 
			//el color y mantenga el icono bien visible
			
			//Selecciono el selectedIcon como Icon
			b.setIcon(b.getSelectedIcon());
			b.setSelected(true);
//			b.setEnabled(false);//comentar para probar el true
			b.setEnabled(true);//si marco setEnabled(true) se ve mejor el icono. Intente editar el metodo pero no lo logre

//			b.setEnabled(true);//descomentar para probar
			//añado seleccion al marcador
			selectedButtons++;
			
			
			if (selectedButtons < 2) {
				botonSeleccionado1 = b;
			}

			//guardamos el segundo boton seleccionado, contamos el intento y reflejamos en pantalla
			if (selectedButtons == 2) {
				botonSeleccionado2 = b;
//				botonSeleccionado2.setEnabled(false);//comentar para probar el true
				botonSeleccionado2.setEnabled(true);//descomentar para probar
				intentos++;
				lblIntentos.setText("Intentos: " + intentos);

				// Desabilita los botones mientras los seleccionados estan abiertos; he puesto para no desabilitar los botones 
				//seleccionados para ser más visible en caso de no haber puesto el enabled(true)
				for (int i = 0; i < listaBotones.size(); i++) {
					if (listaBotones.get(i) != botonSeleccionado1 && listaBotones.get(i) != botonSeleccionado2) {
						listaBotones.get(i).setEnabled(false);
					}

				}

				//si son parejas, eliminamos el icono y el borde para hacer efecto eliminado
				if (botonSeleccionado1.getIcon() == botonSeleccionado2.getIcon()) {

					botonSeleccionado1.setEnabled(false);
					botonSeleccionado2.setEnabled(false);
					botonSeleccionado1.setIcon(null);
					botonSeleccionado2.setIcon(null);
					botonSeleccionado1.setBackground(Color.white);
					botonSeleccionado2.setBackground(Color.white);

					botonSeleccionado1.setBorder(null);
					botonSeleccionado2.setBorder(null);
					;

					//reseteamos botones y sumamos la pareja encontrada
					botonSeleccionado1 = null;
					botonSeleccionado2 = null;
					selectedButtons = 0;
					parejasEncontradas++;
					
					// habilita los botones para volver a seleccionar
					for (int i = 0; i < listaBotones.size(); i++) {
						listaBotones.get(i).setEnabled(true);
						
				
					}

					//Mensaje de felicitacion en caso encuentre todos pares
					if (parejasEncontradas == 8) {
						lblIntentos.setText("¡Felicidades! ¡Ganaste en " + intentos + " intentos!");
						JOptionPane.showMessageDialog(rootPane, "¡Enhorabuena!");
					}
				} else {

					//si no son parejas, pongo un timer para que el jugador pueda memorizarlas y vuelvo 
					//a quitar el icono, deseleccionar, y resetear variables
					timer.schedule(new TimerTask() {
						@Override
						public void run() {
							
							botonSeleccionado1.setSelected(false);
							botonSeleccionado2.setSelected(false);
							botonSeleccionado1.setIcon(null);
							botonSeleccionado2.setIcon(null);

							botonSeleccionado1.setEnabled(true);
							botonSeleccionado2.setEnabled(true);
							botonSeleccionado1 = null;
							botonSeleccionado2 = null;
							selectedButtons = 0;
							
							// habilita los botones para volver a seleccionar
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