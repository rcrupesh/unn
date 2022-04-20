package UtilityAndBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import UtilityAndBase.*;

public class BaseUsingPropertyFile 
{
	protected WebDriver driver;
	public void LaunchBrowser() throws IOException
	{
	Reporter.log("Launching browser",
	true);
	System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
	ChromeOptions opt=new
	ChromeOptions();// created object of chrome options
	driver= new ChromeDriver(opt);
	driver.get(UtilityUsingPropertyFile.readDatafromPropertyFile("URL"));
	driver.manage().window().maximize();
	Reporter.log("Browser launching success", true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public void closeBrowser()
	{
	driver.close();
	Reporter.log("Browser closed success", true);
	}

}
