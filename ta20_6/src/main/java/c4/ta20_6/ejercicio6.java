package c4.ta20_6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class ejercicio6 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAltura;
	private JTextField textPeso;
	private JTextField textField;
	private String imc;
	private Double peso;
	private Double altura;

	/**
	 * Create the frame.
	 */
	public ejercicio6() {
		setForeground(new Color(64, 0, 64));
		setBackground(new Color(216, 207, 220));
		setTitle("Índice de Masa Corporal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setVisible(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel etiquetaPeso = new JLabel("Peso (kg)");
		etiquetaPeso.setBounds(260, 63, 129, 20);
		etiquetaPeso.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(etiquetaPeso);

		JLabel etiquetaAltura = new JLabel("Altura (metros)");
		etiquetaAltura.setBounds(26, 63, 166, 20);
		etiquetaAltura.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(etiquetaAltura);

		JButton btnCalcular = new JButton("Calcular IMC");
		btnCalcular.addActionListener(aL);
		btnCalcular.setBackground(new Color(197, 183, 202));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCalcular.setBounds(50, 152, 152, 37);
		contentPane.add(btnCalcular);

		textAltura = new JTextField();
		textAltura.setBounds(165, 48, 78, 37);
		contentPane.add(textAltura);
		textAltura.setColumns(10);

		textPeso = new JTextField();
		textPeso.setColumns(10);
		textPeso.setBounds(366, 48, 78, 37);
		contentPane.add(textPeso);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setText("0");
		textField.setColumns(10);
		textField.setBounds(323, 154, 78, 37);
		contentPane.add(textField);

		JLabel etiquetaIMC = new JLabel("IMC");
		etiquetaIMC.setFont(new Font("Tahoma", Font.BOLD, 16));
		etiquetaIMC.setBounds(242, 165, 49, 14);
		contentPane.add(etiquetaIMC);
	}

	ActionListener aL = new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			try {
				peso = Double.parseDouble(textPeso.getText());
				altura = Double.parseDouble(textAltura.getText());
				imc = calcular(peso, altura);
				textField.setText(imc);
			} catch (NumberFormatException eX) {
				JOptionPane.showMessageDialog(null, "No has introducido un valor numerico: " + eX.getMessage());
			}
		}
	};

	public String calcular(double peso, double altura) {
		Double result = peso / (Math.pow(altura, 2));
		imc = String.format("%.2f", result);
		return imc;
	}
}
