package c4.ta20_7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio7 extends JFrame {

	private JPanel contentPane;
	private JTextField cantidad;
	private JTextField resultado;
	private JRadioButton rdbtnEurosPesetas = new JRadioButton();
	JRadioButton rdbtnPesetasEuros = new JRadioButton();
	ButtonGroup grupoMoneda = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public ejercicio7() {
		setTitle("Calculadora de cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setVisible(true);
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

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(aL);
		btnCalcular.setBackground(new Color(216, 207, 220));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCalcular.setBounds(155, 149, 117, 31);
		contentPane.add(btnCalcular);
	}

	ActionListener aL = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			double cantidadAConvertir = Double.parseDouble(cantidad.getText());
			double resultadoConversion = 0.0;
			if (rdbtnEurosPesetas.isSelected()) {
				resultadoConversion = cantidadAConvertir * 166.386; // 1 euro = 166.386 pesetas
				resultado.setText(String.format("%.2f", resultadoConversion));
			} else if (rdbtnPesetasEuros.isSelected()) {
				resultadoConversion = cantidadAConvertir / 166.386; // 1 peseta = 0.006 euros
				resultado.setText(String.format("%.2f", resultadoConversion));
			}

		}
	};

}
