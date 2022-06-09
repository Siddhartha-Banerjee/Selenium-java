package testngtestui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot extends ListenerBaseClass
{

	public void getss() throws IOException 
	{
		Date currentdate=new Date();
		String filename=currentdate.toString().replace(" ","-").replace(":", "-");
		
		File ssfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ssfile, new File(".//screenshot//"+filename+".jpg"));

	}

}
