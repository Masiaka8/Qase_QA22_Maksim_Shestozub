package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ProjectTest extends BaseTest{

    private final static String PROJECT_NAME = "Project1";
    private final static String PROJECT_CODE = "QWE1";
    private final static String DESCRIPTION_INPUT = "QWEQWEQWE";

    @Test
    public void CreateNewProjectTest(){
        $("#inputEmail").setValue(BASE_USERNAME);
        $("#inputPassword").setValue(BASE_PASSWORD);
        $("#btnLogin").click();
        $("#createButton").click();
        $("#project-name").setValue(PROJECT_NAME);
        $("#project-code").setValue(PROJECT_CODE);
        $("#description-area").setValue(DESCRIPTION_INPUT);
        $(By.xpath("//span[text()='Create project']//ancestor::button")).click();
        $("#create-suite-button").shouldBe(visible);
    }
}
