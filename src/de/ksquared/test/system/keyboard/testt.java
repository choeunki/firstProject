package de.ksquared.test.system.keyboard;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class testt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testt frame = new testt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public testt() {
		setTitle("\uBA40\uD2F0 \uCE74\uD53C \uD504\uB85C\uADF8\uB7A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("\uBCF5\uC0AC     \uBD99\uC5EC\uB123\uAE30");
		label.setBounds(97, 25, 109, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\uC800\uC7A5\uC18C 1 Key");
		lblNewLabel.setBounds(12, 50, 82, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("F1    /     F5");
		lblNewLabel_1.setBounds(97, 50, 97, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblKey = new JLabel("\uC800\uC7A5\uC18C 2 Key");
		lblKey.setBounds(12, 73, 82, 15);
		contentPane.add(lblKey);
		
		JLabel lblKey_1 = new JLabel("\uC800\uC7A5\uC18C 3 Key");
		lblKey_1.setBounds(12, 97, 82, 15);
		contentPane.add(lblKey_1);
		
		JLabel lblKey_2 = new JLabel("\uC800\uC7A5\uC18C 4 Key");
		lblKey_2.setBounds(12, 122, 82, 15);
		contentPane.add(lblKey_2);
		
		JLabel lblFF = new JLabel("F2    /     F6");
		lblFF.setBounds(97, 75, 97, 15);
		contentPane.add(lblFF);
		
		JLabel lblFF_1 = new JLabel("F3    /     F7");
		lblFF_1.setBounds(97, 98, 97, 15);
		contentPane.add(lblFF_1);
		
		JLabel lblFF_2 = new JLabel("F4    /     F8");
		lblFF_2.setBounds(97, 122, 97, 15);
		contentPane.add(lblFF_2);
		
		textField = new JTextField();
		textField.setBounds(206, 47, 178, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(206, 70, 178, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(206, 94, 178, 21);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(206, 119, 178, 21);
		contentPane.add(textField_3);
	}
}
