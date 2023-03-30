package aqa.zabelin.pages;

import aqa.zabelin.TestHelperSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMailPage extends TestHelperSelenium {

    @FindBy(xpath = "//div[starts-with(@class, 'contactsContainer')]//input[starts-with(@class, 'container') and @type='text']")
    private WebElement eMailField;

    @FindBy(xpath = "//div[starts-with(@class, 'subject')]//input[starts-with(@class, 'container') and @type='text']")
    private WebElement subjectField;

    @FindBy(xpath = "//div[@role='textbox' and starts-with(@class, 'editable') and @contenteditable='true']")
    private WebElement bodyField;

    @FindBy(xpath = "//button[@data-test-id='send']")
    private WebElement sendButton;

    public EMailPage() {
        PageFactory.initElements(driver, this);
    }

    public MainPage sendEMail(String eMail, String title, String body) {
        eMailField.sendKeys(eMail);
        subjectField.sendKeys(title);
        bodyField.sendKeys(body);
        sendButton.click();
        return new MainPage();
    }
}
