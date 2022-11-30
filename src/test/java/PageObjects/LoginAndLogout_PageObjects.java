package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import static common.Utility.*;

public class LoginAndLogout_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//ion-label[contains(text(), 'Should be a valid email address!')]")
    public WebElement emailInvalidErrorMsg;

    @FindBy(xpath = "//ion-label[contains(text(), 'Should be at least 8 characters long!')]")
    public WebElement passwordInvalidErrorMsg;

    @FindBy(xpath = "//ion-icon[@name='eye']")
    public WebElement loginPasswordEyeIcon;

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
        Log.info("Clicked on Login");
        verifyInvalidLoginCredentials();
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
        Thread.sleep(1000);
    }

    public void patientLogin() throws InterruptedException {
        pageLoadWait();
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        Log.info("Clicked on Login");
        verifyInvalidLoginCredentials();
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
        Thread.sleep(1000);
    }

    public void verifyInvalidLoginCredentials() throws InterruptedException {
        waitForElementVisible(emailText);
        clickElement(emailText);
        emailText.sendKeys("InvalidEmail@gmail");
        Log.info("Entered InvalidEmail@gmail");
        pressTab(emailText);
        waitForElementVisible(emailInvalidErrorMsg);
        String emailInvalidErrorMessage = emailInvalidErrorMsg.getText();
        Assert.assertEquals(emailInvalidErrorMsg.getText(), emailInvalidErrorMessage);
        Log.info("Verified emailInvalidErrorMsg");
        waitForElementVisible(passwordText);
        clickElement(passwordText);
        passwordText.sendKeys("WrngP@s");
        Log.info("Entered WrngP@s");
        waitForElementVisible(loginPasswordEyeIcon);
        clickElement(loginPasswordEyeIcon);
        Log.info("Clicked on loginPasswordEyeIcon");
        Thread.sleep(5000);
        clickElement(emailText);
        waitForElementVisible(passwordInvalidErrorMsg);
        String passwordInvalidErrorMessage = passwordInvalidErrorMsg.getText();
        Assert.assertEquals(passwordInvalidErrorMsg.getText(), passwordInvalidErrorMessage);
        Log.info("Verified emailInvalidErrorMsg");
        emailText.clear();
        passwordText.clear();
        Thread.sleep(3000);
    }

}
