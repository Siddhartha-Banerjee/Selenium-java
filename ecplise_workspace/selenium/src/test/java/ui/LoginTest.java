package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest 
{
	public static String browser="firefox";
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-name")).sendKeys("Standard user");
		
		WebElement password=driver.findElement(By.id("password"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("xxx");
		
		driver.findElement(By.id("password")).sendKeys("Standard user");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//driver.close();
	}

}
