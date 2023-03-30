package aqa.zabelin.pages;

import aqa.zabelin.TestHelperSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends TestHelperSelenium {

    @FindBy(xpath = "//a[contains(@href, 'compose') and starts-with(@class, 'compose')]")
    private WebElement writeButton;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public EMailPage writeEMail() {
        //https://e.mail.ru/compose/
        writeButton.click();
        return new EMailPage();
    }
}
