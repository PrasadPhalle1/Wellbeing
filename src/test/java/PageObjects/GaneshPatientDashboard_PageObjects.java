package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logs.Log;

import static common.Utility.*;

public class GaneshPatientDashboard_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;

    @FindBy(xpath = "(//ion-label[text()='Search'])[1]")
//    @FindBy(xpath = "//*[@name='search']")
    public WebElement searchBtn;
    @FindBy(xpath = "//ion-label[text()='Dashboard']")
    public WebElement dashboard;

//    @FindBy(xpath = "(//app-langselect[@class='ion-hide-lg-down']/child::ion-button)[4]")
//    @FindBy(xpath = "(//ion-button[@fill='none'])[2]")
    @FindBy(xpath = "//app-langselect[@class= 'ion-hide-lg-down']/child::div/ion-button[2]")
    public WebElement languageDE;

//    @FindBy(xpath = "(//app-langselect[@class='ion-hide-lg-down']/child::ion-button)[3]")
//    @FindBy(xpath = "(//ion-button[@fill='none'])[1]")
    @FindBy(xpath = "//app-langselect[@class= 'ion-hide-lg-down']/child::div/ion-button[1]")
    public WebElement languageEN;

    @FindBy(xpath = "(//mbsc-button[@ng-reflect-variant='flat'])[2]")
    public WebElement leftArrow;

    @FindBy(xpath = "(//mbsc-button[@ng-reflect-variant='flat'])[4]")
    public WebElement rightArrow;

    @FindBy(xpath = "//div[text()='Request: Ganesh Bankar']")
    public WebElement requestDoctorAppointment;

    @FindBy(xpath = "(//div[text()='Request: Ganesh Bankar'])[1]")
    public WebElement requestDoctorAppointment1;

    @FindBy(xpath = "//ion-button[@ng-reflect-size='full']")
    public WebElement requestDoctorAppointmentCancel;

    //    @FindBy(xpath = "(//mbsc-button[@ng-reflect-variant='flat'] ")
    @FindBy(xpath = "//span[text()=' November 2022 - January 2023 ']")
    public WebElement appointmentsCalender;

    @FindBy(xpath = "(//div[@role='button'])[13]")
    public WebElement year;

    //    @FindBy(xpath = "4(//div[@role='button'])[2]")
    @FindBy(xpath = "(//div[@class='mbsc-calendar-cell-text mbsc-calendar-month-text mbsc-ios'])[24]")
    public WebElement monthDec;

    //    @FindBy(xpath = "//ion-icon[@ng-reflect-name='add-circle-outline']")
    @FindBy(xpath = "//ion-button[@style='--border-radius: 20px;']")
    public WebElement plusSign;

    @FindBy(xpath = "//ion-label[text()='New Note']")
    public WebElement newNote;

    //    @FindBy(xpath = "//ion-icon[@name='close']")
    @FindBy(xpath = "//ion-buttons[@slot='end']")
    public WebElement crossSign;

    @FindBy(xpath = "//div[@class='angular-editor-textarea']")
    public WebElement msgTab;

    @FindBy(xpath = "//ion-button[@class='md button button-solid ion-activatable ion-focusable hydrated']")
    public WebElement saveBtn;

    @FindBy(xpath = "//ion-label[text()='New Report File']")
    public WebElement newReportFile;

    @FindBy(className = "upload")
    public WebElement uploadYourReport;

    @FindBy(xpath = "(//ion-button[@ng-reflect-color='primary'])[2]")
    public WebElement upload;

    @FindBy(xpath = "//ion-button[@size=\"small\"]")
    public WebElement bookBtn;

    @FindBy(xpath = "(//div[@class='mbsc-flex-1-0 mbsc-ios mbsc-schedule-item'])[60]")
    public WebElement selectDateTime;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement appointmentType;

    @FindBy(xpath = "//mbsc-wheel-item[@ng-reflect-text='Consultation']")
    public WebElement consultation;

    @FindBy(xpath = "//ion-button[@expand=\"block\"]")
    public WebElement cancel;

    @FindBy(xpath = "//mbsc-wheel-item[@ng-reflect-text='Follow-up']")
    public WebElement followUp;

    @FindBy(xpath = "(//ion-button[@expand=\"block\"])[2]")
    public WebElement book;

    //    @FindBy(xpath = "(//button[@type='button'])[13]")
    @FindBy(xpath = "//span[text()='Yes']")
    public WebElement yes;

    @FindBy(xpath = "(//ion-button[@ng-reflect-color='primary'])[2]")
    public WebElement back;

    @FindBy(xpath = "//mbsc-event-list-item[@ng-reflect-theme=\"ios\"]")
    public WebElement requestText;

    @FindBy(xpath = "//ion-button[@class='md button button-full button-solid ion-activatable ion-focusable hydrated']")
    public WebElement cancelAppointment;

    @FindBy(xpath = "//ion-icon[@name=\"close-circle-outline\"]")
    public WebElement closeCircle;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutBTN;


    public GaneshPatientDashboard_PageObjects() {
        PageFactory.initElements(driver, this);
    }

    public void loadWellbeingURL() {
        loadUrl(prop.getProperty("WellbeingURL"));
        pageLoadWait();
        Log.info("Wellbeing URL is loaded");
    }

    public void loginOption() {
        Log.info("Checking the Login and logout");
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        Log.info("Click on login button");
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("email_pp_0111_p01"));
        Log.info("Click on email");
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("password_pp_0111_p01"));
        Log.info("Click on password");
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        Log.info("Click on submit ");
    }

    public void patientDashboardTest() throws InterruptedException {
        Log.info("Checking the Patient Doctors through dashboard");
        pageLoadWait();
        Thread.sleep(2000);
        refreshWebPage();
        Thread.sleep(2000);
//        waitForElementVisible(searchBtn);
//        clickElement(searchBtn);
//        Log.info("Click on search");
//        Thread.sleep(2000);
//        waitForElementVisible(dashboard);
//        clickElement(dashboard);
//        Log.info("Click on dashboard");
//        Thread.sleep(2000);
//        pageLoadWait();
        waitForElementVisible(languageDE);
        clickElement(languageDE);
        Log.info("Click on launguage DE button");
        Thread.sleep(5000);
        waitForElementVisible(languageEN);
        clickElement(languageEN);
        Log.info("Click launguage EN button");
        Thread.sleep(5000);
        waitForElementVisible(leftArrow);
        clickElement(leftArrow);
        Log.info("Click left arrow");
        Thread.sleep(2000);
        waitForElementVisible(rightArrow);
        clickElement(rightArrow);
        Log.info("Click on right arrow");
        Thread.sleep(2000);
        waitForElementVisible(appointmentsCalender);
        clickElement(appointmentsCalender);
        Log.info("Click on appointment calender");
        Thread.sleep(2000);
        waitForElementVisible(year);
        clickElement(year);
        Log.info("Click on year");
        Thread.sleep(4000);
        waitForElementVisible(monthDec);
        clickElement(monthDec);
        Log.info("Click on month");
        Thread.sleep(5000);
        waitForElementVisible(plusSign);
        clickElement(plusSign);
        Log.info("Click on plus sign");
        Thread.sleep(2000);
        waitForElementVisible(newNote);
        clickElement(newNote);
        Log.info("Click on new note");
        waitForElementVisible(crossSign);
        clickElement(crossSign);
        Log.info("Click on cross symbol");
        waitForElementVisible(plusSign);
        clickElement(plusSign);
        Log.info("Click on plus sign");
        waitForElementVisible(newNote);
        clickElement(newNote);
        Log.info("Click on new note");
        waitForElementVisible(msgTab);
        msgTab.sendKeys("Hello WellBeing");
        Log.info("Click on massage");
        Thread.sleep(2000);
        waitForElementVisible(saveBtn);
        clickElement(saveBtn);
        Log.info("Click on save ");
        Thread.sleep(5000);
        waitForElementVisible(plusSign);
        clickElement(plusSign);
        Log.info("Click on plus sign");
        Thread.sleep(3000);
        waitForElementVisible(newReportFile);
        clickElement(newReportFile);
        waitForElementVisible(uploadYourReport);
//        uploadYourReport.sendKeys("C:\\Wellbeing\\src\\test\\resources\\files\\PDF-patientTesting.pdf");
        uploadYourReport.sendKeys("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\PNG-PrasadTesting.png");
        Thread.sleep(4000);
        waitForElementVisible(upload);
        clickElement(upload);
        Log.info("Click on upload");
        Thread.sleep(2000);



//        waitForElementVisible(bookBtn);
//        clickElement(bookBtn);
//        Log.info("Click on book ");
//        Thread.sleep(2000);
//        waitForElementVisible(selectDateTime);
//        clickElement(selectDateTime);
//        Log.info("Click on select date and time text box");
//        Thread.sleep(2000);
//        waitForElementVisible(appointmentType);
//        clickElement(appointmentType);
//        Log.info("Click on appointment type");
//        Thread.sleep(2000);
//        waitForElementVisible(consultation);
//        clickElement(consultation);
//        Log.info("Click on consultation");
//        Thread.sleep(2000);
//        waitForElementVisible(cancel);
//        clickElement(cancel);
//        Log.info("Click on cancel");
//        Thread.sleep(2000);
//        waitForElementVisible(selectDateTime);
//        clickElement(selectDateTime);
//        Log.info("Click on select date and time text box");
//        Thread.sleep(2000);
//        waitForElementVisible(appointmentType);
//        clickElement(appointmentType);
//        Log.info("Click on appointment type");
//        Thread.sleep(2000);
//        waitForElementVisible(followUp);
//        clickElement(followUp);
//        Log.info("Click on followUp");
//        Thread.sleep(2000);
//        waitForElementVisible(book);
//        clickElement(book);
//        Log.info("Click on book ");
//        Thread.sleep(2000);
//        waitForElementVisible(yes);
//        clickElement(yes);
//        Thread.sleep(2000);
//        waitForElementVisible(back);
//        clickElement(back);
//        Log.info("Click on back ");
//        Thread.sleep(2000);
//        waitForElementVisible(requestDoctorAppointment);
//        clickElement(requestDoctorAppointment);
//        Log.info("Click on doctor appointment tab");
//        Thread.sleep(2000);
//        waitForElementVisible(requestDoctorAppointmentCancel);
//        clickElement(requestDoctorAppointmentCancel);
//        Log.info("Click on cancel doctor appointments");
//        Thread.sleep(2000);
//        if (requestDoctorAppointment.isDisplayed()) {
//            clickElement(requestDoctorAppointment1);
//            Thread.sleep(2000);
//            waitForElementVisible(requestDoctorAppointmentCancel);
//            clickElement(requestDoctorAppointmentCancel);
//        }
//        waitForElementVisible(requestText);
//        clickElement(requestText);
//        Log.info("Click on request text");
//        Thread.sleep(2000);
//        waitForElementVisible(closeCircle);
//        clickElement(closeCircle);
//        Log.info("Click on close circle");
//        Thread.sleep(2000);
//        waitForElementVisible(requestText);
//        clickElement(requestText);
//        Log.info("Click on request ");
//        Thread.sleep(2000);
//        waitForElementVisible(cancelAppointment);
//        clickElement(cancelAppointment);
//        Log.info("Click on cancel appointment");
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

