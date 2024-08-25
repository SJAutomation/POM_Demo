package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EleFind
{
	
	WebDriver driver;
	
	public EleFind(WebDriver ldriver)
	{
		driver=ldriver;
	}



	By username=By.name("email");
	By password=By.name("pass");
	By loginbtn=By.name("login");
	
	
	public void EnterUsername()
	{
		driver.findElement(username).sendKeys("7769863657");
	}
	
	public void EnterPWD()
	{
		driver.findElement(password).sendKeys("Shubha@FB#$#");;
	}

	
	public void LoginToAPP()
	{
		driver.findElement(loginbtn).click();;
	}

}
