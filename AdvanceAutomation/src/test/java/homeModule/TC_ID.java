package homeModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.UtilityMethods;

public class TC_ID extends BaseClass{
  @Test
  
  public void TestCaseDescription() {
	  WebElement email = driver.findElement(By.id("Email"));
	  WebElement password = driver.findElement(By.id("password"));
	  WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
	  
	  
	  UtilityMethods.ActionsUtility(driver).sendKeys(email,"hello").perform();
	  UtilityMethods.ActionsUtility(driver).sendKeys(password, "password").perform();
	  UtilityMethods.ActionsUtility(driver).click(login).perform();	  
	  /*
	  JavaScriptExecutorUtility.EnteringDataToElementsUsingJavaScript(email, "hcsm166");
	  JavaScriptExecutorUtility.EnteringDataToElementsUsingJavaScript(password, "demo1223234");
	  JavaScriptExecutorUtility.clickingOnElelmentUsingKJavaScript(login);
	  */
  }
}
