package Test;

import PageObjects.DoctorSignup_PageObjects;
import common.BasePage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.awt.*;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class DoctorSignup_Test extends BasePage {

    DoctorSignup_PageObjects signup;

    @BeforeTest
    public void setup(){
        initialize();
        signup = new DoctorSignup_PageObjects();
    }

    @Test(priority = 1)
    public void signupTest(Method method) throws InterruptedException, AWTException {
        startTest(method.getName(),"Testing the Doctor Signup");
        signup.signupOption();
    }

    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}
