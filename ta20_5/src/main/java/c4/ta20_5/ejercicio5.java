package c4.ta20_5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class ejercicio5 extends JFrame {

	private JPanel contentPane;
    private JTextArea eventos = new JTextArea();
	

	/**
	 * Create the frame.
	 */
	public ejercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		eventos = new JTextArea();
		eventos.setBounds(10, 44, 416, 194);
		contentPane.add(eventos);
		eventos.addMouseListener(mA);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(aL);
		btnLimpiar.setBackground(new Color(194, 180, 205));
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLimpiar.setBounds(158, 274, 124, 34);
		contentPane.add(btnLimpiar);
		
		
		setVisible(true);
	}
	
	ActionListener aL = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			eventos.setText("");
			
		}
	};
	
	MouseAdapter mA = new MouseAdapter() {
		 @Override
         public void mouseClicked(MouseEvent e) {
             eventos.append("Mouse Clicked\n");
         }

         @Override
         public void mousePressed(MouseEvent e) {
             eventos.append("Mouse Pressed\n");
         }

         @Override
         public void mouseReleased(MouseEvent e) {
             eventos.append("Mouse Released\n");
         }

         @Override
         public void mouseEntered(MouseEvent e) {
             eventos.append("Mouse Entered\n");
         }

         @Override
         public void mouseExited(MouseEvent e) {
             eventos.append("Mouse Exited\n");
         }
     }; 
		
	

}
