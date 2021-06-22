import static commons.Configuration.url;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.TestBase;
import pages.BillingDetails;
import pages.HomePage;
import pages.ShippingDetails;

public class JumboCardOrderFlowTest extends TestBase {

	@BeforeClass
	public void openPage() {
		driver.get(url.asString());
	}

	@Test(priority=1)
	public void addProductsToCart() {
		HomePage home = new HomePage(driver);
		home.closeModal();
		home.shopAll();
		home.product1();
		home.addToCart();
		home.shopAll();
		home.product2();
		home.addToCart();
		home.viewCart();
		home.checkout();
		Assert.assertTrue(home.billingDetails.isDisplayed());

	}
	@Test(priority=2)
	public void billingDetails() {
		BillingDetails details = new BillingDetails(driver);
		details.firstName();
		details.lastName();
		details.countryName();
		details.streetName();
		details.suiteName();
		details.cityName();
		details.stateName();
		details.postcode();
		details.phone();
		details.enterEmail();
		
	}
	@Test(priority=3)
	public void shippingDetails() {
		ShippingDetails details = new ShippingDetails(driver);
		details.firstName();
		details.lastName();
		details.countryName();
		details.streetName();
		details.suiteName();
		details.cityName();
		details.stateName();
		details.postcode();
		details.phone();
		details.placeOrder();
		Assert.assertTrue(details.orderDetails.isDisplayed());
	}
}