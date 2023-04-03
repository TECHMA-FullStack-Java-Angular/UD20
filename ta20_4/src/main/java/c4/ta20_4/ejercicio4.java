package c4.ta20_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ejercicio4 extends JFrame implements WindowListener {

	private JPanel contentPane;
	private JTextArea evento = new JTextArea();

	/**
	 * Create the frame.
	 */
	public ejercicio4() {
		setForeground(new Color(194, 180, 205));
		setTitle("Ventana oyente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel etiqueta = new JLabel("Eventos producidos:");
		etiqueta.setBounds(39, 11, 218, 20);
		etiqueta.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(etiqueta);

		evento = new JTextArea();
		evento.setBounds(43, 42, 354, 195);
		contentPane.add(evento);

		addWindowListener(this);
		
		setVisible(true);
	}

	// Implement WindowListener methods
	@Override
	public void windowOpened(WindowEvent e) {
		evento.append("Ventana abierta\n");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		evento.append("Ventana cerrándose...\n");
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		evento.append("Ventana cerrada\n");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		evento.append("Ventana activada\n");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		evento.append("Ventana desactivada\n");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		evento.append("Ventana minimizada\n");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		evento.append("Ventana restaurada\n");
	}
}
