package Pages;

import Driver.MainDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

public class BasePage {
    private static WebDriver driver = MainDriver.getDriver();
    private static final Properties properties = new Properties();
   /* private static final CharSequence login = properties.getProperty("login");
    private static final CharSequence password = properties.getProperty("password");
    private static final String URL = properties.getProperty("adress");*/

    protected static WebElement initElement(By by) {
        return driver.findElement(by);
    }

    protected static  void input(By element, CharSequence text) {
        initElement(element).clear();
        initElement(element).sendKeys(text);
    }
    protected static void buttonClick(By element) {
        initElement(element).click();
    }

   /* public static CharSequence getLogin() {
        return properties.getProperty("username");
    }

    public static CharSequence getPassword() {
        return properties.getProperty("password");
    }

   public static String getURL() {
        return properties.getProperty("adress");
    }*/

    public static void openPage(String url) {
        driver.get(url);
    }
    public static void driverInitiation () {
        MainDriver.chromeDriverInited();
    }


}
