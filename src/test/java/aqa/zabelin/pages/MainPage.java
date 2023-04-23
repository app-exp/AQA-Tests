package aqa.zabelin.pages;

import aqa.zabelin.SeleniumTestHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends SeleniumTestHelper {

    @FindBy(xpath = "//a[contains(@href, 'compose') and starts-with(@class, 'compose')]")
    private WebElement writeButton;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public EMailPage writeEMail() {
        writeButton.click();
        return new EMailPage();
    }
}