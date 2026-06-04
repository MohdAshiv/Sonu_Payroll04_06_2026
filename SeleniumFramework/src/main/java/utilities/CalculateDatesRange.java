package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class CalculateDatesRange 
{
	static int len;

	public static int getDatesBetweenUsingJava7( String startDate, String endDate) 
			  {
				SimpleDateFormat ob=new SimpleDateFormat("dd/MM/yyyy");
				Date sDate;
				try {
					sDate = ob.parse(startDate);
				
				Date eDate=ob.parse(endDate);
			
			    List<Date> datesInRange = new ArrayList<>();
			    Calendar calendar = new GregorianCalendar();
			    calendar.setTime(sDate);
			    
			    Calendar endCalendar = new GregorianCalendar();
			    endCalendar.setTime(eDate);

			    while (calendar.before(endCalendar)) 
			    {
			        Date result = calendar.getTime();
			        datesInRange.add(result);
			        calendar.add(Calendar.DATE, 1);
			    }
			     len=datesInRange.size();
			    
			    
				}
				catch (ParseException e) {
					
					e.printStackTrace();
				}
			    return len;
			}
}
