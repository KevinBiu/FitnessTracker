package FitnessGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gender extends JFrame {

	private JPanel contentPane;
	Plan p = new Plan();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gender frame = new Gender();
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
	public Gender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel Ovpanel = new JPanel();
		Ovpanel.setBackground(Color.BLACK);
		Ovpanel.setBounds(0, 0, 825, 531);
		contentPane.add(Ovpanel);
		Ovpanel.setBackground(new Color(0,0,0,200));
		Ovpanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MALE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 27));
		lblNewLabel.setBounds(209, 110, 82, 64);
		Ovpanel.add(lblNewLabel);
		
		JLabel lblFemale = new JLabel("FEMALE");
		lblFemale.setForeground(Color.WHITE);
		lblFemale.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 27));
		lblFemale.setBounds(530, 101, 109, 82);
		Ovpanel.add(lblFemale);
		
		JButton MaleButton = new JButton("");
		MaleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BMI b = new BMI();
				b.setVisible(true);
				dispose();
				//To be a man 
			
			}
		});
		MaleButton.setBackground(Color.LIGHT_GRAY);
		MaleButton.setForeground(Color.WHITE);
		MaleButton.setBounds(133, 187, 218, 215);
		Ovpanel.add(MaleButton);
		
		
		try {
			Image Mimg = ImageIO.read(getClass().getResource("/male-512.png"));
			Image newimg = Mimg.getScaledInstance(MaleButton.getWidth(), MaleButton.getHeight(), java.awt.Image.SCALE_SMOOTH);
			MaleButton.setIcon(new ImageIcon(newimg));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JButton Febutton = new JButton("");
		Febutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BMI b = new BMI();
				b.setVisible(true);
				dispose();
				//To be a woman 
			
			}
		});
		Febutton.setBackground(Color.LIGHT_GRAY);
		Febutton.setBounds(469, 187, 218, 215);
		Ovpanel.add(Febutton);
		
		
		try {
			Image Fimg = ImageIO.read(getClass().getResource("/female-512.png"));
			Image newimg = Fimg.getScaledInstance(Febutton.getWidth(), Febutton.getHeight(), java.awt.Image.SCALE_SMOOTH);
			Febutton.setIcon(new ImageIcon(newimg));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel BaLabel = new JLabel("New label");
		BaLabel.setBounds(0, 0, 825, 531);
		contentPane.add(BaLabel);
		
		//Background Img
		ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/workout2.jpg")));
		Image img2 = img.getImage();
		Image dimg = img2.getScaledInstance(BaLabel.getWidth(), BaLabel.getHeight(), Image.SCALE_SMOOTH);	
		ImageIcon i = new ImageIcon(dimg);
		BaLabel.setIcon(i);
	}
}
