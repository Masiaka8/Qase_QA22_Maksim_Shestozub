package tests;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginTest extends BaseTest {

    @Test
    public void positiveLoginTest() {
        $("#inputEmail").setValue(BASE_USERNAME);
        $("#inputPassword").setValue(BASE_PASSWORD);
        $("#btnLogin").click();
        $("#createButton").shouldBe(visible);
    }
}

