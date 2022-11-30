package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import java.awt.*;

import static common.Utility.*;

public class ManishAssistant_PageObjects extends BasePage {

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
    public WebElement assistantCardJenny;

    @FindBy(xpath = "//ion-label[text()='Reeta']")
    public WebElement assistantCardReeta;

    @FindBy(xpath = "//ion-button[@color='danger']")
    public WebElement assistantDeleteBtn;

    @FindBy(xpath = "//h2[text()='Delete Assistant']")
    public WebElement deleteAssistantPopup;

    @FindBy(xpath = "//div[text()='Are you sure you want to delete assistant : Jenny']")
    public WebElement confirmDeleteMessageJenny;

    @FindBy(xpath = "//div[text()='Are you sure you want to delete assistant : Reeta']")
    public WebElement confirmDeleteMessageReeta;

    @FindBy(xpath = "//span[text()='Yes']")
//    public WebElement deleteYesBtn;
    public WebElement deletepopupYesBtn;

    @FindBy(xpath = "//span[text()='No']")
//    public WebElement deleteNoBtn;
    public WebElement deletepopupNoBtn;

    @FindBy(xpath = "//ion-label[text()='Logout']")
    public WebElement logout;

    @FindBy(xpath = "(//ion-label[text()='Dashboard'])[2]")
    public WebElement dashboardPage;

    public ManishAssistant_PageObjects(){
        PageFactory.initElements(driver,this);
    }

    public void loginOption() throws InterruptedException {
        Log.info("login with valid details");
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        waitForElementVisible(emailText);
//        emailText.sendKeys("manish.swqa+1411_d09@gmail.com");
        emailText.sendKeys("pgatest.swqa+pp_0311_d01@gmail.com");
        waitForElementVisible(passwordText);
//        passwordText.sendKeys("P@ssw0rd!001");
        passwordText.sendKeys("pp123pp123");
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        pageLoadWait();
    }

    public void assistantPageOption() throws InterruptedException {
        Log.info("Clicking on the Assistant Page");
        waitForElementVisible(assistantPage);
        if (assistantPage.isDisplayed()) {
            clickElement(assistantPage);
        }
        pageLoadWait();
        Thread.sleep(2000);
    }

    public void cancelAssistantOption(){
        Log.info("Clicking on cancel button");
        waitForElementVisible(addAssistant);
        clickElement(addAssistant);
        waitForElementVisible(assistantCancelBtn);
        clickElement(assistantCancelBtn);
    }

//    public void deleteAssistantOption() throws InterruptedException {
//        Log.info("Creating the Assistant");
//        waitForElementVisible(addAssistant);
//        clickElement(addAssistant);
//        waitForElementVisible(fullName);
////        fullName.sendKeys("Jenny");
//        fullName.sendKeys("Reeta");
//        waitForElementVisible(emailRequired);
////        emailRequired.sendKeys("manish.swqa+2411_a01@gmail.com");
//        emailRequired.sendKeys("pgatest.swqa+pp_0311_a02@gmail.com");
//        waitForElementVisible(assistantSaveBtn);
//        clickElement(assistantSaveBtn);
//        waitForElementVisible(assistantCreatedPopup);
//        waitForElementVisible(assistantCreatedMessage);
//        String assistantCreatedPopupMessage = "New Assistant Creation in progress";
//        String assistantCreatedMsg = "Assistant account creation in Progress. The assistant can log in now with the provided email. On first time login, please use the forgot password link to set a password";
//        Assert.assertEquals(assistantCreatedPopup.getText(),assistantCreatedPopupMessage);
//        Assert.assertEquals(assistantCreatedMessage.getText(),assistantCreatedMsg);
//        Log.info("Verified the Assistant created popup");
//        waitForElementVisible(assistantCreatedpopupOKBtn);
//        clickElement(assistantCreatedpopupOKBtn);
//        waitForElementVisible(assistantCardReeta);
//        clickElement(assistantCardReeta);
//        Log.info("Deleting the Assistant");
//        waitForElementVisible(assistantDeleteBtn);
//        clickElement(assistantDeleteBtn);
//        waitForElementVisible(deleteAssistantPopup);
//        waitForElementVisible(confirmDeleteMessageReeta);
//        String deleteAssistantPopupMessage = "Delete Assistant";
////        String confirmDeleteMsg = "Are you sure you want to delete assistant : Jenny";
//        String confirmDeleteMsgReeta = "Are you sure you want to delete assistant : Reeta";
//        Assert.assertEquals(deleteAssistantPopup.getText(),deleteAssistantPopupMessage);
//        Assert.assertEquals(confirmDeleteMessageReeta.getText(),confirmDeleteMsgReeta);
//        Log.info("Verified Delete popup");
//        waitForElementVisible(deletepopupNoBtn);
//        clickElement(deletepopupNoBtn);
//        waitForElementVisible(assistantDeleteBtn);
//        clickElement(assistantDeleteBtn);
//        waitForElementVisible(deletepopupYesBtn);
//        clickElement(deletepopupYesBtn);
//
//        waitForElementVisible(assistantCardReeta);
//        clickElement(assistantCardReeta);
//        Log.info("Deleting the Assistant");
//        waitForElementVisible(assistantDeleteBtn);
//        clickElement(assistantDeleteBtn);
//        waitForElementVisible(deletepopupYesBtn);
//        clickElement(deletepopupYesBtn);
//
////        waitForElementVisible(dashboardPage);
////        clickElement(dashboardPage);
//        refreshWebPage();
//        waitForElementVisible(logout);
//        clickElement(logout);
//        Log.info("Assistant Deleted Successfully");
//    }

