package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logs.Log;

import static common.Utility.clickElement;
import static common.Utility.waitForElementVisible;

public class WellbeingLogin_PageObjects extends BasePage {

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

    public WellbeingLogin_PageObjects(){
        PageFactory.initElements(driver,this);
    }

    public void loginOption() {
        Log.info("Checking the Login and logout");
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("email"));
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("password"));
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        waitForElementVisible(logoutBTN);
        clickElement(logoutBTN);
    }
}
