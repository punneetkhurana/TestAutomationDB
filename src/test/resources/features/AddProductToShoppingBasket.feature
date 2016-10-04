Feature: Select product variant. 
Add to shopping basket

  Scenario: search and select a product
  
	  Given User is on de bijenkorf homepage
    And User search a product on homepage
    And User select a product in the results
    When User select size variant of product
    And User add product to shopping basket
    Then product present in the shopping basket
