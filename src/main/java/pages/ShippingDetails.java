package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class ShippingDetails extends BasePage {
	
	private static final Logger lOGGER = LogManager.getLogger(ShippingDetails.class.getName());

	@FindBy(id = "shipping_first_name")
	public WebElement firstName;
	
	@FindBy(id = "shipping_last_name")
	public WebElement lastName;
	
	@FindBy(id = "shipping_country")
	public WebElement countryName;
	
	@FindBy(id = "shipping_address_1")
	public WebElement streetName;
	
	@FindBy(id = "shipping_address_2")
	public WebElement suiteName;
	
	@FindBy(id = "shipping_city")
	public WebElement cityName;
	
	@FindBy(id = "shipping_state")
	public WebElement stateName;
	
	@FindBy(id = "shipping_postcode")
	public WebElement postcode;
	
	@FindBy(id = "shipping_phone")
	public WebElement phone;
	
	@FindBy(id = "place_order")
	public WebElement placeOrder;
	
	@FindBy(xpath = "//h2[@class='woocommerce-order-details__title']")
	public WebElement orderDetails;
	
	public ShippingDetails(WebDriver driver) {
		super(driver);
	}
	public void firstName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters First Name");
		wait.forElementToBeVisible(firstName);
		sendKeys(firstName, "Akshay");
	}
	public void lastName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Last Name");
		wait.forElementToBeVisible(lastName);
		sendKeys(lastName, "Kumar");
	}
	public void countryName() {
		wait.forPage();
		lOGGER.info("Wait Till Selects India");
		wait.forElementToBeVisible(countryName);
		dropDown(countryName, "India");
	}
	public void streetName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Street Name");
		wait.forElementToBeVisible(streetName);
		sendKeys(streetName, "Flora Fountain");
	}
	public void suiteName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Suite Name");
		wait.forElementToBeVisible(suiteName);
		sendKeys(suiteName, "Hira Nandini Suites");
	}
	public void cityName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters City Name");
		wait.forElementToBeVisible(cityName);
		sendKeys(cityName, "Bangalore");
	}
	public void stateName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters State Name");
		wait.forElementToBeVisible(stateName);
		dropDown(stateName, "Karnataka");
	}
	public void postcode() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Postcode");
		wait.forElementToBeVisible(postcode);
		sendKeys(postcode, "400050");
	}
	public void phone() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Phone Number");
		wait.forElementToBeVisible(phone);
		sendKeys(phone, "9876543210");
	}
	public void placeOrder() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Place Order");
		wait.forElementToBeVisible(placeOrder);
		click(placeOrder);
	}
	
}
