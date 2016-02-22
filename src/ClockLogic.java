import java.util.Calendar;

public class ClockLogic {

	private ClockLogic clockLogic;
	private int alarmHour;
	private int alarmMinute;
	private DigitalClockGUI alarmGUI;
	
	

public ClockLogic (DigitalClockGUI digitalClockGUI){
	this.alarmGUI = digitalClockGUI;
	ClockThread ca = new ClockThread();
	ca.start();
	
}




public void setAlarm (int hours, int minute){
	
}

public void clearAlarm(){
	
}


private class ClockThread extends Thread{
	@Override
	public void run() {
		while(true){
			
			Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int minute = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);
				
				String time = hour + ":" + minute + second;
				System.out.println(time);
				
				alarmGUI.setTimeOnLabel(String.valueOf(hour) + String.valueOf(minute) + String.valueOf(second));
				
				
				try {
					Thread.sleep(900);
					} catch (InterruptedException e) {
					e.printStackTrace();
					
					return;
					}
			
		}
		
	}
}
}


