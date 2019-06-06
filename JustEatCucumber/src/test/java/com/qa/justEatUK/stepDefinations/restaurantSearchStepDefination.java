package com.qa.justEatUK.stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.justEatUK.Utilities.TestBase;
import com.qa.justEatUK.pages.HomePage;
import com.qa.justEatUK.pages.RestaurantListPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class restaurantSearchStepDefination extends TestBase {
	
	static WebDriverWait wait;
	
	public restaurantSearchStepDefination () {
		super();
	}
	
	
	HomePage homePage;
	RestaurantListPage listPage ;
	
	
	@Given("^I want food in AR51 1AA$")
	public void want_food_in_AR511AA() throws InterruptedException {
		homePage = new HomePage();
		initialization();
		Thread.sleep(1500);
		homePage.enterSearchButton("AR51 1AA");
		//driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("AR51 1AA");
	}
	
	@When("^I search for restaurant$")
	public void search_for_restaurant() {
		homePage = new HomePage();
		homePage.clickOnSearchButton();
	}
	
	@Then("^I should see some restaurants in AR51 1AA$")
	public void see_some_restaurants_in_AR511AA() {
		listPage = new RestaurantListPage();
		List<WebElement> totalOpenRestaurants = driver.findElements(By.xpath("(//div[@class='c-listing-loader has-ex-1118-active'])[1]/section"));
		boolean actual = totalOpenRestaurants.size()>0;
		Assert.assertTrue(actual);
	}
	
	@Given("^User is on restaurant list page of area AR51 1AA$")
	public void user_is_on_restaurant_list_page_of_area() throws  InterruptedException {
		listPage = new RestaurantListPage();
		String actual = driver.getCurrentUrl();
		System.out.println(actual+"actual url");
		String expected = prop.getProperty("expectedURL");
		System.out.println(expected+": Expected URL");
		Assert.assertEquals(actual, expected);
	}
	
	@When("^User mouse over on Sorted By Best Match$")
	public void user_mouse_over_on_Sorted_By_Best_Match() {
		listPage = new RestaurantListPage();
		listPage.hoverOnSortedByBestMatch();
	}
	
	@Then("^User should see the list and select Distance option$")
	public void user_should_see_the_list_and_select_Distance_option() throws InterruptedException {
		listPage = new RestaurantListPage();
		listPage.ClickOnDistanceOption();
	}
	
	@Then("^User can see sort listed restaurants by distance$")
	public void user_can_see_sort_listed_restaurants_by_distance() throws InterruptedException {
		listPage = new RestaurantListPage();
		wait  = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='u-showAboveMid']")));
		String actualLabel = listPage.sortLabel.getText();	
		Assert.assertEquals(actualLabel, prop.getProperty("expectedLabel"));	
	}
	
	@Given("^User is on restaurant list page$")
	public void user_is_on_restaurant_list_page() {
		listPage = new RestaurantListPage();
	    Assert.assertEquals(driver.getTitle(), prop.getProperty("expectedTitle"));
	}

	@When("^User navigate to Home Page by clicking Change location link$")
	public void user_navigate_to_Home_Page_by_clicking_Change_location_link() {
		listPage = new RestaurantListPage();
		homePage = new HomePage();
		listPage.changeLocationLink.click();		
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("url"));	  
	}

	@Then("^User search for invalid area \"(.*)\"$")
	public void user_search_for_invalid_area(String invalidPostcode) {
		homePage = new HomePage();
		homePage.searchBox.clear();
		homePage.searchBox.sendKeys(invalidPostcode + Keys.ENTER);
	}

	@And("^User should see warning to enter valid postcode$")
	public void user_should_see_warning_to_enter_valid_postcode() {
		homePage = new HomePage();
		Assert.assertEquals(homePage.errorMessage.getText(), prop.getProperty("expectedResult"));
	}
	
	@Then("^User close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
