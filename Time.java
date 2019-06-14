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

import FitnessGUI.Trackers.Tracker;
import FitnessGUI.Trackers.Tracker2;
import FitnessGUI.Trackers.Tracker3;
import FitnessGUI.Trackers.Tracker4;
import FitnessGUI.Trackers.Tracker5;
import FitnessGUI.Trackers.Tracker6;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Time extends JFrame {

	private JPanel contentPane;
	Plan p = new Plan();
	Location l = new Location();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Time frame = new Time();
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
	public Time() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Ovpanel = new JPanel();
		Ovpanel.setBounds(0, 0, 696, 451);
		contentPane.add(Ovpanel);
		Ovpanel.setBackground(new Color(0,0,0,200));
		Ovpanel.setLayout(null);
		
		JLabel lblTime = new JLabel("TIME");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 35));
		lblTime.setBounds(298, 43, 91, 55);
		Ovpanel.add(lblTime);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(285, 96, 104, 2);
		Ovpanel.add(separator);
		
		JButton OP1 = new JButton("0 - 30 Min");
		OP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (l.loc) {
					Tracker t = new Tracker();
					System.out.print(l.loc);
					t.setVisible(true);
					dispose();
				}else {
					System.out.print(l.loc);
					Tracker4 t4 = new Tracker4();
					t4.setVisible(true);
					dispose();
				}	
				
			}
		});
		OP1.setForeground(Color.WHITE);
		OP1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 33));
		OP1.setBackground(Color.LIGHT_GRAY);
		OP1.setBounds(113, 150, 452, 37);
		Ovpanel.add(OP1);
		
		JButton OP2 = new JButton("1 - 2 Hours");
		OP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (l.loc) {
					Tracker2 t2 = new Tracker2();
					t2.setVisible(true);
					dispose();
				}else {
					Tracker5 t5 = new Tracker5();
					t5.setVisible(true);
					dispose();
				}	
		
			}
		});
		OP2.setForeground(Color.WHITE);
		OP2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 33));
		OP2.setBackground(Color.LIGHT_GRAY);
		OP2.setBounds(113, 223, 452, 37);
		Ovpanel.add(OP2);
		
		JButton OP3 = new JButton("2 + Hours");
		OP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (l.loc) {
					Tracker3 t3 = new Tracker3();
					t3.setVisible(true);
					dispose();
				}else {
					Tracker6 t6 = new Tracker6();
					t6.setVisible(true);
					dispose();
				}	 
			
			}
		});
		OP3.setForeground(Color.WHITE);
		OP3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 33));
		OP3.setBackground(Color.LIGHT_GRAY);
		OP3.setBounds(113, 297, 452, 37);
		Ovpanel.add(OP3);
		
		JLabel BLabel = new JLabel("New label");
		BLabel.setBounds(0, 0, 696, 451);
		contentPane.add(BLabel);
		
		//Background Img
		ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Dips.jpg")));
		Image img2 = img.getImage();
		Image dimg = img2.getScaledInstance(BLabel.getWidth(), BLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon i = new ImageIcon(dimg);
		BLabel.setIcon(i);
	}

}
