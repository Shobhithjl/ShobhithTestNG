package HybridApproach;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScripts 
{
	WebDriver driver;
	Properties p;
	
	@BeforeMethod
	public void initBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.fb.com");
	    FileInputStream fis = new FileInputStream("./TestData/ConfigurationData.properties");	
	    p = new Properties();
	    p.load(fis);
	    String url = p.getProperty("testUrl");
	    driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
