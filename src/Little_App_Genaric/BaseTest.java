package Little_App_Genaric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
	
	WebDriver driver ;
	
	@BeforeMethod (alwaysRun=true)
	public  void openApp(){
		
     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
