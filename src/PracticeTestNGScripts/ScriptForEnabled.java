package PracticeTestNGScripts;

import org.testng.annotations.Test;

public class ScriptForEnabled 
{
	@Test
	public void signUp()
	{
		System.out.println("This is sign up module");
	}
	
	@Test
	public void login()
	{
		System.out.println("This is Login module");
	}
	
	@Test(enabled = false)
	public void homePage()
	{
		System.out.println("This is homepage");
	}
	
	@Test(enabled = false)
	public void profilePage()
	{
		System.out.println("This is Profile Page");
	}
	
	@Test(enabled = false)
	public void logout()
	{
		System.out.println("This is logout Module");
	}
}
