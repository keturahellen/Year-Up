import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUIProject {

	private JFrame frame;
	private JTextField textName;
	private JTextField textAge;
	private static String s_whoAreYou = "Who are you?";
	private static String s_clearMe = "Clear Me!";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIProject window = new GUIProject();
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
	public GUIProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("My name is:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblName.setBounds(109, 40, 64, 50);
		frame.getContentPane().add(lblName);
		
		textName = new JTextField();
		textName.setBounds(183, 55, 109, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblAge = new JLabel("I am:");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAge.setBounds(141, 85, 31, 31);
		frame.getContentPane().add(lblAge);
		
		textAge = new JTextField();
		textAge.setBounds(183, 91, 109, 20);
		frame.getContentPane().add(textAge);
		textAge.setColumns(10);
		
		JLabel lblYearUpStudent = new JLabel("I am a student at Year Up!");
		lblYearUpStudent.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblYearUpStudent.setBounds(119, 127, 192, 14);
		frame.getContentPane().add(lblYearUpStudent);
		
		JButton btnWhoAreYou = new JButton(s_whoAreYou);
		btnWhoAreYou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(btnWhoAreYou.getText().equals(s_whoAreYou))
				{
					textName.setText("Keturah Johnson");
					textAge.setText("23");
					btnWhoAreYou.setText(s_clearMe);
				}
				else if (btnWhoAreYou.getText().equals(s_clearMe))
				{
					textAge.setText("");
					textName.setText("");
					btnWhoAreYou.setText(s_whoAreYou);
				}
				
			}
		});
		btnWhoAreYou.setBounds(109, 163, 200, 50);
		frame.getContentPane().add(btnWhoAreYou);
	}
}
