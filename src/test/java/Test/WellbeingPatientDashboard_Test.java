package Test;

import PageObjects.WellbeingPatientDashboard_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class WellbeingPatientDashboard_Test extends BasePage {


    WellbeingPatientDashboard_PageObjects patientDashboard;

    @BeforeTest
    public void setup(){
        initialize();
        patientDashboard=new WellbeingPatientDashboard_PageObjects();
    }

    @Test
    public void patientDashboardTest(Method method) throws InterruptedException {
        startTest(method.getName(),"Testing the Patient Search Doctor ");
        patientDashboard.loadWellbeingURL();
        patientDashboard.patientSelectDoctorThroughDashboard();
    }


    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}


