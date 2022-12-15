package Data;

import org.testng.annotations.DataProvider;

public class RegisterData {

    @DataProvider(name = "registrationData")
    public static Object[][] registerData() {
        return new Object[][] {
                {"Giorgi", "Odishvili", "giorgiodishvili1", "giorgi-23@"},
                {"Giorgi1", "Odishvili1", "giorgiodishvili2", "gioodishvili-12%"}
        };
    }
}
