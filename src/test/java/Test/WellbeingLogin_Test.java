package Test;

import PageObjects.WellbeingLogin_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class WellbeingLogin_Test extends BasePage {
    WellbeingLogin_PageObjects login;

    @BeforeTest
    public void setup(){
        initialize();
        login = new WellbeingLogin_PageObjects();
    }

    @Test
    public void loginTest(Method method) {
        startTest(method.getName(), "Testing Login");
        login.loginOption();
    }

    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}
