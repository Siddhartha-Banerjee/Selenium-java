package testngtestui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProviderDemoTest 
{
	@Test(dataProvider="dataset1",dataProviderClass=DataProviderData.class)
	public void test1(String usnm,String pw)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(usnm);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pw);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();
	}
	
	@Test(dataProvider="dataset",dataProviderClass=DataProviderData.class,groups="static")
	public void test(String usnm,String pw)
	{
		System.out.println(usnm+"=="+pw);
	}
	
	
}
