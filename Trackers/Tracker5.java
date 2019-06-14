package FitnessGUI.Trackers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import FitnessGUI.Plan;
import gui.Arm_Circles;
import gui.Bench_Press;
import gui.Bent_Over_Row;
import gui.Burpees;
import gui.Diamond_Push_Up_Knees;
import gui.Dumbell_Scaption;
import gui.Hip_Circles;
import gui.Leg_Crossovers;
import gui.Leg_Swings;
import gui.Plank;
import gui.Plank_Oblique;
import gui.Plank_Wraps;
import gui.Push_Ups;
import gui.Side_Plank_Dumbbell_Reach;
import gui.Squats;
import gui.Static_Lunges;
import gui.Travelling_Dumbell_Swing;
import gui.Walking_Lunges;

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

public class Tracker5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tracker5 frame = new Tracker5();
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
	public Tracker5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1835, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel TLabel = new JLabel("Intermediate Workout");
		TLabel.setBounds(58, 32, 376, 69);
		TLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 35));
		contentPane.add(TLabel);
		
		JLabel lblHour = new JLabel("1 Hour");
		lblHour.setBounds(58, 114, 245, 39);
		lblHour.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		contentPane.add(lblHour);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(48, 98, 359, 2);
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
		
		JLabel label1 = new JLabel("New label");
		label1.setBounds(119, 191, 107, 79);
		panel.add(label1);
		
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
		button.setBackground(Color.LIGHT_GRAY);
		
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
		
		JLabel label2 = new JLabel("New label");
		label2.setBounds(119, 375, 107, 79);
		panel.add(label2);
		
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
		button_2.setBackground(Color.LIGHT_GRAY);
		
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
		
		JLabel label3 = new JLabel("New label");
		label3.setBounds(119, 534, 107, 79);
		panel.add(label3);
		
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
		button_3.setBackground(Color.LIGHT_GRAY);
		
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
		
		JLabel label4 = new JLabel("New label");
		label4.setBounds(119, 712, 107, 79);
		panel.add(label4);
		
		JButton button_4 = new JButton("See More Details\r\n");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Leg_Crossovers lc = new Leg_Crossovers();
				lc.setVisible(true);
				lc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});
		button_4.setBounds(546, 699, 196, 69);
		panel.add(button_4);
		button_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_4.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblLegSwings = new JLabel("Leg Crossover");
		lblLegSwings.setBounds(292, 699, 197, 39);
		panel.add(lblLegSwings);
		lblLegSwings.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		
		JTextPane txtpnReps_3 = new JTextPane();
		txtpnReps_3.setText("Reps : 10\r\n");
		txtpnReps_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_3.setBounds(292, 755, 196, 92);
		panel.add(txtpnReps_3);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(292, 742, 197, 8);
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
		
		JLabel label5 = new JLabel("New label");
		label5.setBounds(120, 148, 107, 79);
		panel_1.add(label5);
		
		JButton button_1 = new JButton("See More Details\r\n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bent_Over_Row bor = new Bent_Over_Row();
				bor.setVisible(true);
				bor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(548, 153, 183, 60);
		panel_1.add(button_1);
		
		JTextPane txtpnReps_4 = new JTextPane();
		txtpnReps_4.setText("Reps : 15\r\nSets : 3");
		txtpnReps_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_4.setBounds(283, 186, 154, 60);
		panel_1.add(txtpnReps_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(283, 181, 217, 8);
		panel_1.add(separator_2);
		
		JLabel label6 = new JLabel("New label");
		label6.setBounds(120, 264, 107, 79);
		panel_1.add(label6);
		
		JButton button_5 = new JButton("See More Details\r\n");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Walking_Lunges wl = new Walking_Lunges();
				wl.setVisible(true);
				wl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(548, 269, 183, 60);
		panel_1.add(button_5);
		
		JLabel lblPlankWraps = new JLabel("Walking Lunge\r\n");
		lblPlankWraps.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPlankWraps.setBounds(283, 253, 217, 36);
		panel_1.add(lblPlankWraps);
		
		JTextPane txtpnReps_5 = new JTextPane();
		txtpnReps_5.setText("Reps : 20\r\nSets : 3");
		txtpnReps_5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_5.setBounds(283, 302, 173, 60);
		panel_1.add(txtpnReps_5);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setBounds(283, 297, 217, 8);
		panel_1.add(separator_7);
		
		JLabel label7 = new JLabel("New label");
		label7.setBounds(120, 386, 107, 79);
		panel_1.add(label7);
		
		JButton button_6 = new JButton("See More Details\r\n");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Travelling_Dumbell_Swing tds = new Travelling_Dumbell_Swing();
				tds.setVisible(true);
				tds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(548, 391, 183, 60);
		panel_1.add(button_6);
		
		JLabel lblStaticLunges = new JLabel("Dumbbell Swing ");
		lblStaticLunges.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblStaticLunges.setBounds(283, 375, 240, 36);
		panel_1.add(lblStaticLunges);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Reps : 15\r\nSets : 2");
		textPane_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		textPane_2.setBounds(283, 424, 154, 60);
		panel_1.add(textPane_2);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.BLACK);
		separator_8.setBounds(283, 419, 217, 8);
		panel_1.add(separator_8);
		
		JLabel label8 = new JLabel("New label");
		label8.setBounds(120, 508, 107, 79);
		panel_1.add(label8);
		
		JButton button_7 = new JButton("See More Details\r\n");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bench_Press bp = new Bench_Press();
				bp.setVisible(true);
				bp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_7.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setBounds(548, 513, 183, 60);
		panel_1.add(button_7);
		
		JLabel lblBurpees = new JLabel("Bench Press");
		lblBurpees.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblBurpees.setBounds(283, 497, 173, 36);
		panel_1.add(lblBurpees);
		
		JTextPane txtpnReps_6 = new JTextPane();
		txtpnReps_6.setText("Reps : 8\r\nSets : 3");
		txtpnReps_6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_6.setBounds(283, 546, 154, 60);
		panel_1.add(txtpnReps_6);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.BLACK);
		separator_9.setBounds(283, 541, 173, 8);
		panel_1.add(separator_9);
		
		JLabel label9 = new JLabel("New label");
		label9.setBounds(120, 627, 107, 79);
		panel_1.add(label9);
		
		JButton button_8 = new JButton("See More Details\r\n");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dumbell_Scaption ds = new Dumbell_Scaption();
				ds.setVisible(true);
				ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_8.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.setBounds(548, 632, 183, 60);
		panel_1.add(button_8);
		
		JLabel lblDiamondPushUps = new JLabel("Dumbbell Scaption");
		lblDiamondPushUps.setFont(new Font("Trebuchet MS", Font.BOLD, 23));
		lblDiamondPushUps.setBounds(283, 616, 212, 36);
		panel_1.add(lblDiamondPushUps);
		
		JTextPane txtpnReps_7 = new JTextPane();
		txtpnReps_7.setText("Reps : 8\r\nSets : 3");
		txtpnReps_7.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnReps_7.setBounds(283, 665, 154, 60);
		panel_1.add(txtpnReps_7);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(Color.BLACK);
		separator_10.setBounds(283, 660, 195, 8);
		panel_1.add(separator_10);
		
		JLabel label10 = new JLabel("New label");
		label10.setBounds(120, 744, 107, 79);
		panel_1.add(label10);
		
		JButton button_9 = new JButton("See More Details\r\n");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Side_Plank_Dumbbell_Reach spdr = new Side_Plank_Dumbbell_Reach();
				spdr.setVisible(true);
				spdr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		button_9.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		button_9.setBackground(Color.LIGHT_GRAY);
		button_9.setBounds(548, 749, 183, 60);
		panel_1.add(button_9);
		
		JLabel lblPlanks = new JLabel("Side Plank w/ Dumbell");
		lblPlanks.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblPlanks.setBounds(283, 733, 240, 36);
		panel_1.add(lblPlanks);
		
		JTextPane txtpnMinSets = new JTextPane();
		txtpnMinSets.setText("5 Each Side");
		txtpnMinSets.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		txtpnMinSets.setBounds(283, 782, 154, 60);
		panel_1.add(txtpnMinSets);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(Color.BLACK);
		separator_11.setBounds(283, 777, 217, 8);
		panel_1.add(separator_11);
		
		JTextPane txtpnSidePlanksWith = new JTextPane();
		txtpnSidePlanksWith.setText("Bent-Over Row");
		txtpnSidePlanksWith.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		txtpnSidePlanksWith.setBounds(281, 140, 227, 37);
		panel_1.add(txtpnSidePlanksWith);
		
		JLabel label_2 = new JLabel("3 min breaks between each exercises");
		label_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 28));
		label_2.setBounds(370, 36, 465, 39);
		panel_1.add(label_2);
		
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
				
			// ----------------------------------------------------------------------------------------------------------------------------------
				
				//Workout Picture
				ImageIcon img5 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/WHome.png")));
				Image img_5 = img5.getImage();
				Image dimg5 = img_5.getScaledInstance(label5.getWidth(), label5.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i5 = new ImageIcon(dimg5);
				label5.setIcon(i5);
				
				//Workout pictures 
				ImageIcon img6 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/WHome.png")));
				Image img_6 = img6.getImage();
				Image dimg6 = img_6.getScaledInstance(label6.getWidth(), label6.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon i6 = new ImageIcon(dimg6);
				label6.setIcon(i6);
				
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
	}
}
