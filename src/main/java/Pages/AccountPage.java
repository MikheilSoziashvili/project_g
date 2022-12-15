package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AccountPage {
    public static SelenideElement userName = $("#userName-value");
    public static SelenideElement goToBookStore = $("#gotoStore");
    public static SelenideElement search = $("#searchBox");
    public static SelenideElement logOut = $("#submit");
    public static SelenideElement firstBook = $x("//div[@class = 'rt-tbody']/div[@class = 'rt-tr-group'][1]//div[@class = 'action-buttons']//a");

}
