package utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class GernateRandomNumber {

	public  String  gernateRandom() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		 //  System.out.println(dtf.format(now)); 
		   
		   String r = dtf.format(now);
		   String t= r.replace("/", "");
		    t=t.replace(" ", "");
		    t=t.replace(":", "");
		    return t;
	}
}