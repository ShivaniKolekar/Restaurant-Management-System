package resto;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mm frame = new mm();
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
	public mm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(177, 90, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setBounds(101, 93, 46, 14);
		contentPane.add(lblUserId);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(101, 158, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(177, 155, 86, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("submi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second  nf=new second();
				
				 
				 String user=textField.getText();
				 String pss=textField_1.getText();
				 String ww = " welcome";
				 if(user.equals("Pearl") && pss.equals("Pearl"))
				 {
					 nf.setVisible(true);
					 
					 //JOptionPane.showMessageDialog(null, ww);
				 }
				 else
				 {
					 String st = "plz enter username n pass correct";
					 JOptionPane.showMessageDialog(null, st);
				 }
				
				
			 
			}
		});
		btnNewButton.setBounds(143, 186, 89, 23);
		contentPane.add(btnNewButton);
	}
}
