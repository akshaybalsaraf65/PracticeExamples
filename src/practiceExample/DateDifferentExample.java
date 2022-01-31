package practiceExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifferentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	String dateStart = "06/23/2021 05:30:56";
	        String dateStop = "06/26/2021 02:15:00";

	        //HH converts hour in 24 hours format (0-23), day calculation
	        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	        Date d1 = null;
	        Date d2 = null;

	        try {
	            d1 = format.parse(dateStart);
	            d2 = format.parse(dateStop);

	            //in milliseconds
	            long diff = d2.getTime() - d1.getTime();

	            long diffSeconds = diff / 1000 % 60;
	            long diffMinutes = diff / (60 * 1000) % 60;
	            long diffHours = diff / (60 * 60 * 1000) % 24;
	            long diffDays = diff / (24 * 60 * 60 * 1000);

	            System.out.print(diffDays + " days, ");
	            System.out.print(diffHours + " hours, ");
	            System.out.print(diffMinutes + " minutes, ");
	            System.out.print(diffSeconds + " seconds.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
