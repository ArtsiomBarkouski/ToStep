package Pages;

import org.openqa.selenium.By;

public class MainPageAfterLoginLocators {

   protected final static By USER_NAME_LOGO = By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div[2]/div[2]/a/span");
   protected final static By SEARCH_INPUT = By.xpath("//*[@id='title-search-input']");
   protected final static By FIRST_OBJECT_IN_SEARCH_RESULT = By.xpath("//*[@class='items']/div[1]//a[@class='btn']");
   protected final static By FIRST_COLOR_OF_FIRST_OBJECT = By.xpath("//*[@class='color-block noscroll']/div[1]");
   protected final static By ADD_TO_CART_BUTTON = By.xpath("//div[@class='btn']");
   protected final static By GO_TO_CART_BUTTON = By.xpath("//*[@class='go_to_cart']/input");
   protected final static By CREATE_ORDER_BUTTON = By.xpath("//*[@class='button-red']");
   protected final static By CREATR_ORDER_NEXT_BUTTON = By.xpath("//*[@id='bx-soa-total']/div[3]");


}
