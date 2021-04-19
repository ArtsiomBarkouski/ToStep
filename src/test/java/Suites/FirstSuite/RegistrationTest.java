package Suites.FirstSuite;
import Driver.MainDriver;
import Pages.BasePage;
import Pages.RegistrationPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RegistrationTest {

    @BeforeTest
    public void init() {
        BasePage.driverInitiation();
    }

    @Test
    public void registrationTest() {
        BasePage.openPage("https://artterritory.by/");
        RegistrationPage.fullRegister("123aaa112313@gmail.com", "123456789");
    }

    @AfterTest
    public void tearDown() {
        MainDriver.quitDriver();
    }
}
