package resto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class second extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					second frame = new second();
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
	public second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 651, 252);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Menu Actions", null, panel, null);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(326, 87, 157, 43);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuAction m=new MenuAction();
				m.setVisible(true);
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Staff Mangement", null, panel_1, null);
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffManagement s=new StaffManagement();
				s.setVisible(true);
			}
		});
		panel_1.add(btnNewButton_1);
		
		
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Profit Analyze", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Supply Mangement", null, panel_3, null);
		
		JButton btnNewButton_2 = new JButton("Enter");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SupplyManagement sm=new SupplyManagement();
				sm.setVisible(true);
			}
		});
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Logout", null, panel_4, null);
	}
}
