package UdemyCode;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateandCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //date class examples
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
		
		//calendar class examples
		Calendar cal = Calendar.getInstance();
	    System.out.println(sd.format(cal.getTime()));
	    System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	    System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	    System.out.println(cal.get(Calendar.AM_PM));
	    System.out.println(cal.get(Calendar.MINUTE));
	}

}
