package UtilityAndBase;

import java.io.File;
import java.io.FileInputStream;  //unusual event that break the normal flow of program execution.
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;  //The Java I/O package, a.k.a. java.io, provides a set of input streams and output streams used to read and write data to files or other input and output sources. 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter; 
public class Utility 
{
static Sheet MySheet;
public static String ReadDataFromExcel(int rowindex,int columnindex) throws EncryptedDocumentException, IOException
{
	FileInputStream MyFile=new FileInputStream("D:\\Rupesh\\selenium\\Myexcelsheet.xlsx");
	Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet6");
	  String value = MySheet.getRow(rowindex).getCell(columnindex).getStringCellValue();
	 return value;
}
public static void TakesScreenshot(WebDriver driver,int TCID) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("D:\\Rupesh\\SeleniumScreenshot\\TC"+TCID+"Screenshot.png");
	FileHandler.copy(src, destination);
	Reporter.log("Screenshot taken for tc "+TCID,true);
}
}




