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
    public void patientSignupTest(Method method) throws InterruptedException {
        startTest(method.getName(),"Testing the Patient Signup");
        patientSignup.patientSignup();
    }



    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}
