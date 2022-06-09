package ui;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wait 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[7]/a"));
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
		
		//Fluent wait
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("wrong link")
				.ignoring(NoSuchElementException.class);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/wrong-link-for/fluent_wait-test/xxxxxx"))).click();
		
		//explicit wait
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[1]/ul/li[7]/div[2]/div[1]/nav[2]/ul/li[3]/a"))).click();
		//driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[7]/div[2]/div[1]/nav[2]/ul/li[3]/a")).click();

	}

}
