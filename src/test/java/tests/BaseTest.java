package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.*;

public abstract class BaseTest {
    protected final static String BASE_USERNAME ="masiaka8@gmail.com";
    protected final static String BASE_PASSWORD ="93879387maks";


    @BeforeClass(alwaysRun = true)
    public void initialize() {
        Configuration.baseUrl = "https://app.qase.io";
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;
    }

    @BeforeMethod(alwaysRun = true)
    public void  navigate() {
        open("/login");
    }

    @AfterClass(alwaysRun = true)
    public void  tearDown() {
    }
}