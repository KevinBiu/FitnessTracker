package FitnessGUI.Trackers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.Arm_Circles;
import gui.Burpees;
import gui.Diamond_Push_Up_Knees;
import gui.Hip_Circles;
import gui.Leg_Crossovers;
import gui.Leg_Swings;
import gui.Plank;
import gui.Plank_Oblique;
import gui.Plank_Wraps;
import gui.Push_Ups;
import gui.Squats;
import gui.Static_Lunges;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

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

public class Tracker3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tracker3 frame = new Tracker3();
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
	public Tracker3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1835, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel TLabel = new JLabel("Advance Workout\r\n");
		TLabel.setBounds(58, 32, 271, 69);
		TLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 35));
		contentPane.add(TLabel);
		
		JLabel lblHours = new JLabel("2+ Hours");
		lblHours.setBounds(58, 114, 245, 39);
		lblHours.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		contentPane.add(lblHours);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(48, 98, 301, 3);
		separator.setForeground(Color.BLACK);
		contentPane.add(separator);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(908, 98, 2, 873);
		contentPane.add(separator_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(30, 154, 884, 889);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWarmups = new JLabel("WARM-UPS \r\n");
		lblWarmups.setBounds(66, 13, 457, 87);
		panel.add(lblWarmups);
		lblWarmups.setHorizontalAlignment(SwingConstants.LEFT);
		lblWarmups.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 50));
		
		JLabel label1 = new JLabel("New label");
		label1.setBounds(119, 148, 107, 79);
		panel.add(label1);
		
		JButton button = new JButton("See More Details\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Leg_Crossovers lc = new Leg_Crossovers();
				lc.setVisible(true);
				lc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button.setBounds(546, 158, 164, 55);
		panel.add(button);
		button.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button.setBackground(Color.WHITE);
		
		JLabel lblHipCircles = new JLabel("Leg Crossovers");
		lblHipCircles.setBounds(292, 141, 154, 32);
		panel.add(lblHipCircles);
		lblHipCircles.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JTextPane txtpnReps = new JTextPane();
		txtpnReps.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		txtpnReps.setText("Reps : 10");
		txtpnReps.setBounds(292, 178, 118, 41);
		panel.add(txtpnReps);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(292, 174, 154, 8);
		panel.add(separator_1);
		separator_1.setForeground(Color.BLACK);
		
		JLabel label4 = new JLabel("New label");
		label4.setBounds(119, 529, 107, 79);
		panel.add(label4);
		
		JButton button_4 = new JButton("See More Details\r\n");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arm_Circles ac = new Arm_Circles();
				ac.setVisible(true);
				ac.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(546, 539, 164, 55);
		panel.add(button_4);
		
		JLabel lblArmCircles = new JLabel("Arm Circles");
		lblArmCircles.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblArmCircles.setBounds(292, 522, 141, 32);
		panel.add(lblArmCircles);
		
		JTextPane txtpnReps_2 = new JTextPane();
		txtpnReps_2.setText("Reps : 8 Inward\r\n           8 outward\r\n");
		txtpnReps_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		txtpnReps_2.setBounds(292, 559, 141, 55);
		panel.add(txtpnReps_2);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.BLACK);
		separator_6.setBounds(292, 555, 107, 8);
		panel.add(separator_6);
		
		JLabel label5 = new JLabel("New label");
		label5.setBounds(119, 658, 107, 79);
		panel.add(label5);
		
		JButton button_8 = new JButton("See More Details\r\n");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hip_Circles hc = new Hip_Circles();
				hc.setVisible(true);
				hc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_8.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(546, 668, 164, 55);
		panel.add(button_8);
		
		JLabel label_13 = new JLabel("Hip Circles\r\n");
		label_13.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		label_13.setBounds(292, 651, 107, 32);
		panel.add(label_13);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Reps : 8 Inward\r\n           8 outward\r\n           (Per Leg)");
		textPane_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		textPane_3.setBounds(292, 688, 141, 87);
		panel.add(textPane_3);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(Color.BLACK);
		separator_10.setBounds(292, 684, 107, 8);
		panel.add(separator_10);
		
		JLabel label2 = new JLabel("New label");
		label2.setBounds(119, 260, 107, 79);
		panel.add(label2);
		
		JButton button_3 = new JButton("See More Details\r\n");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Squats s = new Squats();
				s.setVisible(true);
				s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(546, 270, 164, 55);
		panel.add(button_3);
		
		JLabel label_4 = new JLabel("Squats");
		label_4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		label_4.setBounds(292, 253, 107, 32);
		panel.add(label_4);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setForeground(Color.BLACK);
		separator_15.setBounds(290, 285, 77, 8);
		panel.add(separator_15);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Reps : 15");
		textPane.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		textPane.setBounds(292, 290, 123, 41);
		panel.add(textPane);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(292, 290, 70, 4);
		panel.add(separator_5);
		
		JLabel label3 = new JLabel("New label");
		label3.setBounds(120, 393, 107, 79);
		panel.add(label3);
		
		JButton button_12 = new JButton("See More Details\r\n");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Leg_Swings ls = new Leg_Swings();
				ls.setVisible(true);
				ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_12.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_12.setBackground(Color.WHITE);
		button_12.setBounds(547, 403, 164, 55);
		panel.add(button_12);
		
		JLabel lblLegSwings = new JLabel("Leg Swings\r\n");
		lblLegSwings.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblLegSwings.setBounds(293, 386, 107, 32);
		panel.add(lblLegSwings);
		
		JTextPane txtpnReps_3 = new JTextPane();
		txtpnReps_3.setText("Reps : 10");
		txtpnReps_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		txtpnReps_3.setBounds(293, 423, 123, 41);
		panel.add(txtpnReps_3);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setForeground(Color.BLACK);
		separator_14.setBounds(293, 423, 79, 4);
		panel.add(separator_14);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setForeground(Color.BLACK);
		separator_16.setBounds(291, 418, 107, 8);
		panel.add(separator_16);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(946, 82, 884, 889);
		contentPane.add(panel_1);
		
		JLabel lblWorkout = new JLabel("WORKOUT");
		lblWorkout.setHorizontalAlignment(SwingConstants.LEFT);
		lblWorkout.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 50));
		lblWorkout.setBounds(66, 13, 457, 87);
		panel_1.add(lblWorkout);
		
		JLabel lblMinBreaks = new JLabel("3 min breaks between each exercises");
		lblMinBreaks.setBounds(386, 46, 465, 39);
		panel_1.add(lblMinBreaks);
		lblMinBreaks.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 28));
		
		JLabel label6 = new JLabel("New label");
		label6.setBounds(134, 120, 107, 79);
		panel_1.add(label6);
		
		JButton button_1 = new JButton("See More Details\r\n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Static_Lunges sl = new Static_Lunges();
				sl.setVisible(true);
				sl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(561, 130, 164, 55);
		panel_1.add(button_1);
		
		JLabel lblStaticLunges = new JLabel("Static Lunges");
		lblStaticLunges.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblStaticLunges.setBounds(307, 113, 164, 32);
		panel_1.add(lblStaticLunges);
		
		JTextPane txtpnReps_4 = new JTextPane();
		txtpnReps_4.setText("Reps : 15 \r\nSets : 3");
		txtpnReps_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		txtpnReps_4.setBounds(307, 150, 107, 49);
		panel_1.add(txtpnReps_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(307, 146, 141, 8);
		panel_1.add(separator_2);
		
		JLabel label7 = new JLabel("New label");
		label7.setBounds(134, 227, 107, 79);
		panel_1.add(label7);
		
		JButton button_5 = new JButton("See More Details\r\n");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plank_Wraps pw = new Plank_Wraps();
				pw.setVisible(true);
				pw.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(561, 237, 164, 55);
		panel_1.add(button_5);
		
		JLabel lblPlankWraps = new JLabel("Plank Wraps");
		lblPlankWraps.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblPlankWraps.setBounds(307, 220, 141, 32);
		panel_1.add(lblPlankWraps);
		
		JTextPane txtpnReps_5 = new JTextPane();
		txtpnReps_5.setText("Reps : 5 each side\r\nSets : 3");
		txtpnReps_5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		txtpnReps_5.setBounds(307, 257, 141, 55);
		panel_1.add(txtpnReps_5);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setBounds(307, 253, 119, 8);
		panel_1.add(separator_7);
		
		JLabel label8 = new JLabel("New label");
		label8.setBounds(134, 339, 107, 79);
		panel_1.add(label8);
		
		JButton button_6 = new JButton("See More Details\r\n");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Burpees br = new Burpees();
				br.setVisible(true);
				br.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(561, 349, 164, 55);
		panel_1.add(button_6);
		
		JLabel lblBurpees = new JLabel("Burpees");
		lblBurpees.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblBurpees.setBounds(307, 332, 107, 32);
		panel_1.add(lblBurpees);
		
		JTextPane txtpnReps_6 = new JTextPane();
		txtpnReps_6.setText("Reps : 10 \r\nSets : 3");
		txtpnReps_6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		txtpnReps_6.setBounds(307, 369, 119, 55);
		panel_1.add(txtpnReps_6);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.BLACK);
		separator_8.setBounds(307, 365, 107, 8);
		panel_1.add(separator_8);
		
		JLabel label9 = new JLabel("New label");
		label9.setBounds(134, 447, 107, 79);
		panel_1.add(label9);
		
		JButton button_7 = new JButton("See More Details\r\n");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Push_Ups pu = new Push_Ups();
				pu.setVisible(true);
				pu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_7.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(561, 457, 164, 55);
		panel_1.add(button_7);
		
		JLabel lblPushUps = new JLabel("Push Ups");
		lblPushUps.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblPushUps.setBounds(307, 440, 107, 32);
		panel_1.add(lblPushUps);
		
		JTextPane txtpnReps_7 = new JTextPane();
		txtpnReps_7.setText("Reps : 15\r\nSets : 3");
		txtpnReps_7.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		txtpnReps_7.setBounds(307, 477, 107, 55);
		panel_1.add(txtpnReps_7);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.BLACK);
		separator_9.setBounds(307, 473, 107, 8);
		panel_1.add(separator_9);
		
		JLabel label10 = new JLabel("New label");
		label10.setBounds(134, 558, 107, 79);
		panel_1.add(label10);
		
		JButton button_9 = new JButton("See More Details\r\n");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Diamond_Push_Up_Knees dp = new Diamond_Push_Up_Knees();
				dp.setVisible(true);
				dp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_9.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(561, 568, 164, 55);
		panel_1.add(button_9);
		
		JLabel lblDiamondPushUps = new JLabel("Diamond Push Ups");
		lblDiamondPushUps.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblDiamondPushUps.setBounds(307, 551, 185, 32);
		panel_1.add(lblDiamondPushUps);
		
		JTextPane txtpnReps_8 = new JTextPane();
		txtpnReps_8.setText("Reps : 15\r\nSets : 2");
		txtpnReps_8.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		txtpnReps_8.setBounds(307, 588, 97, 55);
		panel_1.add(txtpnReps_8);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(Color.BLACK);
		separator_11.setBounds(307, 584, 185, 8);
		panel_1.add(separator_11);
		
		JLabel label11 = new JLabel("New label");
		label11.setBounds(134, 667, 107, 79);
		panel_1.add(label11);
		
		JButton button_10 = new JButton("See More Details\r\n");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plank pl = new Plank();
				pl.setVisible(true);
				pl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_10.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(561, 677, 164, 55);
		panel_1.add(button_10);
		
		JLabel lblPlank = new JLabel("Plank\r\n");
		lblPlank.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblPlank.setBounds(307, 660, 107, 32);
		panel_1.add(lblPlank);
		
		JTextPane txtpnMinSets = new JTextPane();
		txtpnMinSets.setText("3 Min \r\nSets : 3");
		txtpnMinSets.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		txtpnMinSets.setBounds(307, 697, 76, 55);
		panel_1.add(txtpnMinSets);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setForeground(Color.BLACK);
		separator_12.setBounds(307, 693, 68, -1);
		panel_1.add(separator_12);
		
		JLabel label12 = new JLabel("New label");
		label12.setBounds(134, 772, 107, 79);
		panel_1.add(label12);
		
		JButton button_11 = new JButton("See More Details\r\n");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plank_Oblique po = new Plank_Oblique();
				po.setVisible(true);
				po.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_11.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(561, 782, 164, 55);
		panel_1.add(button_11);
		
		JTextPane txtpnReps_9 = new JTextPane();
		txtpnReps_9.setText("Reps : 10 \r\nSets : 2");
		txtpnReps_9.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		txtpnReps_9.setBounds(307, 802, 85, 55);
		panel_1.add(txtpnReps_9);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setForeground(Color.BLACK);
		separator_13.setBounds(307, 798, 107, 8);
		panel_1.add(separator_13);
		
		JTextPane txtpnSidePlanksWith = new JTextPane();
		txtpnSidePlanksWith.setText("Side planks with \r\noblique wraps");
		txtpnSidePlanksWith.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		txtpnSidePlanksWith.setBounds(304, 751, 141, 55);
		panel_1.add(txtpnSidePlanksWith);
		
		JSeparator separator_17 = new JSeparator();
		separator_17.setForeground(Color.BLACK);
		separator_17.setBounds(306, 692, 70, 8);
		panel_1.add(separator_17);
		
		// ---------------------------------------------------------------------------------------------------------------
		
				//WarmUp pictures 
				ImageIcon img1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Warmup.png")));
				Image img_1 = img1.getImage();
				Image dimg = img_1.getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i = new ImageIcon(dimg);
				label1.setIcon(i);
				
				//WarmUp pictures 
				ImageIcon img2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Warmup.png")));
				Image img_2 = img2.getImage();
				Image dimg2 = img_2.getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i2 = new ImageIcon(dimg2);
				label2.setIcon(i2);
				
				//WarmUp pictures 
				ImageIcon img3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Warmup.png")));
				Image img_3 = img3.getImage();
				Image dimg3 = img_3.getScaledInstance(label3.getWidth(), label3.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i3 = new ImageIcon(dimg3);
				label3.setIcon(i3);
				
				//WarmUp pictures 
				ImageIcon img4 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Warmup.png")));
				Image img_4 = img4.getImage();
				Image dimg4 = img_4.getScaledInstance(label4.getWidth(), label4.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i4 = new ImageIcon(dimg4);
				label4.setIcon(i4);
				
				//WarmUp Picture
				ImageIcon img5 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Warmup.png")));
				Image img_5 = img5.getImage();
				Image dimg5 = img_5.getScaledInstance(label5.getWidth(), label5.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i5 = new ImageIcon(dimg5);
				label5.setIcon(i5);
				
				//WarmUp pictures 
				ImageIcon img6 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/WHome.png")));
				Image img_6 = img6.getImage();
				Image dimg6 = img_6.getScaledInstance(label6.getWidth(), label6.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i6 = new ImageIcon(dimg6);
				label6.setIcon(i6);

				
			// ----------------------------------------------------------------------------------------------------------------------------------
				
				
				//Workout pictures 
				ImageIcon img7 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/WHome.png")));
				Image img_7 = img7.getImage();
				Image dimg7 = img_7.getScaledInstance(label7.getWidth(), label7.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i7 = new ImageIcon(dimg7);
				label7.setIcon(i7);
				
				//Workout pictures 
				ImageIcon img8 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/WHome.png")));
				Image img_8 = img8.getImage();
				Image dimg8 = img_8.getScaledInstance(label8.getWidth(), label8.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i8 = new ImageIcon(dimg8);
				label8.setIcon(i8);
				
				ImageIcon img9 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/WHome.png")));
				Image img_9 = img9.getImage();
				Image dimg9 = img_9.getScaledInstance(label9.getWidth(), label9.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i9 = new ImageIcon(dimg9);
				label9.setIcon(i9);
				
				//Workout pictures 
				ImageIcon img10 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/WHome.png")));
				Image img_10 = img10.getImage();
				Image dimg10 = img_10.getScaledInstance(label10.getWidth(), label10.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i10 = new ImageIcon(dimg10);
				label10.setIcon(i10);
				
				ImageIcon img11 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/WHome.png")));
				Image img_11 = img11.getImage();
				Image dimg11 = img_11.getScaledInstance(label11.getWidth(), label11.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i11 = new ImageIcon(dimg11);
				label11.setIcon(i11);
				
				//Workout pictures 
				ImageIcon img12 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/WHome.png")));
				Image img_12 = img12.getImage();
				Image dimg12 = img_12.getScaledInstance(label12.getWidth(), label12.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i12 = new ImageIcon(dimg12);
				label12.setIcon(i12);
	}
}
