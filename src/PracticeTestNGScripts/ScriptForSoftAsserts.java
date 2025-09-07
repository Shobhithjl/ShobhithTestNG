package PracticeTestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ScriptForSoftAsserts 
{
	@Test
	public void fetchTitle()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		SoftAssert sa = new SoftAssert();
		String expectedTitle="FACEBOOK";
		String actualTitle=driver.getTitle();
		sa.assertEquals(actualTitle,expectedTitle);
		System.out.println(actualTitle);
		driver.quit();
		sa.assertAll();
	}
}
