package Steps;

import Pages.AccountPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Visible;

public class FourthTestSteps {

    public static void fillSearchAndValidate() {
        AccountPage.goToBookStore.scrollIntoView(true);
        AccountPage.goToBookStore.click();

        AccountPage.search.sendKeys(AccountPage.firstBook.getText());
        AccountPage.firstBook.shouldBe(Condition.visible);
    }
}
