package HybridApproach;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchCurrentURL extends GenericScripts 
{
	@Test
	public void fetchCurrentURL()
	{
		String title = driver.getCurrentUrl();
		System.out.println(title);
		Assert.fail();
	}
}
