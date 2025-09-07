package PracticeTestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScriptForUsingAssert 
{
	@Test
	public void fetchTitle()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		String expectedTitle="Facebook";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
	}
	
	@Test
	public void fetchCurrentURL()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		String expectedURL="Facebook";
		String actualURL= driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		System.out.println(actualURL);
	}
}
