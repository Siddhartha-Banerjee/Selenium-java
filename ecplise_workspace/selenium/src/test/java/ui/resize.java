package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resize 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement ele=driver.findElement(By.xpath("/html/body/div/div[3]"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDropBy(ele, 100, 80).perform();
		ac.contextClick(frame);		

	}

}
