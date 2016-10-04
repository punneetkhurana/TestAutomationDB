package modules;

import helpers.Log;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import pageobjects.DeBijenkorfHome;
import pageobjects.DeBijenkorfProduct;

/**
* The SearchProduct class implements a functionality that search the product
* on homepage.
* @author  Puneet Khurana
* @version 1.0
* @since   2016-10-01 
*/
public class SearchProduct {
	/**
	* This method is used to type the search keyword and click 
	* search button on the homepage.
	* @author  Puneet Khurana
 	* @param driver This is the object of the web driver used.
 	* @param map This specify the test data read from excel sheet
 	* @return nothing
	*/
	public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(DeBijenkorfHome.tbx_search));
		DeBijenkorfHome.tbx_search.sendKeys(map.get("productname"));
		Log.info(" is entered in Search text box" );
		element = wait.until(ExpectedConditions.elementToBeClickable(DeBijenkorfHome.btn_search));
		DeBijenkorfHome.btn_search.click();
		Log.info("Click action is performed on Search button");
		Reporter.log("Search Action is successfully perfomred");
	}
}
