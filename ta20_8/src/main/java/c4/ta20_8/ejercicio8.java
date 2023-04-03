package c4.ta20_8;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ejercicio8 extends JFrame {

	private JPanel contentPane;

	private JTextField cantidad;
	private JTextField resultado;
	private JRadioButton rdbtnEurosPesetas = new JRadioButton();
	JRadioButton rdbtnPesetasEuros = new JRadioButton();
	ButtonGroup grupoMoneda = new ButtonGroup();
	JButton btnCalcular = new JButton();
	private JButton btnBorrar;

	/**
	 * Create the frame.
	 */
	public ejercicio8() {
		setTitle("Calculadora de cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCantidad = new JLabel("Cantidad a convertir");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCantidad.setBounds(10, 26, 197, 42);
		contentPane.add(lblCantidad);

		cantidad = new JTextField();
		cantidad.setBounds(205, 28, 96, 42);
		contentPane.add(cantidad);
		cantidad.setColumns(10);
		cantidad.addKeyListener(kA);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultado.setBounds(116, 208, 117, 42);
		contentPane.add(lblResultado);

		resultado = new JTextField();
		resultado.setColumns(10);
		resultado.setBounds(243, 210, 96, 42);
		contentPane.add(resultado);

		rdbtnEurosPesetas = new JRadioButton("Euros a Pesetas");
		rdbtnEurosPesetas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnEurosPesetas.setBounds(40, 98, 179, 23);
		grupoMoneda.add(rdbtnEurosPesetas);
		contentPane.add(rdbtnEurosPesetas);

		rdbtnPesetasEuros = new JRadioButton("Pesetas a Euros");
		rdbtnPesetasEuros.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnPesetasEuros.setBounds(255, 98, 152, 23);
		grupoMoneda.add(rdbtnPesetasEuros);
		contentPane.add(rdbtnPesetasEuros);

		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(aL);
		btnCalcular.setBackground(new Color(216, 207, 220));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCalcular.setBounds(155, 149, 117, 31);
		contentPane.add(btnCalcular);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBorrar.setBounds(59, 306, 89, 23);
		contentPane.add(btnBorrar);
		btnCalcular.addKeyListener(kA);
		btnBorrar.addActionListener(bL);
		
		setVisible(true);
		
	}

	ActionListener aL = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
			double cantidadAConvertir = Double.parseDouble(cantidad.getText());
			double resultadoConversion = 0.0;
			if (rdbtnEurosPesetas.isSelected()) {
				resultadoConversion = cantidadAConvertir * 166.386; // 1 euro = 166.386 pesetas
				resultado.setText(String.format("%.2f", resultadoConversion));
			} else if (rdbtnPesetasEuros.isSelected()) {
				resultadoConversion = cantidadAConvertir / 166.386; // 1 peseta = 0.006 euros
				resultado.setText(String.format("%.2f", resultadoConversion));
			}
			}catch (NumberFormatException eX) {
				JOptionPane.showMessageDialog(null, "No has introducido un valor numerico: " + eX.getMessage());
			}

		}
	};
	
	KeyAdapter kA = new KeyAdapter() {
	    @Override
	    public void keyPressed(KeyEvent e) {
	        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	            btnCalcular.doClick();
	            
	            
	        } else if (e.getKeyCode() == KeyEvent.VK_TAB && e.getModifiers() == KeyEvent.SHIFT_DOWN_MASK) {
	            // Selección del radio button "Pesetas a Euros" con Shift + Tab
	            rdbtnPesetasEuros.setSelected(true);
	        } else if (e.getKeyCode() == KeyEvent.VK_TAB) {
	            // Selección del radio button "Euros a Pesetas" con Tab
	            rdbtnEurosPesetas.setSelected(true);
	        
	    }else if(e.getKeyCode() == KeyEvent.VK_CLEAR) {
	    	btnBorrar.doClick();
	    }
	    }
	};
	
	ActionListener bL = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			cantidad.setText("");
			resultado.setText("");
			rdbtnPesetasEuros.setSelected(false);
			rdbtnEurosPesetas.setSelected(false);
		}
	};
	

}
