package testngtestui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyTitileTest 
{
	@Test
	public void titleTest()
	{
		SoftAssert sa=new SoftAssert();
		String exptitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String exptext="Searchh";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().minimize();
		
		String actitle=driver.getTitle();
		sa.assertEquals(actitle, exptitle,"title match failed");
		
		String actext=driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		sa.assertEquals(actext, exptext,"text match failed");
		
		driver.close();
		sa.assertAll();
	}
}
