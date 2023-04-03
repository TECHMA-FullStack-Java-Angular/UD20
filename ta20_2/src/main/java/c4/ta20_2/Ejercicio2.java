package c4.ta20_2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String textoUser = "";
	private JLabel lblNewLabel = new JLabel();
	private JButton btn1 = new JButton();
	private JButton btn2 = new JButton();



	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setTitle("Ventana interactiva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setVisible(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Has pulsado: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(69, 162, 340, 61);
		contentPane.add(lblNewLabel);
		
		btn1 = new JButton("Boton 1");
		btn1.addActionListener(aL); 
		btn1.setBackground(new Color(194, 180, 205));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(69, 72, 127, 42);
		contentPane.add(btn1);
		
		btn2 = new JButton("Boton 2");
		btn2.addActionListener(aL);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBackground(new Color(194, 180, 205));
		btn2.setBounds(251, 72, 127, 42);
		contentPane.add(btn2);
	}
	
	//creamos el listener
		ActionListener aL = new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn1) {
					textoUser= "Boton 1";
				}else if (e.getSource() == btn2){
					textoUser= "Boton 2";
				}
				
				lblNewLabel.setText("Has pulsado: " + textoUser); // actualizar el texto de la etiqueta
				
			}
				};
	
}
