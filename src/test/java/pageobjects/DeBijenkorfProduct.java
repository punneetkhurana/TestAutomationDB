package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class DeBijenkorfProduct extends BaseClass{

	public DeBijenkorfProduct(WebDriver driver){
		super(driver);
	}    

	@FindBy(how=How.CSS, using=".dbk-heading.dbk-heading_brand.dbk-heading_h2.hidden-xs")
	public static WebElement lbl_productdetails;
	
	@FindBy(how=How.CSS, using=".dbk-form--input")
	public static WebElement ddl_productsize;
	
	@FindBy(how=How.CSS, using=".Tappable-inactive.dbk-btn.dbk-btn_primary.dbk-btn_justified")
	public static WebElement btn_addtobasket;
	
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	