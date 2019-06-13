package FitnessGUI.Description;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PushUps extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PushUps frame = new PushUps();
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
	public PushUps() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 581);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Picture");
		lblNewLabel.setBounds(0, 13, 681, 278);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html><ul>" +
		        "<li></li>" +             
		        "<li></li>" + 
		        "<li></li>" + 
		        "</ul><html>");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(0, 320, 669, 201);
		contentPane.add(lblNewLabel_1);
	}

}
