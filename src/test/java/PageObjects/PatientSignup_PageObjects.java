package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import static common.Utility.*;

public class PatientSignup_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

//    @FindBy(xpath = "//input[@placeholder='your@email.address']")
//    public WebElement emailText;
//
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;

    @FindBy(xpath = "(//*[text()='Logout'])[1]")
    public WebElement logoutBTN;



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

    @FindBy(xpath = "(//ion-icon[@name='eye'])[1]")
    public WebElement passwordEyeIcon;

    @FindBy(xpath = "//ion-label[text()='Should be at least 8 characters long!']")
    public WebElement passwordTextErrorMsg;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    public WebElement confirmPasswordText;

    @FindBy(xpath = "(//ion-icon[@name='eye'])[2]")
    public WebElement confirmPasswordEyeIcon;

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

    @FindBy(xpath = "//*[text()=' Full Name Required ']")
    public WebElement fullNameRequired;

    @FindBy(xpath = "//*[text()=' Full Name Invalid ']")
    public WebElement fullNameInvalidMsg;

    @FindBy(xpath = "//input[@name='dateOfBirth']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//*[text()=' Date of Birth Required ']")
    public WebElement dateOfBirthRequired;

    @FindBy(xpath = "//*[text()='January']")
    public WebElement defaultMonth;

    @FindBy(xpath = "//*[text()='01']")
    public WebElement defaultDate;

    @FindBy(xpath = "//*[text()='2000']")
    public WebElement defaultYear;

    @FindBy(xpath = "//*[text()='May']")
    public WebElement wrongMonth;

    @FindBy(xpath = "//*[text()='05']")
    public WebElement wrongDate;

    @FindBy(xpath = "//*[text()='2022']")
    public WebElement wrongYear;

    @FindBy(xpath = "//*[text()=' Cancel ']")
    public WebElement cancelDOBBtn;

    @FindBy(xpath = "//*[text()='September']")
    public WebElement correctMonth;

    @FindBy(xpath = "//*[text()='06']")
    public WebElement correctDate;

    @FindBy(xpath = "//*[text()='1981']")
    public WebElement correctYear;

    @FindBy(xpath = "//*[text()=' Set ']")
    public WebElement setDOBBtn;

    @FindBy(xpath ="//ion-select[@name='gender']")
    public WebElement gender;

    @FindBy(xpath = "//div[text()='Male']")
    public WebElement genderMale;

    @FindBy(xpath = "//div[text()='Female']")
    public WebElement genderFemale;

    @FindBy(xpath = "//div[text()='Other']")
    public WebElement genderOther;

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



    public void selectPatientTabThroughSignupLink() throws InterruptedException {
        pageLoadWait();
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
        Log.info("Selected Patient Tab Through Signup Link");
    }

    public void verifyWrongSignupCredentialsAndAlreadyRegisteredPatient() throws InterruptedException {
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("patientSignupWrongMail"));
        pressTab(emailText);
        waitForElementVisible(emailTextErrorMsg);
        Assert.assertEquals(emailTextErrorMsg.getText(), "Should be a valid email address!");
        clickElement(emailText);
        emailText.clear();
        emailText.sendKeys(prop.getProperty("patientAlreadySignupCorrectMail"));
        passwordText.sendKeys(prop.getProperty("patientSignupWrongPassword"));
        clickOnPasswordEyeIcon();
        clickElement(confirmPasswordText);
        waitForElementVisible(passwordTextErrorMsg);
        Assert.assertEquals(passwordTextErrorMsg.getText(), "Should be at least 8 characters long!");
        clickElement(passwordText);
        passwordText.clear();
        passwordText.sendKeys(prop.getProperty("patientAlreadySignupCorrectPassword"));
        clickOnPasswordEyeIcon();
        confirmPasswordText.sendKeys(prop.getProperty("patientSignupWrongConfirmPassword"));
        clickOnConfirmPasswordEyeIcon();
        waitForElementVisible(confirmPasswordTextErrorMsg);
        Assert.assertEquals(confirmPasswordTextErrorMsg.getText(), "Confirm password does not match");
        clickElement(confirmPasswordText);
        confirmPasswordText.clear();
        confirmPasswordText.sendKeys(prop.getProperty("patientAlreadySignupCorrectConfirmPassword"));
        clickOnConfirmPasswordEyeIcon();
        waitForElementVisible(registerBtn);
        scrollUpTo(registerBtn);
        Assert.assertEquals(registerBtn.isEnabled(),true);
        Thread.sleep(2000);
        if(registerBtn.isEnabled()) {
            clickElement(registerBtn);
        }
        Thread.sleep(2000);
        waitForElementVisible(userExistsPopUp);
        String patientAlreadyExistMessage = userExistsMsg.getText();
        Assert.assertEquals(userExistsMsg.getText(), patientAlreadyExistMessage);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Thread.sleep(2000);
        Log.info("Verified Wrong Signup Credentials And Already Registered Patient");
    }

    public void clickOnPasswordEyeIcon(){
        waitForElementVisible(passwordEyeIcon);
        try {
            for (int i=0; i<2; i++){
                clickElement(passwordEyeIcon);
                Thread.sleep(1000);
            }
        }catch (Exception e){

        }
        Log.info("Clicked On Password Eye Icon");
    }

    public void clickOnConfirmPasswordEyeIcon(){
        waitForElementVisible(confirmPasswordEyeIcon);
        try {
            for (int i=0; i<2; i++){
                clickElement(confirmPasswordEyeIcon);
                Thread.sleep(1000);
            }
        }catch (Exception e){

        }
        Log.info("Clicked On Confirm Password Eye Icon");
    }

    public void newPatientSignup() throws InterruptedException {
        waitForElementVisible(emailText);
        emailText.clear();
        emailText.sendKeys(prop.getProperty("patientSignupWrongMail"));
        clickElement(passwordText);
        waitForElementVisible(emailTextErrorMsg);
        Assert.assertEquals(emailTextErrorMsg.getText(), "Should be a valid email address!");
        clickElement(emailText);
        emailText.clear();
        emailText.sendKeys(prop.getProperty("patientNewSignupCorrectMail"));
        passwordText.sendKeys(prop.getProperty("patientSignupWrongPassword"));
        clickOnPasswordEyeIcon();
        clickElement(confirmPasswordText);
        waitForElementVisible(passwordTextErrorMsg);
        Assert.assertEquals(passwordTextErrorMsg.getText(), "Should be at least 8 characters long!");
        clickElement(passwordText);
        passwordText.clear();
        passwordText.sendKeys(prop.getProperty("patientNewSignupCorrectPassword"));
        clickOnPasswordEyeIcon();
        confirmPasswordText.sendKeys(prop.getProperty("patientSignupWrongConfirmPassword"));
        clickOnConfirmPasswordEyeIcon();
        waitForElementVisible(confirmPasswordTextErrorMsg);
        Assert.assertEquals(confirmPasswordTextErrorMsg.getText(), "Confirm password does not match");
        clickElement(confirmPasswordText);
        confirmPasswordText.clear();
        confirmPasswordText.sendKeys(prop.getProperty("patientNewSignupCorrectConfirmPassword"));
        clickOnConfirmPasswordEyeIcon();
        waitForElementVisible(registerBtn);
        scrollUpTo(registerBtn);
        waitForElementVisible(registerBtn);
        Assert.assertEquals(registerBtn.isEnabled(),true);
        Thread.sleep(2000);
        if(registerBtn.isEnabled()) {
            clickElement(registerBtn);
        }
        Thread.sleep(2000);
        waitForElementVisible(validateEmailPopUp);
        String newPatientValidateMessage = validateEmailMsg.getText();
        Assert.assertEquals(validateEmailMsg.getText(), newPatientValidateMessage);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Thread.sleep(2000);
        Log.info("New Patient Signed up");
    }

    public void clickOnLinkSentToYourEmailForValidation() throws InterruptedException {
        Thread.sleep(10000);
        driver.navigate().back();
        waitForElementVisible(submitBtn);
        if (submitBtn.isEnabled()) {
            clickElement(submitBtn);
        }
        Log.info("Clicked On Link Sent To Your Email For Validation");
    }

    public void enterDetailsForNewPatientSignup() throws InterruptedException {
        pageLoadWait();
        verifyAndEnterValidFullName();
        verifyEnterCorrectDOB();
        selectCorrectGender();
        verifyAndEnterValidContactNumber();
        verifyAndEnterValidAddress();
        verifyAndEnterValidCity();
        verifyAndEnterValidState();
        verifyAndEnterValidZipCode();
        verifyAndEnterValidCountry();
        Log.info("Entered Details For New Patient Signup");
    }

    public void verifyAndEnterValidFullName() throws InterruptedException {
        waitForElementVisible(fullName);
        clickElement(fullName);
        clickElement(dateOfBirth);
        waitForElementVisible(fullNameRequired);
        String fullNameRequiredError = fullNameRequired.getText();
        Assert.assertEquals(fullNameRequired.getText(), fullNameRequiredError);
        Thread.sleep(2000);
        clickElement(fullName);
        fullName.sendKeys(prop.getProperty("patientNewSignupWrongDetails_FullName"));
        pressTab(fullName);
        waitForElementVisible(fullNameInvalidMsg);
        String fullNameInvalidError = fullNameInvalidMsg.getText();
        Assert.assertEquals(fullNameInvalidMsg.getText(), fullNameInvalidError);
        Thread.sleep(2000);
        clickElement(fullName);
        fullName.clear();
        fullName.sendKeys(prop.getProperty("patientNewSignupCorrectDetails_FullName"));
        pressTab(fullName);
        Thread.sleep(2000);
        Log.info("Verified And Entered Valid Full Name");
    }

    public void verifyEnterCorrectDOB() throws InterruptedException {
        dateOfBirth.clear();
        pressEscape(dateOfBirth);
        pressTab(dateOfBirth);
        Thread.sleep(2000);
        waitForElementVisible(dateOfBirthRequired);
        String dateOfBirthRequiredError = dateOfBirthRequired.getText();
        Assert.assertEquals(dateOfBirthRequired.getText(), dateOfBirthRequiredError);
        Thread.sleep(2000);
        dateOfBirth.sendKeys("05/15/2015");
        clickElement(dateOfBirth);
        Thread.sleep(2000);
        waitForElementVisible(cancelDOBBtn);
        clickElement(cancelDOBBtn);
        Thread.sleep(2000);
        dateOfBirth.clear();
        dateOfBirth.sendKeys("09/06/1981");
        clickElement(dateOfBirth);
        Thread.sleep(2000);
        waitForElementVisible(setDOBBtn);
        clickElement(setDOBBtn);
        pressTab(dateOfBirth);
        Thread.sleep(2000);
        Log.info("Verified And Entered Correct DOB");
    }

    public void selectCorrectGender() throws InterruptedException {
        waitForElementVisible(gender);
        clickElement(gender);
        waitForElementVisible(genderMale);
        clickElement(genderMale);
        waitForElementVisible(genderCancelBtn);
        clickElement(genderCancelBtn);
        Thread.sleep(2000);
        waitForElementVisible(gender);
        clickElement(gender);
        waitForElementVisible(genderFemale);
        clickElement(genderFemale);
        waitForElementVisible(genderCancelBtn);
        clickElement(genderCancelBtn);
        Thread.sleep(2000);
        waitForElementVisible(gender);
        clickElement(gender);
        waitForElementVisible(genderOther);
        clickElement(genderOther);
        waitForElementVisible(genderCancelBtn);
        clickElement(genderCancelBtn);
        Thread.sleep(2000);
        waitForElementVisible(gender);
        clickElement(gender);
        waitForElementVisible(genderMale);
        clickElement(genderMale);
        waitForElementVisible(genderOkBtn);
        clickElement(genderOkBtn);
        Thread.sleep(2000);
        Log.info("Selected Correct Gender");
    }

    public void verifyAndEnterValidContactNumber(){
        waitForElementVisible(contactNumber);
        clickElement(contactNumber);
        pressTab(contactNumber);
        waitForElementVisible(contactNumberRequiredMsg);
        String contactNumberRequiredError = contactNumberRequiredMsg.getText();
        Assert.assertEquals(contactNumberRequiredMsg.getText(), contactNumberRequiredError);
        contactNumber.sendKeys(prop.getProperty("patientNewSignupWrongDetails_ContactNumber"));
        pressTab(contactNumber);
        waitForElementVisible(contactNumberInvalidMsg);
        String contactNumberInvalidError = contactNumberInvalidMsg.getText();
        Assert.assertEquals(contactNumberInvalidMsg.getText(), contactNumberInvalidError);
        contactNumber.clear();
        contactNumber.sendKeys(prop.getProperty("patientNewSignupCorrectDetails_ContactNumber"));
        pressTab(contactNumber);
        Log.info("Verified And Entered Valid Contact Number");
    }

    public void verifyAndEnterValidAddress() throws InterruptedException {
        waitForElementVisible(addressLine1);
        clickElement(addressLine1);
        pressTab(addressLine1);
        waitForElementVisible(addressLine1RequiredMsg);
        String addressLine1RequiredError = addressLine1RequiredMsg.getText();
        Assert.assertEquals(addressLine1RequiredMsg.getText(), addressLine1RequiredError);
        clickElement(addressLine1);
        addressLine1.sendKeys(prop.getProperty("patientNewSignupCorrectDetails_AddressLine1"));
        clickElement(addressLine2);
        addressLine2.sendKeys(prop.getProperty("patientNewSignupCorrectDetails_AddressLine2"));
        pressTab(addressLine2);
        Thread.sleep(2000);
        Log.info("Verified And Entered Valid Address");
    }

    public void verifyAndEnterValidCity() throws InterruptedException {
        scrollUpTo(termsCheckbox);
        waitForElementVisible(city);
        clickElement(city);
        pressTab(city);
        waitForElementVisible(cityRequiredMsg);
        String cityRequiredError = cityRequiredMsg.getText();
        Assert.assertEquals(cityRequiredMsg.getText(), cityRequiredError);
        clickElement(city);
        city.sendKeys(prop.getProperty("patientNewSignupWrongDetails_City"));
        waitForElementVisible(cityInvalidMsg);
        String cityInvalidError = cityInvalidMsg.getText();
        Assert.assertEquals(cityInvalidMsg.getText(), cityInvalidError);
        clickElement(city);
        city.clear();
        city.sendKeys(prop.getProperty("patientNewSignupCorrectDetails_City"));
        pressTab(city);
        Thread.sleep(2000);
        Log.info("Verified And Entered Valid City");
    }

    public void verifyAndEnterValidState() throws InterruptedException {
        waitForElementVisible(state);
        clickElement(state);
        pressTab(state);
        waitForElementVisible(stateRequiredMsg);
        String stateRequiredError = stateRequiredMsg.getText();
        Assert.assertEquals(stateRequiredMsg.getText(), stateRequiredError);
        clickElement(state);
        state.sendKeys(prop.getProperty("patientNewSignupWrongDetails_State"));
        waitForElementVisible(stateInvalidMsg);
        String stateInvalidError = stateInvalidMsg.getText();
        Assert.assertEquals(stateInvalidMsg.getText(), stateInvalidError);
        clickElement(state);
        state.clear();
        state.sendKeys(prop.getProperty("patientNewSignupCorrectDetails_State"));
        pressTab(state);
        Thread.sleep(2000);
        Log.info("Verified And Entered Valid State");
    }

    public void verifyAndEnterValidZipCode() throws InterruptedException {
        waitForElementVisible(zip);
        clickElement(zip);
        pressTab(zip);
        waitForElementVisible(zipRequiredMsg);
        String zipCodeRequiredError = zipRequiredMsg.getText();
        Assert.assertEquals(zipRequiredMsg.getText(), zipCodeRequiredError);
        clickElement(zip);
        zip.sendKeys(prop.getProperty("patientNewSignupWrongDetails_ZipCode"));
        waitForElementVisible(zipInvalidMsg);
        String zipCodeInvalidError = zipInvalidMsg.getText();
        Assert.assertEquals(zipInvalidMsg.getText(), zipCodeInvalidError);
        clickElement(zip);
        zip.clear();
        zip.sendKeys(prop.getProperty("patientNewSignupCorrectDetails_ZipCode"));
        pressTab(zip);
        Thread.sleep(2000);
        Log.info("Verified And Entered Valid Zip Code");
    }

    public void verifyAndEnterValidCountry() throws InterruptedException {
        waitForElementVisible(country);
        clickElement(country);
        pressTab(country);
        waitForElementVisible(countryRequiredMsg);
        String countryRequiredError = countryRequiredMsg.getText();
        Assert.assertEquals(countryRequiredMsg.getText(), countryRequiredError);
        clickElement(country);
        country.sendKeys(prop.getProperty("patientNewSignupWrongDetails_Country"));
        waitForElementVisible(countryInvalidMsg);
        String countryInvalidError = countryInvalidMsg.getText();
        Assert.assertEquals(countryInvalidMsg.getText(), countryInvalidError);
        clickElement(country);
        country.clear();
        country.sendKeys(prop.getProperty("patientNewSignupCorrectDetails_Country"));
        pressTab(country);
        Thread.sleep(2000);
        Log.info("Verified And Entered Valid Country");
    }

    public void clickInToCheckBoxForTermsAndConditions() throws InterruptedException {
        waitForElementVisible(termsCheckbox);
        Assert.assertEquals(termsCheckbox.isSelected(), false);
        clickElement(termsCheckbox);
        Thread.sleep(2000);
        Log.info("Clicked InTo CheckBox For Terms And Conditions");
    }

    public void clickSaveButton() throws InterruptedException {
        waitForElementVisible(saveBtn);
        Assert.assertEquals(saveBtn.isEnabled(), true);
        clickElement(saveBtn);
        Thread.sleep(2000);
        Log.info("Clicked Save Button");
    }

    public void refreshPageAndLogout(){
        pageLoadWait();
        refreshWebPage();
        waitForElementVisible(logoutBTN);
        clickElement(logoutBTN);
        Log.info("Clicked on Logout");
    }

}
