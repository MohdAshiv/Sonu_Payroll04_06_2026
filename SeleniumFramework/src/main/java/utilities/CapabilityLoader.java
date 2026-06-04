package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

public class CapabilityLoader
{
	
	 
    private static String browserNameEnv = "selenium.browserType";
    private static String runScopeEnv = "selenium.runLocation";
//    private static String sauceLabsPlatformEnv = "sauceLabs.platform";
//    private static String sauceLabsVersionEnv = "sauceLabs.version";
//    private static String sauceLabsUsernameEnv = "sauceLabs.username";
//    private static String sauceLabsAccessKeyEnv = "sauceLabs.accessKey";
   
    public static WebDriver createWebDriver() throws IOException {
        if (PropertiesLoader.getProperties().getProperty(runScopeEnv).toLowerCase().equals("saucelabs")) {
            if (PropertiesLoader.getProperties().getProperty(browserNameEnv).toLowerCase().equals("chrome")) {

//                DesiredCapabilities caps = DesiredCapabilities.chrome();
//                caps.setCapability("platform", PropertiesLoader.getProperties().getProperty(sauceLabsPlatformEnv));
//                caps.setCapability("version", PropertiesLoader.getProperties().getProperty(sauceLabsVersionEnv));
//                caps.setCapability("extendedDebugging", true);

                WebDriver driver = null;

//                try {
//                    driver = new RemoteWebDriver(new URL("http://" + PropertiesLoader.getProperties().getProperty(sauceLabsUsernameEnv) + ":" + PropertiesLoader.getProperties().getProperty(sauceLabsAccessKeyEnv) + "@ondemand.saucelabs.com:80/wd/hub"), caps);
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                }

                return driver;
            } else {
                return null;
            }
        } else {
            if (PropertiesLoader.getProperties().getProperty(browserNameEnv).toLowerCase().equals("chrome")) {
                ChromeOptions options = new ChromeOptions();
                
            //   options.setHeadless(true);
//                options.addArguments("window-size=1366,768");
               
                options.addArguments(new String[]{"--start-maximized"});
                
            //    options.addArguments("window-size=1920*1080");
                options.addArguments("--force-device-scale-factor=1");
                options.addArguments("--high-dpi-support=1");
                
//                options.addArguments("--js-flags=--expose-gc");
//                options.addArguments("--enable-precise-memory-info");

                
              //  Download file to the folder
            //   Map<String, Object> prefs = new HashMap<String, Object>();

               
             //   prefs.put("download.default_directory", System.getProperty("user.dir")+"\\SonuPDF\\"+"File");


//               prefs.put("download.default_directory", "E:\\LatestSeleniumFramework\\Sonu_Payroll_Selenium_New\\SeleniumFramework\\PdfFile");
//
// 
//
//                options.setExperimentalOption("prefs", prefs);
//                prefs.put("plugins.always_open_pdf_externally", true);
                WebDriverManager.chromedriver().setup();
                
                

            WebDriver driver = new ChromeDriver(options);
              

                return driver;
            } else {
                WebDriver driver = new FirefoxDriver();

                return driver;
            }
        }
    }
   
}
