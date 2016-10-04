package modules;

import helpers.Log;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import pageobjects.DeBijenkorfProduct;
import pageobjects.DeBijenkorfResults;
import pageobjects.DeBijenkorfHome;

/**
* The SelectProductSize class implements a functionality that selects the product
* size on product details page.
* @author  Puneet Khurana
* @version 1.0
* @since   2016-10-01 
*/
public class SelectProductSize {
	/**
	* This method is used to select the product size on product 
	* details page.
	* @author  Puneet Khurana
 	* @param driver This is the object of the web driver used.
 	* @param map This specify the test data read from excel sheet
 	* @return nothing
	*/
	public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(DeBijenkorfProduct.ddl_productsize));
		Select ddl=new Select((DeBijenkorfProduct.ddl_productsize));
		List<WebElement> allOptions=ddl.getOptions();
		ddl.selectByVisibleText(map.get("productsize"));
		Log.info("Select action is performed on product variant");
		Reporter.log("Select Product Size is successfully performed");
	}
}
