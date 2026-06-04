package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitUtility {

	public void implictWaitForSeconds(WebDriver driver, int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void implictWaitForMinutes(WebDriver driver, int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
	}
	
	public void explicitWait_visibilityOfElementLocated(WebDriver driver, int time, By locator){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void explicitWait_visibilityOf(WebDriver driver, int time, WebElement locator){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	public void explicitiWait_presenceOfElementLocated(WebDriver driver, int time, By locator){
		WebDriverWait iwait = new WebDriverWait(driver, Duration.ofSeconds(time));
		iwait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
//	public void fluentWait(WebDriver driver, int totalTime,int pollingTime, WebElement element){
//		
//		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
//		fw.withTimeout(totalTime, TimeUnit.SECONDS);
//		fw.pollingEvery(pollingTime, TimeUnit.SECONDS);
//		fw.ignoring(NoSuchElementException.class);
//		fw.until(ExpectedConditions.visibilityOf(element));
//	}
	
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

	public void until(ExpectedCondition<Boolean> stalenessOf) {
		// TODO Auto-generated method stub
		
	}
}

