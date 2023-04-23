package aqa.zabelin;

import java.io.IOException;
import java.util.Properties;

public abstract class Settings {

    private static final Properties prop = new Properties();

    static {
        try {
            prop.load(SeleniumTestHelper.class.getClassLoader().getResourceAsStream("settings.properties"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String loadProperty(String key) {
        return prop.getProperty(key).trim();
    }

    public static String getUrlMailRu() {
        return loadProperty("urlMailRu");
    }

    public static String getUrlMailRuLogin() {
        return loadProperty("urlMailRuLogin");
    }

    public static String getUrlMailRuPass() {
        return loadProperty("urlMailRuPass");
    }
}