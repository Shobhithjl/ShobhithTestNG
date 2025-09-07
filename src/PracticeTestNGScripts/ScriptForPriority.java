package PracticeTestNGScripts;

import org.testng.annotations.Test;

public class ScriptForPriority 
{
	@Test(priority = 1)
	public void signUp()
	{
		System.out.println("This is sign up module");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("This is Login module");
	}
	
	@Test(priority = 3)
	public void homePage()
	{
		System.out.println("This is homepage");
	}
	
	@Test(priority = 4)
	public void profilePage()
	{
		System.out.println("This is Profile Page");
	}
	
	@Test(priority = 5)
	public void logout()
	{
		System.out.println("This is logout Module");
	}
}
