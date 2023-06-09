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
        String password = Settings.getUrlMailRuPass();

        System.out.println("SENT CHECK STRING: " + sentString);

        boolean sentResult = new LoginPage()
                .setLogin(login, "SENDING TEST")
                .setPassAndSend(password)
                .writeEMail()
                .sendEMail(login, title, body)
                .checkSent(login);

        boolean receivedResult = new LoginPage()
                .setLogin(login, "RECEIVING TEST")
                .setPassAndCheck(password)
                .checkReceived(sentString);

        Assertions.assertEquals(sentResult, receivedResult);
    }
}