package c4.ta20_3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ejercicio3 extends JFrame {
	
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private JPanel contentPane;
	private Integer contador1 = 0;
	private Integer contador2 = 0;
	private JLabel lblNewLabel = new JLabel();
	private JButton btn1 = new JButton();
	private JButton btn2 = new JButton();



	/**
	 * Create the frame.
	 * @return 
	 * @return 
	 */
	public  ejercicio3() {
		
		setTitle("Ventana más interactiva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setVisible(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Contador de pulsados");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 163, 507, 61);
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
		btn2.setBounds(348, 72, 127, 42);
		contentPane.add(btn2);
	}
	
	//creamos el listener
		ActionListener aL = new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn1) {
					contador1 +=1;
				}else if (e.getSource() == btn2){
					contador2 += 1;
				}
				
				lblNewLabel.setText("Boton 1: " + contador1 + " veces        Boton 2 :"+contador2+" veces"); // actualizar el texto de la etiqueta
				
			}
				};
	
}
