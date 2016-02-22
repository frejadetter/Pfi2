import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;


public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField HoursField;
	private JTextField MinuteFiled;
	private JLabel LabelTime;
	private ClockLogic clockLogic;

	public void setTimeOnLabel(String time){
		
		LabelTime.setText(time);
		
		}


	public void ShowAlarm (){
		
	}


	public void ActivateAlarm(){
		
	}

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LabelTime = new JLabel("");
		LabelTime.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTime.setFont(new Font("Avenir", Font.PLAIN, 16));
		LabelTime.setBounds(241, 17, 183, 86);
		contentPane.add(LabelTime);
		
		JLabel Alarm = new JLabel("Alarm");
		Alarm.setFont(new Font("Avenir", Font.PLAIN, 16));
		Alarm.setHorizontalAlignment(SwingConstants.CENTER);
		Alarm.setBounds(241, 124, 183, 75);
		contentPane.add(Alarm);
		
		HoursField = new JTextField();
		HoursField.setBounds(132, 64, 87, 40);
		contentPane.add(HoursField);
		HoursField.setColumns(10);
		
		MinuteFiled = new JTextField();
		MinuteFiled.setColumns(10);
		MinuteFiled.setBounds(132, 124, 87, 40);
		contentPane.add(MinuteFiled);
		
		JLabel lblHours = new JLabel("HOURS");
		lblHours.setFont(new Font("Avenir", Font.PLAIN, 15));
		lblHours.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHours.setBounds(43, 64, 77, 40);
		contentPane.add(lblHours);
		
		JLabel lblMinutes = new JLabel("MINUTES");
		lblMinutes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMinutes.setFont(new Font("Avenir", Font.PLAIN, 15));
		lblMinutes.setBounds(43, 124, 77, 40);
		contentPane.add(lblMinutes);
		
		JButton SetAlarm = new JButton("SET ALARM");
		SetAlarm.setFont(new Font("Avenir", Font.BOLD, 15));
		SetAlarm.setBounds(43, 203, 101, 52);
		contentPane.add(SetAlarm);
		
		JButton ClearAlarm = new JButton("CLEAR ALARM");
		ClearAlarm.setFont(new Font("Avenir", Font.BOLD, 13));
		ClearAlarm.setBounds(165, 203, 101, 52);
		contentPane.add(ClearAlarm);
	}
}
