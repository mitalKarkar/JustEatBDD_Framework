$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/mitta/eclipse-workspace/JustEatCucumber/src/main/java/com/qa/justEatUK/feature/just-eat.feature");
formatter.feature({
  "line": 1,
  "name": "Use the website to find restaurants",
  "description": "\t\t So that I can order food\r\n\t\t As a hungry customer\r\n\t\t I want to be able to find restaurants in my area",
  "id": "use-the-website-to-find-restaurants",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Search for restaurants in an area",
  "description": "",
  "id": "use-the-website-to-find-restaurants;search-for-restaurants-in-an-area",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I want food in AR51 1AA",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for restaurant",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see some restaurants in AR51 1AA",
  "keyword": "Then "
});
formatter.match({
  "location": "restaurantSearchStepDefination.want_food_in_AR511AA()"
});
formatter.result({
  "duration": 9683049904,
  "status": "passed"
});
formatter.match({
  "location": "restaurantSearchStepDefination.search_for_restaurant()"
});
formatter.result({
  "duration": 8025409984,
  "status": "passed"
});
formatter.match({
  "location": "restaurantSearchStepDefination.see_some_restaurants_in_AR511AA()"
});
formatter.result({
  "duration": 802437461,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Sort the list of restaurants by distance in an area",
  "description": "",
  "id": "use-the-website-to-find-restaurants;sort-the-list-of-restaurants-by-distance-in-an-area",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User is on restaurant list page of area AR51 1AA",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User mouse over on Sorted By Best Match",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User should see the list and select Distance option",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User can see sort listed restaurants by distance",
  "keyword": "Then "
});
formatter.match({
  "location": "restaurantSearchStepDefination.user_is_on_restaurant_list_page_of_area()"
});
formatter.result({
  "duration": 151710108,
  "status": "passed"
});
formatter.match({
  "location": "restaurantSearchStepDefination.user_mouse_over_on_Sorted_By_Best_Match()"
});
formatter.result({
  "duration": 495252908,
  "status": "passed"
});
formatter.match({
  "location": "restaurantSearchStepDefination.user_should_see_the_list_and_select_Distance_option()"
});
formatter.result({
  "duration": 822646663,
  "status": "passed"
});
formatter.match({
  "location": "restaurantSearchStepDefination.user_can_see_sort_listed_restaurants_by_distance()"
});
formatter.result({
  "duration": 7664070638,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Search for location with invalid postcode",
  "description": "",
  "id": "use-the-website-to-find-restaurants;search-for-location-with-invalid-postcode",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "User is on restaurant list page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User navigate to Home Page by clicking Change location link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User search for invalid area \"45AR 1AA\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User should see warning to enter valid postcode",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "restaurantSearchStepDefination.user_is_on_restaurant_list_page()"
});
formatter.result({
  "duration": 257805011,
  "status": "passed"
});
formatter.match({
  "location": "restaurantSearchStepDefination.user_navigate_to_Home_Page_by_clicking_Change_location_link()"
});
formatter.result({
  "duration": 2337432366,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "45AR 1AA",
      "offset": 30
    }
  ],
  "location": "restaurantSearchStepDefination.user_search_for_invalid_area(String)"
});
formatter.result({
  "duration": 312767627,
  "status": "passed"
});
formatter.match({
  "location": "restaurantSearchStepDefination.user_should_see_warning_to_enter_valid_postcode()"
});
formatter.result({
  "duration": 64193404,
  "status": "passed"
});
formatter.match({
  "location": "restaurantSearchStepDefination.close_the_browser()"
});
formatter.result({
  "duration": 737240537,
  "status": "passed"
});
});