package Test;

import PageObjects.WellbeingPatientHistory_PageObject;
import common.BasePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class WellbeingPatientHistory_Test extends BasePage {

    WellbeingPatientHistory_PageObject patienthistory;

    @BeforeTest
    public void setup() {
        initialize();
        patienthistory = new WellbeingPatientHistory_PageObject();
    }

    @Test
    public void patientDashboardTest(Method method) throws InterruptedException {
        startTest(method.getName(), "Checking the Patient Appointment History");
        patienthistory.loadWellbeingURL();
        patienthistory.patientChechTheAppointmentHistory();
    }


//    @AfterTest
//    public void tearDown() {
//        closeDriver();
//    }
}

