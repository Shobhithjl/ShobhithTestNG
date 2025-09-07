package HybridApproach;

import org.testng.annotations.Test;

public class LoginFeature extends GenericScripts 
{
	@Test
	public void LoginFeature()
	{
		LoginPageElements lp = new LoginPageElements(driver);
		
		lp.enterUsn(p.getProperty("testUsn"));
		lp.enterPsw(p.getProperty("testPsw"));
		lp.clickLogin();
	}
}
