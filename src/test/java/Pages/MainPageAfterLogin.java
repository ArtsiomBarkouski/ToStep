package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Pages.MainPageAfterLoginLocators.*;

public class MainPageAfterLogin extends BasePage {
    public static void loginSuccessfull() {
        Assert.assertEquals("incorrect login", "tomagavk19@gmail.com", BasePage.initElement(USER_NAME_LOGO).getText());
    }

    public static void searchObject (String obj) {
        waitForElementToBeVisibleAndClickableAndClick(SEARCH_INPUT);
        inputAndEnter(SEARCH_INPUT, obj);

    }

    public static void addToCartFirstObject() {
        waitForElementToBeVisibleAndClickableAndClick(FIRST_OBJECT_IN_SEARCH_RESULT);
        waitForElementToBeVisibleAndClickableAndClick(FIRST_COLOR_OF_FIRST_OBJECT);
        waitForElementToBeVisibleAndClickableAndClick(ADD_TO_CART_BUTTON);

    }

    public static void addToCartFirstObjectAndCreateOrder() {
        addToCartFirstObject();
        waitForElementToBeVisibleAndClickableAndClick(GO_TO_CART_BUTTON);
        waitForElementToBeVisibleAndClickableAndClick(CREATE_ORDER_BUTTON);
        waitForElementToBeVisibleAndClickableAndClick(CREATR_ORDER_NEXT_BUTTON);
    }
}
