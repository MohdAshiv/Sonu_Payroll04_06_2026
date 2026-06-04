package utilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ChangeWindow extends BasePage
{
	public ChangeWindow(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static void tabswitch(WebDriver driver)
	{
		
		String parentwindow= driver.getWindowHandle();
		Set<String> s1 =driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		
		
	
		while(i1.hasNext())
		{
			String child_window = i1.next();
			if(!parentwindow.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
			}
		}
	
	}
	
	public static void Switchwindow(int tabnp, WebDriver driver) 
	{
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(tabnp));
	
	
	}
		

}
