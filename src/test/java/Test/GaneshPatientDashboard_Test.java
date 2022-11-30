package Test;

import PageObjects.GaneshPatientDashboard_PageObjects;
import common.BasePage;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class GaneshPatientDashboard_Test extends BasePage {


    GaneshPatientDashboard_PageObjects patientDashboard;

    @BeforeClass
    public void setup(){
        initialize();
        patientDashboard=new GaneshPatientDashboard_PageObjects();
    }

    @Test
    public void patientDashboardTest(Method method) throws InterruptedException {
        startTest(method.getName(),"Checking the Patient  Doctors appointment through dashboard ");
//        patientDashboard.loadWellbeingURL();
        patientDashboard.loginOption();
        patientDashboard.patientDashboardTest();
        patientDashboard.patientLogout();

    }

    @AfterClass
    public void tearDown(){
        closeDriver();
    }
}


