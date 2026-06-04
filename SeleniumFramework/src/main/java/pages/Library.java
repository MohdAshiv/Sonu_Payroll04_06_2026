package pages;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Library 

{
	 private static WebDriver m_Driver;
	WebDriver driver;
	

	{
		// TODO Auto-generated constructor stub
	}
	
	public Library(WebDriver m_Driver2) {
		// TODO Auto-generated constructor stub
	}
	//Switch into frame	  
    public void switchFrameNew(WebDriver driver, WebElement element)
    {
		//Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(element);
	  }
//Switch To Default Content
    public void switchDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
//Switch To Parent Frame
    public void switchToParentFrame(WebDriver driver) 
    {
		driver.switchTo().parentFrame();
	}
	
  //mouse Hover     
    public void mouseHover(WebElement element) {
  	  Actions act = new Actions(driver);
  	  act.moveToElement(element).perform();
		
	 }
/*Mouse Click*/
    public void mouseClick(WebElement element) {
  	  Actions act = new Actions(driver);
  	  act.moveToElement(element).perform();
  	  act.click(element).perform();
	
}
    public void selectByVisibleText(WebElement element,String text) 
    {

		Select sel = new Select(element);
		sel.selectByVisibleText(text);

}
    
    
    
    public static void Switchwindow(int tabnp, WebDriver driver)
    {
    	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(tabnp));
    }
    public void switchwindowForward(WebDriver driver)  {
  		@SuppressWarnings({ "rawtypes", "unchecked" })
  		ArrayList tabs = new ArrayList (driver.getWindowHandles());
  		System.out.println(tabs.size());
  		driver.switchTo().window((String) tabs.get(tabs.size()-1));
  		//Thread.sleep(2000);
  	}
  	public void switchwindowBackward(WebDriver driver) throws InterruptedException {
  		@SuppressWarnings({ "rawtypes", "unchecked" })
  		ArrayList tabs = new ArrayList (driver.getWindowHandles());
  		System.out.println(tabs.size());
  		driver.switchTo().window((String) tabs.get(tabs.size()-2));
  		//Thread.sleep(2000);
}
    
  //Random String Generation
  	public String RandomString(String str)  {
		Random rd= new Random();
		int in = rd.nextInt(1000);
		return (str+in);
  	}
//Add Days
  	public Date addDays(Date d, int days)
    {
		
        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
        return d;
         
    }
//PopUp Handling
  	public void popUpHandlingOk(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
  	public void popUpHandlingCancel(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
}
  	/*ScrollHEight_javaScriptExecutor*/
  	public void ScrollHeight(WebDriver driver) {
  	  		JavascriptExecutor js =(JavascriptExecutor)driver;
  	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
  		}
  	 /*ScrollHeightUsingPixel*/
  	public void ScrollHeightPixel(WebDriver driver,int pixel) {
  	  	    JavascriptExecutor js =(JavascriptExecutor)driver;
  	        js.executeScript("window.scrollBy(0,250)");
  		}

  	
  	
  	/*ScrollHEight_javaScriptExecutor*/
  	public void ScrollToElement(WebDriver driver,WebElement element) {
  		    //WebElement element = driver.findElement(By.id("id_of_element"));
  		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
  		    try {
  				Thread.sleep(300);
  			} catch (InterruptedException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
  	}
  		    
  		    public static void waitForElementById(String id)
  		   
  		   
  		    {
  		    WebDriverWait wait=new WebDriverWait(m_Driver,Duration.ofSeconds(30));
  		    wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
  		    
  		    }		    
  		    
  		    public static void waitForElementClickedBy(String id)
  		    {
  		    	
  		    	WebDriverWait wait=new WebDriverWait(m_Driver,Duration.ofSeconds(30));
  		    	wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
  		    	
  		    }
             
  		  public static void waitForElementByXpath(String xpath)
  		  		   
  		   {
  		   	WebDriverWait wait=new WebDriverWait(m_Driver,Duration.ofSeconds(30));
  		   	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
  			   			   
  		   }
  		  
  		  public static void waitForElementByClass(String classname)
  		
  		  {
  			  
   		   	WebDriverWait wait=new WebDriverWait(m_Driver,Duration.ofSeconds(30));
   		   	
   		 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(classname)));
  		  }
  		  
  		public void implictWaitForSeconds(WebDriver driver, int time){
  			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
  		}
  		
  		public void implictWaitForMinutes(WebDriver driver, int time)
  		{
  			driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
  		}
  		
  		public void explicitWait_visibilityOfElementLocated(WebDriver driver, int time, By locator){
  			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
  			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  		}
  		
  		public void explicitWait_visibilityOf(WebDriver driver, int time, WebElement locator)
  		{
  			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
  			wait.until(ExpectedConditions.visibilityOf(locator));
  		}
  		public void explicitiWait_presenceOfElementLocated(WebDriver driver, int time, By locator){
  			WebDriverWait iwait = new WebDriverWait(driver, Duration.ofSeconds(time));
  			iwait.until(ExpectedConditions.presenceOfElementLocated(locator));
  			
  		}
  		
