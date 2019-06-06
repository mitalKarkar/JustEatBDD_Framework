package com.qa.justEatUK.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.justEatUK.Utilities.TestBase;

public class RestaurantListPage extends TestBase{
	
	@FindBy(xpath="//span[@class='u-showAboveMid']")
	WebElement options;
	
	@FindBy(xpath="//label[@for='Distance']")
	WebElement radioButtonDistance;
	
	@FindBy(xpath="//span[@class='u-showAboveMid']")
	public WebElement sortLabel;
	
	@FindBy(linkText="change location")
	public WebElement changeLocationLink;
	
	@FindBy(xpath="//span[@class='u-showAboveMid']")
	WebElement sortByBestMatch;
	
	@FindBy(xpath="//div[@aria-live='assertive']")
	public WebElement errorMessage;
	
	public RestaurantListPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void hoverOnSortedByBestMatch() {
		
		Actions action = new Actions(driver);
		action.moveToElement(sortByBestMatch).perform();
	}
	
	public void ClickOnDistanceOption() {
		radioButtonDistance.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
