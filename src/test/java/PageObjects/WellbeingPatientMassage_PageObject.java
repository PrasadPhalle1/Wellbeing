package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logs.Log;

import static common.Utility.clickElement;
import static common.Utility.waitForElementVisible;

public class WellbeingPatientMassage_PageObject extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;


    @FindBy(xpath = "//ion-label[text()='Messages']")
    public WebElement massageBtn;

    @FindBy(xpath = "//ion-icon[@aria-label='trash outline']")
    public WebElement deletMassageIcon;

    public WellbeingPatientMassage_PageObject() {
        PageFactory.initElements(driver, this);
    }


    public void loadWellbeingURL() {
        loadUrl(prop.getProperty("WellbeingURL"));
        pageLoadWait();
        Log.info("Wellbeing URL is loaded");
    }

    public void patientAppointmentMassage() throws InterruptedException {
        pageLoadWait();

        Log.info("Checking the Login and logout");
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("email"));
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("password"));
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);

        waitForElementVisible(massageBtn);
        clickElement(massageBtn);
        waitForElementVisible(deletMassageIcon);
        clickElement(deletMassageIcon);
    }
}
