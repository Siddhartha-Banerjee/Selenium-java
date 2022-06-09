package selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\selenium\\drivers\\chromedriver.exe");
		//ChromeDriver driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\drivers\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.youtube.com");
		

	}

}
