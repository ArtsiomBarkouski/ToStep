package Pages;
import static Pages.MainPageBeforeLoginLocators.*;

public class MainPageBeforeLogin extends BasePage {

    public static void logInButtonCLick() {
        buttonClick(LOG_IN_BUTTON);
    }
    public static void typeUsername(CharSequence username) {
        input(EMAIL_FIELD, username);
    }
    public static void typePassword(CharSequence password) {
        input(PASSWORD_FIELD, password);
    }
    public static void loginButtonCLick() {
        buttonClick(LOGIN_BUTTON);
    }

    public static void fullLogIn(CharSequence username, CharSequence password) {
        logInButtonCLick();
        typeUsername(username);
        typePassword(password);
        loginButtonCLick();
    }
  //  public static boolean logInSucsessful() {
   //     "/html/body/header/div[1]/div/div/div/div[2]/div[2]/div[2]/a/span"
 //  }

}