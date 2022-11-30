package Test;

import PageObjects.ManishAssistant_PageObjects;
import common.BasePage;
import org.testng.annotations.*;

import java.awt.*;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class ManishAssistant_Test extends BasePage {

    ManishAssistant_PageObjects assistant;

    @BeforeClass
    public void setup(){
        initialize();
        assistant = new ManishAssistant_PageObjects();
    }

    @Test
    public void assistantTest(Method method) throws InterruptedException, AWTException {
        startTest(method.getName(),"Checking the Assistant Page");
        assistant.assistantOption();
    }

    @AfterClass
    public void tearDown(){
        closeDriver();
    }
}
