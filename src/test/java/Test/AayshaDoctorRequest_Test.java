package Test;

import PageObjects.AayshaDoctorRequests_PageObjects;
import common.BasePage;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class AayshaDoctorRequest_Test extends BasePage {
    AayshaDoctorRequests_PageObjects request;;
    @BeforeClass
    public void setup(){
        initialize();
        request = new AayshaDoctorRequests_PageObjects();
    }

    @Test
    public void approveAndRejectRequest(Method method) throws InterruptedException {
        startTest(method.getName(),"Doctor is Checking the Patient's Appointment and Approve or Reject");
        pageLoadWait();
        request.loginWithValidCredentials();
        request.clickOnRequest();
        Thread.sleep(3000);
        request.approvedLink();
        request.rejectLink();
        Thread.sleep(3000);
        request.refreshPageAndLogout();

        request.loginWithValidCredentials();
        request.clickOnRequest();
        Thread.sleep(3000);
        request.refreshPageAndLogout();
    }

    @AfterClass
    public void tearDown(){
        closeDriver();
    }

}
