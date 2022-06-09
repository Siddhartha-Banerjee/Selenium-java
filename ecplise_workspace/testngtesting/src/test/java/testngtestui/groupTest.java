package testngtestui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

@Test(groups="user-reg")
public class groupTest extends befosre_after_suite 
{
	@Test(groups="regression")
	public static void first()
	{
		System.out.println("test 1");
		throw new SkipException("skipping this test");
	}
	
	@Test(groups="regression",enabled=false)
	public static void second()
	{
		System.out.println("test 2");
	}
	
	@Test(groups={"regression","bvt"})
	public static void third()
	{
		Reporter.log("test 3, regression and bvt ");
		System.out.println("test 3");
	}
	
	@Test(groups="bvt")
	public static void fourth()
	{
		System.out.println("test 4");
		Assert.assertTrue(false);
	}

}
