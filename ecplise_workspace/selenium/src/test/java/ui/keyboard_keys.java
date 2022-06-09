package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard_keys 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.prepostseo.com/tool/online-text-editor");
		//WebElement frame=driver.findElement(By.xpath("//*[@id=\"textbox_ifr\"]"));
		//driver.switchTo().frame(frame);
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().parentFrame();
		driver.switchTo().frame("textbox_ifr");
		WebElement ta1=driver.findElement(By.xpath("//*[@id=\"tinymce\"]"));
		Actions ac=new Actions(driver);
		ta1.click();
		ta1.sendKeys("abcdef");
		ac.keyDown(ta1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		//WebElement ta2=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		//ta2.click();
		ac.keyDown(ta1, Keys.CONTROL).sendKeys("vvv").build().perform();
		
		
	}

}
