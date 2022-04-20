package UtilityAndBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityUsingPropertyFile 
{
	public static String readDatafromPropertyFile(String key) throws IOException
	{
	Properties prop= new Properties();
	FileInputStream myfile= new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\4dec_evening_batch\\src\\propertyFile");
	prop.load(myfile);
	String value = prop.getProperty(key);
	return value;
	}
	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//File dest= new File("D:\\Velocity\\Java Class\\Dec-2021Class\\4thDecEvening\\Screenshot\\"+TCID+"SC.png");
	File dest=new File("D:\\Rupesh\\SeleniumScreenshot\\\"+TCID+\"SC.png");
	FileHandler.copy(src, dest);
}
}
