package c4.ta20_9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BienvenidoFrame extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public BienvenidoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 438);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 223, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al Juego de Memoria");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 26));
		lblNewLabel.setBounds(80, 46, 486, 132);
		contentPane.add(lblNewLabel);
		
		JButton btnColores = new JButton("Jugar memory  colores");
		btnColores.setForeground(new Color(64, 0, 128));
		btnColores.setBackground(new Color(155, 128, 230));
		btnColores.setFont(new Font("Ubuntu", Font.BOLD, 18));
		btnColores.addActionListener(listenerColores);
		btnColores.setBounds(45, 263, 267, 53);
		contentPane.add(btnColores);
		
		JButton btnImagenes = new JButton("Jugar memory  imagenes");
		btnImagenes.setForeground(new Color(64, 0, 128));
		btnImagenes.setBackground(new Color(155, 128, 230));
		btnImagenes.addActionListener(listenerImagenes);
		btnImagenes.setFont(new Font("Ubuntu", Font.BOLD, 18));
		btnImagenes.setBounds(336, 263, 267, 53);
		contentPane.add(btnImagenes);
		
		setVisible(true);
	}


        ActionListener listenerColores =new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Llamada al ejercicio con colores + otros extras
				Ejercicio9 frame = new Ejercicio9();
			}
        };
        
        ActionListener listenerImagenes =new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Llamada al ejercicio con images
				Ejercicio9_image frame2 = new Ejercicio9_image();
			}
        };
}
