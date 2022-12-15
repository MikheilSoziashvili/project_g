package Steps;

import Pages.LoginPage;
import Pages.RegisterPage;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.bidi.log.Log;

import static com.codeborne.selenide.Selenide.open;

public class FirstTestSteps {

    public static void clickNew() {
        open("https://demoqa.com/login");

        LoginPage.newUser.scrollIntoView(true);
        LoginPage.newUser.click();
    }

    public static void fillAndClickRegister(String firstName, String lastName, String userName, String password) {
        RegisterPage.firstName.sendKeys(firstName);
        RegisterPage.lastName.sendKeys(lastName);
        RegisterPage.userName.sendKeys(userName);
        RegisterPage.password.sendKeys(password);

        RegisterPage.register.scrollIntoView(true);
        RegisterPage.register.click();
    }

    public static void validateError() {
        RegisterPage.error.shouldHave(Condition.exactText("Please verify reCaptcha to register!"));
    }
}
