package Pages;

import org.openqa.selenium.By;

public class RegistrationPageLocators {
    protected final static By REGISTRATION_BUTTON_ON_MAIN_PAGE = By.xpath("/html/body/header/div[1]/div/div/div/div[1]/form[2]/span[2]");
    protected final static By EMAIL_FIELD = By.xpath("/html/body/header/div[1]/div/div/div/div[1]/form[3]/input[4]");
    protected final static By PASSWORD_FIELD = By.xpath("/html/body/header/div[1]/div/div/div/div[1]/form[3]/input[5]");
    protected final static By PASSWORD_CONFIRM_FIELD = By.xpath("/html/body/header/div[1]/div/div/div/div[1]/form[3]/input[6]");
    protected final static By REGISTER_BUTTON = By.xpath("/html/body/header/div[1]/div/div/div/div[1]/form[3]/input[7]");

}
