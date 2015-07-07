import java.awt.Color;
import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class TicTacToe {
	
	
	private JFrame frame;
	private String m_previousMove = null;
	private JButton[][] m_allButtons = new JButton[3][3];
	private static String s_x = "X";
	private static String s_o = "O";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 431, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnOne = new JButton("");
		btnOne.setBounds(39, 49, 89, 62);
		frame.getContentPane().add(btnOne);
		m_allButtons[0][0] = btnOne;
		
		JButton btnTwo = new JButton("");
		btnTwo.setBounds(162, 49, 89, 62);
		frame.getContentPane().add(btnTwo);
		m_allButtons[0][1] = btnTwo;
		
		JButton btnThree = new JButton("");
		btnThree.setBounds(286, 49, 89, 62);
		frame.getContentPane().add(btnThree);
		m_allButtons[0][2] = btnThree;
		
		JButton btnFour = new JButton("");
		btnFour.setBounds(39, 134, 89, 62);
		frame.getContentPane().add(btnFour);
		m_allButtons[1][0] = btnFour;
		
		JButton btnFive = new JButton("");
		btnFive.setBounds(162, 134, 89, 62);
		frame.getContentPane().add(btnFive);
		m_allButtons[1][1] = btnFive;
		
		JButton btnSix = new JButton("");
		btnSix.setBounds(286, 134, 89, 62);
		frame.getContentPane().add(btnSix);
		m_allButtons[1][2] = btnSix;
		
		JButton btnSeven = new JButton("");
		btnSeven.setBounds(39, 222, 89, 62);
		frame.getContentPane().add(btnSeven);
		m_allButtons[2][0] = btnSeven;
		
		JButton btnEight = new JButton("");
		btnEight.setBounds(162, 222, 89, 62);
		frame.getContentPane().add(btnEight);
		m_allButtons[2][1] = btnEight;
		
		JButton btnNine = new JButton("");
		btnNine.setBounds(286, 222, 89, 62);
		frame.getContentPane().add(btnNine);
		m_allButtons[2][2] = btnNine;
		AddAllEventHandlers();
	}
	
	private void ChangeButtonText(JButton button)
	{
		if(m_previousMove !=null)
		{
			if(m_previousMove.equals(s_o))
			{
				button.setText(s_x);
				button.setEnabled(false);
				m_previousMove = s_x;
			}
			
			else if (m_previousMove.equals(s_x))
			{
				button.setText(s_o);
				button.setEnabled(false);
				m_previousMove = s_o;
			}
		}
			
		else
		{
			button.setText(s_x);
			m_previousMove = s_x;
			button.setEnabled(false);
		}
		}
	
	
	
	private void DisableAllButtons()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					m_allButtons[i][j].setEnabled(false);
				}
			}
		}
	}
	
	
	private void AddAllEventHandlers()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{	
					JButton currentButton = m_allButtons[i][j];					
					currentButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent arg0)
						{
						
							ChangeButtonText(currentButton);
					        currentButton.setEnabled(false);
					        CheckGameWinner();
						}
					});
				}
			}
		}
	}

	
	
	private void CheckGameWinner()
	{
		if(m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				String one = m_allButtons[i][0].getText();
				String two = m_allButtons[i][1].getText();
				String three = m_allButtons[i][2].getText();
				
				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
				
				if (! empty)
				{
					boolean same = (one == two) && (two == three);
					
					if (same)
					{
						m_allButtons[i][0].setBackground(Color.WHITE);
						m_allButtons[i][1].setBackground(Color.WHITE);
						m_allButtons[i][2].setBackground(Color.WHITE);
						DisableAllButtons();
					}
					
				}
			}
			
			for (int i = 0; i < 3; i++)
			{
				String one = m_allButtons[0][i].getText();
				String two = m_allButtons[1][i].getText();
				String three = m_allButtons[2][i].getText();
				
				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
				
				if (! empty)
				{
					boolean same = (one==two) && (two==three);
				
				
				if (same)
				{
					m_allButtons[0][i].setBackground(Color.WHITE);
					m_allButtons[1][i].setBackground(Color.WHITE);
					m_allButtons[2][i].setBackground(Color.WHITE);
					DisableAllButtons();

				}
			    }
		    }
			
			
			
				String one = m_allButtons[0][0].getText();
				String two = m_allButtons[1][1].getText();
				String three = m_allButtons[2][2].getText();
				
				boolean diagonalOneEmpty = one.isEmpty() || two.isEmpty() || three.isEmpty();
				
				if (! diagonalOneEmpty)
				{
					boolean diagonalOneSame = (one==two) && (two==three);
				
				
					if (diagonalOneSame)
					{
					m_allButtons[0][0].setBackground(Color.WHITE);
					m_allButtons[1][1].setBackground(Color.WHITE);
					m_allButtons[2][2].setBackground(Color.WHITE);
					DisableAllButtons();

					}
			    }
				
				String four = m_allButtons[0][0].getText();
				String five = m_allButtons[1][1].getText();
				String six = m_allButtons[2][2].getText();
				
				boolean diagonalTwoEmpty = four.isEmpty() || five.isEmpty() || six.isEmpty();
				
				if (! diagonalTwoEmpty)
				{
					boolean diagonalTwoSame = (one==two) && (two==three);
				
				
					if (diagonalTwoSame)
					{
					m_allButtons[0][0].setBackground(Color.WHITE);
					m_allButtons[1][1].setBackground(Color.WHITE);
					m_allButtons[2][2].setBackground(Color.WHITE);
					DisableAllButtons();
					}
				
		    
				}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
}
