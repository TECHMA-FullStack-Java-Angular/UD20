package c4.ta20_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Ventana extends JFrame {

	private JPanel contentPane;
	 private JLabel etiqueta;
	/**
	 * @wbp.nonvisual location=351,29
	 */


	

	/**
	 * Create the frame.
	 */
	public Ventana() {
		
		initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {
        etiqueta = new JLabel("¡Soy una etiqueta!");
        etiqueta.setFont(new Font("Tahoma", Font.PLAIN, 20));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(etiqueta);

        setTitle("Ventana redimensionable");
        setResizable(true);
        setBounds(100, 100, 400, 300);

        JRootPane rootPane = SwingUtilities.getRootPane(etiqueta);
        rootPane.setWindowDecorationStyle(JRootPane.FRAME);
    
		
		
		
		
//		setTitle("Control básico");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		
//		
//
//		setVisible(true);
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("¡Soy redimensionable!");
//		
//		getContentPane().add(lblNewLabel);
//		setTitle("Etiqueta");
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		lblNewLabel.setBounds(91, 90, 275, 36);
//		setResizable(true);
//		contentPane.add(lblNewLabel);
	}

}
