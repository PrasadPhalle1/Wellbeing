package Test;

import PageObjects.GaneshPatientSearchDoctor_PageObjects;
import common.BasePage;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import static utils.extentreports.ExtentTestManager.startTest;

public class GaneshPatientSearchDoctor_Test extends BasePage {
    GaneshPatientSearchDoctor_PageObjects patientSearch;

    @BeforeClass
    public void setup(){
        initialize();
        patientSearch=new GaneshPatientSearchDoctor_PageObjects();
    }

    @Test
    public void patientSearchDoctorTest(Method method) throws InterruptedException {
        startTest(method.getName(),"Testing the Patient Search Doctor ");
//        patientSearch.loadWellbeingURL();
        patientSearch.patientSelectDoctorThroughSearchTab();
        patientSearch.patientLogout();
    }

    @AfterClass
    public void tearDown(){
        closeDriver();
    }
}


