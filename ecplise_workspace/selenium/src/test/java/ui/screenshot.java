package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot 
{

	public static void main(String[] args) throws IOException 
	{
		Date currentdate=new Date();
		String filename=currentdate.toString().replace(" ","-").replace(":", "-");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		File ssfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ssfile, new File(".//screenshot//"+filename+".jpg"));

	}

}
