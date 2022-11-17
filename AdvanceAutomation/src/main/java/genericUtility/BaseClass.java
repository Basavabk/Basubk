package genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
     public static WebDriver driver;
    
     @BeforeSuite
     public void launchingBrowser() {
    	  WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
    	  driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  		
    	  
    	  
     }
     @BeforeClass
     public void navigationToApp() {
    	 driver.get("https://demowebshop.tricentis.com/");
     
     }
     @AfterClass
     public void loggingOut() {
    	 
     }
     @AfterSuite
     public void tearDownTheBrowser() {
}
}