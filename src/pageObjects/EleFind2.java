package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EleFind2
{

	WebDriver driver;
	
	public EleFind2(WebDriver d)
	{
		this.driver=d;
		PageFactory.initElements(d, this);
	}

	
	@FindBy(how= How.NAME,using = "email")
	WebElement username;
	

	@FindBy(how= How.NAME,using = "pass")
	WebElement password;
	

	@FindBy(how= How.NAME,using = "login")
	WebElement loginbtn;
	
	public void EnterUsername()
	{
		username.sendKeys("7769863657");
	}
	
	public void EnterPWD()
	{
		password.sendKeys("Shubha@FB#$#");
	}

	
	public void LoginToAPP()
	{
		loginbtn.click();
	}
	
}
