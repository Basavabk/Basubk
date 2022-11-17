package genericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtility extends BaseClass{
	public static JavascriptExecutor js=(JavascriptExecutor) driver;
	public static void clickingOnElelmentUsingKJavaScript(WebElement Element) {
		js.executeScript("arguments[0].click(),", Element);
		
	}
    public static void EnteringDataToElementsUsingJavaScript(WebElement element,String data) {
    	js.executeScript("arguments[0].value='"+data+";", element);
    }
}
