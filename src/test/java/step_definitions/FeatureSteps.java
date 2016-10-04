package step_definitions;

import static org.testng.AssertJUnit.assertEquals;
import helpers.DataHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modules.AddProductToBasket;
import modules.SearchProduct;
import modules.SelectProduct;
import modules.SelectProductSize;
import modules.VerifyProductPresentInBasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.DeBijenkorfProduct;
import pageobjects.DeBijenkorfResults;
import pageobjects.DeBijenkorfHome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
* The FeatureSteps class implements a functionality contains all the step 
* definitions/glue code for the features.
* @author  Puneet Khurana
* @version 1.0
* @since   2016-10-01 
*/
public class FeatureSteps{
    public WebDriver driver;
//    public List<HashMap<String,String>> datamap = DataHelper.data();
    public static List<HashMap<String,String>> datamap = null;
	private static String productAdded = null;
    
    public FeatureSteps()
    {
    	driver = Hooks.driver;
    	datamap = new ArrayList<HashMap<String,String>>();
    	HashMap<String,String> sampleData = new HashMap<String,String>();
    	sampleData.put("productname","jeans");
    	sampleData.put("productnumber","3");
    	sampleData.put("productsize","152");
    	System.out.println("Current data" +sampleData);
    	datamap.add(sampleData);
    }
    
    
    
    @Given("^User is on de bijenkorf homepage$")
    public void user_is_on_de_bijenkorf_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.get("http://debijenkorf.nl");
        assertEquals("https://www.debijenkorf.nl/",driver.getCurrentUrl());

    }

    
    @When("^User search a product on homepage$")
    public void user_search_a_product_on_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, DeBijenkorfHome.class);
    	SearchProduct.Execute(driver,datamap.get(0));

    }

    @When("^Search results are loaded$")
    public void search_results_are_loaded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^User select a product in the results$")
    public void user_select_a_product_in_the_results() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, DeBijenkorfResults.class);
    	SelectProduct.Execute(driver,datamap.get(0));
    }


    @When("^User select size variant of product$")
    public void user_select_size_variant_of_product() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, DeBijenkorfProduct.class);
    	SelectProductSize.Execute(driver,datamap.get(0));
    }

    @When("^User add product to shopping basket$")
    public void user_add_product_to_shopping_basket() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, DeBijenkorfProduct.class);
    	productAdded = AddProductToBasket.Execute(driver,datamap.get(0));
    }

    @Then("^product present in the shopping basket$")
    public void product_present_in_the_shopping_basket() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, DeBijenkorfHome.class);
    	VerifyProductPresentInBasket.Execute(driver,productAdded);
    }


    
    
    
    
    
    
    
    
    
    
    
}