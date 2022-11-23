package Test;

import PageObjects.LoginAndLogout_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class LoginAndLogout_Test extends BasePage {
    LoginAndLogout_PageObjects loginAndLogout;

    @BeforeTest
    public void setup(){
        initialize();
        loginAndLogout = new LoginAndLogout_PageObjects();
    }

    @Test
    public void loginAndLogoutTest(Method method) throws InterruptedException {
        startTest(method.getName(), "Testing Login");
        loginAndLogout.loadWellbeingURL();
        loginAndLogout.doctorLogin();
        loginAndLogout.doctorLogout();
//        openNewTab();
//        openNewWindow();
//        loginAndLogout.loadWellbeingURL();
        loginAndLogout.patientLogin();
        loginAndLogout.patientLogout();
//        loginAndLogout.doctorLogout();
    }

    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}
