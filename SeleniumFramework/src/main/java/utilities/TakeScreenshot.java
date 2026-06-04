package utilities;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import javax.imageio.ImageIO;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import pages.BasePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

public class TakeScreenshot  {

	public static void takeScreenshot (WebDriver m_Driver , String ScreenshotName ) throws Exception
	{
		
		try {
			TakesScreenshot ts=(TakesScreenshot)m_Driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("./Screenshots/"+ScreenshotName+".png"));
		
		}
		catch (Exception e) 
		{
			System.out.println("Exception while taking screenshot");
		}

	}
	public static void Getscreenshot(String Filename,String Foldername, WebDriver m_Driver)
	{
	String path="";
	try
	{
	String loc=System.getProperty("user.dir");
	path=loc+"\\As_Screenshot\\"+Foldername+"\\"+Filename+".png";
	//EventFiringWebDriver ewf=new EventFiringWebDriver(m_Driver);
	//File src=ewf.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(src, new File(path));

	}
	catch (Exception e)
	{



	System.out.println("Issue in Getscreenshot");
	}
	}
	
	
	public static void Getscreenshot1( WebDriver m_Driver) throws Exception
	{
	  
	   JavascriptExecutor js = (JavascriptExecutor)m_Driver;
		
		js.executeScript("document.body.style.zoom = '80%';");
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(5000)).takeScreenshot(m_Driver);
	        ImageIO.write(s.getImage(),"PNG",new File("C:\\Users\\Sonu\\eclipse-workspace\\Framework\\As_Screenshot\\xyz.png"));
	}
	

}