    public void deleteAssistantOption() throws InterruptedException {
        Log.info("Creating the Assistant");
        waitForElementVisible(addAssistant);
        clickElement(addAssistant);
        Thread.sleep(2000);
        waitForElementVisible(fullName);
        fullName.sendKeys("Jenny");
        waitForElementVisible(emailRequired);
//        emailRequired.sendKeys("manish.swqa+2411_a01@gmail.com");
        emailRequired.sendKeys("pgatest.swqa+pp_0311_a02@gmail.com");
        Thread.sleep(2000);
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
        Thread.sleep(2000);
        waitForElementVisible(assistantCreatedpopupOKBtn);
        clickElement(assistantCreatedpopupOKBtn);
        Thread.sleep(2000);
        waitForElementVisible(assistantCardJenny);
        clickElement(assistantCardJenny);
        Thread.sleep(2000);
        Log.info("Deleting the Assistant");
        waitForElementVisible(assistantDeleteBtn);
        clickElement(assistantDeleteBtn);
        Thread.sleep(2000);
        waitForElementVisible(deleteAssistantPopup);
        waitForElementVisible(confirmDeleteMessageJenny);
        String deleteAssistantPopupMessage = "Delete Assistant";
        String confirmDeleteMsgJenny = "Are you sure you want to delete assistant : Jenny";
        Assert.assertEquals(deleteAssistantPopup.getText(),deleteAssistantPopupMessage);
        Assert.assertEquals(confirmDeleteMessageJenny.getText(),confirmDeleteMsgJenny);
        Log.info("Verified Delete popup");
        Thread.sleep(2000);
        waitForElementVisible(deletepopupNoBtn);
        clickElement(deletepopupNoBtn);
        Thread.sleep(2000);
        waitForElementVisible(assistantDeleteBtn);
        clickElement(assistantDeleteBtn);
        Thread.sleep(2000);
        waitForElementVisible(deletepopupYesBtn);
        clickElement(deletepopupYesBtn);
        pageLoadWait();
        Thread.sleep(5000);
        Log.info("Assistant Deleted Successfully");

////        Same Code
//        waitForElementVisible(assistantCardJenny);
//        clickElement(assistantCardJenny);
//        Log.info("Deleting the Assistant");
//        Thread.sleep(2000);
//        waitForElementVisible(assistantDeleteBtn);
//        clickElement(assistantDeleteBtn);
////        Log.info("Verified Delete popup");
//        Thread.sleep(2000);
//        waitForElementVisible(deletepopupNoBtn);
//        clickElement(deletepopupNoBtn);
//        Thread.sleep(2000);
//        waitForElementVisible(assistantDeleteBtn);
//        clickElement(assistantDeleteBtn);
//        Thread.sleep(2000);
//        waitForElementVisible(deletepopupYesBtn);
//        clickElement(deletepopupYesBtn);
        pageLoadWait();
        Thread.sleep(2000);
    }

    public void clickOnDashboardAndLogoutOption(){
        waitForElementVisible(dashboardPage);
        clickElement(dashboardPage);
        Log.info("Clicked on Dashboard");
        waitForElementVisible(logout);
        clickElement(logout);
        Log.info("Clicked on Logout");
    }

    public void assistantOption() throws InterruptedException, AWTException {
        loginOption();
        assistantPageOption();
        cancelAssistantOption();
        deleteAssistantOption();
        clickOnDashboardAndLogoutOption();
        loginOption();
        assistantPageOption();
        clickOnDashboardAndLogoutOption();
    }
}
