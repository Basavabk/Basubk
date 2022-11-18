package homeModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.UtilityMethods;

public class Selecting  extends BaseClass {

	@Test
	public void demo() throws InterruptedException, IOException {
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		UtilityMethods method=new UtilityMethods();
		method.SelectUtility(dropdown, "1");
		Thread.sleep(2000);
		
		//ScreenshotUtility.takingScreenshot("myscreenshot");

}
}