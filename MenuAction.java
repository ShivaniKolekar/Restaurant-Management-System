package resto;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAction extends JFrame {
	
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
					MenuAction frame = new MenuAction();
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
	public MenuAction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Add", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("ID");
		label.setBounds(102, 47, 75, 14);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(187, 76, 106, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 44, 106, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(187, 114, 106, 20);
		panel.add(textField_2);
		
		JLabel label_1 = new JLabel("Item Name");
		label_1.setBounds(102, 79, 75, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Item Price");
		label_2.setBounds(102, 117, 75, 14);
		panel.add(label_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    	Class.forName("oracle.jdbc.driver.OracleDriver");
				     String url = "jdbc:oracle:thin:@//localhost:5560/xe";
				     Connection conn = DriverManager.getConnection(url,"system","");
				     conn.setAutoCommit(false);
				        String query1 = "INSERT INTO WIN(NAME) VALUES('"+textField.getSelectedText()+"')";

				        Statement stm = conn.createStatement();
				        stm.execute(query1);

				          JOptionPane.showMessageDialog(null, "Record Added Succesfully.", "Record Added",
				                  JOptionPane.INFORMATION_MESSAGE);

					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

		 
				
			}
		});
		btnNewButton.setBounds(74, 160, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(187, 160, 89, 23);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(305, 160, 89, 23);
		panel.add(btnDelete);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Search", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Item Name");
		lblNewLabel.setBounds(45, 8, 66, 14);
		panel_1.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(162, 5, 167, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(147, 109, 89, 23);
		panel_1.add(btnNewButton_1);
	}
}
