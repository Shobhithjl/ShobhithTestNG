package HybridApproach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements 
{
	//Declaration
	@FindBy(id="email")
	private WebElement usnTf;
	
	@FindBy(id="pass")
	private WebElement pswTf;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	
	//Initialization
	LoginPageElements(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public void enterUsn(String usn)
	{
		usnTf.sendKeys(usn);
	    
	}
	
	public void enterPsw(String psw)
	{
		pswTf.sendKeys(psw);
		
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
}
