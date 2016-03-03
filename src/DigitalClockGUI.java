import java.awt.BorderLayout;
import java.util.Calendar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	JTextField textFieldHours;
	JTextField textFieldMinutes;
	private ClockLogic clockLogic;
	private JLabel labelTime;
	private JLabel labelAlarm;
	private JLabel labelAlarmTime;
	private JLabel lblTimeIs;

	
public void setTimeOnLabel(String time){
	labelTime.setText(time);
}


	public void activateAlarm(boolean activate){
		if(activate == true){
			labelAlarmTime.setText("Alarm!!");
		
		}
		
	}
	
	
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
		setBounds(100, 100, 373, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JLabel lblHour = new JLabel("HOUR");
		lblHour.setBounds(37, 184, 61, 16);
		contentPane.add(lblHour);
		
		textFieldHours = new JTextField();
		textFieldHours.setBounds(84, 179, 68, 26);
		contentPane.add(textFieldHours);
		textFieldHours.setColumns(10);
		
		JLabel lblMinutes = new JLabel("MINUTES");
		lblMinutes.setBounds(171, 184, 61, 16);
		contentPane.add(lblMinutes);
		
		textFieldMinutes = new JTextField();
		textFieldMinutes.setBounds(244, 179, 75, 26);
		contentPane.add(textFieldMinutes);
		textFieldMinutes.setColumns(10);
		
		JButton btnSetAlarm = new JButton("SET ALARM");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hourString = textFieldHours.getText();
				String minuteString = textFieldMinutes.getText();
				
				int hour = Integer.parseInt(hourString);
			    int minute = Integer.parseInt(minuteString);
			    
				clockLogic.setAlarm(hour, minute);
				
				labelAlarmTime.setText(hourString + " : " + minuteString);
				
			
			}
		});
		btnSetAlarm.setBounds(47, 219, 117, 29);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("CLEAR ALARM");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				labelAlarmTime.setText(" ");
				clockLogic.clearAlarm();
				
			}
		});
		btnClearAlarm.setBounds(192, 219, 117, 29);
		contentPane.add(btnClearAlarm);
		
		
		labelAlarm = new JLabel("ALARM AT");
		labelAlarm.setBounds(37, 100, 75, 16);
		contentPane.add(labelAlarm);
		
		labelTime = new JLabel("");
		labelTime.setFont(new Font("Avenir", Font.PLAIN, 25));
		labelTime.setBounds(37, 23, 294, 69);
		contentPane.add(labelTime);
		
		labelAlarmTime = new JLabel("");
		labelAlarmTime.setBounds(37, 122, 154, 45);
		contentPane.add(labelAlarmTime);
		
		lblTimeIs = new JLabel("Time is");
		lblTimeIs.setBounds(37, 6, 61, 16);
		contentPane.add(lblTimeIs);
		
		clockLogic = new ClockLogic(this);
		
		
	}
	
	
	
}
