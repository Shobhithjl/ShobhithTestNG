package PracticeTestNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScriptForDependsOnMethods 
{
	@Test
	public void signUp()
	{
		System.out.println("This is sign up module");
	}
	
	@Test(dependsOnMethods = "signUp")
	public void login()
	{
		System.out.println("This is Login module");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "login")
	public void homePage()
	{
		System.out.println("This is homepage");
	}
	
	@Test(dependsOnMethods = "login")
	public void profilePage()
	{
		System.out.println("This is Profile Page");
	}
	
	@Test
	public void logout()
	{
		System.out.println("This is logout Module");
	}
}
