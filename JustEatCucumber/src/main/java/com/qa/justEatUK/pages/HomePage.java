package com.qa.justEatUK.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.justEatUK.Utilities.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//input[@name='postcode']")
	public WebElement searchBox;

	@FindBy(xpath="//button[@aria-label='Search']")
	public WebElement searchButton;
	
	@FindBy(xpath="//div[@aria-live='assertive']")
	public WebElement errorMessage;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public RestaurantListPage clickOnSearchButton() {
		searchButton.click();
		return new RestaurantListPage();

	}
	
	public HomePage enterSearchButton(String a) {
		PageFactory.initElements(driver, this);
		searchBox.sendKeys(a);
		return new HomePage();

	}
	
}
