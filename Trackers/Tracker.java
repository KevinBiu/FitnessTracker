package FitnessGUI.Trackers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.Arm_Circles;
import gui.Burpees;
import gui.Hip_Circles;
import gui.Leg_Swings;
import gui.Plank;
import gui.Push_Ups;
import gui.Squats;
import gui.Static_Lunges;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tracker extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tracker frame = new Tracker();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
	public Tracker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1835, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel TLabel = new JLabel("Basic Workout");
		TLabel.setBounds(58, 32, 271, 69);
		TLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 35));
		contentPane.add(TLabel);
		
		JLabel label_1 = new JLabel("0 - 30 Min\r\n");
		label_1.setBounds(58, 114, 245, 39);
		label_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		contentPane.add(label_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(48, 98, 238, 2);
		separator.setForeground(Color.BLACK);
		contentPane.add(separator);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(908, 98, 2, 873);
		contentPane.add(separator_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 148, 884, 889);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWarmups = new JLabel("WARM-UPS \r\n");
		lblWarmups.setBounds(66, 13, 457, 87);
		panel.add(lblWarmups);
		lblWarmups.setHorizontalAlignment(SwingConstants.LEFT);
		lblWarmups.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 50));
		
		JLabel label = new JLabel("New label");
		label.setBounds(119, 191, 107, 79);
		panel.add(label);
		
		JButton button = new JButton("See More Details\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hip_Circles hc = new Hip_Circles();
				hc.setVisible(true);
				hc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button.setBounds(546, 178, 196, 69);
		panel.add(button);
		button.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button.setBackground(Color.WHITE);
		
		JLabel lblHipCircles = new JLabel("Hip Circles\r\n");
		lblHipCircles.setBounds(292, 178, 154, 39);
		panel.add(lblHipCircles);
		lblHipCircles.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		
		JTextPane txtpnReps = new JTextPane();
		txtpnReps.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps.setText("Reps : 8 Inward\r\n           8 outward\r\n           (Per Leg)");
		txtpnReps.setBounds(293, 230, 196, 92);
		panel.add(txtpnReps);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(292, 222, 154, 8);
		panel.add(separator_1);
		separator_1.setForeground(Color.BLACK);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(119, 375, 107, 79);
		panel.add(label_7);
		
		JButton button_2 = new JButton("See More Details\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Arm_Circles ac = new Arm_Circles();
				ac.setVisible(true);
				ac.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_2.setBounds(546, 362, 196, 69);
		panel.add(button_2);
		button_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_2.setBackground(Color.WHITE);
		
		JLabel lblArmCircles = new JLabel("Arm Circles\r\n");
		lblArmCircles.setBounds(292, 362, 178, 39);
		panel.add(lblArmCircles);
		lblArmCircles.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		
		JTextPane txtpnReps_1 = new JTextPane();
		txtpnReps_1.setText("Reps : 8 Forward\r\n           8 Backward\r\n    \r\n");
		txtpnReps_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_1.setBounds(293, 414, 196, 92);
		panel.add(txtpnReps_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(292, 402, 164, 8);
		panel.add(separator_4);
		separator_4.setForeground(Color.BLACK);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setBounds(119, 534, 107, 79);
		panel.add(label_10);
		
		JButton button_3 = new JButton("See More Details\r\n");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Squats s = new Squats();
				s.setVisible(true);
				s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_3.setBounds(546, 535, 196, 69);
		panel.add(button_3);
		button_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_3.setBackground(Color.WHITE);
		
		JLabel lblSquats = new JLabel("Squats\r\n");
		lblSquats.setBounds(292, 535, 154, 39);
		panel.add(lblSquats);
		lblSquats.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		
		JTextPane txtpnReps_2 = new JTextPane();
		txtpnReps_2.setText("Reps : 15");
		txtpnReps_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_2.setBounds(293, 587, 196, 92);
		panel.add(txtpnReps_2);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(292, 578, 107, 2);
		panel.add(separator_5);
		separator_5.setForeground(Color.BLACK);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setBounds(119, 712, 107, 79);
		panel.add(label_13);
		
		JButton button_4 = new JButton("See More Details\r\n");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Leg_Swings ls = new Leg_Swings();
				ls.setVisible(true);
				ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});
		button_4.setBounds(546, 699, 196, 69);
		panel.add(button_4);
		button_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_4.setBackground(Color.WHITE);
		
		JLabel lblLegSwings = new JLabel("Leg Swings");
		lblLegSwings.setBounds(292, 699, 154, 39);
		panel.add(lblLegSwings);
		lblLegSwings.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		
		JTextPane txtpnReps_3 = new JTextPane();
		txtpnReps_3.setText("Reps : 10\r\n");
		txtpnReps_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_3.setBounds(292, 755, 196, 92);
		panel.add(txtpnReps_3);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(292, 742, 133, 2);
		panel.add(separator_6);
		separator_6.setForeground(Color.BLACK);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(954, 148, 884, 889);
		contentPane.add(panel_1);
		
		JLabel lblWorkout = new JLabel("WORKOUT");
		lblWorkout.setHorizontalAlignment(SwingConstants.LEFT);
		lblWorkout.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 50));
		lblWorkout.setBounds(66, 13, 457, 87);
		panel_1.add(lblWorkout);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(119, 191, 107, 79);
		panel_1.add(label_3);
		
		JButton button_1 = new JButton("See More Details\r\n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Push_Ups pu = new Push_Ups();
				pu.setVisible(true);
				pu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(546, 178, 196, 69);
		panel_1.add(button_1);
		
		JLabel lblPushUps = new JLabel("Push Ups\r\n");
		lblPushUps.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPushUps.setBounds(292, 178, 154, 39);
		panel_1.add(lblPushUps);
		
		JTextPane txtpnReps_4 = new JTextPane();
		txtpnReps_4.setText("Reps : 15\r\nSets : 2");
		txtpnReps_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_4.setBounds(293, 230, 196, 92);
		panel_1.add(txtpnReps_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(292, 222, 154, 8);
		panel_1.add(separator_2);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(119, 375, 107, 79);
		panel_1.add(label_5);
		
		JButton button_5 = new JButton("See More Details\r\n");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Static_Lunges sl = new Static_Lunges();
				sl.setVisible(true);
				sl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(546, 362, 196, 69);
		panel_1.add(button_5);
		
		JLabel lblStaticLunges = new JLabel("Static Lunges");
		lblStaticLunges.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblStaticLunges.setBounds(292, 362, 197, 39);
		panel_1.add(lblStaticLunges);
		
		JTextPane txtpnReps_5 = new JTextPane();
		txtpnReps_5.setText("Reps : 15 \r\nSets : 2");
		txtpnReps_5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_5.setBounds(293, 414, 196, 92);
		panel_1.add(txtpnReps_5);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setBounds(292, 402, 197, 8);
		panel_1.add(separator_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(119, 534, 107, 79);
		panel_1.add(label_8);
		
		JButton button_6 = new JButton("See More Details\r\n");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Burpees b = new Burpees();
				b.setVisible(true);
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(546, 535, 196, 69);
		panel_1.add(button_6);
		
		JLabel lblBurpees = new JLabel("Burpees");
		lblBurpees.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblBurpees.setBounds(292, 535, 154, 39);
		panel_1.add(lblBurpees);
		
		JTextPane txtpnReps_6 = new JTextPane();
		txtpnReps_6.setText("Reps : 15\r\nSets : 2");
		txtpnReps_6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_6.setBounds(293, 587, 196, 92);
		panel_1.add(txtpnReps_6);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.BLACK);
		separator_8.setBounds(292, 579, 126, 8);
		panel_1.add(separator_8);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setBounds(119, 712, 107, 79);
		panel_1.add(label_11);
		
		JButton button_7 = new JButton("See More Details\r\n");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plank p = new Plank();
				p.setVisible(true);
				p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_7.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(546, 699, 196, 69);
		panel_1.add(button_7);
		
		JLabel lblPlank = new JLabel("Plank");
		lblPlank.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPlank.setBounds(292, 699, 154, 39);
		panel_1.add(lblPlank);
		
		JTextPane txtpnMinSets = new JTextPane();
		txtpnMinSets.setText("2 min \r\nSets : 2");
		txtpnMinSets.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnMinSets.setBounds(292, 755, 196, 92);
		panel_1.add(txtpnMinSets);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.BLACK);
		separator_9.setBounds(292, 736, 95, 8);
		panel_1.add(separator_9);
	}
}
