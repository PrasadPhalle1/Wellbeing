package Test;

import PageObjects.DrLoginAndLogout_PageObjects;
import PageObjects.PtLoginAndLogout_PageObjects;
import common.BasePage;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class PtLoginAndLogout_Test extends BasePage {
    PtLoginAndLogout_PageObjects ptloginAndLogout;

    @BeforeClass
    public void setup(){
        initialize();
        ptloginAndLogout = new PtLoginAndLogout_PageObjects();
    }

    @Test
    public void ptLoginAndLogoutTest(Method method) throws InterruptedException {
        startTest(method.getName(), "Testing Login");
//        drloginAndLogout.loadWellbeingURL();
        ptloginAndLogout.ptLogin();
        ptloginAndLogout.ptLogout();
    }

    @AfterClass
    public void tearDown(){
        closeDriver();
    }
}
