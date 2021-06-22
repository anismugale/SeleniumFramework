package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class BillingDetails extends BasePage {

	private static final Logger lOGGER = LogManager.getLogger(BillingDetails.class.getName());

	@FindBy(id = "billing_first_name")
	public WebElement firstName;
	
	@FindBy(id = "billing_last_name")
	public WebElement lastName;
	
	@FindBy(xpath = "//select[@id='billing_country']")
	public WebElement countryName;
	
	@FindBy(id = "billing_address_1")
	public WebElement streetName;
	
	@FindBy(id = "billing_address_2")
	public WebElement suiteName;
	
	@FindBy(id = "billing_city")
	public WebElement cityName;
	
	@FindBy(id = "billing_state")
	public WebElement stateName;
	
	@FindBy(id = "billing_postcode")
	public WebElement postcode;
	
	@FindBy(id = "billing_phone")
	public WebElement phone;
	
	@FindBy(id = "billing_email")
	public WebElement enterEmail;
	

	public BillingDetails(WebDriver driver) {
		super(driver);
	}
	public void firstName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters First Name");
		wait.forElementToBeVisible(firstName);
		sendKeys(firstName, "Rohit");
	}
	public void lastName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Last Name");
		wait.forElementToBeVisible(lastName);
		sendKeys(lastName, "Sharma");
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
		sendKeys(streetName, "FC Road");
	}
	public void suiteName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Suite Name");
		wait.forElementToBeVisible(suiteName);
		sendKeys(suiteName, "Royal Orchid Golden Suites");
	}
	public void cityName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters City Name");
		wait.forElementToBeVisible(cityName);
		sendKeys(cityName, "Pune");
	}
	public void stateName() {
		wait.forPage();
		lOGGER.info("Wait Till Enters State Name");
		wait.forElementToBeVisible(stateName);
		dropDown(stateName, "Maharashtra");
	}
	public void postcode() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Postcode");
		wait.forElementToBeVisible(postcode);
		sendKeys(postcode, "201307");
	}
	public void phone() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Phone Number");
		wait.forElementToBeVisible(phone);
		sendKeys(phone, "9876543210");
	}
	public void enterEmail() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Email");
		wait.forElementToBeVisible(enterEmail);
		sendKeys(enterEmail, "abc@xyz.com");
	}

}
