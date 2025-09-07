package HybridApproach;

import org.testng.annotations.Test;

public class FetchTitle extends GenericScripts 
{	
	@Test
	public void fetchTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
}
