package Test;

import PageObjects.ManishDoctorProfile_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class ManishDoctorProfile_Test extends BasePage {
    ManishDoctorProfile_PageObjects doctorProfile;

    @BeforeTest
    public void setup(){
        initialize();
        doctorProfile = new ManishDoctorProfile_PageObjects();
    }

    @Test
    public void doctorProfileTest(Method method) throws InterruptedException, AWTException{
        startTest(method.getName(),"Testing the doctor profile");
        doctorProfile.doctorProfile();
    }

    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}
