package Pages;

import Driver.MainDriver;
import org.openqa.selenium.By;
<<<<<<< HEAD
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

public class BasePage {
    private static WebDriver driver = MainDriver.getDriver();
    private static final Properties properties = new Properties();
=======
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Properties;

import static org.openqa.selenium.Keys.ENTER;

public class BasePage {
    private static WebDriver driver = MainDriver.getDriver();
    private static final Properties properties = new Properties();
    private static final long PAUSE_LENGTH = 30000;
    private final static WebDriverWait wait = new WebDriverWait(driver, 30);
>>>>>>> 1e231fb3f920456822ed46377f3765e666a4b02a
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
<<<<<<< HEAD
=======

    protected static  void inputAndEnter(By element, CharSequence text) {
        initElement(element).clear();
        initElement(element).sendKeys(text);
        initElement(element).sendKeys(ENTER);
    }

>>>>>>> 1e231fb3f920456822ed46377f3765e666a4b02a
    protected static void buttonClick(By element) {
        initElement(element).click();
    }

<<<<<<< HEAD
   /* public static CharSequence getLogin() {
        return properties.getProperty("username");
    }

    public static CharSequence getPassword() {
        return properties.getProperty("password");
    }

   public static String getURL() {
        return properties.getProperty("adress");
    }*/
=======
     /*public static void waitForElementVisible(By element) {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() < start + PAUSE_LENGTH) {
            if (initElement(element).isDisplayed()) {
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                MainDriver.LOG.error(e.getMessage());
                throw new AssertionError(e);
            }
        }
        throw new ElementNotVisibleException("---------- WebElement "
                + initElement(element) + " still isn't visible");
    } */

    public static void waitForElementPresent(By element) {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() < start + PAUSE_LENGTH) {
            if ((isPresent(element))) {

                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                MainDriver.LOG.error(e.getMessage());
                throw new AssertionError(e);
            }
        }
        throw new ElementNotVisibleException("---------- WebElement "
                + initElement(element) + " still isn't visible");
    }

    protected static void waitForElementToBeVisible(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    protected static void waitForElementToBeVisibleAndClickableAndClick(By element) {
        waitForElementToBeVisible(element);
        waitForElementPresent(element);
        buttonClick(element);
    }

    private static boolean isPresent(By element) {
        return !driver.findElements(element).isEmpty();
    }
>>>>>>> 1e231fb3f920456822ed46377f3765e666a4b02a

    public static void openPage(String url) {
        driver.get(url);
    }
    public static void driverInitiation () {
        MainDriver.chromeDriverInited();
    }


}
