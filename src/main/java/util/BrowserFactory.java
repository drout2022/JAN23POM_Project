package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	static String browser ="chrome";
	static String url="https://techfios.com/billing/?ng=dashboard/";
	

	 public static WebDriver init() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("web driver driver", "driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
	public static void tearDown() {
		
		driver.close();
		driver.quit();
	}

}
