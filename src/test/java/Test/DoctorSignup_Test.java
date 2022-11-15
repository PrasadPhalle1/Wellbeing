package Test;

//import PageObjects.DoctorAppointments_PageObjects;
//import PageObjects.DoctorDeshboard_PageObjects;
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
    public void newDoctorSignupTest(Method method) throws InterruptedException, AWTException {
        startTest(method.getName(), "Testing Signup");
//        signup.doctorSignupExistsUser();
        signup.loadWellbeingURL();
        signup.selectDoctorTabThroughSignupLink();
        signup.verifyWrongSignupCredentialsAndAlreadyRegisteredDoctor();
        signup.newDoctorSignup();
        signup.clickOnLinkSentToYourEmailForValidation();   // ToDo: within 10 Sec manually click On Link Sent To Your Email For Validation
        signup.enterDetailsForNewDoctorSignup();
//        signup.verifyLoginWithWrongCredentialsAndCheckExistsDoctor();
//        signup.basicFormOptionOne();
//        signup.basicFormOptionTwo();
//        signup.basicFormOptionThree();
    }


    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}




