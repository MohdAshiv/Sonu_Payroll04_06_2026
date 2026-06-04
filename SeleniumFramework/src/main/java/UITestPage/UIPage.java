package UITestPage;
 
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
 
import javax.imageio.ImageIO;
 
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
 
import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
 
import ie.curiositysoftware.testmodeller.TestModellerModule;
import pages.BasePage;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utilities.reports.ExtentReportManager;
 
 
 
// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7f1f71f8-06c0-4765-bb49-ade149e17dc0
@TestModellerModule(guid = "7f1f71f8-06c0-4765-bb49-ade149e17dc0")
public class UIPage extends BasePage
{
	public UIPage (WebDriver driver)
	{
		super(driver);
	}
	//  Billing.SoftAssertLogger  as= new Billing.SoftAssertLogger(m_Driver);
	SoftAssert soft=new SoftAssert();
	Generic.WaitStatementLib w=new Generic.WaitStatementLib();
	BufferedImage actualImage;
		public void verifyScreenShot(String loc,String Diff) throws IOException
		{
			Path path = Paths.get(loc);
	        String fileName = path.getFileName().toString();         
				w.implictWaitForSeconds(m_Driver, 20);
 
		      // Load the expected/baseline image
		      BufferedImage expectedImage = ImageIO.read(new File(loc));
 
		      // Compare images
		      ImageDiffer imgDiff = new ImageDiffer();
		      ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
 
		      if (diff.hasDiff()) {
		          System.out.println("Screenshots DO NOT match!");
		          // Optionally save the diff image
		          ImageIO.write(diff.getMarkedImage(), "PNG", new File(Diff));
		          soft.assertFalse(true, fileName+" = Screenshots Status : DO NOT match!");
		         // ExtentReportManager.failStep(m_Driver, fileName+" = Screenshots Status : DO NOT match!");
		      }
		      else 
		      {
		    	  soft.assertTrue(true, fileName+" = Screenshots Status : match perfectly");
		          System.out.println("Screenshots match perfectly.");
		         // ExtentReportManager.passStep(m_Driver, fileName+" =Screenshots Status : match perfectly");
		      }
		}
		public void verifySS(String loc,String Diff) throws IOException
		{
			Path path = Paths.get(loc);
	        String fileName = path.getFileName().toString();     
			w.implictWaitForSeconds(m_Driver, 20);
 
		      // Load the expected/baseline image
		      BufferedImage expectedImage = ImageIO.read(new File(loc));
		      //BufferedImage actualImage = ImageIO.read(new File(loc));
 
		      ImageComparison imageComparison = new ImageComparison(expectedImage, actualImage);
 
		      imageComparison.setThreshold(20);
		      imageComparison.setMinimalRectangleSize(15);
		      imageComparison.setPixelToleranceLevel(0.6); // Only available in newer versions
		      imageComparison.setDifferenceRectangleFilling(true, 5.0f);
 
		      ImageComparisonResult result = imageComparison.compareImages();
 
		      if (result.getImageComparisonState() == ImageComparisonState.MATCH) {
		          System.out.println("Images match.");
		          ExtentReportManager.passStep(m_Driver, fileName+" = Screenshots Status 2 : Images match.");
		      } else {
		          System.out.println("Images differ.");
		          ImageIO.write(result.getResult(), "PNG", new File(Diff));
		          ExtentReportManager.failStep(m_Driver, fileName+" = Screenshots Status 2 : Images differ.");
		      }
		}

		public void TakeScreenShotForVerify() throws IOException
		{
			w.implictWaitForSeconds(m_Driver, 800);
			 Screenshot actualScreenshot = new AShot().takeScreenshot(m_Driver);
		     actualImage = actualScreenshot.getImage();
		}
		public void TakeScreenshotFullForVerify()
		{
			w.implictWaitForSeconds(m_Driver, 40);
			Screenshot screenshot = new AShot()
			        .shootingStrategy(ShootingStrategies.viewportPasting(100))
			        .takeScreenshot(m_Driver);
			 actualImage = screenshot.getImage();
		}
		public void TakeFullScreenShot(String ScreenShotName) throws IOException
		{
			w.implictWaitForSeconds(m_Driver, 40);
			Screenshot screenshot = new AShot()
			        .shootingStrategy(ShootingStrategies.viewportPasting(100))
			        .takeScreenshot(m_Driver);
			 actualImage = screenshot.getImage();
		     File outputfile = new File(System.getProperty("user.dir") + "\\As_Screenshot\\UI\\"+ScreenShotName);
		     ImageIO.write(actualImage, "png", outputfile);
		}
		public void TakeScreenShot(String ScreenShotName) throws IOException
		{
			 w.implictWaitForSeconds(m_Driver, 400);
			 Screenshot actualScreenshot = new AShot().takeScreenshot(m_Driver);
		     actualImage = actualScreenshot.getImage();

		     File outputfile = new File(System.getProperty("user.dir") + "\\As_Screenshot\\UI\\"+ScreenShotName);
		     ImageIO.write(actualImage, "png", outputfile);
		}
		
 public void assertAll()
{
	soft.assertAll();
}

}