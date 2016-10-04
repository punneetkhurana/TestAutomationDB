package modules;

import helpers.Log;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import pageobjects.DeBijenkorfResults;
import pageobjects.DeBijenkorfHome;

/**
* The SelectProduct class implements a functionality that select the product
* from search results on homepage.
* @author  Puneet Khurana
* @version 1.0
* @since   2016-10-01 
*/
public class SelectProduct {
	/**
	* This method is used to select the product
	* from search results on homepage.
	* @author  Puneet Khurana
 	* @param driver This is the object of the web driver used.
 	* @param map This specify the test data read from excel sheet
 	* @return nothing
	*/
	public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(DeBijenkorfResults.lbl_product(driver,map.get("productnumber"))));
		DeBijenkorfResults.lbl_product(driver,map.get("productnumber")).click();
		Log.info("Click action is performed on product in search results");
		Reporter.log("Select Product Action is successfully perfomred");

	}
}
