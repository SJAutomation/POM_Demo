package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.EleFind;
import pageObjects.EleFind2;


public class MainClass {

	 static WebDriver driver;	
		
	

	public static void main(String[] args) 
	{
	
				
				
				driver=new ChromeDriver();
				driver.get("https://www.facebook.com");
				
				driver.manage().window().maximize();
		
//        		EleFind ele=new EleFind(driver);
//				
//				
//				ele.EnterUsername();
//				ele.EnterPWD();
//				ele.LoginToAPP();
			
				
				EleFind2 ele=new EleFind2(driver);

				ele.EnterUsername();
				ele.EnterPWD();
				ele.LoginToAPP();
				
				System.out.println("Logged in successfullly...");
				
		//driver.quit();

	}

}
