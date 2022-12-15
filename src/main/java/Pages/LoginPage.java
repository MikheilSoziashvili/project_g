package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public static SelenideElement newUser = $("#newUser");
    public static SelenideElement userName = $("#userName");
    public static SelenideElement password = $("#password");
    public static SelenideElement login = $("#login");
    public static SelenideElement welcome = $x("//form[@id = 'userForm']//h2");
}
