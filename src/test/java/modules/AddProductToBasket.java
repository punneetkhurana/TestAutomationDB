package modules;

import helpers.Log;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import pageobjects.DeBijenkorfProduct;
import pageobjects.DeBijenkorfResults;
import pageobjects.DeBijenkorfHome;

/**
* The AddProductToBasket class implements a functionality that adds the product
* to the shopping basket.
* @author  Puneet Khurana
* @version 1.0
* @since   2016-10-01 
*/
public class AddProductToBasket {
	/**
	* This method is used to add the product to the shopping
	* basket and return the product name that has been added.
	* @author  Puneet Khurana
 	* @param driver This is the object of the web driver used.
 	* @param map This specify the test data read from excel sheet
 	* @return String. this returns the product name
	*/
	public static String Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String productName = DeBijenkorfProduct.lbl_productdetails.getText().toUpperCase().trim();
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(DeBijenkorfProduct.btn_addtobasket));		
		DeBijenkorfProduct.btn_addtobasket.click();
		Thread.sleep(10000);
		Log.info("Click action is performed on add to basket option in product details");
		Reporter.log("Add Product to Basket is successfully performed");
		return productName;
	}
}
