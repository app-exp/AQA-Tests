package aqa.zabelin.pages;

import aqa.zabelin.SeleniumTestHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReceivedPage extends SeleniumTestHelper {

    @FindBy(xpath = "//div[@class='nav-folders']//a[contains(@href, 'inbox')]")
    private WebElement receiveButton;

    @FindAll(@FindBy(xpath = "//div[contains(@class, 'rid')]//a[contains(@href, 'inbox')]//span[contains(@class, 'normal')]"))
    public List<WebElement> eMailsElements;

    public ReceivedPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean checkReceived(String sentString) {

        boolean result = false;

        receiveButton.click();

        for (WebElement eMail : eMailsElements) {
            if (eMail.getText().contains(sentString)) {
                result = true;
                break;
            }
        }

        return result;
    }
}