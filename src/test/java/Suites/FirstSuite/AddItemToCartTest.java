package Suites.FirstSuite;
import Driver.MainDriver;
import Pages.BasePage;
import Pages.MainPageAfterLogin;
import Pages.MainPageBeforeLogin;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Driver.MainDriver.LOG;


public class AddItemToCartTest {

    @BeforeTest
    public void init() {
        BasePage.driverInitiation();
    }

    @Test
    public void artTerritoryLoginTest()  {
        BasePage.openPage("https://artterritory.by/");
        MainPageBeforeLogin.fullLogIn("tomagavk19@gmail.com", "123456789");
        MainPageAfterLogin.loginSuccessfull();
        LOG.info("login succsessful");
    }

    @Test(dependsOnMethods={"artTerritoryLoginTest"})
    public void addToCartTest() {
        MainPageAfterLogin.searchObject("фломастер");
        MainPageAfterLogin.addToCartFirstObjectAndCreateOrder();
    }

    @AfterTest
    public void tearDown() {
        MainDriver.quitDriver();
    }
}
