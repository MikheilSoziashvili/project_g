import Data.RegisterData;
import Steps.*;
import Utils.Utils;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass {

    String userName = "testAutomation";
    String password = "Automation@1234";

    @BeforeSuite
    public void setUp() {
        Configuration.timeout = 5000;
        Configuration.browser = "chrome";
    }

    @Test(priority = 0, dataProvider = "registrationData", dataProviderClass = RegisterData.class)
    public void firstTest(String firstName, String lastName, String userName, String password) {
        FirstTestSteps.clickNew();
        FirstTestSteps.fillAndClickRegister(firstName, lastName, userName, password);
        FirstTestSteps.validateError();
    }

    @Test(priority = 1)
    public void secondTest() {
        Utils.login(userName, password);
        SecondTestSteps.checkUserName(userName);
    }

    @Test(priority = 2)
    public void thirdTest() {
        Utils.login(userName, password);
        ThirdTestSteps.checkIsbnAndNameWithApi();
    }

    @Test(priority = 3)
    public void fourthTest() {
        Utils.login(userName, password);
        FourthTestSteps.fillSearchAndValidate();
    }

    @Test(priority = 4)
    public void fifthTest() {
        Utils.login(userName, password);
        FifthTestSteps.clickLogoutAndCheckScreen();
    }

}
