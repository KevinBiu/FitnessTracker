package FitnessGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI extends JFrame {

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
					BMI frame = new BMI();
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
	public BMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Ovpanel = new JPanel();
		Ovpanel.setBounds(0, 0, 666, 406);
		contentPane.add(Ovpanel);
		Ovpanel.setBackground(new Color(0,0,0,200));
		Ovpanel.setLayout(null);
		
		JLabel Hunit = new JLabel("FT");
		Hunit.setForeground(Color.WHITE);
		Hunit.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		Hunit.setBackground(new Color(192, 192, 192));
		Hunit.setBounds(422, 132, 45, 42);
		Ovpanel.add(Hunit);
		
		JLabel Wunit = new JLabel("LBS");
		Wunit.setForeground(Color.WHITE);
		Wunit.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		Wunit.setBackground(Color.LIGHT_GRAY);
		Wunit.setBounds(422, 232, 45, 42);
		Ovpanel.add(Wunit);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setForeground(Color.WHITE);
		lblBmi.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 35));
		lblBmi.setBounds(286, 39, 70, 55);
		Ovpanel.add(lblBmi);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(276, 91, 84, 2);
		Ovpanel.add(separator);
		
		JLabel lblNewLabel = new JLabel("HEIGHT");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(111, 119, 111, 55);
		Ovpanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WEIGHT");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(111, 214, 111, 62);
		Ovpanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 25));
		textField.setBounds(234, 132, 149, 42);
		Ovpanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(234, 229, 149, 42);
		Ovpanel.add(textField_1);
		
		JButton SubButton = new JButton("SUBMIT");
		SubButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Location l = new Location();
				l.setVisible(true);
				dispose();
			}
		});
		SubButton.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		SubButton.setForeground(Color.WHITE);
		SubButton.setBackground(Color.LIGHT_GRAY);
		SubButton.setBounds(440, 323, 111, 33);
		Ovpanel.add(SubButton);
		
		JButton MButton = new JButton("METRIC");
		MButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hunit.setText("CM");
				Wunit.setText("KG");
			}
		});
		MButton.setForeground(Color.WHITE);
		MButton.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		MButton.setBackground(Color.LIGHT_GRAY);
		MButton.setBounds(70, 323, 112, 33);
		Ovpanel.add(MButton);
		
		JButton IButton = new JButton("IMPERIAL ");
		IButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hunit.setText("FT");
				Wunit.setText("LBS");
			}
		});
		IButton.setForeground(Color.WHITE);
		IButton.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		IButton.setBackground(Color.LIGHT_GRAY);
		IButton.setBounds(194, 323, 111, 33);
		Ovpanel.add(IButton);
		
		JLabel BLabel = new JLabel("New label");
		BLabel.setBounds(0, 0, 666, 406);
		contentPane.add(BLabel);
		
		//Background Img
		ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Shoe.jpg")));
		Image img2 = img.getImage();
		Image dimg = img2.getScaledInstance(BLabel.getWidth(), BLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon i = new ImageIcon(dimg);
		BLabel.setIcon(i);
	}
}
