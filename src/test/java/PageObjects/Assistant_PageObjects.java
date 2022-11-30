package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import static common.Utility.*;

public class Assistant_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;

    @FindBy(xpath = "//ion-label[text()='Assistants']")
    public WebElement assistantPage;

    @FindBy(xpath = "//ion-button[text()=' Add Assistant']")
    public WebElement addAssistant;

    @FindBy(xpath = "//input[@placeholder='Full Name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@placeholder='Email Required']")
    public WebElement emailRequired;

    @FindBy(xpath = "//ion-button[text()=' Save ']")
    public WebElement assistantSaveBtn;

    @FindBy(xpath = "//ion-button[text()=' Cancel ']")
    public WebElement assistantCancelBtn;

    @FindBy(xpath = "//h2[text()='New Assistant Creation in progress']")
    public WebElement assistantCreatedPopup;

    @FindBy(xpath = "//div[text()='Assistant account creation in Progress. The assistant can log in now with the provided email. On first time login, please use the forgot password link to set a password']")
    public WebElement assistantCreatedMessage;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement assistantCreatedpopupOKBtn;

    @FindBy(xpath = "//ion-label[text()='Jenny']")
    public WebElement assistantCard;

    @FindBy(xpath = "//ion-button[@color='danger']")
    public WebElement assistantDeleteBtn;

    @FindBy(xpath = "//h2[text()='Delete Assistant']")
    public WebElement deleteAssistantPopup;

    @FindBy(xpath = "//div[text()='Are you sure you want to delete assistant : Jenny']")
    public WebElement confirmDeleteMessage;

    @FindBy(xpath = "//span[text()='Yes']")
    public WebElement deletepopupYesBtn;

    @FindBy(xpath = "//span[text()='No']")
    public WebElement deletepopupNoBtn;

    @FindBy(xpath = "//h2[text()='New Assistant Failed']")
    public WebElement duplicateAssistantpopup;

    @FindBy(xpath = "//div[text()='Creation of new assistant login failed: auth/email-already-exists']")
    public WebElement duplicateAssistantpopupMssg;

    @FindBy(xpath = "//strong[text()='Wellbeing@swqa-solutions.com']")
    public WebElement mail;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement duplicateAssistantpopupOkBtn;

    @FindBy(xpath = "(//ion-label[text()='Logout'])")
    public WebElement logout;

    @FindBy(xpath = "(//ion-label[text()='Logout'])[2]")
    public WebElement logoutTwo;

    public Assistant_PageObjects(){
        PageFactory.initElements(driver,this);
    }

    public void loginOption() {
        Log.info("login with valid details");
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        waitForElementVisible(emailText);
//        emailText.sendKeys("manish.swqa+1411_d09@gmail.com");
        emailText.sendKeys(prop.getProperty("email_pp_0111_d01"));
        waitForElementVisible(passwordText);
//        passwordText.sendKeys("P@ssw0rd!001");
        passwordText.sendKeys(prop.getProperty("password_pp_0111_d01"));
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        pageLoadWait();
    }

    public void assistantPageOption(){
        Log.info("Clicking on the Assistant Page");
        waitForElementVisible(assistantPage);
        if (assistantPage.isDisplayed()) {
            clickElement(assistantPage);
        }
    }

    public void cancelAssistantOption(){
        Log.info("Clicking on cancel button");
        waitForElementVisible(addAssistant);
        clickElement(addAssistant);
        waitForElementVisible(assistantCancelBtn);
        clickElement(assistantCancelBtn);
        Log.info("Clicked on cancel button");
    }

    public void deleteAssistantOption() throws InterruptedException {
        Log.info("Creating the Assistant");
        waitForElementVisible(addAssistant);
        clickElement(addAssistant);
        waitForElementVisible(fullName);
        fullName.sendKeys("Jenny");
        waitForElementVisible(emailRequired);
//        emailRequired.sendKeys("manish.swqa+2411_a01@gmail.com");
        emailRequired.sendKeys("pgatest.swqa+pp_0111_a02@gmail.com");
        waitForElementVisible(assistantSaveBtn);
        clickElement(assistantSaveBtn);
        Thread.sleep(5000);
        waitForElementVisible(assistantCreatedPopup);
        waitForElementVisible(assistantCreatedMessage);
        String assistantCreatedPopupMessage = "New Assistant Creation in progress";
        String assistantCreatedMsg = "Assistant account creation in Progress. The assistant can log in now with the provided email. On first time login, please use the forgot password link to set a password";
        Assert.assertEquals(assistantCreatedPopup.getText(),assistantCreatedPopupMessage);
        Assert.assertEquals(assistantCreatedMessage.getText(),assistantCreatedMsg);
        Log.info("Verified the Assistant created popup");
        waitForElementVisible(assistantCreatedpopupOKBtn);
        clickElement(assistantCreatedpopupOKBtn);
        waitForElementVisible(assistantCard);
        clickElement(assistantCard);
        Log.info("Deleting the Assistant");
        waitForElementVisible(assistantDeleteBtn);
        clickElement(assistantDeleteBtn);
        waitForElementVisible(deleteAssistantPopup);
        waitForElementVisible(confirmDeleteMessage);
        String deleteAssistantPopupMessage = "Delete Assistant";
        String confirmDeleteMsg = "Are you sure you want to delete assistant : Jenny";
        Assert.assertEquals(deleteAssistantPopup.getText(),deleteAssistantPopupMessage);
        Assert.assertEquals(confirmDeleteMessage.getText(),confirmDeleteMsg);
        Log.info("Verified Delete popup");
        waitForElementVisible(deletepopupNoBtn);
        clickElement(deletepopupNoBtn);
        waitForElementVisible(assistantDeleteBtn);
        clickElement(assistantDeleteBtn);
        Thread.sleep(2000);
        waitForElementVisible(deletepopupYesBtn);
        clickElement(deletepopupYesBtn);
        pageLoadWait();
        Thread.sleep(5000);
        Log.info("Assistant Deleted Successfully");
////                     Same Code
//        waitForElementVisible(assistantCard);
//        clickElement(assistantCard);
//        Log.info("Deleting the Assistant");
//        waitForElementVisible(assistantDeleteBtn);
//        clickElement(assistantDeleteBtn);
//        Log.info("Verified Delete popup");
//        waitForElementVisible(deletepopupNoBtn);
//        clickElement(deletepopupNoBtn);
//        waitForElementVisible(assistantDeleteBtn);
//        clickElement(assistantDeleteBtn);
//        waitForElementVisible(deletepopupYesBtn);
//        clickElement(deletepopupYesBtn);
//        pageLoadWait();
//        Thread.sleep(2000);
    }

    public void createAssistant() throws InterruptedException {
        Log.info("Creating the Assistant");
        waitForElementVisible(addAssistant);
        clickElement(addAssistant);
        waitForElementVisible(fullName);
        fullName.sendKeys("Amit Mishra");
        waitForElementVisible(emailRequired);
//        emailRequired.sendKeys("manish.swqa+2511_a01@gmail.com");
        emailRequired.sendKeys("pgatest.swqa+pp_0111_a01@gmail.com");
        waitForElementVisible(assistantSaveBtn);
        clickElement(assistantSaveBtn);
        Thread.sleep(5000);
        waitForElementVisible(assistantCreatedPopup);
        waitForElementVisible(assistantCreatedMessage);
        String assistantCreatedPopupMessage = "New Assistant Creation in progress";
        String assistantCreatedMsg = "Assistant account creation in Progress. The assistant can log in now with the provided email. On first time login, please use the forgot password link to set a password";
        Assert.assertEquals(assistantCreatedPopup.getText(),assistantCreatedPopupMessage);
        Assert.assertEquals(assistantCreatedMessage.getText(),assistantCreatedMsg);
        Log.info("Verified the Assistant created popup");
        waitForElementVisible(assistantCreatedpopupOKBtn);
        clickElement(assistantCreatedpopupOKBtn);
        Log.info("Assistant Created Successfully");
    }

    public void duplicateAssistantOption() throws InterruptedException {
        Log.info("Creating the Duplicate Assistant");
        waitForElementVisible(addAssistant);
        clickElement(addAssistant);
        waitForElementVisible(fullName);
        fullName.sendKeys("Amit Dubey");
        waitForElementVisible(emailRequired);
//        emailRequired.sendKeys("manish.swqa+2511_a01@gmail.com");
        emailRequired.sendKeys("pgatest.swqa+pp_0111_a01@gmail.com");
        waitForElementVisible(assistantSaveBtn);
        clickElement(assistantSaveBtn);
        Thread.sleep(5000);
        waitForElementVisible(assistantCreatedPopup);
        waitForElementVisible(assistantCreatedMessage);
        String assistantCreatedPopupMessage = "New Assistant Creation in progress";
        String assistantCreatedMsg = "Assistant account creation in Progress. The assistant can log in now with the provided email. On first time login, please use the forgot password link to set a password";
        Assert.assertEquals(assistantCreatedPopup.getText(),assistantCreatedPopupMessage);
        Assert.assertEquals(assistantCreatedMessage.getText(),assistantCreatedMsg);
        Log.info("Verified the Assistant created popup");
//        waitForElementVisible(assistantCreatedpopupOKBtn);
//        clickElement(assistantCreatedpopupOKBtn);
        Log.info("Duplicate Assistant Created Successfully");
//        Thread.sleep(5000);
//        refreshWebPage();
//        pageLoadWait();
        waitForElementVisible(duplicateAssistantpopup);
        String duplicateAssistantpopupMessage = "New Assistant Failed";
        String mailpopupMsg = "Wellbeing@swqa-solutions.com";
        Assert.assertEquals(duplicateAssistantpopup.getText(),duplicateAssistantpopupMessage);
        Assert.assertEquals(mail.getText(),mailpopupMsg);
        Log.info("Verified Mail");
        waitForElementVisible(duplicateAssistantpopupOkBtn);
        clickElement(duplicateAssistantpopupOkBtn);
        Log.info("Duplicate assistant is not created successfully");
        Thread.sleep(2000);

        refreshWebPage();
        pageLoadWait();
        waitForElementVisible(assistantCreatedpopupOKBtn);
        clickElement(assistantCreatedpopupOKBtn);

        refreshWebPage();
        pageLoadWait();

//        waitForElementVisible(logoutTwo);
//        clickElement(logoutTwo);
        waitForElementVisible(logout);
        clickElement(logout);
    }

    public void reLoginAndLogoutOption() {
        Log.info("reLoginAndLogout");
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        waitForElementVisible(emailText);
//        emailText.sendKeys("manish.swqa+1411_d09@gmail.com");
        emailText.sendKeys(prop.getProperty("email_pp_0111_d01"));
        waitForElementVisible(passwordText);
//        passwordText.sendKeys("P@ssw0rd!001");
        passwordText.sendKeys(prop.getProperty("password_pp_0111_d01"));
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        waitForElementVisible(assistantPage);
        clickElement(assistantPage);
        Log.info("Verifying the Assistant Page");
        refreshWebPage();
        waitForElementVisible(logout);
        clickElement(logout);
        Log.info("Doctor Logged out successfully");
    }

    public void assistantOption() throws InterruptedException {
        Log.info("Assistant Page Testing");
        loginOption();
        assistantPageOption();
        cancelAssistantOption();
        createAssistant();
        deleteAssistantOption();
        duplicateAssistantOption();
        reLoginAndLogoutOption();
        Log.info("Assistant Page Successfully Tested");
    }
}
