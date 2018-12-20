package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Inicio {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(164, 109, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblRutAdmin = new JLabel("RUT admin:");
		lblRutAdmin.setBounds(164, 84, 86, 14);
		panel.add(lblRutAdmin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(164, 167, 86, 20);
		panel.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(164, 142, 86, 14);
		panel.add(lblPassword);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.setBounds(164, 212, 89, 23);
		panel.add(btnAcceder);
	}
}
