package FitnessGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Location extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Location frame = new Location();
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
	public Location() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Ovpanel = new JPanel();
		Ovpanel.setBounds(0, 0, 730, 480);
		contentPane.add(Ovpanel);
		Ovpanel.setBackground(new Color(0,0,0,200));
		Ovpanel.setLayout(null);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 27));
		lblHome.setBounds(141, 79, 82, 64);
		Ovpanel.add(lblHome);
		
		JLabel lblWeights = new JLabel("WEIGHTS");
		lblWeights.setForeground(Color.WHITE);
		lblWeights.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 27));
		lblWeights.setBounds(454, 79, 129, 64);
		Ovpanel.add(lblWeights);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(127, 141, 113, 2);
		Ovpanel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(441, 141, 138, 2);
		Ovpanel.add(separator_1);
		
		JButton Hbutton = new JButton("");
		Hbutton.setForeground(Color.WHITE);
		Hbutton.setBackground(Color.LIGHT_GRAY);
		Hbutton.setBounds(74, 174, 218, 215);
		Ovpanel.add(Hbutton);
		try {
			Image Mimg = ImageIO.read(getClass().getResource("/home.png"));
			Image newimg = Mimg.getScaledInstance(Hbutton.getWidth(), Hbutton.getHeight(), java.awt.Image.SCALE_SMOOTH);
			Hbutton.setIcon(new ImageIcon(newimg));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JButton Wbutton = new JButton("");
		Wbutton.setForeground(Color.WHITE);
		Wbutton.setBackground(Color.LIGHT_GRAY);
		Wbutton.setBounds(405, 174, 218, 215);
		Ovpanel.add(Wbutton);
		try {
			Image Mimg = ImageIO.read(getClass().getResource("/Dumbbell.png"));
			Image newimg = Mimg.getScaledInstance(Wbutton.getWidth(), Wbutton.getHeight(), java.awt.Image.SCALE_SMOOTH);
			Wbutton.setIcon(new ImageIcon(newimg));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel BLabel = new JLabel("New label");
		BLabel.setBounds(0, 0, 730, 480);
		contentPane.add(BLabel);
		
		ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Push-Up.jpg")));
		
		Image img2 = img.getImage();
		Image dimg = img2.getScaledInstance(BLabel.getWidth(), BLabel.getHeight(), Image.SCALE_SMOOTH);
		
		ImageIcon i = new ImageIcon(dimg);
		BLabel.setIcon(i);
	}

}
