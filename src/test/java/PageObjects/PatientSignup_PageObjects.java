package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logs.Log;

import static common.Utility.*;

public class PatientSignup_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//ion-text[contains(text(),' Sign Up ')]")
    public WebElement signupLink;

    @FindBy(xpath = "(//ion-segment-button)[2]")
    public WebElement doctorBtn;

    @FindBy(xpath = "(//ion-segment-button)[1]")
    public WebElement patientBtn;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//ion-label[text()='Should be a valid email address!']")
    public WebElement emailTextErrorMsg;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-label[text()='Should be at least 8 characters long!']")
    public WebElement passwordTextErrorMsg;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    public WebElement confirmPasswordText;

    @FindBy(xpath = "//ion-label[text()='Confirm password does not match']")
    public WebElement confirmPasswordTextErrorMsg;

    @FindBy(xpath = "//ion-button[text()=' Register ']")
    public WebElement registerBtn;

    @FindBy(xpath = "//*[contains(text(), 'User Exists')]")
    public WebElement userExistsPopUp;

    @FindBy(xpath = "//*[contains(text(), 'already exists')]")
    public WebElement userExistsMsg;

    @FindBy(xpath = "//*[contains(text(), 'Validate Email')]")
    public WebElement validateEmailPopUp;

    @FindBy(xpath = "//*[contains(text(), 'Thanks')]")
    public WebElement validateEmailMsg;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement okBtn;

    @FindBy(xpath = "//span[contains(.,' Login')]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBtn;

    @FindBy(xpath = "//input[@name='fullName']")
    public WebElement fullName;

    @FindBy(xpath = "//*[text()=' Full Name Invalid ']")
    public WebElement fullNameInvalidMsg;

    @FindBy(xpath = "//input[@name='dateOfBirth']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//*[text()='January']")
    public WebElement month;

    @FindBy(xpath = "//*[text()='03']")
    public WebElement date;

    @FindBy(xpath = "//*[text()='2001']")
    public WebElement year;

    @FindBy(xpath = "//*[text()=' Cancel ']")
    public WebElement cancelDOBBtn;

    @FindBy(xpath = "//*[text()=' Set ']")
    public WebElement setBtn;

    @FindBy(xpath ="//ion-select[@name='gender']")
    public WebElement gender;

    @FindBy(xpath = "//div[text()='Male']")
    public WebElement male;

    @FindBy(xpath = "//div[text()='Female']")
    public WebElement female;

    @FindBy(xpath = "//div[text()='Other']")
    public WebElement other;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement genderCancelBtn;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement genderOkBtn;

    @FindBy(xpath = "//input[@name='contact']")
    public WebElement contactNumber;

    @FindBy(xpath = "//*[text()=' Contact Number Required ']")
    public WebElement contactNumberRequiredMsg;

    @FindBy(xpath = "//*[text()=' Contact Number is Invalid ']")
    public WebElement contactNumberInvalidMsg;

    @FindBy(xpath = "//input[@name='address1']")
    public WebElement addressLine1;

    @FindBy(xpath = "//*[text()=' Address Required ']")
    public WebElement addressLine1RequiredMsg;

    @FindBy(xpath = "//input[@name='address2']")
    public WebElement addressLine2;

    @FindBy(xpath = "//input[@placeholder='City']")
    public WebElement city;

    @FindBy(xpath = "//*[text()=' City Required ']")
    public WebElement cityRequiredMsg;

    @FindBy(xpath = "//*[text()=' City Invalid ']")
    public WebElement cityInvalidMsg;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//*[text()=' State Required ']")
    public WebElement stateRequiredMsg;

    @FindBy(xpath = "//*[text()=' State Invalid ']")
    public WebElement stateInvalidMsg;

    @FindBy(xpath = "//input[@name='zipcode']")
    public WebElement zip;

    @FindBy(xpath = "//*[text()=' Zip Code Required ']")
    public WebElement zipRequiredMsg;

    @FindBy(xpath = "//*[text()=' Zip Code Invalid ']")
    public WebElement zipInvalidMsg;

    @FindBy(xpath = "//input[@placeholder='Country']")
    public WebElement country;

    @FindBy(xpath = "//*[text()=' Country Required ']")
    public WebElement countryRequiredMsg;

    @FindBy(xpath = "//*[text()=' Country Invalid ']")
    public WebElement countryInvalidMsg;

    @FindBy(xpath = "//ion-checkbox[@name='terms']")
    public WebElement termsCheckbox;

    @FindBy(xpath = "//ion-button[text()=' Save ']")
    public WebElement saveBtn;

    @FindBy(xpath = "//ion-label[text()='Logout']")
    public WebElement logoutBtn;

    public PatientSignup_PageObjects(){
        PageFactory.initElements(driver,this);
    }

    public void patientSignup() throws InterruptedException {
        Log.info("Checking the Patient Signup functions");
        waitForElementVisible(loginBtn);
        clickElement(loginBtn);
        waitForElementVisible(signupLink);
        clickElement(signupLink);
        waitForElementVisible(doctorBtn);
        clickElement(doctorBtn);
        Thread.sleep(2000);
        waitForElementVisible(patientBtn);
        clickElement(patientBtn);
        Thread.sleep(2000);
//        waitForElementVisible(emailText);
//        emailText.sendKeys(prop.getProperty("patientSignupMail"));
//        waitForElementVisible(passwordText);
//        passwordText.sendKeys(prop.getProperty("patientSignupPassword"));
//        waitForElementVisible(confirmPasswordText);
//        confirmPasswordText.sendKeys(prop.getProperty("patientSignupConfirmPassword"));
//        waitForElementVisible(registerBtn);
//        if(registerBtn.isEnabled()) {
//            clickElement(registerBtn);
//        }
//        waitForElementVisible(okBtn);
//        clickElement(okBtn);
//        Thread.sleep(10000);
//        driver.navigate().back();
//        waitForElementVisible(submitBtn);
//        if (submitBtn.isEnabled()) {
//            clickElement(submitBtn);
//        }
//        waitForElementVisible(fullName);
//        fullName.sendKeys(prop.getProperty("patientSignupFullName"));
//        waitForElementVisible(dateOfBirth);
//        clickElement(dateOfBirth);
//        scrollUsingJavaScriptExecutor(month);
//        waitForElementVisible(month);
//        clickElement(month);
//        scrollUsingJavaScriptExecutor(date);
//        waitForElementVisible(date);
//        clickElement(date);
//        scrollUsingJavaScriptExecutor(year);
//        waitForElementVisible(year);
//        clickElement(year);
//        waitForElementVisible(setBtn);
//        clickElement(setBtn);
//        waitForElementVisible(gender);
//        clickElement(gender);
//        waitForElementVisible(male);
//        clickElement(male);
//        waitForElementVisible(genderOkBtn);
//        clickElement(genderOkBtn);
//        scrollUsingJavaScriptExecutor(contactNumber);
//        waitForElementVisible(contactNumber);
//        contactNumber.sendKeys(prop.getProperty("patientSignupContactNumber"));
//        waitForElementVisible(addressLine1);
//        addressLine1.sendKeys(prop.getProperty("patientSignupAddressLine1"));
//        waitForElementVisible(addressLine2);
//        addressLine2.sendKeys(prop.getProperty("patientSignupAddressLine2"));
//        waitForElementVisible(city);
//        city.sendKeys(prop.getProperty("patientSignupCity"));
//        scrollUsingJavaScriptExecutor(state);
//        waitForElementVisible(state);
//        state.sendKeys(prop.getProperty("patientSignupState"));
//        waitForElementVisible(zip);
//        zip.sendKeys(prop.getProperty("patientSignupZip"));
//        scrollUsingJavaScriptExecutor(country);
//        waitForElementVisible(country);
//        country.sendKeys(prop.getProperty("patientSignupCountry"));
//        waitForElementVisible(termsCheckbox);
//        clickElement(termsCheckbox);
//        waitForElementVisible(saveBtn);
//        if(saveBtn.isEnabled()){
//            clickElement(saveBtn);
//        }
//        waitForElementVisible(logoutBtn);
//        clickElement(logoutBtn);
    }


}
