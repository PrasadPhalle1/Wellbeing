package Test;

import PageObjects.WellbeingPatientSearchDoctor_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class WellbeingPatientSearchDoctor_Test extends BasePage {
    WellbeingPatientSearchDoctor_PageObjects patientSearch;

    @BeforeTest
    public void setup(){
        initialize();
        patientSearch=new WellbeingPatientSearchDoctor_PageObjects();
    }

    @Test
    public void patientSearchDoctorTest(Method method) throws InterruptedException {
        startTest(method.getName(),"Testing the Patient Search Doctor ");
        patientSearch.loadWellbeingURL();
        patientSearch.patientSelectDoctorThroughSearchTab();
    }


    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}


