package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class AgentReports extends BasePage{

	public AgentReports(WebDriver driver) {
		super(driver);
	}
	
	

	private By reports = By.xpath("//*[@id='Reports']/table/tbody/tr[1]/td/a");

	// we are using index to click all agent report
     
	/**
 	 * Click  Reports 
	 * @throws InterruptedException 
     * @name Click  Reports 
     */
	
	

}
