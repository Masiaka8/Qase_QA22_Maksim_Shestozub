package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TestCaseTest extends BaseTest{

    private final static String PROJECT_NAME = "Project2";
    private final static String PROJECT_CODE = "QWE2";
    private final static String DESCRIPTION_PROJECT_INPUT = "QWEQWEQWE";
    private final static String NAME_NEW_CASE = "QWE111";
    private final static String DESCRIPTION_CASE_INPUT = "wasd123";

    @Test
    public void createNewTestCase (){
        $("#inputEmail").setValue(BASE_USERNAME);
        $("#inputPassword").setValue(BASE_PASSWORD);
        $("#btnLogin").click();
        $("#createButton").click();
        $("#project-name").setValue(PROJECT_NAME);
        $("#project-code").setValue(PROJECT_CODE);
        $("#description-area").setValue(DESCRIPTION_PROJECT_INPUT);
        $(By.xpath("//span[text()='Create project']//ancestor::button")).click();
        $("#create-case-button").click();
        $("#title").setValue(NAME_NEW_CASE);
        $(By.xpath("//label[text()='Description']//ancestor::div[@class='col-12 form-group']//p")).
                setValue(DESCRIPTION_CASE_INPUT);
        $("#save-case").click();
        $("#create-case-button").shouldBe(visible);
    }
}
