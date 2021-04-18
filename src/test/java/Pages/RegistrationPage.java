package Pages;

import static Pages.MainPageBeforeLoginLocators.LOG_IN_BUTTON;
import static Pages.RegistrationPageLocators.*;

public class RegistrationPage extends BasePage {

    public static void logInButtonCLick() {
        buttonClick(LOG_IN_BUTTON);
    }

    public static void registrationOnMailPageButtonClick() {
        buttonClick(REGISTRATION_BUTTON_ON_MAIN_PAGE);
    }

    public static void typeEmail(CharSequence email) {
        input(EMAIL_FIELD, email);
    }

    public static void typePassword(CharSequence password) {
        input(PASSWORD_FIELD, password);
    }

    public static void confirmPassword(CharSequence password) {
        input(PASSWORD_CONFIRM_FIELD, password);
    }

    public static void registerButtonClick() {
        buttonClick(REGISTER_BUTTON);
    }

    public static void fullRegister(CharSequence email, CharSequence password) {
        logInButtonCLick();
        registrationOnMailPageButtonClick();
        typeEmail(email);
        typePassword(password);
        confirmPassword(password);
        registerButtonClick();
    }
}

