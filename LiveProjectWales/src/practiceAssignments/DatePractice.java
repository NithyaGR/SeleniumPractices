package practiceAssignments;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePractice {

	public static void main(String[] args) {


		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 15);//to go back previous cal.add(Calendar.DATE. -10);
		d = cal.getTime();//you need this to get the added date. 
		System.out.println(d);
		System.out.println(sdf.format(d));
		String dayString = d.toString().substring(0,3);
		System.out.println(dayString);
		String we1="Sat"; String we2="Sun";
		if((dayString.equals(we1))||(dayString.equals(we2))){
			System.out.println("Choose a weekday");
		}
		//System.out.println(dayString.length());
		String localFormat = sdf.format(d);
		System.out.println(localFormat);
		
		
		String dateArray[] = localFormat.split("/");
		System.out.println("Month :"+dateArray[0]);
		System.out.println("Day :"+dateArray[1]);
		System.out.println("Year :"+dateArray[2].substring(0, 2));
		
		
	}

}
