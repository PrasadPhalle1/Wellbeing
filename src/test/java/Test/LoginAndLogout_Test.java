package Test;

import PageObjects.LoginAndLogout_PageObjects;
import common.BasePage;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class LoginAndLogout_Test extends BasePage {
    LoginAndLogout_PageObjects loginAndLogout;

    @BeforeClass
    public void setup(){
        initialize();
        loginAndLogout = new LoginAndLogout_PageObjects();
    }

    @Test
    public void loginAndLogoutTest(Method method) throws InterruptedException {
        startTest(method.getName(), "Testing Login");
//        loginAndLogout.loadWellbeingURL();
        loginAndLogout.doctorLogin();
        loginAndLogout.doctorLogout();
        loginAndLogout.patientLogin();
        loginAndLogout.patientLogout();
    }

    @AfterClass
    public void tearDown(){
        closeDriver();
    }
}
