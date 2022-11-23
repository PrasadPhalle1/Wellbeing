package Test;

import PageObjects.AayshaDoctorSignup_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class AayshaDoctorSignup_Test extends BasePage {
    AayshaDoctorSignup_PageObjects signup;
    @BeforeTest
    public void setup(){
        initialize();
        signup = new AayshaDoctorSignup_PageObjects();

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


    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}


