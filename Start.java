package FitnessGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Overpanel = new JPanel();
		Overpanel.setBackground(Color.BLACK);
		Overpanel.setBounds(0, 0, 825, 562);
		contentPane.add(Overpanel);
		Overpanel.setBackground(new Color(0,0,0,200));
		Overpanel.setLayout(null);
		
		JLabel lblFitnessTracker = new JLabel("Fitness Tracker 5000");
		lblFitnessTracker.setForeground(Color.WHITE);
		lblFitnessTracker.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 46));
		lblFitnessTracker.setBounds(195, 94, 474, 117);
		Overpanel.add(lblFitnessTracker);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(182, 199, 487, 15);
		Overpanel.add(separator);
		
		JButton SButton = new JButton("START");
		SButton.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 24));
		SButton.setForeground(Color.WHITE);
		SButton.setBackground(Color.LIGHT_GRAY);
		SButton.setBounds(324, 294, 172, 56);
		Overpanel.add(SButton);
		
		JLabel BLabel = new JLabel("New label");
		BLabel.setBackground(new Color(240, 240, 240));
		BLabel.setBounds(0, 0, 825, 562);
		contentPane.add(BLabel);
		
		ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/workout.jpg")));
		
		Image img2 = img.getImage();
		Image dimg = img2.getScaledInstance(BLabel.getWidth(), BLabel.getHeight(), Image.SCALE_SMOOTH);
		
		ImageIcon i = new ImageIcon(dimg);
		BLabel.setIcon(i);
		
	}
}
