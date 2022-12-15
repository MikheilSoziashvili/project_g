package Steps;

import Pages.AccountPage;
import Pages.LoginPage;
import com.codeborne.selenide.Condition;

public class FifthTestSteps {

    public static void clickLogoutAndCheckScreen() {
        AccountPage.logOut.click();
        LoginPage.welcome.shouldHave(Condition.partialTextCaseSensitive("Welcome"));

    }
}
