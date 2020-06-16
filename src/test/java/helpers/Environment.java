package helpers;

import static java.lang.Boolean.parseBoolean;

public class Environment {

    public final static String
            selenoidUrl = System.getProperty("selenoid_url", "selenoid.autotests.cloud"),
            mailruUrl = System.getProperty("mailruUrl", "https://mail.ru");

    public final static boolean
            isHeadless = parseBoolean(System.getProperty("isHeadless", "false")),
            isSelenoid = selenoidUrl != null;
}