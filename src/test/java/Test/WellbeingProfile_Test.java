package Test;

import PageObjects.WellbeingProfile_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;


import static utils.extentreports.ExtentTestManager.startTest;

public class WellbeingProfile_Test extends BasePage {

    WellbeingProfile_PageObjects profile;

    @BeforeTest
    public void setup(){
        initialize();
        profile = new WellbeingProfile_PageObjects();
    }

    @Test
    public void profileTest(Method method) throws InterruptedException, AWTException{
        startTest(method.getName(),"Testing the Doctor profile");
        profile.loadWellbeingURL();
        profile.profileOption();
    }

    @AfterTest
    public void tearDown(){
        closeDriver();
    }

}
