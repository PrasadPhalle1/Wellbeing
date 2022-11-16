package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logs.Log;

import static common.Utility.clickElement;
import static common.Utility.waitForElementVisible;

public class WellbeingPatientHistory_PageObject extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;


//    @FindBy(xpath = "(//ion-label[text()='History'])[2]")
    @FindBy(xpath = "//ion-label[text()='History']")
    public WebElement HistoryBtn;

    @FindBy(xpath = "(//ion-icon[@ng-reflect-name='add-circle-outline'])[2]")
    public WebElement plusSign;

    @FindBy(xpath = "//ion-label[text()='New Note']")
    public WebElement newFile;

    @FindBy(xpath = "//div[@class='angular-editor-textarea']")
    public WebElement msgTextBox;

    @FindBy(xpath = "//ion-button[@class='md button button-solid ion-activatable ion-focusable hydrated']")
    public WebElement saveBtn;

    @FindBy(xpath = "//ion-button[@class='md button button-clear in-toolbar in-toolbar-color button-has-icon-only ion-activatable ion-focusable hydrated']")
    public WebElement clearSign;

    @FindBy(xpath = "//ion-label[text()='New Report File']")
    public WebElement newReportFile;

    @FindBy(xpath = "//u[text()='Click Here To Upload Your Report ']")
    public WebElement uploadYourReport;

//    @FindBy(xpath = "//div[text()='View uploaded document']")
    @FindBy(xpath = "(//div[text()='View uploaded document'])[6]")
    public WebElement viewUploadedDocument;

    @FindBy(xpath = "//ion-select[@aria-haspopup='listbox']")
    public WebElement listBoxALLIcon;

    @FindBy(xpath = "(//ion-radio[@role=\"radio\"])[2]")
    public WebElement selectDoctorName;


    public WellbeingPatientHistory_PageObject() {
        PageFactory.initElements(driver, this);
    }

//    public void loginOption() {
//        Log.info("Checking the Login and logout");
//        waitForElementVisible(loginBTN);
//        clickElement(loginBTN);
//        waitForElementVisible(emailText);
//        emailText.sendKeys(prop.getProperty("email"));
//        waitForElementVisible(passwordText);
//        passwordText.sendKeys(prop.getProperty("password"));
//        waitForElementVisible(submitBTN);
//        clickElement(submitBTN);
//
//    }

    public void loadWellbeingURL() {
        loadUrl(prop.getProperty("WellbeingURL"));
        pageLoadWait();
        Log.info("Wellbeing URL is loaded");
    }

    public void patientChechTheAppointmentHistory() throws InterruptedException {
        Log.info("Checking the Patient Doctors Appointment History");
        pageLoadWait();

        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("email"));
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("password"));
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);

        waitForElementVisible(HistoryBtn);
        clickElement(HistoryBtn);
        Thread.sleep(2000);
        waitForElementVisible(plusSign);
        clickElement(plusSign);
        Thread.sleep(2000);
        waitForElementVisible(newFile);
        clickElement(newFile);
        Thread.sleep(2000);
        waitForElementVisible(clearSign);
        clickElement(clearSign);
        Thread.sleep(2000);
        waitForElementVisible(plusSign);
        clickElement(plusSign);
        Thread.sleep(2000);
        waitForElementVisible(newFile);
        clickElement(newFile);
        Thread.sleep(2000);
        waitForElementVisible(msgTextBox);
        msgTextBox.sendKeys("Blood Sample Report");
        Thread.sleep(4000);
        waitForElementVisible(saveBtn);
        clickElement(saveBtn);
        Thread.sleep(2000);
        waitForElementVisible(plusSign);
        clickElement(plusSign);
        Thread.sleep(2000);
        waitForElementVisible(newReportFile);
        clickElement(newReportFile);
        Thread.sleep(2000);
        waitForElementVisible(clearSign);
        clickElement(clearSign);
        Thread.sleep(2000);
//        waitForElementVisible(uploadYourReport);
//        clickElement(uploadYourReport);
        waitForElementVisible(viewUploadedDocument);
        clickElement(viewUploadedDocument);
        Thread.sleep(2000);
        waitForElementVisible(listBoxALLIcon);
        clickElement(listBoxALLIcon);
        Thread.sleep(2000);
        waitForElementVisible(selectDoctorName);
        clickElement(selectDoctorName);



    }
}