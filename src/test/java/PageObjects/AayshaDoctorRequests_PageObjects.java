package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import static common.Utility.*;

public class AayshaDoctorRequests_PageObjects extends BasePage {

    @FindBy(xpath = " (//ion-button[text()='Approve'])[1]")
    public WebElement approveLink1;
    @FindBy(xpath = " (//ion-button[text()='Reject'])[1]")
    public WebElement rejectLink2;
    //span[text()='No']
    @FindBy(xpath = " //span[text()='Yes']")
    public WebElement rejectRequestYes;
    @FindBy(xpath = "//span[text()='No']")
    public WebElement rejectRequestNo;
    @FindBy(xpath = "//div[text()='Are you sure you want to cancel the appointment?']")
    public WebElement conformRejectRequestText;
    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBtn;
    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement email;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBtn;
    @FindBy(xpath = "//ion-label[text()='Requests']")
    public WebElement requestsLink;
    @FindBy(xpath = "//ion-label[text()='Logout']")
    public WebElement logoutBtn;

    public AayshaDoctorRequests_PageObjects(){
        PageFactory.initElements(driver,this);
    }


    public void clickOnRequest(){
        try {
            refreshWebPage();
            waitForElementVisible(requestsLink);
            clickElement(requestsLink);
            Log.info("Click on Request Link");
            Thread.sleep(3000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void approvedLink() throws InterruptedException {
        waitForElementVisible(approveLink1);
        clickElement(approveLink1);
        Log.info("Approve request");
        Thread.sleep(3000);

    }

    public void rejectLink() throws InterruptedException {
        waitForElementVisible(rejectLink2);
        clickElement(rejectLink2);
        Log.info("Click on Reject request");
        Thread.sleep(3000);
        Assert.assertEquals(conformRejectRequestText.getText(),"Are you sure you want to cancel the appointment?");
        waitForElementVisible(rejectRequestNo);
        clickElement(rejectRequestNo);
        Log.info("click on Reject request No");
        waitForElementVisible(rejectLink2);
        clickElement(rejectLink2);
        Log.info("Click on Reject request");
        Thread.sleep(3000);
        waitForElementVisible(rejectRequestYes);
        clickElement(rejectRequestYes);
        Log.info("Click on Reject request Yes");
        Thread.sleep(3000);
    }

    public  void loginWithValidCredentials() throws InterruptedException {
        Log.info("Check the login");
        waitForElementVisible(loginBtn);
        clickElement(loginBtn);
        Log.info("Click login btn");
        waitForElementVisible(email);
//        email.sendKeys(prop.getProperty("email1"));
        email.sendKeys(prop.getProperty("email_pp_0111_d01"));
        Log.info("Send email");
        waitForElementVisible(password);
//        password.sendKeys(prop.getProperty("password1"));
        password.sendKeys(prop.getProperty("password_pp_0111_d01"));
        Log.info("Send password");
        Thread.sleep(3000);
        waitForElementVisible(submitBtn);
        clickElement(submitBtn);
        Thread.sleep(3000);
        Log.info("Click on submit");
    }


    public void refreshPageAndLogout() throws InterruptedException {
        pageLoadWait();
        refreshWebPage();
        waitForElementVisible(logoutBtn);
        clickElement(logoutBtn);
        Log.info("Clicked on Logout");
        Thread.sleep(5000);
    }


}
