package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BookPage {
    public static SelenideElement isbn = $x("//div[@id = 'ISBN-wrapper']//label[@id = 'userName-value']");
}
