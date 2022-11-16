package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logs.Log;

import static common.Utility.clickElement;
import static common.Utility.waitForElementVisible;

public class WellbeingPatientSearchDoctor_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Search']")
    public WebElement searchBtn;

    @FindBy(xpath = "//input[@aria-label='search text']")
    public WebElement searchNametext;

    @FindBy(xpath = "//ion-icon[@class='searchbar-clear-icon sc-ion-searchbar-md md hydrated']")
    public WebElement cleartext;

    @FindBy(xpath = "//ion-button[@ng-reflect-color='secondary']")
    public WebElement bookBtn;

    @FindBy(xpath = "(//div[@class='mbsc-flex-1-0 mbsc-ios mbsc-schedule-item'])[21]")
    public WebElement slotBookdate;

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

    @FindBy(xpath = "//ion-button[@ng-reflect-color='primary'])")
    public WebElement backBtn;



    public WellbeingPatientSearchDoctor_PageObjects(){
        PageFactory.initElements(driver,this);
    }

    public void loadWellbeingURL() {
        loadUrl(prop.getProperty("WellbeingURL"));
        pageLoadWait();
        Log.info("Wellbeing URL is loaded");
    }

    public void patientSelectDoctorThroughSearchTab() throws InterruptedException {
        Log.info("Checking the Patient Doctor Appointment");
        pageLoadWait();
        waitForElementVisible(searchBtn);
        clickElement(searchBtn);
        Thread.sleep(2000);
        waitForElementVisible(zoomInBtn);
        clickElement(zoomInBtn); 
        Thread.sleep(2000);
        waitForElementVisible(zoomOutBtn);
        clickElement(zoomOutBtn);
        Thread.sleep(2000);
        waitForElementVisible(searchNametext);
        searchNametext.sendKeys(prop.getProperty("doctorName1"));
        Thread.sleep(2000);
        waitForElementVisible(cleartext);
        clickElement(cleartext);
        Thread.sleep(2000);
        waitForElementVisible(searchNametext);
        searchNametext.sendKeys(prop.getProperty("doctorName2"));
        waitForElementVisible(bookBtn);
        clickElement(bookBtn);
        Thread.sleep(2000);
        waitForElementVisible(slotBookdate);
        clickElement(slotBookdate);
        waitForElementVisible(apptTypeBtn);
        clickElement(apptTypeBtn);
        waitForElementVisible(cancelBtn);
        clickElement(cancelBtn);
        waitForElementVisible(apptTypeBtn);
        clickElement(apptTypeBtn);
        waitForElementVisible(ConsultationBtn);
        clickElement(ConsultationBtn);
        waitForElementVisible(FollowUpBtn);
        clickElement(FollowUpBtn);
        Thread.sleep(2000);
        waitForElementVisible(apptmBookBtn);
        clickElement(apptmBookBtn);
        waitForElementVisible(backBtn);
        clickElement(backBtn);
        waitForElementVisible(selectSpeciliazationBtn);
        clickElement(selectSpeciliazationBtn);


    }

}
