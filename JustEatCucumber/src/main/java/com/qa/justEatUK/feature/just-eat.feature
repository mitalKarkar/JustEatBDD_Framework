Feature: Use the website to find restaurants
				 So that I can order food
				 As a hungry customer
				 I want to be able to find restaurants in my area

Scenario: Search for restaurants in an area

		Given I want food in AR51 1AA
		When I search for restaurant
		Then I should see some restaurants in AR51 1AA
		
Scenario: Sort the list of restaurants by distance in an area

		Given User is on restaurant list page of area AR51 1AA
		When User mouse over on Sorted By Best Match
		Then User should see the list and select Distance option
		Then User can see sort listed restaurants by distance

Scenario: Search for location with invalid postcode

		Given User is on restaurant list page
		When User navigate to Home Page by clicking Change location link
		Then User search for invalid area "45AR 1AA"
		And User should see warning to enter valid postcode
		Then User close the browser
