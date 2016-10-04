package modules;

import static org.testng.AssertJUnit.assertEquals;
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
* The VerifyProductPresentInBasket class implements a functionality that verify if
* the product added to the shopping basket in present in the basket.
* @author  Puneet Khurana
* @version 1.0
* @since   2016-10-01 
*/
public class VerifyProductPresentInBasket {
	/**
	* This method is used to verify if the product added to 
	* the shopping basket in present in the basket.
	* @author  Puneet Khurana
 	* @param driver This is the object of the web driver used.
 	* @param productdetais This specify the product name that was added initially
 	* @return nothing
	*/
	public static void Execute(WebDriver driver,String productDetails) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(DeBijenkorfHome.lnk_shoppingbasket));
		DeBijenkorfHome.lnk_shoppingbasket.click();
		element = wait.until(ExpectedConditions.elementToBeClickable(DeBijenkorfHome.lbl_productinbasket));
        assertEquals(productDetails,DeBijenkorfHome.lbl_productinbasket.getText().toUpperCase().trim());
		Log.info("Assert action is performed on product added to basket");
		Reporter.log("Verify Product Present in Basket is successfully performed");

	}
}
