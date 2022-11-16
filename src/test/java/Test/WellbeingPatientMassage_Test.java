package Test;
import PageObjects.WellbeingPatientMassage_PageObject;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class WellbeingPatientMassage_Test extends BasePage {

    WellbeingPatientMassage_PageObject patientmassage;

    @BeforeTest
    public void setup() {
        initialize();
        patientmassage = new WellbeingPatientMassage_PageObject();
    }

    @Test
    public void patientDashboardTest(Method method) throws InterruptedException {
        startTest(method.getName(), "Checking the Patient Appointment Massage");
        patientmassage.loadWellbeingURL();
        patientmassage.patientAppointmentMassage();
    }


    @AfterTest
    public void tearDown() {
        closeDriver();
    }
}


