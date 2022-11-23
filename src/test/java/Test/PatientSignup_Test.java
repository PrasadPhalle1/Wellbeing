package Test;

import PageObjects.PatientSignup_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class PatientSignup_Test extends BasePage {

    PatientSignup_PageObjects patientSignup;

    @BeforeTest
    public void setup(){
        initialize();
        patientSignup=new PatientSignup_PageObjects();
    }

    @Test(priority = 1)
    public void newPatientSignupTest(Method method) throws InterruptedException {
        startTest(method.getName(),"Testing the New Patient Signup");
//        patientSignup.loadWellbeingURL();
        patientSignup.selectPatientTabThroughSignupLink();
        patientSignup.verifyWrongSignupCredentialsAndAlreadyRegisteredPatient();
        patientSignup.newPatientSignup();
        patientSignup.clickOnLinkSentToYourEmailForValidation();  // ToDo: within 10 Sec manually click On Link Sent To Your Email For Validation
        patientSignup.enterDetailsForNewPatientSignup();
        patientSignup.clickInToCheckBoxForTermsAndConditions();
        patientSignup.clickSaveButton();
        patientSignup.refreshPageAndLogout();
    }

    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}
