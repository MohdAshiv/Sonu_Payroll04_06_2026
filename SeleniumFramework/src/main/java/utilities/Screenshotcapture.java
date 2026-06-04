package utilities;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class Screenshotcapture extends BasePage 
{

	//private static final int OutputType = 0;
	public Screenshotcapture(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static String path;
	 public static void captureAsImage(WebDriver driver,String screenShotName) throws IOException, HeadlessException, AWTException
	    {
		 TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        
    String dest =System.getProperty("user.dir")+ "\\report"  +"\\Saving\\"+screenShotName+".png";
    
	       //File destination = new File(dest);
    File destination = new File(dest);
     FileUtils.copyFile(source, destination);

	     // return "ErrorScreenshots/"+screenShotName+".png";
	      
	      
	      
//		 BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+\\"screenShotName+".png"));	
//	
				 
//				 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\test.png"));				 
		// ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\report"  +"\\Saving\\"+screenShotName+".png"));
		 //ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\test.png"));
//		 BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\report"  +"\\Saving\\"+screenShotName+".png"));
	    }
	        
	    }

//	    public static String captureAsBase64(WebDriver driver)
//	    {
//	        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//	    }
//
//	    public static byte[] captureAsByteArray(WebDriver driver)
//	    {
//	        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	    }


