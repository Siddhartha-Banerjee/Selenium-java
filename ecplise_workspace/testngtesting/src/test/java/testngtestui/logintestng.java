package testngtestui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logintestng 
{
	@BeforeTest
	public static void beforetest()
	{
		System.out.println("beforetest testng");
	}
	@AfterTest
	public static void aftertest()
	{
		System.out.println("aftertest testng");
	}
	
	
	@Test(priority=2, description="this is login tset 2nd priority")
	public static void secondtesting()
	{
		System.out.println("test 2");
	}
	@Test(priority=1, description="this is logout tset 1st priority")
	public static void firsttesting()
	{
		System.out.println("test 1");
	}
	
	
	@BeforeMethod
	public static void connect()
	{
		System.out.println("before every method");
	}
	@AfterMethod
	public static void disconnect()
	{
		System.out.println("after every method");
	}

}
