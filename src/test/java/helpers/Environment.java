package helpers;


public class Environment {
// COMMON CONFIG
    public final static String
        url = System.getProperty("url", "http://facebook.com"),
        email = System.getProperty("email", "qa.guru.test@gmail.com"),
        password = System.getProperty("password", "testpassword#&!"),
        item = System.getProperty("item", "ThinkPad"),
        url2 = System.getProperty("url2", "https://market.yandex.kz");

}
