package testngtestui;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.reporters.jq.ResultsByClass;

public class reports 
{
	@BeforeSuite
	public static void before()
	{
		Reporter.log("result ");
		System.out.println("before suite");
	}
	
	@AfterSuite
	public static void after()
	{
		System.out.println("after suite");
	}
	@Test
	public static void first()
	{
		
		System.out.println("test 1");
		Reporter.log("<a href=\"E:\\selenium\\ecplise_workspace\\testngtesting\\screenshot\\Mon-May-02-12-08-20-IST-2022.jpg\">screenshot</a>");
		
	}
	
	@Test(dependsOnMethods="first",alwaysRun=true)
	public static void second()
	{
		System.out.println("test 2");
	}
	
	@Test
	public static void third()
	{
		Reporter.log("test 3, regression and bvt ");
		System.out.println("test 3");
	}
}
