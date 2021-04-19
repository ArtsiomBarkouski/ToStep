package Suites.FirstSuite;
import Driver.MainDriver;
import Pages.BasePage;
import Pages.MainPageAfterLogin;
import Pages.MainPageBeforeLogin;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest {

    @BeforeTest
    public void init() {
        BasePage.driverInitiation();
        }

    @Test
    public void artTerritoryLoginTest()  {
        BasePage.openPage("https://artterritory.by/");
        MainPageBeforeLogin.fullLogIn("tomagavk19@gmail.com", "123456789");
        MainPageAfterLogin.loginSuccessfull();

    }
    @AfterTest
    public void tearDown() {
        MainDriver.quitDriver();
    }
  }
