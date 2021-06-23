package pages;

import commons.BasePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage extends BasePage {

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());
	
    @FindBy(xpath = "//div[@class='mc-closeModal']")
    public WebElement closeModal;

    @FindBy(xpath = "(//a[contains(text(),'Shop All')])[1]")
    public WebElement shopAll;
    
    @FindBy(xpath = "(//h2[@class='woocommerce-loop-product__title'])[84]")
    public WebElement product1;
    
    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addToCart;
    
    @FindBy(xpath = "(//h2[@class='woocommerce-loop-product__title'])[128]")
    public WebElement product2;
    
    @FindBy(xpath = "//a[contains(text(),'View cart')]")
    public WebElement viewCart;
    
    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    public WebElement checkout;
    
    @FindBy(xpath = "//h3[contains(text(),'Billing details')]")
    public WebElement billingDetails;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void closeModal() {
		wait.forPage();
		lOGGER.info("Wait Till Clicks Close Modal");
		 wait.forElementToBeVisible(closeModal);
		 click(closeModal);
    }
    public void shopAll() {
		wait.forPage();
		lOGGER.info("Wait Till Clicks Shop All");
		 wait.forElementToBeVisible(shopAll);
		 click(shopAll);
    }
    public void product1() {
		wait.forPage();
		lOGGER.info("Wait Till Clicks Product 1");
		 wait.forElementToBeVisible(product1);
		 click(product1);
    }
    public void addToCart() {
		wait.forPage();
		lOGGER.info("Wait Till Clicks Add To Cart");
		 wait.forElementToBeVisible(addToCart);
		 click(addToCart);
    }
    public void product2() {
		wait.forPage();
		lOGGER.info("Wait Till Clicks Product 2");
		 wait.forElementToBeVisible(product2);
		 click(product2);
    }
    public void viewCart() {
		wait.forPage();
		lOGGER.info("Wait Till Clicks View Cart");
		 wait.forElementToBeVisible(viewCart);
		 click(viewCart);
    }
    public void checkout() {
		wait.forPage();
		lOGGER.info("Wait Till Clicks Checkout");
		 wait.forElementToBeVisible(checkout);
		 click(checkout);
    }
}
