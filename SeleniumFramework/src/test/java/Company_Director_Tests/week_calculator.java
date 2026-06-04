package Company_Director_Tests;

import java.text.ParseException;

import org.apache.http.util.Args;

import utilities.CalculateDatesRange;

public class week_calculator 
{
	
	public void getweek() throws ParseException
	{
		String sdate="11/05/2021";
		String edate="05/04/2022";
		int size=CalculateDatesRange.getDatesBetweenUsingJava7(sdate, edate);
		int week=size/7;
		System.out.println(week);
	}
	
	public static void main(String args[]) throws ParseException
	{
		
		week_calculator ob=new week_calculator();
		ob.getweek();
		
	}

}
