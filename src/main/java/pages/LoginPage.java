package pages;

import commons.BasePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage extends BasePage {

	private static final Logger lOGGER = LogManager.getLogger(LoginPage.class.getName());
	
    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement textField;

    @FindBy(id = "(//a[@class='hide-focus-ring'])[3]")
    public WebElement images;

   

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void textField() {
		wait.forPage();
		lOGGER.info("Wait Till Enters Text In TextField");
		 wait.forElementToBeVisible(textField);
		 textField.clear();
		 textField.sendKeys("stackoverflow");
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.ENTER).build().perform();
	 }
    public void images() {
		wait.forPage();
		lOGGER.info("Wait Till Clicks Images");
		 wait.forElementToBeVisible(images);
		 images.click();
    }
}
