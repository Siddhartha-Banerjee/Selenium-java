package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hover_ebay
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		WebElement we=driver.findElement(By.xpath("/html/body/div[1]/header[3]/div/div/div/header/div/div/div/div/div/div/div[1]/ul/li[5]/a"));
		Actions ac=new Actions(driver);
		ac.moveToElement(we).perform();
		
		//driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]")).click();
		//driver.findElement(By.xpath("//span[text()='From']")).click();
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span")).click();
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Kolkata");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
	}
}
