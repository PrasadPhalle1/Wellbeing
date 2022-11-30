package Test;

import PageObjects.DoctorSignup_PageObjects;
import common.BasePage;
import org.testng.annotations.*;

import java.awt.*;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class DoctorSignup_Test extends BasePage {
    DoctorSignup_PageObjects signup;
    @BeforeClass
    public void setup(){
        initialize();
        signup = new DoctorSignup_PageObjects();

    }

    @Test(priority = 1)
    public void newDoctorSignupTest(Method method) throws InterruptedException, AWTException {
        startTest(method.getName(), "Testing New Doctor Signup");
//        signup.verifyLoginWithWrongCredentialsNotSignedUpAndSignedUpDoctor();
        signup.selectDoctorTabThroughSignupLink();
        signup.verifyWrongSignupCredentialsAndAlreadyRegisteredDoctor();
        signup.newDoctorSignupWithValidCredentials();
        signup.clickOnLinkSentToYourEmailForValidation();     // ToDo: within 10 Sec manually click On Link Sent To Your Email For Validation
        signup.enterDetailsForNewDoctorSignup();
        signup.verifyAndAcceptTermsAndConditions();
//        signup.clickInToCheckBoxForTermsAndConditions();
        signup.clickSaveButton();
        signup.refreshPageAndLogout();
    }


    @AfterClass
    public void tearDown(){
        closeDriver();
    }
}


