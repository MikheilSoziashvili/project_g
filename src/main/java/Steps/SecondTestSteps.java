package Steps;

import Pages.AccountPage;
import com.codeborne.selenide.Condition;

public class SecondTestSteps {

    public static void checkUserName(String userName) {
        AccountPage.userName.shouldHave(Condition.exactText(userName));
    }
}
