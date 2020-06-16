package helpers;

import static java.lang.Boolean.parseBoolean;

public class Environment {

    public final static String
            selenoidUrl = System.getProperty("selenoid_url", "selenoid.autotests.cloud"),
            selenoidUsername = System.getProperty("selenoid_username", ""),
            selenoidPassword = System.getProperty("selenoid_password", ""),
            mailruUrl = System.getProperty("mailruUrl", "https://mail.ru");

    public final static boolean
            isHeadless = parseBoolean(System.getProperty("isHeadless", "false")),
            isSelenoid = selenoidUrl != null;
}