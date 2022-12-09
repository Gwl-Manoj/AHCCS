package Library_Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Achievement_Charter_Excel_Data_BaseClass 
{

	public WebDriver driver;
	public void open_browser()     // Open the Browser C:\\Users\\gwl\\eclipse-workspace\\achievement_Charter_Limit\\Browsers\\chromedriver.exe
	{
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Browsers\\chromedriver.exe");
		
		

		WebDriverManager.chromedriver().setup(); 
		
		try
		{
			
			ChromeOptions option = new ChromeOptions();
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, option);
			option.merge(capabilities);
			
			
			
			option.addArguments("acceptInsecureCerts");
//			option.addArguments("window-size=1200x600");
			
			option.addArguments("--no-sandbox");
//			option.addArguments("--headless");
			option.addArguments("--disable-dev-shm-usage");
			option.addArguments("--disable-setuid-sandbox");
			
			driver= new ChromeDriver(option);
			
//			driver.manage().window().maximize();// Maximize the browser
			driver.get("https://enroll.grafik-stage.io/login");  
//			driver.get("https://enroll.achievementcharter.com/login");
		}
		catch(Exception e)
		{
			System.out.println(""+e);
			e.printStackTrace();
			
		}
		
//		WebDriverManager.firefoxdriver().setup();
//		try
//		{
////			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Softwares\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
//		 	
//			 FirefoxOptions options = new FirefoxOptions();
//			 options.setCapability("marionette", true);
////			 options.addArguments("acceptInsecureCerts");
////			 options.addArguments("--headledd");
////			 options.setHeadless(true);
//			 driver = new FirefoxDriver(options);
////			 options.addArguments("window-size=1600x1000");
////			 driver.get("https://enroll.grafik-stage.io/login");
//			 driver.get("https://enroll.achievementcharter.com/login");
//			 
//		}
//		catch(Exception e)
//		{
//			System.out.println(""+e);
//			e.printStackTrace();
//			
//		}
		
		
		
	}	
}
