package Utils;

import Pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class Utils {

    public static void login(String userName, String password) {
        open("https://demoqa.com/login");
        LoginPage.userName.sendKeys(userName);
        LoginPage.password.sendKeys(password);

        LoginPage.login.scrollIntoView(true);
        LoginPage.login.click();
    }
}
