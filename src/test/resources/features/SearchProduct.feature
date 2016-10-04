Feature: Search a product on de bijenkorf website. 
Select a product from the search results.

  Scenario: search and select a product
  
	  Given User is on de bijenkorf homepage
    When User search a product on homepage
    And Search results are loaded
    Then User select a product in the results
