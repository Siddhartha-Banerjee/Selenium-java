package testngtestui;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class befosre_after_suite 
{
	@BeforeSuite
	public static void before()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public static void after()
	{
		System.out.println("after suite");
	}
}