//  		public void fluentWait(WebDriver driver, int totalTime,int pollingTime, WebElement element){
//  			
//  			FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
//  			fw.withTimeout(totalTime, TimeUnit.SECONDS);
//  			fw.pollingEvery(pollingTime, TimeUnit.SECONDS);
//  			fw.ignoring(NoSuchElementException.class);
//  			fw.until(ExpectedConditions.visibilityOf(element));
//  		}
  		
  		public void explicitWait_elementToBeClickable(WebDriver driver, int time, WebElement element){
  			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
  			wait.until(ExpectedConditions.elementToBeClickable(element));	
  		}
  		
  		public void explicitWait_attributeToBeNotEmpty(WebDriver driver, int time, WebElement element, String attribute){
  			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
  			wait.until(ExpectedConditions.attributeToBeNotEmpty(element,attribute));
  		}
  		
  		public void explicitWait_textToBePresentInElementValue(WebDriver driver, int time, WebElement element, String value){
  			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
  			wait.until(ExpectedConditions.textToBePresentInElementValue(element, value));
  		}

 		public void ArrowDownSelect(WebDriver driver,WebElement element) {
  	  		
  	  	  	try {
  	  	  		Thread.sleep(1000);
  	  	  	} 
  	  	  	catch (InterruptedException e1) 
  	  	  	{
  	  	  	e1.printStackTrace();
  	  	  	}	
  	    element.click();
  	    try {
  		  		Thread.sleep(1000);
  		  	} catch (InterruptedException e1) 
  	    {
  		  	e1.printStackTrace();
  		  	}	
  	  	//element.sendKeys(st);
  	  	try {
  	  		Thread.sleep(1000);
  	  	} catch (InterruptedException e1) {
  	  	e1.printStackTrace();
  	  	}
  	  	explicitWait_attributeToBeNotEmpty(driver, 5, element, "value");
  	  	Actions act = new Actions(driver);
  	  	act.sendKeys(Keys.ARROW_DOWN).perform();
  	  	act.sendKeys(Keys.ENTER).perform();	
  	  	}
 		public static void tabswitch1(WebDriver driver)

 		{
 			
 			String parentwindow= driver.getWindowHandle();
 		    Set<String> s1 =driver.getWindowHandles();
 		    Iterator<String> i1 =s1.iterator();

 		while(i1.hasNext())
 		{

 		    String child_window = i1.next();
 		    	if(!parentwindow.equalsIgnoreCase(child_window));
 		    	{
 		    		driver.switchTo().window(child_window);
 		    	}
 		}
 		    }
 		    	
 		    	
 	
 		
 			  
 			
 			
 		
 			
 				        
 		
 			 
 			
 			    	

 
}














