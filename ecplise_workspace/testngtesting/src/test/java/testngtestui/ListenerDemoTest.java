package testngtestui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemoTest extends ListenerBaseClass
{
	//@Test
	@Test(retryAnalyzer=testngtestui.Retry.class)
	public void launchapp()
	{
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	}
}
