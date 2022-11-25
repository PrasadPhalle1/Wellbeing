package Test;

import PageObjects.ManishAssistant_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class ManishAssistant_Test extends BasePage {

    ManishAssistant_PageObjects assistant;

    @BeforeTest
    public void setup(){
        initialize();
        assistant = new ManishAssistant_PageObjects();
    }

    @Test
    public void assistantTest(Method method) throws InterruptedException, AWTException {
        startTest(method.getName(),"Checking the Assistant Page");
        assistant.assistantOption();
    }

    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}
