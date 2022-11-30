package Test;

import PageObjects.DoctorProfile_PageObjects;
import common.BasePage;
import org.testng.annotations.*;

import java.awt.*;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class DoctorProfile_Test extends BasePage {
    DoctorProfile_PageObjects doctorProfile;

    @BeforeClass
    public void setup(){
        initialize();
        doctorProfile = new DoctorProfile_PageObjects();
    }

    @Test
    public void doctorProfileTest(Method method) throws InterruptedException, AWTException{
        startTest(method.getName(),"Testing the doctor profile");
        doctorProfile.doctorProfile();
    }

    @AfterClass
    public void tearDown(){
        closeDriver();
    }
}
