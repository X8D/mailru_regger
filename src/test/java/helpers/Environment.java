package helpers;

public class Environment {
    public final static String
            mailUrl = System.getProperty("urlmailru","https://mail.ru"),

            remoteDriverUrl = System.getProperty("remote_driver_url"), // https://username:password@selenoid.autotests.cloud:4444/wd/hub/
            videoStorageUrl = System.getProperty("video_storage_url"); // https://selenoid.autotests.cloud/video/

}