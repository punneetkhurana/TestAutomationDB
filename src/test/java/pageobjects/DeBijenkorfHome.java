package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class DeBijenkorfHome extends BaseClass{

	public DeBijenkorfHome(WebDriver driver){
		super(driver);
	}    

	@FindBy(how=How.CSS, using=".dbk-form--field")
	public static WebElement tbx_search;
	
	@FindBy(how=How.CSS, using="button.dbk-form--submit")
	public static WebElement btn_search;

	@FindBy(how=How.XPATH, using="//div[@class='dbk-header--flyouts']/span[3]/span")
	public static WebElement lnk_shoppingbasket;

	@FindBy(how=How.XPATH, using="//div[@class='dbk-product-info']/h1/a")
	public static WebElement lbl_productinbasket;

	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	