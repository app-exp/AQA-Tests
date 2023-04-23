package aqa.zabelin.pages;

import aqa.zabelin.Settings;
import aqa.zabelin.SeleniumTestHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends SeleniumTestHelper {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement loginField;

    @FindBy(xpath = "//button[@data-test-id='next-button']")
    private WebElement nextButton;

    public LoginPage() {
        driver.get(Settings.getUrlMailRu());
        PageFactory.initElements(driver, this);
    }

    public PassPage setLogin(String login) {
        loginField.sendKeys(login);
        nextButton.click();
        return new PassPage();
    }
}