package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table_handling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List <WebElement> rows=driver.findElements(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/div/table/tbody/tr"));
		List <WebElement> cols=driver.findElements(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td"));
		System.out.println(rows.size());
		System.out.println(cols.size());
		for(int i=2;i<=rows.size();i++)
		{
			for(int j=1;j<=cols.size();j++)
			{
				System.out.print(driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/div/table/tbody/tr["+ i +"]/td["+ j +"]")).getText()+" ");
			}
			System.out.println("");
		}
	}

}
