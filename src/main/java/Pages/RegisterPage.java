package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    public static SelenideElement firstName = $("#firstname");
    public static SelenideElement lastName = $("#lastname");
    public static SelenideElement userName = $("#userName");
    public static SelenideElement password = $("#password");
    public static SelenideElement register = $("#register");
    public static SelenideElement error = $("#name");
}
