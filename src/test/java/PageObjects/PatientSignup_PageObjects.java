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




    public void patientSignup() throws InterruptedException {
        Log.info("Checking the Patient Signup functions");
        pageLoadWait();
        loginOption();  // Add by Prasad for time being (for Login only and entering "Basic Information" of already registered patient)
//        selectPatientTabThroughSignupLink();
//        verifyWrongSignupCredentialsAndAlreadyRegisteredPatient();
//        newPatientSignup();
//        clickOnLinkSentToYourEmailForValidation();  // ToDo: within 10 Sec manually click On Link Sent To Your Email For Validation
        enterDetailsForNewPatientSignup();
    }

    public void loginOption() {
//        Log.info("Checking the Login and logout");
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("email"));
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("password"));
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
//        waitForElementVisible(logoutBTN);
//        clickElement(logoutBTN);
    }


    public void selectPatientTabThroughSignupLink() throws InterruptedException {
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
    }

    public void verifyWrongSignupCredentialsAndAlreadyRegisteredPatient() throws InterruptedException {
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("patientSignupWrongMail"));
        clickElement(passwordText);
        Assert.assertEquals(emailTextErrorMsg.getText(), "Should be a valid email address!");
        clickElement(emailText);
        emailText.clear();
        emailText.sendKeys(prop.getProperty("patientAlreadySignupCorrectMail"));
        passwordText.sendKeys(prop.getProperty("patientSignupWrongPassword"));
        clickOnPasswordEyeIcon();
        clickElement(confirmPasswordText);
        Assert.assertEquals(passwordTextErrorMsg.getText(), "Should be at least 8 characters long!");
        clickElement(passwordText);
        passwordText.clear();
        passwordText.sendKeys(prop.getProperty("patientAlreadySignupCorrectPassword"));
        clickOnPasswordEyeIcon();
        confirmPasswordText.sendKeys(prop.getProperty("patientSignupWrongConfirmPassword"));
        clickOnConfirmPasswordEyeIcon();
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
    }

    public void newPatientSignup() throws InterruptedException {
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("patientSignupWrongMail"));
        clickElement(passwordText);
        Assert.assertEquals(emailTextErrorMsg.getText(), "Should be a valid email address!");
        clickElement(emailText);
        emailText.clear();
        emailText.sendKeys(prop.getProperty("patientNewSignupCorrectMail"));
        passwordText.sendKeys(prop.getProperty("patientSignupWrongPassword"));
        clickOnPasswordEyeIcon();
        clickElement(confirmPasswordText);
        Assert.assertEquals(passwordTextErrorMsg.getText(), "Should be at least 8 characters long!");
        clickElement(passwordText);
        passwordText.clear();
        passwordText.sendKeys(prop.getProperty("patientNewSignupCorrectPassword"));
        clickOnPasswordEyeIcon();
        confirmPasswordText.sendKeys(prop.getProperty("patientSignupWrongConfirmPassword"));
        clickOnConfirmPasswordEyeIcon();
        Assert.assertEquals(confirmPasswordTextErrorMsg.getText(), "Confirm password does not match");
        clickElement(confirmPasswordText);
        confirmPasswordText.clear();
        confirmPasswordText.sendKeys(prop.getProperty("patientNewSignupCorrectConfirmPassword"));
        clickOnConfirmPasswordEyeIcon();
        waitForElementVisible(registerBtn);
        scrollUpTo(registerBtn);
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
    }

    public void clickOnLinkSentToYourEmailForValidation() throws InterruptedException {
        Thread.sleep(10000);
        driver.navigate().back();
        waitForElementVisible(submitBtn);
        if (submitBtn.isEnabled()) {
            clickElement(submitBtn);
        }
    }

    public void enterDetailsForNewPatientSignup() throws InterruptedException {
        pageLoadWait();
        verifyAndEnterValidFullName();
        verifyEnterCorrectDOB();
        selectCorrectGender();
        verifyAndEnterValidContactNumber();

//        @FindBy(xpath = "//*[text()=' Full Name Invalid ']")
//        public WebElement fullNameInvalidMsg;
//
//        @FindBy(xpath = "//input[@name='dateOfBirth']")
//        public WebElement dateOfBirth;
//
//        @FindBy(xpath = "//*[text()='September']")
//        public WebElement month;
//
//        @FindBy(xpath = "//*[text()='06']")
//        public WebElement date;
//
//        @FindBy(xpath = "//*[text()='1981']")
//        public WebElement year;
//
//        @FindBy(xpath = "//*[text()=' Cancel ']")
//        public WebElement cancelDOBBtn;
//
//        @FindBy(xpath = "//*[text()=' Set ']")
//        public WebElement setBtn;
//
//        @FindBy(xpath ="//ion-select[@name='gender']")
//        public WebElement gender;
//
//        @FindBy(xpath = "//div[text()='Male']")
//        public WebElement male;
//
//        @FindBy(xpath = "//div[text()='Female']")
//        public WebElement female;
//
//        @FindBy(xpath = "//div[text()='Other']")
//        public WebElement other;
//
//        @FindBy(xpath = "//span[text()='Cancel']")
//        public WebElement genderCancelBtn;
//
//        @FindBy(xpath = "//span[text()='OK']")
//        public WebElement genderOkBtn;
//
//        @FindBy(xpath = "//input[@name='contact']")
//        public WebElement contactNumber;
//
//        @FindBy(xpath = "//*[text()=' Contact Number Required ']")
//        public WebElement contactNumberRequiredMsg;
//
//        @FindBy(xpath = "//*[text()=' Contact Number is Invalid ']")
//        public WebElement contactNumberInvalidMsg;
//
//        @FindBy(xpath = "//input[@name='address1']")
//        public WebElement addressLine1;
//
//        @FindBy(xpath = "//*[text()=' Address Required ']")
//        public WebElement addressLine1RequiredMsg;
//
//        @FindBy(xpath = "//input[@name='address2']")
//        public WebElement addressLine2;
//
//        @FindBy(xpath = "//input[@placeholder='City']")
//        public WebElement city;
//
//        @FindBy(xpath = "//*[text()=' City Required ']")
//        public WebElement cityRequiredMsg;
//
//        @FindBy(xpath = "//*[text()=' City Invalid ']")
//        public WebElement cityInvalidMsg;
//
//        @FindBy(xpath = "//input[@name='state']")
//        public WebElement state;
//
//        @FindBy(xpath = "//*[text()=' State Required ']")
//        public WebElement stateRequiredMsg;
//
//        @FindBy(xpath = "//*[text()=' State Invalid ']")
//        public WebElement stateInvalidMsg;
//
//        @FindBy(xpath = "//input[@name='zipcode']")
//        public WebElement zip;
//
//        @FindBy(xpath = "//*[text()=' Zip Code Required ']")
//        public WebElement zipRequiredMsg;
//
//        @FindBy(xpath = "//*[text()=' Zip Code Invalid ']")
//        public WebElement zipInvalidMsg;
//
//        @FindBy(xpath = "//input[@placeholder='Country']")
//        public WebElement country;
//
//        @FindBy(xpath = "//*[text()=' Country Required ']")
//        public WebElement countryRequiredMsg;
//
//        @FindBy(xpath = "//*[text()=' Country Invalid ']")
//        public WebElement countryInvalidMsg;
//
//        @FindBy(xpath = "//ion-checkbox[@name='terms']")
//        public WebElement termsCheckbox;
//
//        @FindBy(xpath = "//ion-button[text()=' Save ']")
//        public WebElement saveBtn;
//
//        @FindBy(xpath = "//ion-label[text()='Logout']")
//        public WebElement logoutBtn;
//
//        waitForElementVisible(gender);
//        clickElement(gender);
//        waitForElementVisible(male);
//        clickElement(male);
//        waitForElementVisible(genderOkBtn);
//        clickElement(genderOkBtn);
//        scrollUpTo(contactNumber);
//        waitForElementVisible(contactNumber);
//        contactNumber.sendKeys(prop.getProperty("patientSignupContactNumber"));
//        waitForElementVisible(addressLine1);
//        addressLine1.sendKeys(prop.getProperty("patientSignupAddressLine1"));
//        waitForElementVisible(addressLine2);
//        addressLine2.sendKeys(prop.getProperty("patientSignupAddressLine2"));
//        waitForElementVisible(city);
//        city.sendKeys(prop.getProperty("patientSignupCity"));
//        scrollUpTo(state);
//        waitForElementVisible(state);
//        state.sendKeys(prop.getProperty("patientSignupState"));
//        waitForElementVisible(zip);
//        zip.sendKeys(prop.getProperty("patientSignupZip"));
//        scrollUpTo(country);
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

    public void verifyAndEnterValidFullName() throws InterruptedException {
        waitForElementVisible(fullName);
        clickElement(fullName);
        clickElement(dateOfBirth);
        waitForElementVisible(fullNameRequired);
        String fullNameRequiredError = fullNameRequired.getText();
        Assert.assertEquals(fullNameRequired.getText(), fullNameRequiredError);
        Thread.sleep(2000);
        clickElement(fullName);
//        fullName.clear();
        fullName.sendKeys(prop.getProperty("patientNewSignupWrongDetails_FullName"));
//        clickElement(dateOfBirth);
        pressTab(fullName);
        waitForElementVisible(fullNameInvalidMsg);
        String fullNameInvalidError = fullNameInvalidMsg.getText();
        Assert.assertEquals(fullNameInvalidMsg.getText(), fullNameInvalidError);
        Thread.sleep(2000);
        clickElement(fullName);
        fullName.clear();
        fullName.sendKeys(prop.getProperty("patientNewSignupCorrectDetails_FullName"));
//        clickElement(dateOfBirth);
        pressTab(fullName);
        Thread.sleep(2000);
    }

    public void verifyEnterCorrectDOB() throws InterruptedException {
//        waitForElementVisible(dateOfBirth);
//        clickElement(dateOfBirth);
//        waitForElementVisible(cancelDOBBtn);
//        clickElement(cancelDOBBtn);
        dateOfBirth.clear();
        pressEscape(dateOfBirth);
        pressTab(dateOfBirth);
        Thread.sleep(2000);
//        clickElement(gender);
//        clickElement(genderCancelBtn);
        waitForElementVisible(dateOfBirthRequired);
        String dateOfBirthRequiredError = dateOfBirthRequired.getText();
        Assert.assertEquals(dateOfBirthRequired.getText(), dateOfBirthRequiredError);
        Thread.sleep(2000);
        dateOfBirth.sendKeys("05/15/2015");
        clickElement(dateOfBirth);
//        clickElement(defaultMonth);
//        scrollUpTo(wrongMonth);
//        waitForElementVisible(wrongMonth);
////        clickElement(wrongMonth);
//        clickElement(defaultDate);
//        scrollUpTo(wrongDate);
//        waitForElementVisible(wrongDate);
////        clickElement(wrongDate);
//        clickElement(defaultYear);
//        scrollUpTo(wrongYear);
//        waitForElementVisible(wrongYear);
////        clickElement(wrongYear);
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
//        waitForElementVisible(gender);
//        clickElement(gender);
        pressTab(dateOfBirth);
        Thread.sleep(2000);
//        waitForElementVisible(dateOfBirth);
//        clickElement(dateOfBirth);
//        clickElement(defaultMonth);
//        scrollUpTo(correctMonth);
//        waitForElementVisible(correctMonth);
//        clickElement(correctMonth);
//        clickElement(defaultDate);
//        scrollUpTo(correctDate);
//        waitForElementVisible(correctDate);
//        clickElement(correctDate);
//        clickElement(defaultYear);
//        scrollUpTo(correctYear);
//        waitForElementVisible(correctYear);
//        clickElement(correctYear);
//        Thread.sleep(2000);
//        waitForElementVisible(setDOBBtn);
//        clickElement(setDOBBtn);
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
    }

    public void verifyAndEnterValidContactNumber(){
        waitForElementVisible(contactNumber);
        clickElement(contactNumber);
        pressTab(contactNumber);
        waitForElementVisible(contactNumberRequiredMsg);
        String contactNumberRequiredError = contactNumberRequiredMsg.getText();
        Assert.assertEquals(contactNumberRequiredMsg.getText(), contactNumberRequiredError);
//        contactNumber.clear();
        contactNumber.sendKeys(prop.getProperty("patientNewSignupWrongDetails_ContactNumber"));
        pressTab(contactNumber);
        waitForElementVisible(contactNumberInvalidMsg);
        String contactNumberInvalidError = contactNumberInvalidMsg.getText();
        Assert.assertEquals(contactNumberInvalidMsg.getText(), contactNumberInvalidError);
        contactNumber.clear();
        contactNumber.sendKeys(prop.getProperty("patientNewSignupCorrectDetails_ContactNumber"));
        pressTab(contactNumber);
    }


}
