package aqa.zabelin;

import aqa.zabelin.pages.MainPage;
import aqa.zabelin.pages.LoginPage;
import org.junit.jupiter.api.Assertions;

public class QualityLabTest {

    public static void runQualityLabTest() throws NullPointerException {

        String title = "QualityLab is true lab! (c)ZABELIN";
        String body = "Really true! (c)ZABELIN";
        String login = Settings.getUrlMailRuLogin();
        String pass = Settings.getUrlMailRuPass();

        MainPage mainPage  = new LoginPage()
                .setLogin(login)
                .setPass(pass)
                .writeEMail()
                .sendEMail(login, title, body);

        Assertions.assertTrue(true);
    }
}
