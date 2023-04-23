package aqa.zabelin;

import aqa.zabelin.pages.LoginPage;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class SeleniumTestMailRu {

    public static void runTest() throws NullPointerException {

        Random rand = new Random();
        String sentString = Integer.toString(rand.nextInt());
        String title = sentString + " Some title! (c)ZABELIN";
        String body = "Some text! (c)ZABELIN";

        String login = Settings.getUrlMailRuLogin();
        String pass = Settings.getUrlMailRuPass();

        System.out.println("SENT CHECK STRING: " + sentString);

        boolean sentResult = new LoginPage()
                .setLogin(login)
                .setPassAndSend(pass)
                .writeEMail()
                .sendEMail(login, title, body)
                .checkSent();

        boolean receivedResult = new LoginPage()
                .setLogin(login)
                .setPassAndCheck(pass)
                .checkReceived(sentString);

        Assertions.assertEquals(sentResult, receivedResult);
    }
}