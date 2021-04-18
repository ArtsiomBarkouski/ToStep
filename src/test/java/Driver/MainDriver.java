package Driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class MainDriver {
    private static WebDriver driver;
    private final static Logger LOG = LogManager.getLogger("system");

    private MainDriver() {
    }

    private static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        LOG.info("Driver initialization");
        LOG.trace("Trace message");
        LOG.error("Error message");
        LOG.debug("Debug message");
        return new EventFiringWebDriver(new ChromeDriver(chromeOptions)).register(new WebDriverListener());
    }

    public static WebDriver getDriver() {
        return  (driver == null) ? driver = initChromeDriver() : driver;
    }

    public static WebDriver chromeDriverInited() {
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
           return getDriver();
       }

    public static void quitDriver() {
        driver.quit();
    }
}
