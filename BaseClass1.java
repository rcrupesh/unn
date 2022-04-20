package UtilityAndBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class BaseClass1 
{
	protected WebDriver driver;
public void LaunchBrowser()
{
	Reporter.log("Launching chrome browser",true);
	System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();   //opens up without any extension or history or cookies,
	opt.addArguments("disable-notifications");
	driver=new ChromeDriver(opt);
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.manage().window().maximize();
	Reporter.log("Browser launch success",true);
	
			
	
}
public void CloseBrowser()
{
	driver.close();
	Reporter.log("Browser close success",true);
}
}
