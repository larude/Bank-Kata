package bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateF {
	
	public static Date date(String dateString) {
		Date myDate = new Date();
		try {
			 SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
			 myDate = formatDate.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return myDate;
	}

}
