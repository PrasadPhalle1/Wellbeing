package Test;

import PageObjects.DrLoginAndLogout_PageObjects;
import PageObjects.LoginAndLogout_PageObjects;
import common.BasePage;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class DrLoginAndLogout_Test extends BasePage {
    DrLoginAndLogout_PageObjects drloginAndLogout;

    @BeforeClass
    public void setup(){
        initialize();
        drloginAndLogout = new DrLoginAndLogout_PageObjects();
    }

    @Test
    public void drLoginAndLogoutTest(Method method) throws InterruptedException {
        startTest(method.getName(), "Testing Login");
//        drloginAndLogout.loadWellbeingURL();
        drloginAndLogout.drLogin();
        drloginAndLogout.drLogout();
    }

    @AfterClass
    public void tearDown(){
        closeDriver();
    }
}
