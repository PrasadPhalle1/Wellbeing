package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logs.Log;

import static common.Utility.clickElement;
import static common.Utility.waitForElementVisible;

public class WellbeingPatientDashboard_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;

    @FindBy(xpath = "(//ion-label[text()='Search'])[2]")
//    @FindBy(xpath = "//*[@name='search']")
    public WebElement searchBtn;
    @FindBy(xpath = "//ion-label[text()='Dashboard']")
    public WebElement dashboard;

    @FindBy(xpath = "(//app-langselect[@class='ion-hide-lg-down']/child::ion-button)[4]")
    public WebElement languageDE;

    @FindBy(xpath = "(//app-langselect[@class='ion-hide-lg-down']/child::ion-button)[3]")
    public WebElement languageEN;

    @FindBy(xpath = "//mbsc-button[@aria-label='Today']")
    public WebElement todaytab;

    @FindBy(xpath = "(//mbsc-button[@ng-reflect-variant='flat'])[2]")
    public WebElement leftArrow;

    @FindBy(xpath = "(//mbsc-button[@ng-reflect-variant='flat'])[4]")
    public WebElement rightArrow;

    @FindBy(xpath = "//div[text()='Appointment: Aaysha Siddika']")
    public WebElement doctorAppointmentTab;

    @FindBy(xpath = "//ion-button[@ng-reflect-size='full']")
    public WebElement doctorAppointmentCancel;

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

    @FindBy(xpath = "//u[text()='Click Here To Upload Your Report ']")
    public WebElement uploadYourReport;

    @FindBy(xpath = "(//ion-button[@ng-reflect-color='primary'])[2]")
    public WebElement upload;

    @FindBy(xpath = "//ion-button[@size=\"small\"]")
    public WebElement bookBtn;

    @FindBy(xpath = "(//div[@class='mbsc-flex-1-0 mbsc-ios mbsc-schedule-item'])[59]")
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

    @FindBy(xpath = "(//button[@type='button'])[13]")
    public WebElement yes;

    @FindBy(xpath = "(//ion-button[@ng-reflect-color='primary'])[2]")
    public WebElement back;

    @FindBy(xpath = "//mbsc-event-list-item[@ng-reflect-theme=\"ios\"]")
    public WebElement requestText;

    @FindBy(xpath = "//ion-button[@class='md button button-full button-solid ion-activatable ion-focusable hydrated']")
    public WebElement cancelAppointment;

    @FindBy(xpath = "//ion-icon[@name=\"close-circle-outline\"]")
    public WebElement closeCircle;


    @FindBy(xpath = "//div[@class='angular-editor-textarea']")
    public WebElement massageTab;



    public WellbeingPatientDashboard_PageObjects() {
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
//    }

    public void loadWellbeingURL() {
        loadUrl(prop.getProperty("WellbeingURL"));
        pageLoadWait();
        Log.info("Wellbeing URL is loaded");
    }

    public void patientSelectDoctorThroughDashboard() throws InterruptedException {
        Log.info("Checking the Patient Doctor Appointment");
        pageLoadWait();

        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("email"));
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("password"));
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        pageLoadWait();
        waitForElementVisible(searchBtn);
        clickElement(searchBtn);
        Thread.sleep(5000);
        waitForElementVisible(dashboard);
        clickElement(dashboard);
        Thread.sleep(2000);
        waitForElementVisible(languageDE);
        clickElement(languageDE);
        Thread.sleep(2000);
        waitForElementVisible(languageEN);
        clickElement(languageEN);
        Thread.sleep(2000);
//        waitForElementVisible(todaytab);
//        clickElement(todaytab);
//        Thread.sleep(2000);
//        waitForElementVisible(leftArrow);
//        clickElement(leftArrow);
//        Thread.sleep(2000);
//        waitForElementVisible(rightArrow);
//        clickElement(rightArrow);
//        Thread.sleep(2000);
//        waitForElementVisible(doctorAppointmentTab);
//        clickElement(doctorAppointmentTab);
//        Thread.sleep(2000);
//        waitForElementVisible(doctorAppointmentCancel);
//        clickElement(doctorAppointmentCancel);
        waitForElementVisible(appointmentsCalender);
        clickElement(appointmentsCalender);
        Thread.sleep(2000);
        waitForElementVisible(year);
        clickElement(year);
        Thread.sleep(4000);
        waitForElementVisible(monthDec);
        clickElement(monthDec);
        Thread.sleep(5000);
        waitForElementVisible(plusSign);
        clickElement(plusSign);
        Thread.sleep(2000);
        waitForElementVisible(newNote);
        clickElement(newNote);
        waitForElementVisible(msgTab);
        msgTab.sendKeys("Hello");
        Thread.sleep(2000);
        waitForElementVisible(saveBtn);
        clickElement(saveBtn);
//        waitForElementVisible(crossSign);
//        clickElement(crossSign);
        Thread.sleep(5000);
        waitForElementVisible(plusSign);
        clickElement(plusSign);
        Thread.sleep(3000);
        waitForElementVisible(newReportFile);
        clickElement(newReportFile);
        Thread.sleep(3000);
//        waitForElementVisible(uploadYourReport);
//        uploadYourReport.sendKeys("C:\\Users\\ganes\\OneDrive\\Pictures\\Screen.png");
//        uploadYourReport.sendKeys("C:\\Wellbeing\\src\\test\\resource\\files\\certificate.pdf");
//        Thread.sleep(2000);
//        waitForElementVisible(upload);
//        clickElement(upload);
//        Thread.sleep(9000);
        waitForElementVisible(crossSign);
        clickElement(crossSign);
        Thread.sleep(2000);
        waitForElementVisible(bookBtn);
        clickElement(bookBtn);
        Thread.sleep(2000);
        waitForElementVisible(selectDateTime);
        clickElement(selectDateTime);
        Thread.sleep(2000);
        waitForElementVisible(appointmentType);
        clickElement(appointmentType);
        Thread.sleep(2000);
        waitForElementVisible(consultation);
        clickElement(consultation);
        Thread.sleep(2000);
        waitForElementVisible(cancel);
        clickElement(cancel);
        Thread.sleep(2000);
        waitForElementVisible(selectDateTime);
        clickElement(selectDateTime);
        Thread.sleep(2000);
        waitForElementVisible(appointmentType);
        clickElement(appointmentType);
        Thread.sleep(2000);
        waitForElementVisible(followUp);
        clickElement(followUp);
        Thread.sleep(2000);
        waitForElementVisible(book);
        clickElement(book);
        Thread.sleep(2000);
        waitForElementVisible(yes);
        clickElement(yes);
        Thread.sleep(2000);
        waitForElementVisible(back);
        clickElement(back);
        Thread.sleep(2000);
        waitForElementVisible(requestText);
        clickElement(requestText);
        Thread.sleep(2000);
        waitForElementVisible(closeCircle);
        clickElement(closeCircle);
        Thread.sleep(2000);
        waitForElementVisible(requestText);
        clickElement(requestText);
        Thread.sleep(2000);
        waitForElementVisible(cancelAppointment);
        clickElement(cancelAppointment);


    }
}
