package aqa.zabelin.pages;

import aqa.zabelin.SeleniumTestHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SentPage extends SeleniumTestHelper {

    @FindBy(xpath = "//a[starts-with(@class, 'layer') and contains(@href, 'sent')]")
    private WebElement sentHeader;

    @FindBy(xpath = "//span[starts-with(@class, 'layer') and contains(@data-id, 'contact')]")
    private WebElement sentField;

    public SentPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean checkSent(String eMailAdress) {
        return sentHeader.isDisplayed() && sentField.getText().toLowerCase().contains(eMailAdress.toLowerCase().trim());
    }
}