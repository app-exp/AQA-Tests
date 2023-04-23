package aqa.zabelin.pages;

import aqa.zabelin.Settings;
import aqa.zabelin.SeleniumTestHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class LoginPage extends SeleniumTestHelper {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement loginField;

    @FindBy(xpath = "//button[@data-test-id='next-button']")
    private WebElement nextButton;

    public LoginPage() {
        driver.get(Settings.getUrlMailRu());
        PageFactory.initElements(driver, this);
    }

    public PassPage setLogin(String login, String header) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('h3[data-test-id=header-text]').textContent='" + header + "';");

        loginField.sendKeys(login);
        nextButton.click();
        return new PassPage();
    }
}