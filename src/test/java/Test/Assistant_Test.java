package Test;

import PageObjects.Assistant_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class Assistant_Test extends BasePage {

    Assistant_PageObjects assistant;

    @BeforeTest
    public void setup(){
        initialize();
        assistant = new Assistant_PageObjects();
    }

    @Test
    public void assistantTest(Method method) throws InterruptedException {
        startTest(method.getName(),"Checking the Assistant Page");
        assistant.assistantOption();
    }

    @AfterTest
    public void tearDown(){
        closeDriver();
    }
}
