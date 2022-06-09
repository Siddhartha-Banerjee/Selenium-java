package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class w3school 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.id("search2")).sendKeys("html");
		Thread.sleep(2000);
		driver.findElement(By.id("learntocode_searchbtn")).click();
		//Thread.sleep(2000);
		
		
		WebElement dr=driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/a"));
		Actions scroll=new Actions(driver);
		scroll.moveToElement(dr);
		scroll.perform();
		dr.click();
		Set<String> wh=driver.getWindowHandles();
		System.out.println(wh);
		Iterator<String> it=wh.iterator();
		String pw=it.next();
		String cw=it.next();
		driver.switchTo().window(cw);
		
		
		WebElement run=driver.findElement(By.id("runbtn"));
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(run)).click();
		Thread.sleep(2000);
	}
}
