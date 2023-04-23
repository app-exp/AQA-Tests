package aqa.zabelin.pages;

import aqa.zabelin.SeleniumTestHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SentPage extends SeleniumTestHelper {

    @FindBy(xpath = "//a[starts-with(@class, 'layer') and contains(@href, 'sent')]")
    private WebElement sentField;

    public SentPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean checkSent() {
        return sentField.isDisplayed();
    }
}