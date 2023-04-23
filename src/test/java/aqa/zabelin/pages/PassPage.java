package aqa.zabelin.pages;

import aqa.zabelin.SeleniumTestHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassPage extends SeleniumTestHelper {

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@data-test-id='submit-button']")
    private WebElement loginButton;

    public PassPage() {
        PageFactory.initElements(driver, this);
    }

    public MainPage setPassAndSend(String pass) {
        passwordField.sendKeys(pass);
        loginButton.click();
        return new MainPage();
    }

    public ReceivedPage setPassAndCheck(String pass) {
        passwordField.sendKeys(pass);
        loginButton.click();
        return new ReceivedPage();
    }
}