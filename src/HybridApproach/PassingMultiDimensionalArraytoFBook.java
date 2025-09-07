package HybridApproach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PassingMultiDimensionalArraytoFBook 
{
	@Test(dataProvider = "testData")
	public void login(String usn1,String psw1) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		WebElement usn = driver.findElement(By.id("email"));
		WebElement psw = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		usn.sendKeys(usn1);
		psw.sendKeys(psw1);
		login.click();
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	@DataProvider(name="testData")
	public String[][] testData()
	{
		String[][]cred= new String[4][2];
		cred[0][0]="abcd";
		cred[0][1]="abcd@123";
		cred[1][0]="xyz";
		cred[1][1]="xyz@123";
		cred[2][0]="admin";
		cred[2][1]="admin@123";
		cred[3][0]="user";
		cred[3][1]="user@123";
		return cred;
	}

}
