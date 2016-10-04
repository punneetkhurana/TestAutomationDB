package pageobjects;

import org.openqa.selenium.WebDriver;
/**
* The BaseClass class implements a functionality touches all the page objects we use.
* @author  Puneet Khurana
* @version 1.0
* @since   2016-10-01 
*/
public abstract class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;

	public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}

}
