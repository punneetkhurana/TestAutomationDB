package pageobjects;
import java.util.HashMap;

import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class DeBijenkorfResults extends BaseClass{


	public DeBijenkorfResults(WebDriver driver){
		super(driver);
	}    
	
	 public static WebElement lbl_product(WebDriver driver,String index){
		 
         WebElement element = driver.findElement(By.cssSelector("ul.dbk-productlist.dbk-productlist_3col li:nth-of-type("+index+")"));
 
         return element;
 
         }
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	