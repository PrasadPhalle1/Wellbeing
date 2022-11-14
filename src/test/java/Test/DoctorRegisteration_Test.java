package Test;

//import PageObjects.DoctorAppointments_PageObjects;
import PageObjects.DoctorRegisteration_PageObjects;
import PageObjects.DoctorSignup_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class DoctorRegisteration_Test extends BasePage {

    DoctorSignup_PageObjects signup;
    DoctorRegisteration_PageObjects registeration;
    @BeforeTest
    public void setup(){
        initialize();
        signup = new DoctorSignup_PageObjects();
        registeration=new DoctorRegisteration_PageObjects();

    }

    @Test(priority = 1)
    public void loginTest(Method method) throws InterruptedException {
        startTest(method.getName(), "Testing Registration");
        //Thread.sleep(5000);
        pageLoadWait();
//        signup.signupWithValidCredentialsAndVerifyAndLogin();
        registeration.fillUpRegisterationFormWithValidDetails();
//        registeration.doctorRegisterFormOne();
//        registeration.doctorRegisterFormTwo();
//        registeration.doctorRegisterFormThree();

    }



//    @AfterTest
    public void tearDown(){
        closeDriver();
    }

}
