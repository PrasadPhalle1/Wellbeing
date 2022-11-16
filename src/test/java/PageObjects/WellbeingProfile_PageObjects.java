package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logs.Log;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static common.Utility.*;

public class WellbeingProfile_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;

    @FindBy(xpath = "//ion-label[text()='Profile']")
    public WebElement profilePage;

    @FindBy(xpath = "//label[text()='Set profile Picture']")
    public WebElement setProfile;

    @FindBy(xpath = "//ion-label[text()='Remove profile picture ']")
    public WebElement removeProfile;

    @FindBy(xpath = "//span[text()='Yes']")
    public WebElement yesBtn;

    @FindBy(xpath = "(//ion-label[.='Logout'])[2]")
    public WebElement logout;

    public WellbeingProfile_PageObjects(){
        PageFactory.initElements(driver,this);
    }

    public void loadWellbeingURL() {
        loadUrl(prop.getProperty("WellbeingURL"));
        pageLoadWait();
        Log.info("Wellbeing URL is loaded");
    }

    public void profileOption() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        Log.info("Checking the doctor profile updation");
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
//        waitForElementVisible(emailText);
//        emailText.sendKeys("manish.swqa+1411_d09@gmail.com");
//        waitForElementVisible(passwordText);
//        passwordText.sendKeys("P@ssw0rd!001");
        waitForElementVisible(emailText);
        emailText.sendKeys("pgatest.swqa+pp_0311_d01@gmail.com");
        waitForElementVisible(passwordText);
        passwordText.sendKeys("pp123pp123");
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        Thread.sleep(2000);
        waitForElementVisible(profilePage);
        clickElement(profilePage);

//        Excel
        StringSelection stringSelectionExcel = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\Excel-PrasadTesting.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionExcel,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
//        waitForElementVisible(removeProfile);
//        clickElement(removeProfile);
//        Thread.sleep(2000);
//        waitForElementVisible(yesBtn);
//        clickElement(yesBtn);
//        Thread.sleep(2000);

//        Zip file
        StringSelection stringSelectionZip = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\Zip-PrasadTesting.zip");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionZip,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
//        waitForElementVisible(removeProfile);
//        clickElement(removeProfile);
//        Thread.sleep(2000);
//        waitForElementVisible(yesBtn);
//        clickElement(yesBtn);
//        Thread.sleep(2000);

//        pdf File
        StringSelection stringSelectionPDF = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\PDF-PrasadTesting.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionPDF,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
//        waitForElementVisible(removeProfile);
//        clickElement(removeProfile);
//        Thread.sleep(2000);
//        waitForElementVisible(yesBtn);
//        clickElement(yesBtn);
//        Thread.sleep(2000);

//        word document
        StringSelection stringSelectionMS_Word = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\MS_Word-PrasadTesting.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionMS_Word,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
//        waitForElementVisible(removeProfile);
//        clickElement(removeProfile);
//        Thread.sleep(2000);
//        waitForElementVisible(yesBtn);
//        clickElement(yesBtn);
//        Thread.sleep(2000);

//        webm video
        StringSelection stringSelectionWEBM = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\WEBM-PrasadTesting.webm");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionWEBM,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
//        waitForElementVisible(removeProfile);
//        clickElement(removeProfile);
//        Thread.sleep(2000);
//        waitForElementVisible(yesBtn);
//        clickElement(yesBtn);
//        Thread.sleep(2000);

//        JPG
        StringSelection stringSelectionJPG = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\JPG-PrasadTesting.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionJPG,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        waitForElementVisible(removeProfile);
        clickElement(removeProfile);
        Thread.sleep(2000);
        waitForElementVisible(yesBtn);
        clickElement(yesBtn);
        Thread.sleep(2000);

//        PNG
        StringSelection stringSelectionPNG = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\PNG-PrasadTesting.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionPNG,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        waitForElementVisible(removeProfile);
        clickElement(removeProfile);
        Thread.sleep(2000);
        waitForElementVisible(yesBtn);
        clickElement(yesBtn);
        Thread.sleep(2000);
        waitForElementVisible(logout);
        clickElement(logout);
        Thread.sleep(2000);
    }



}
