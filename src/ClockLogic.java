import java.util.Calendar;

import javax.swing.JOptionPane;

public class ClockLogic {

	private ClockLogic digitalClockGUI;
	private int alarmHour;
	private int alarmMinute;
	private  DigitalClockGUI digClockGUI;

	
	public ClockLogic (DigitalClockGUI digitalClockGUI){
		this.digClockGUI = digitalClockGUI;
		ClockThread clockTread = new ClockThread();
		clockTread.start();
		
	}
	
public void setAlarm(int hours, int minutes){
	this.alarmHour = hours;
	this.alarmMinute = minutes;

} 
		
	
	
	
	
	
	public void clearAlarm(){
		alarmHour = 0;
		alarmMinute = 0;
		
	}
	
	
	public static String addZero(int i){
		String s = String.valueOf(i);
		if( s.length() == 1) {
			s="0" + s;
		}
		return s;
	}
	
	private class ClockThread extends Thread{
		@Override
		public void run() {
			while(true){
				
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int min = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);
			

				digClockGUI.setTimeOnLabel(addZero(hour) + " : "+ addZero(min) + " : " + addZero(second));
				
				
			if( alarmHour == hour && alarmMinute == min){
					
					digClockGUI.activateAlarm(true);
				} 
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
					return;
				}
				
			
			}
			
			
		}

			
			
	}
	


		
	}
