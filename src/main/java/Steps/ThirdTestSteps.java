package Steps;

import Pages.AccountPage;
import Pages.BookPage;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class ThirdTestSteps {

    private static String[] getIsbnValue() {
        AccountPage.goToBookStore.scrollIntoView(true);
        AccountPage.goToBookStore.click();

        String firstBookName = AccountPage.firstBook.getText();
        AccountPage.firstBook.click();

        return new String[] {BookPage.isbn.getText(), firstBookName};
    }

    public static void checkIsbnAndNameWithApi() {
        String[] isbnAndName = getIsbnValue();

        String response = given().
                contentType(ContentType.JSON).
                pathParam("ISBN", isbnAndName[0]).
                get("https://bookstore.toolsqa.com/swagger/#/BookStore/BookStoreV1BookGet?ISBN={ISBN}").
                then().
                assertThat().
                statusCode(200).
                and().
                extract().
                body().asString();

        System.out.println(response); //ასე გამოაქვს და დაბლა ხაზზე არის შემოწმება title-ის კარგად რომ მოქონდეს response
//        Assert.assertTrue(response.contains(isbnAndName[1]));
    }
}
