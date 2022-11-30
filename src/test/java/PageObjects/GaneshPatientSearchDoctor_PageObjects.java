package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import static common.Utility.*;

public class GaneshPatientSearchDoctor_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;


    @FindBy(xpath = "(//ion-label[text()='Search'])[1]")
//    @FindBy(xpath = "//ion-label[text()='Search']")
//    @FindBy(xpath = "//ion-icon[@aria-label='search']")
    public WebElement searchBtn;

    @FindBy(xpath = "//input[@aria-label='search text']")
    public WebElement searchNametext;

    @FindBy(xpath = "//ion-icon[@class='searchbar-clear-icon sc-ion-searchbar-md md hydrated']")
    public WebElement cleartext;

    @FindBy(xpath = "//ion-button[@ng-reflect-color='secondary']")
    public WebElement bookBtn;

    @FindBy(xpath = "(//div[@class='mbsc-flex-1-0 mbsc-ios mbsc-schedule-item'])[130]")
    public WebElement firstSlotBookdate;

    @FindBy(xpath = "(//div[@class='mbsc-flex-1-0 mbsc-ios mbsc-schedule-item'])[132]")
    public WebElement secondSlotBookdate;

    @FindBy(xpath = "(//div[@class='mbsc-flex-1-0 mbsc-ios mbsc-schedule-item'])[47]")
    public WebElement thirdSlotBookdate;

    @FindBy(xpath = "(//div[@class='mbsc-flex-1-0 mbsc-ios mbsc-schedule-item'])[130]")
    public WebElement forthSlotBookdate;

    @FindBy(xpath = "//input[@placeholder='Appointment Type']")
    public WebElement apptTypeBtn;

    @FindBy(xpath = "//mbsc-wheel-item[@ng-reflect-text='Consultation']")
    public WebElement ConsultationBtn;

    @FindBy(xpath = "//mbsc-wheel-item[@ng-reflect-text='Follow-up']")
    public WebElement FollowUpBtn;

    @FindBy(xpath = "//ion-button[@ng-reflect-expand='block']")
    public WebElement cancelBtn;

    @FindBy(xpath = "(//ion-button[@ng-reflect-expand='block'])[2]")
    public WebElement apptmBookBtn;

    @FindBy(xpath = "//*[contains(text(), 'Error')]")
    public WebElement slotBookErrorPopUp;

    @FindBy(xpath = "//div[contains(@class, 'alert-message')]")
    public WebElement slotBookErrorMsg;

    @FindBy(xpath = "//span[contains(text(), 'OK')]")
    public WebElement slotBookErrorOkBtn;

    @FindBy(xpath = "//*[contains(text(), 'Book Another?')]")
    public WebElement anotherSlotBookPopUp;

    @FindBy(xpath = "//div[contains(@class, 'alert-message')]")
    public WebElement anotherSlotBookMsg;

    @FindBy(xpath = "//span[contains(text(), 'Yes')]")
    public WebElement anotherSlotBookYesBtn;

    @FindBy(xpath = "//span[contains(text(), 'Cancel')]")
    public WebElement anotherSlotBookCancelBtn;

    @FindBy(xpath = "//button[@aria-label='Zoom in']")
    public WebElement zoomInBtn;

    @FindBy(xpath = "//button[@aria-label='Zoom out']")
    public WebElement zoomOutBtn;

    @FindBy(xpath = "//ion-chip[@ng-reflect-color='primary']")
    public WebElement selectSpeciliazationBtn;

    @FindBy(xpath = "//*[@role='checkbox']")
    public WebElement selectAllcheckboxBtn;

    @FindBy(xpath = "//*[@role='checkbox']")
    public WebElement unSelectAllcheckboxBtn;

    @FindBy(xpath = "//*[text()='Aurvedic specialist']")
    public WebElement checkboxBtn;

    @FindBy(xpath = "//*[text()='Cardiologist']")
    public WebElement checkbox1Btn;

    @FindBy(xpath = "(//ion-button[@ng-reflect-color='primary'])[2]")
    public WebElement setBtn;

    @FindBy(xpath = "//ion-button[@ng-reflect-color='primary']")
    public WebElement cancel2Btn;

    @FindBy(xpath = "//ion-button[@ng-reflect-color='primary']")
    public WebElement backBtn;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutBTN;


    public GaneshPatientSearchDoctor_PageObjects() {
        PageFactory.initElements(driver, this);
    }

    public void loadWellbeingURL() {
        loadUrl(prop.getProperty("WellbeingURL"));
        pageLoadWait();
        Log.info("Wellbeing URL is loaded");
    }

    public void patientSelectDoctorThroughSearchTab() throws InterruptedException {
        pageLoadWait();
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        Log.info("Click on login");
        waitForElementVisible(emailText);
//        emailText.sendKeys(prop.getProperty("email"));
        emailText.sendKeys(prop.getProperty("email_pp_0111_p01"));
        Log.info("Click on email");
        waitForElementVisible(passwordText);
//        passwordText.sendKeys(prop.getProperty("password"));
        passwordText.sendKeys(prop.getProperty("password_pp_0111_p01"));
        Log.info("Click  on password");
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        Log.info("Click submit button");
//        pageLoadWait();
//        refreshWebPage();
        Thread.sleep(2000);
        pageLoadWait();
        refreshWebPage();
        waitForElementVisible(searchBtn);
        clickElement(searchBtn);
        Log.info("Click on search");
        Thread.sleep(2000);
//        waitForElementVisible(zoomInBtn);
//        clickElement(zoomInBtn);
//        Log.info("Click on zoom in");
//        Thread.sleep(2000);
//        waitForElementVisible(zoomOutBtn);
//        clickElement(zoomOutBtn);
//        Log.info("Click on zoom out");
//        Thread.sleep(2000);

        waitForElementVisible(searchNametext);
//        searchNametext.sendKeys(prop.getProperty("doctorName1"));
        searchNametext.sendKeys(prop.getProperty("doctorName1"));
        Log.info("Click on doctor name1");
        Thread.sleep(2000);
        waitForElementVisible(cleartext);
        clickElement(cleartext);
        Log.info("Click on clear text");
        Thread.sleep(2000);
        waitForElementVisible(searchNametext);
//        searchNametext.sendKeys(prop.getProperty("doctorName2"));
        searchNametext.sendKeys(prop.getProperty("doctorName_PP_DRONE_ONEELE"));
        Log.info("Click on doctor name2");
        waitForElementVisible(bookBtn);
        clickElement(bookBtn);
        Log.info("Click on book");
        Thread.sleep(5000);

        waitForElementVisible(firstSlotBookdate);
        clickElement(firstSlotBookdate);
        Thread.sleep(2000);
        Log.info("Click on firstSlotBookdate");

        waitForElementVisible(cancelBtn);
        clickElement(cancelBtn);
        Thread.sleep(2000);
        Log.info("Click on cancel");
        waitForElementVisible(firstSlotBookdate);
        clickElement(firstSlotBookdate);
        Thread.sleep(2000);
        Log.info("Click on firstSlotBookdate");
        waitForElementVisible(apptTypeBtn);
        clickElement(apptTypeBtn);
        Thread.sleep(2000);
        Log.info("Click on appointment type");

//        waitForElementVisible(apptTypeBtn);
//        clickElement(apptTypeBtn);
//        Thread.sleep(2000);
//        Log.info("Click on appointment type");
        waitForElementVisible(ConsultationBtn);
        clickElement(ConsultationBtn);
        Thread.sleep(2000);
        Log.info("Click on Consultation");



        waitForElementVisible(apptTypeBtn);
        clickElement(apptTypeBtn);
        Thread.sleep(2000);
        Log.info("Click on appointment type");
        waitForElementVisible(FollowUpBtn);
        clickElement(FollowUpBtn);
        Thread.sleep(2000);
        Log.info("Click on followup");
        waitForElementVisible(apptTypeBtn);
        clickElement(apptTypeBtn);
        Thread.sleep(2000);
        Log.info("Click on appointment type");
        waitForElementVisible(ConsultationBtn);
        clickElement(ConsultationBtn);
        Thread.sleep(2000);
        Log.info("Click on Consultation");
        waitForElementVisible(apptmBookBtn);
        clickElement(apptmBookBtn);
        Thread.sleep(2000);
        Log.info("Click on apptmBookBtn");

        waitForElementVisible(secondSlotBookdate);
        clickElement(secondSlotBookdate);
        Thread.sleep(2000);
        Log.info("Click on secondSlotBookdate");
        waitForElementVisible(cancelBtn);
        clickElement(cancelBtn);
        Thread.sleep(2000);
        Log.info("Click on cancel");
        waitForElementVisible(secondSlotBookdate);
        clickElement(secondSlotBookdate);
        Thread.sleep(2000);
        Log.info("Click on secondSlotBookdate");
        waitForElementVisible(apptTypeBtn);
        clickElement(apptTypeBtn);
        Thread.sleep(2000);
        Log.info("Click on appointment type");
//        waitForElementVisible(apptTypeBtn);
//        clickElement(apptTypeBtn);
//        Log.info("Click on appointment type");
        waitForElementVisible(ConsultationBtn);
        clickElement(ConsultationBtn);
        Log.info("Click on Consultation");
        waitForElementVisible(apptTypeBtn);
        clickElement(apptTypeBtn);
        Thread.sleep(2000);
        Log.info("Click on appointment type");




        waitForElementVisible(FollowUpBtn);
        clickElement(FollowUpBtn);
        Log.info("Click on followup");
        waitForElementVisible(apptmBookBtn);
        clickElement(apptmBookBtn);
        Thread.sleep(2000);
        Log.info("Click on apptmBookBtn");


        waitForElementVisible(anotherSlotBookPopUp);
        waitForElementVisible(anotherSlotBookMsg);
        String anotherSlotBookMessage = anotherSlotBookMsg.getText();
        Assert.assertEquals(anotherSlotBookMsg.getText(), anotherSlotBookMessage);
        waitForElementVisible(anotherSlotBookYesBtn);
        clickElement(anotherSlotBookYesBtn);
        Thread.sleep(2000);
        Log.info("Clicked on anotherSlotBookYesBtn");

        waitForElementVisible(thirdSlotBookdate);
        clickElement(thirdSlotBookdate);
        Thread.sleep(5000);
        Log.info("Click on thirdSlotBookdate");
        waitForElementVisible(slotBookErrorPopUp);
        waitForElementVisible(slotBookErrorMsg);
        String slotBookErrorMessage = slotBookErrorMsg.getText();
        Assert.assertEquals(slotBookErrorMsg.getText(), slotBookErrorMessage);
        waitForElementVisible(slotBookErrorOkBtn);
        clickElement(slotBookErrorOkBtn);
        Thread.sleep(2000);
        Log.info("Clicked on slotBookErrorOkBtn");

        refreshWebPage();
        pageLoadWait();


        waitForElementVisible(backBtn);
        clickElement(backBtn);
        Thread.sleep(2000);
        Log.info("Click on back");
//        waitForElementVisible(selectSpeciliazationBtn);
//        clickElement(selectSpeciliazationBtn);
        Log.info("Patient Searched the Doctor and Appointment/s is/are booked");
    }

    public void patientLogout() throws InterruptedException {
//        pageLoadWait();
        refreshWebPage();
        waitForElementVisible(logoutBTN);
        clickElement(logoutBTN);
        Log.info("Clicked on Logout for Patient");
        Thread.sleep(3000);
    }
}
