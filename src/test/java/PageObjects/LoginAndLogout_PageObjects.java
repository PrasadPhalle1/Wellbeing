package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logs.Log;

import static common.Utility.clickElement;
import static common.Utility.waitForElementVisible;

public class LoginAndLogout_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;

    @FindBy(xpath = "(//*[text()='Logout'])[1]")
    public WebElement logoutBTN;

    public LoginAndLogout_PageObjects(){
        PageFactory.initElements(driver,this);
    }

    public void loadWellbeingURL() {
        loadUrl(prop.getProperty("WellbeingURL"));
        pageLoadWait();
        Log.info("Wellbeing URL is loaded");
    }

    public void doctorLogin() throws InterruptedException {
        pageLoadWait();
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("drEmail"));
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("drPassword"));
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        Log.info("Clicked on Login for Doctor");
        Thread.sleep(3000);
    }

    public void doctorLogout() throws InterruptedException {
        pageLoadWait();
        waitForElementVisible(logoutBTN);
        clickElement(logoutBTN);
        Log.info("Clicked on Logout for Doctor");
        Thread.sleep(3000);
    }

    public void patientLogin() throws InterruptedException {
        pageLoadWait();
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("ptEmail"));
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("ptPassword"));
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        Log.info("Clicked on Login for Patient");
        Thread.sleep(3000);
    }

    public void patientLogout() throws InterruptedException {
        pageLoadWait();
        waitForElementVisible(logoutBTN);
        clickElement(logoutBTN);
        Log.info("Clicked on Logout for Patient");
        Thread.sleep(3000);
    }
}
