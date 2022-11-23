package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.List;

import static common.Utility.*;

public class AayshaDoctorSignup_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[text()=' Sign Up ']")
    public WebElement signupLink;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public WebElement loginLink;

    @FindBy(xpath = "(//ion-segment-button)[2]")
    public WebElement doctorLink;

    @FindBy(xpath = "(//ion-segment-button)[1]")
    public WebElement patientLink;
    @FindBy(xpath = "//*[contains(text(), 'User Exists')]")
    public WebElement userExistsPopUp;
    @FindBy(xpath = "//*[contains(text(), 'already exists')]")
    public WebElement userExistsMsg;
    @FindBy(xpath = "//*[contains(text(),'Validate Email')]")
    public WebElement newDoctorValidateMessage;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;
    @FindBy(xpath = "//ion-label[text()='Should be a valid email address!']")
    public WebElement invalidEmailTextError;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;
    @FindBy(xpath = "//ion-label[text()='Should be at least 8 characters long!']")
    public WebElement passwordErrortextSignup;
    @FindBy(xpath = "(//ion-icon[@name='eye'])[1]")
    public WebElement passwordEyeIcon;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    public WebElement confirmPasswordText;
    @FindBy(xpath = "//ion-label[text()='Confirm password does not match']")
    public WebElement confirmPasswordTextError;
    @FindBy(xpath = "(//ion-icon[@name='eye'])[2]")
    public WebElement confirmPasswordEyeIcon;

    @FindBy(xpath = "//ion-button[text()=' Register ']")
    public WebElement registerBtn;
    @FindBy(xpath = "//span[text()='OK']")
    public WebElement okBtn;
    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement email;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "//*[text()='Please repeat or register.']")
    public WebElement loginErrorPopup;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBtn;

    @FindBy(xpath = "//input[@name='registrationNumber']")
    public WebElement registerationID;
    @FindBy(xpath = "//ion-label[text()=' Registration number is required ']")
    public WebElement requiredRegisterationIDErrorMsg;
    @FindBy(xpath = "//ion-label[text()=' Registration number is invalid ']")
    public WebElement invalidRegisterationIDErrorMsg;

    @FindBy(xpath = "//input[@name='fullName']")
    public WebElement fullName;
    @FindBy(xpath = "//ion-label[text()=' Full Name Required ']")
    public WebElement requiredFullName;
    @FindBy(xpath = "//ion-label[text()=' Full Name Invalid ']")
    public WebElement invalidFullName;

    @FindBy(xpath = "//input[@name='dateOfBirth']")
    public WebElement dateOfBirth;
    @FindBy(xpath = "//ion-label[text()=' Date of Birth Required ']")
    public WebElement requiredDateOfBirth;
    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelDateOfBirth;

    @FindBy(xpath = "//*[text()='November']")
    public WebElement clickOnMonth;
    @FindBy(xpath = "//*[text()='June']")
    public WebElement selectMonth;
    @FindBy(xpath = "//*[text()='14']")
    public WebElement clickOnDate;
    @FindBy(xpath = "//*[text()='28']")
    public WebElement selectDate;
    @FindBy(xpath = "//*[text()='2022']")
    public WebElement clickOnYear;
    @FindBy(xpath = "//*[text()='1995']")
    public WebElement selectYear;
    @FindBy(xpath = "//*[text()=' Set ']")
    public WebElement setBtn;
    @FindBy(xpath = "//*[text()=' Cancel ']")
    public WebElement cancel;

    @FindBy(xpath = "//ion-select[@name='gender']")
    public WebElement gender;
    @FindBy(xpath = "//div[text()='Male']")
    public WebElement male;
    @FindBy(xpath = "//div[text()='Female']")
    public WebElement female;
    @FindBy(xpath = "//div[text()='Other']")
    public WebElement other;
    @FindBy(xpath = "//span[text()='OK']")
    public WebElement genderOkBtn;
    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement popupCancelBtn;

    //@FindBy(xpath = "//input[@name='contact' and @placeholder='Mobile Number']")    updated-Aaysha-04-11-2022
    @FindBy(xpath = "//input[@name='contact' and @placeholder='Contact Number']")
    public WebElement contactNumber;
    @FindBy(xpath = "//ion-label[text()=' Contact Number Required ']")
    public WebElement requiredContactNumberMsg;
    @FindBy(xpath = "//ion-label[text()=' Contact Number is Invalid ']")
    public WebElement invalidContactNumberMsg;

    @FindBy(xpath = "//ion-button[text()='Next']")
    public WebElement nextBtn;
    @FindBy(xpath = "//ion-button[text()='Back']")
    public WebElement backBtn;
    @FindBy(xpath = "//*[text()='Confirm']")
    public WebElement conformBtn;
    @FindBy(xpath = "//ion-button[text()='Skip Clinic Setup?']")
    public WebElement skipClinicSetupBtn;
    @FindBy(xpath = "//*[contains(text(),'profile section')]")
    public WebElement skipClinicSetupPopUpText;


//    @FindBy(xpath = "//*[@aria-label='Specialization,  Specialization ']")
////    @FindBy(xpath = "//*[@id='ion-sel-1-lbl']")
////    @FindBy(xpath = "//ion-label[text()=' Specialization ']")
////    @FindBy(xpath = "//*[contains(text(),' Specialization ')][1]")
//    public WebElement specialization;
    @FindBy(xpath = "//*[@name='specialization']")
    public WebElement specialization;
    @FindBy(xpath = "//ion-label[text()=' Specialization Required ']")
    public WebElement requiredSpecial;


    //    @FindBy(xpath = "//div[text()=' Geriatrics ']")
//    public WebElement geriatrics;
    @FindBy(xpath = "//*[@role='checkbox']")
    public List<WebElement> specializationList;
    @FindBy(xpath = "//*[text()=' Specialization Required ']")
    public WebElement requiredSpecializationLMsg;

    @FindBy(xpath = "//div[text()=' Ayurvedic specialist ']")
    public WebElement ayurvedicSpecialist;
    @FindBy(xpath = "//div[text()=' Cardiologist ']")                                 //updated-Aaysha-04-11-2022
    public WebElement cardiologist;
    @FindBy(xpath = "//div[text()=' Dentist ']")                                        //updated-Aaysha-04-11-2022
    public WebElement dentist;
    @FindBy(xpath = "//div[text()=' Dermatologist ']")
    public WebElement dermatologist;
    @FindBy(xpath = "//div[text()=' Diabetologist ']")
    public WebElement diabetologist;
    @FindBy(xpath = "//div[text()=' ENT surgeon ']")
    public WebElement ENTsurgeon;
    @FindBy(xpath = "//div[text()=' General surgeon ']")
    public WebElement generalSurgeon;
    @FindBy(xpath = "//div[text()=' Gynaecologist & Obstetrician ']")
    public WebElement gynaecologistObstetrician;
    @FindBy(xpath = "//div[text()=' Haematologist ']")
    public WebElement haematologist;
    @FindBy(xpath = "//div[text()='  Homoeopaths ']")
    public WebElement homoeopaths;
    @FindBy(xpath = "//div[text()=' Nephrologist ']")
    public WebElement nephrologist;
    @FindBy(xpath = "//div[text()=' Neurologist ']")
    public WebElement neurologist;
    @FindBy(xpath = "//div[text()=' Oncologist ']")
    public WebElement oncologist;
    @FindBy(xpath = "//div[text()=' Opthalmologist ']")
    public WebElement Opthalmologist;
    @FindBy(xpath = "//div[text()=' Orthopaedic surgeon ']")
    public WebElement orthopaedicSurgeon;
    @FindBy(xpath = "//div[text()=' Paediatrician ']")
    public WebElement Paediatrician;
    @FindBy(xpath = "//div[text()=' Physician ']")
    public WebElement Physician;
    @FindBy(xpath = "//div[text()=' Spine surgeon ']")
    public WebElement spineSurgeon;
    @FindBy(xpath = "//div[text()=' Urologist ']")
    public WebElement urologist;

//    @FindBy(xpath = "//span[text()='OK']")
//    public WebElement okBtn;

    //    okBtn
    @FindBy(xpath = "//input[@name='experience']")
    public WebElement experience;
    @FindBy(xpath = "//ion-label[text()=' Experience Required ']")
    public WebElement requiredExperienceMsg;
    @FindBy(xpath = "//ion-label[text()=' Experience Invalid ']")
    public WebElement invalidExperience;
    @FindBy(xpath = "//*[text()='Please Enter Valid Experience']")
    public WebElement invalidExperienceMsg;
//    @FindBy(xpath = "//*[text()='Upload Certificate ']")
//    public WebElement certificate;
    @FindBy(xpath = "//*[text()='Upload Certificate']")
    public WebElement certificate;
    //    nextBtn
    @FindBy(xpath = "//input[@name='clinicName']")
    public WebElement clinicName;
    @FindBy(xpath = "//ion-label[text()=' Clinic Name Required ']")
    public WebElement requiredClinicName;
    @FindBy(xpath = "//ion-label[text()=' Clinic Name Invalid ']")
    public WebElement InvalidClinicName;

    @FindBy(xpath = "//input[@name='address1' and @placeholder='Address Line 1']")
    public WebElement addressLine1;
    @FindBy(xpath = "//ion-label[text()=' Address Required ']")
    public WebElement requiredAddressLine1;

    @FindBy(xpath = "//input[@name='address2' and @placeholder='Address Line 2']")
    public WebElement addressLine2;
    @FindBy(xpath = "//input[@name='city' and @placeholder='City']")
    public WebElement city;
    @FindBy(xpath = "//ion-label[text()=' City Required ']")
    public WebElement requiredCityErrorMsg;
    @FindBy(xpath = "//ion-label[text()=' City Invalid ']")
    public WebElement invalidCityErrorMsg;

    @FindBy(xpath = "//input[@name='state' and @placeholder='State/Province/Region']")
    public WebElement state;
    @FindBy(xpath = "//ion-label[text()=' State Required ']")
    public WebElement requiredStateErrorMsg;
    @FindBy(xpath = "//ion-label[text()=' State Invalid ']")
    public WebElement invalidStateErrorMsg;

    @FindBy(xpath = "//input[@name='zipcode' and @placeholder='Zip/Postal Code']")
    public WebElement pinCode;
    @FindBy(xpath = "//ion-label[text()=' Zip Code Required ']")
    public WebElement requiredPinCodeErrorMsg;
    @FindBy(xpath = "//ion-label[text()=' Zip Code Invalid ']")
    public WebElement invalidPinCodeErrorMsg;

    @FindBy(xpath = "//input[@name='country' and @placeholder='Country']")
    public WebElement country;
    @FindBy(xpath = "//ion-label[text()=' Country Required ']")
    public WebElement requiredCountryErrorMsg;
    @FindBy(xpath = "//ion-label[text()=' Country Invalid ']")
    public WebElement invalidCountryErrorMsg;

    @FindBy(xpath = "//input[@placeholder='Select holidays']")
    public WebElement holiday;
    @FindBy(xpath = "(//mbsc-calendar-day[@ng-reflect-text='19'])[2]")
    public WebElement selectHoliday;

    @FindBy(xpath = "//*[text()='Availability']")
    public WebElement availability;
    //    @FindBy(xpath = "//*[contains(@aria-label,'Select Availability')]")
    @FindBy(xpath = "(//*[contains(@aria-haspopup,'listbox')])[1]")
    public WebElement selectAvailability;

    @FindBy(xpath = "//button[@role='checkbox']")
    public List<WebElement> dayList;

    @FindBy(xpath = "//div[text()=' Monday ']")
    public WebElement monday;
    @FindBy(xpath = "//div[text()=' Tuesday ']")
    public WebElement tuesday;
    @FindBy(xpath = "//div[text()=' Wednesday ']")
    public WebElement wednesday;
    @FindBy(xpath = "//div[text()=' Thursday ']")
    public WebElement thursday;
    @FindBy(xpath = "//div[text()=' Friday ']")
    public WebElement friday;
    @FindBy(xpath = "//div[text()=' Saturday ']")
    public WebElement saturday;
    @FindBy(xpath = "//div[text()=' Sunday ']")
    public WebElement sunday;
    //    okBtn
//    @FindBy(xpath = "//*[@aria-label='Select Patient Slot Time,  Slots per Patient ']") updated By Aaysha 17/11/2022
    @FindBy(xpath = "(//*[contains(@aria-haspopup,'listbox')])[2]")
//    @FindBy(xpath = "//ion-label[contains(text(),' Slots per Patient ')]")
    public WebElement timeSlot;
    //    @FindBy(xpath = "//div[text()=' 15 minutes ']")
    @FindBy(xpath = "//button[@role='radio'][1]")
    public WebElement fifteenMinutes;
    @FindBy(xpath = "//button[@role='radio'][2]")
//    @FindBy(xpath = "//div[text()=' 30 minutes ']")
    public WebElement thirtyMinutes;
    //    @FindBy(xpath = "//div[text()=' 60 minutes ']")
    @FindBy(xpath = "//button[@role='radio'][3]")
    public WebElement sixtyMinutes;
    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement timeCancelBtn;
    //    okBtn
    @FindBy(xpath = "//input[@name='from-0']")
    public WebElement from;
    @FindBy(xpath = "//div[@class='mbsc-ltr mbsc-scroller-bar-cont']")
    public WebElement scrollOne;
    @FindBy(xpath = "( //mbsc-wheel-item[@ng-reflect-index='10'])[1]")
    public WebElement selectHoursFrom;
    @FindBy(xpath = "(//div[@class='mbsc-ltr mbsc-scroller-bar-cont'])[2]")
    public WebElement scrollTwo;
    @FindBy(xpath = "(//mbsc-wheel-item[@ng-reflect-index='0'])[2]")
    public WebElement selectMinites;
    //    setBtn
    @FindBy(xpath = "( //mbsc-wheel-item[@ng-reflect-index='4'])[1]")
    public WebElement selectHoursTo;
    @FindBy(xpath = "//input[@name='to-0']")
    public WebElement to;
    @FindBy(xpath = "//ion-label[text()=' Shift end cannot be earlier than shift start ']")
    public WebElement toEarlierErrorMsg;
    @FindBy(xpath = "//ion-label[text()=' Shift end time must be greater than start time ']")
    public WebElement toGreaterErrorMsg;

    @FindBy(xpath = "//ion-button[contains(text(),'Add Schedule')]")
    public WebElement addSchedule;
    @FindBy(xpath = "(//ion-button[contains(text(),' Remove ')])[2]")
    public WebElement removeAddSchedule;
    //    setBtn
    @FindBy(xpath = "//mbsc-wheel-item[.='PM']")
    public WebElement pm;
    @FindBy(xpath = "//mbsc-wheel-item[.='AM']")
    public WebElement am;
    @FindBy(xpath = "//*[text()='Fee structure']")
    public WebElement feeStructure;

    //    @FindBy(xpath = "//*[@aria-label='Currency,  Payment Currency ']")
//    @FindBy(xpath = "//ion-label[contains(text(),' Payment Currency ')]")
    @FindBy(xpath = "//*[@ng-reflect-placeholder='Currency']")
    public WebElement currency;
    @FindBy(xpath = "//div[text()='Indian Rupee (INR) ']")
    public WebElement indianRupee;
    @FindBy(xpath = "//div[text()='Pound Sterling (GBP) ']")
    public WebElement poundGBP ;
    //    okBtn
    @FindBy(xpath = "//ion-label[text()=' Consulting Fee Exceed Max Value ']")
    public WebElement exceedValueConsultFee;
    @FindBy(xpath = "//ion-label[text()=' Consulting Fee Required ']")
    public WebElement requiredConsultFee;
    @FindBy(xpath = "//input[@name='consultingFee']")
    public WebElement consultFee;

    @FindBy(xpath = "//ion-label[text()=' Follow Up Fee Exceed Max Value ']")
    public WebElement exceedValueFollowFee;
    @FindBy(xpath = "//ion-label[text()=' Follow Up Fee Required ']")
    public WebElement requiredFollowUpFee;
    @FindBy(xpath = "//input[@name='followUpFee']")
    public WebElement followUpFee;

    //      nextBtn
    @FindBy(xpath = "//span[text()='Terms and Conditions']")
    public WebElement termsAndConditions;
    @FindBy(xpath = "//ion-button[text()='OK']")
    public WebElement okBttn;
    @FindBy(xpath = "//div[@class='accept']//ion-checkbox[@aria-checked='false']")
    public WebElement checkBox;
    @FindBy(xpath = "//ion-checkbox[@name='terms']")
    public WebElement termsCheckbox;
    @FindBy(xpath = "//ion-button[text()='Save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//ion-label[text()='Logout']")
    public WebElement logoutBtn;

    public AayshaDoctorSignup_PageObjects(){

        PageFactory.initElements(driver,this);
    }

    public void doctorSignupExistsUser() throws InterruptedException {
        Log.info("Checking the Doctor Signup functions");
        pageLoadWait();
        selectDoctorTabThroughSignupLink();
        verifyWrongSignupCredentialsAndAlreadyRegisteredDoctor();
    }

    public void selectDoctorTabThroughSignupLink() throws InterruptedException {
        refreshWebPage();
        waitForElementVisible(loginBtn);
        clickElement(loginBtn);
        waitForElementVisible(signupLink);
        clickElement(signupLink);
        waitForElementVisible(doctorLink);
        clickElement(doctorLink);
        Thread.sleep(2000);
        waitForElementVisible(patientLink);
        clickElement(patientLink);
        Thread.sleep(2000);
        waitForElementVisible(doctorLink);
        clickElement(doctorLink);
        Thread.sleep(2000);
    }

    public void verifyWrongSignupCredentialsAndAlreadyRegisteredDoctor() throws InterruptedException {
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("doctorSignupWrongMail"));
        clickElement(passwordText);
        Assert.assertEquals(invalidEmailTextError.getText(), "Should be a valid email address!");
        clickElement(emailText);
        emailText.clear();
        emailText.sendKeys(prop.getProperty("doctorAlreadySignupCorrectMail"));
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("doctorSignupWrongPassword"));
        clickOnPasswordEyeIcon();
        clickElement(confirmPasswordText);
        Assert.assertEquals(passwordErrortextSignup.getText(), "Should be at least 8 characters long!");
        clickElement(passwordText);
        passwordText.clear();
        passwordText.sendKeys(prop.getProperty("doctorAlreadySignupCorrectPassword"));
        clickOnPasswordEyeIcon();
        confirmPasswordText.sendKeys(prop.getProperty("doctorSignupWrongConfirmPassword"));
        clickOnConfirmPasswordEyeIcon();
        Assert.assertEquals(confirmPasswordTextError.getText(), "Confirm password does not match");
        clickElement(confirmPasswordText);
        confirmPasswordText.clear();
        confirmPasswordText.sendKeys(prop.getProperty("doctorAlreadySignupCorrectConfirmPassword"));
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
        String doctorAlreadyExistMessage = userExistsMsg.getText();
        Assert.assertEquals(userExistsMsg.getText(), doctorAlreadyExistMessage);
        System.out.println(doctorAlreadyExistMessage);
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



    public void verifyLoginWithWrongCredentialsNotSignedUpAndSignedUpDoctor() throws InterruptedException {
        Log.info("Check login And not Register Doctor");
//        waitForElementVisible(loginLink);
//        clickElement(loginLink);
        waitForElementVisible(loginBtn);
        clickElement(loginBtn);
        Log.info("Click login link");
//        waitForElementVisible(signupLink);
//        clickElement(signupLink);
//        Log.info("Click signup link");
//        waitForElementVisible(doctorLink);
//        clickElement(doctorLink);
//        Log.info("Click doctor link");
//        waitForElementVisible(emailText);
//        emailText.sendKeys(prop.getProperty("email1"));
//        Log.info("Send email");
//        waitForElementVisible(passwordText);
//        passwordText.sendKeys(prop.getProperty("password1"));
//        waitForElementVisible(confirmPasswordText);
//        confirmPasswordText.sendKeys(prop.getProperty("password1"));
//        Log.info("Send confirm password");
//        waitForElementVisible(registerBtn);
//        clickElement(registerBtn);
//        Log.info("Click on register button");
//        waitForElementVisible(okBtn);
//        clickElement(okBtn);
//        Log.info("Click on OK button");
//        Thread.sleep(10000);
//        waitForElementVisible(loginLink);
//        clickElement(loginLink);
//        Log.info("Wait 10 secound Verify & Click on login button");

        waitForElementVisible(email);
        emailText.sendKeys(prop.getProperty("doctorSignupWrongMail"));
        clickElement(password);
        Assert.assertEquals(invalidEmailTextError.getText(), "Should be a valid email address!");
        Log.info("Verified doctorSignupWrongMail for login");
        clickElement(email);
        email.clear();

        waitForElementVisible(email);
        email.sendKeys(prop.getProperty("doctorLoginWrongMail"));
        Log.info("Send Not Exist Email id");

        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("doctorLoginWrongInvalidPassword"));
        clickOnPasswordEyeIcon();
        clickElement(emailText);
        Assert.assertEquals(passwordErrortextSignup.getText(), "Should be at least 8 characters long!");
        Log.info("Verified doctorLoginWrongPassword for login");
        clickElement(passwordText);
        passwordText.clear();

        waitForElementVisible(password);
        password.sendKeys(prop.getProperty("doctorLoginWrongValidPassword"));
        Log.info("Send Not Exist password");
        Thread.sleep(5000);
        waitForElementVisible(submitBtn);
        clickElement(submitBtn);
        Log.info("Click on login for submit");

        waitForElementVisible(loginErrorPopup);
        String loginErrorPopupText=loginErrorPopup.getText();
        Assert.assertEquals(loginErrorPopup.getText(),loginErrorPopupText);
        Log.info("Login TextError Popup Assertion completed");
        Log.info("Verified doctor is not signed up for login");
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Log.info("click on ok Error Text box");

        waitForElementVisible(email);
        clickElement(email);
        email.clear();
        email.sendKeys(prop.getProperty("doctorAlreadySignupCorrectMail"));
        Log.info("Send doctorAlreadySignupCorrectMail");
        waitForElementVisible(password);
        clickElement(password);
        password.clear();
        password.sendKeys(prop.getProperty("doctorAlreadySignupCorrectPassword"));
        Log.info("Send doctorAlreadySignupCorrectPassword");

        Thread.sleep(5000);
        waitForElementVisible(submitBtn);
        clickElement(submitBtn);
        Log.info("Click on login for submit");

        waitForElementVisible(logoutBtn);
        clickElement(logoutBtn);
        Log.info("Click on logout Option");

        Log.info("Verified doctor is already signed up so Logged in and Logged out");
    }

//    public  void loginWithValidCredentials() throws InterruptedException {
//        Log.info("Check the  login");
//         waitForElementVisible(loginBtn);
//        clickElement(loginBtn);
//        Log.info("Click login btn");
//        waitForElementVisible(email);
//        email.sendKeys(prop.getProperty("email1"));
//        Log.info("Send email");
//        waitForElementVisible(password);
//        password.sendKeys(prop.getProperty("password1"));
//        Log.info("Send password");
//        Thread.sleep(3000);
//        waitForElementVisible(submitBtn);
//        clickElement(submitBtn);
//        Thread.sleep(3000);
//        Log.info("Click on login for submit");
//    }

    public void newDoctorSignupWithValidCredentials() throws InterruptedException {
        Log.info(" New Signup check");
//        waitForElementVisible(loginBtn);
//        clickElement(loginBtn);
//        Thread.sleep(3000);
//        waitForElementVisible(signupLink);
//        clickElement(signupLink);
//        Log.info("Click signup link");
//        waitForElementVisible(doctorLink);
//        clickElement(doctorLink);
//        Log.info("Click doctor link");

        waitForElementVisible(emailText);
        emailText.clear();
        emailText.sendKeys(prop.getProperty("doctorNewSignupCorrectMail"));
        Log.info("Send new Email Id");
        waitForElementVisible(passwordText);
        passwordText.clear();
        passwordText.sendKeys(prop.getProperty("doctorNewSignupCorrectPassword"));
        Log.info("Send new password");
        waitForElementVisible(confirmPasswordText);
        confirmPasswordText.clear();
        confirmPasswordText.sendKeys(prop.getProperty("doctorNewSignupCorrectConfirmPassword"));
        Log.info("Send  new confirm password");
        waitForElementVisible(registerBtn);
        clickElement(registerBtn);
        Log.info("Click on register button");
//        waitForElementVisible(okBtn);
//        clickElement(okBtn);
//        Log.info("Click on OK button & wait for 10 Secound for verify mail");
//        Thread.sleep(10000);
//        waitForElementVisible(loginLink);
//        clickElement(loginLink);
//        Log.info("Click on Login Link");
//        waitForElementVisible(email);
//        email.sendKeys(prop.getProperty("doctorSignupNewMail"));
//        Log.info("Send email");
//        waitForElementVisible(password);
//        password.sendKeys(prop.getProperty("doctorSignupNewPassword"));
//        Log.info("Send password");
//        Thread.sleep(5000);
//        waitForElementVisible(submitBtn);
//        clickElement(submitBtn);
//        Thread.sleep(3000);
//        Log.info("Click on login for submit");
        waitForElementVisible(newDoctorValidateMessage);
        String newDoctorValidatePopup = newDoctorValidateMessage.getText();
        Assert.assertEquals(newDoctorValidateMessage.getText(), newDoctorValidatePopup);
        Log.info("Verified Thanks Message Window for New Doctor Sign up");
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Log.info("Click on OK button & wait for 10 Seconds for verify mail");

    }
    public void clickOnLinkSentToYourEmailForValidation() throws InterruptedException {
        Thread.sleep(10000);
        driver.navigate().back();
        waitForElementVisible(submitBtn);
        if (submitBtn.isEnabled()) {
            clickElement(submitBtn);
        }
        Log.info("Clicked On Link Sent To Your Email For Validation");
        Thread.sleep(2000);
        Log.info("New Doctor is Signed up");
    }

    public void enterDetailsForNewDoctorSignup() throws InterruptedException, AWTException {
        pageLoadWait();
        doctorRegisterFormOne();
        doctorRegisterFormTwo();
        doctorRegisterFormThree();

//        verifyAndEnterValidRegistrationID();
//        verifyAndEnterValidFullName();
//        verifyEnterCorrectDOB();
//        selectCorrectGender();
//        verifyAndEnterValidContactNumber();
//        verifyAndSelectValidSpecialization();
//        verifyAndEnterValidExperience();
//        verifyAndEnterValidClinicName();
//        verifyAndEnterValidAddress();
//        verifyAndEnterValidCity();
//        verifyAndEnterValidState();
//        verifyAndEnterPinCode();
//        verifyAndEnterCountry();
//        verifyAndEnterHoliday();
//        verifyAndEnterAvailability();
//        verifyAndEnterSlotPerPerson();
//        verifyAndEnterFromAndToShiftTime();
//        verifyAndEnterPaymentCurrency();
//        verifyAndEnterConsultingFee();
//        verifyAndEnterFollowUpFee();
//        verifyAndAcceptTermsAndConditions();

        Log.info("Entered Details For New Doctor Signup");
    }

    public void doctorRegisterFormOne() throws InterruptedException {
        verifyAndEnterValidRegistrationID();
        verifyAndEnterValidFullName();
        verifyEnterCorrectDOB();
        selectCorrectGender();
        verifyAndEnterValidContactNumber();
    }
    public void doctorRegisterFormTwo() throws InterruptedException, AWTException {
        verifyAndSelectValidSpecialization();
        verifyAndEnterValidExperience();
        verifyAndEnterValidCertificate();

    }

        public void doctorRegisterFormThree() throws InterruptedException {
            verifyAndEnterValidClinicName();
            verifyAndEnterValidAddress();
            verifyAndEnterValidCity();
            verifyAndEnterValidState();
            verifyAndEnterPinCode();
            verifyAndEnterCountry();
            verifyAndEnterHoliday();
            verifyAndEnterAvailability();
            verifyAndEnterSlotPerPerson();
            verifyAndEnterFromAndToShiftTime();
            verifyAndEnterPaymentCurrency();
            verifyAndEnterConsultingFee();
            verifyAndEnterFollowUpFee();
        }


    public void verifyAndEnterValidRegistrationID() throws InterruptedException {
        waitForElementVisible(registerationID);
        clickElement(registerationID);
        pressTab(registerationID);
        clickElement(fullName);
        waitForElementVisible(requiredRegisterationIDErrorMsg);
        Thread.sleep(2000);
        String registrationIDRequiredError = requiredRegisterationIDErrorMsg.getText();
        Assert.assertEquals(requiredRegisterationIDErrorMsg.getText(), registrationIDRequiredError);
        Thread.sleep(3000);
        clickElement(registerationID);
        registerationID.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_RegistrationID"));
        pressTab(registerationID);
        waitForElementVisible(invalidRegisterationIDErrorMsg);
        String registerationIDInvalidError = invalidRegisterationIDErrorMsg.getText();
        Assert.assertEquals(invalidRegisterationIDErrorMsg.getText(), registerationIDInvalidError);
        Log.info("Verified registerationIDInvalidError");
        Thread.sleep(3000);
        clickElement(registerationID);
        registerationID.clear();
        registerationID.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_RegistrationID"));
        pressTab(registerationID);
        Thread.sleep(2000);
        Log.info("Entered Valid Registration ID");

    }

    public void verifyAndEnterValidFullName() throws InterruptedException {
        waitForElementVisible(fullName);
        clickElement(fullName);
        clickElement(dateOfBirth);
        waitForElementVisible(requiredFullName);
        String fullNameRequiredError = requiredFullName.getText();
        Assert.assertEquals(requiredFullName.getText(), fullNameRequiredError);
        Log.info("Verified fullNameRequiredError");
        Thread.sleep(2000);
        clickElement(fullName);
        fullName.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_FullName"));
        pressTab(fullName);
        waitForElementVisible(invalidFullName);
        String fullNameInvalidError = invalidFullName.getText();
        Assert.assertEquals(invalidFullName.getText(), fullNameInvalidError);
        Log.info("Verified fullNameInvalidError");
        Thread.sleep(2000);
        clickElement(fullName);
        fullName.clear();
        fullName.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_FullName"));
        pressTab(fullName);
        Thread.sleep(2000);
        Log.info("Entered Valid Full Name");
    }

    public void verifyEnterCorrectDOB() throws InterruptedException {
        dateOfBirth.clear();
        pressEscape(dateOfBirth);
        pressTab(dateOfBirth);
        Thread.sleep(2000);
        waitForElementVisible(requiredDateOfBirth);
        String dateOfBirthRequiredError = requiredDateOfBirth.getText();
        Assert.assertEquals(requiredDateOfBirth.getText(), dateOfBirthRequiredError);
        Log.info("Verified dateOfBirthRequiredError");
        Thread.sleep(2000);
        dateOfBirth.sendKeys("05/15/2015");
        clickElement(dateOfBirth);
        Thread.sleep(2000);
        waitForElementVisible(cancel);
        clickElement(cancel);
        Thread.sleep(2000);
        dateOfBirth.clear();
        dateOfBirth.sendKeys("09/06/1981");
        clickElement(dateOfBirth);
        Thread.sleep(2000);
        waitForElementVisible(cancel);
        clickElement(cancel);
        Thread.sleep(2000);
        clickElement(dateOfBirth);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        pressTab(dateOfBirth);
        Thread.sleep(2000);
        Log.info("Verified And Entered Correct DOB");
    }

    public void selectCorrectGender() throws InterruptedException {
        waitForElementVisible(gender);
        clickElement(gender);
        waitForElementVisible(male);
        clickElement(male);
        waitForElementVisible(popupCancelBtn);
        clickElement(popupCancelBtn);
        Thread.sleep(2000);
        waitForElementVisible(gender);
        clickElement(gender);
        waitForElementVisible(female);
        clickElement(female);
        waitForElementVisible(popupCancelBtn);
        clickElement(popupCancelBtn);
        Thread.sleep(2000);
        waitForElementVisible(gender);
        clickElement(gender);
        waitForElementVisible(other);
        clickElement(other);
        waitForElementVisible(popupCancelBtn);
        clickElement(popupCancelBtn);
        Thread.sleep(2000);
        waitForElementVisible(gender);
        clickElement(gender);
        waitForElementVisible(male);
        clickElement(male);
        waitForElementVisible(genderOkBtn);
        clickElement(genderOkBtn);
        Thread.sleep(2000);
        Log.info("Selected Correct Gender");
    }

    public void verifyAndEnterValidContactNumber() throws InterruptedException {
        waitForElementVisible(contactNumber);
        clickElement(contactNumber);
        pressTab(contactNumber);
        waitForElementVisible(requiredContactNumberMsg);
        String contactNumberRequiredError = requiredContactNumberMsg.getText();
        Assert.assertEquals(requiredContactNumberMsg.getText(), contactNumberRequiredError);
        Log.info("Verified contactNumberRequiredError");
        contactNumber.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_ContactNumber"));
        pressTab(contactNumber);
        Thread.sleep(2000);
        waitForElementVisible(invalidContactNumberMsg);
        String contactNumberInvalidError = invalidContactNumberMsg.getText();
        Assert.assertEquals(invalidContactNumberMsg.getText(), contactNumberInvalidError);
        Log.info("Verified contactNumberInvalidError");
        contactNumber.clear();
        contactNumber.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_ContactNumber"));
        pressTab(contactNumber);
        Thread.sleep(2000);
        waitForElementVisible(nextBtn);
        clickElement(nextBtn);
        Log.info("Entered Valid Contact Number");
    }

    public void verifyAndSelectValidSpecialization() throws InterruptedException {
        waitForElementVisible(specialization);
        clickElement(specialization);
        Thread.sleep(3000);
        waitForElementVisible(popupCancelBtn);
        clickElement(popupCancelBtn);
        Thread.sleep(3000);
        pressEscape(specialization);
//        pressTab(specialization);
        Thread.sleep(3000);
        waitForElementVisible(requiredSpecializationLMsg);
        String specializationRequiredError = requiredSpecializationLMsg.getText();
        Assert.assertEquals(requiredSpecializationLMsg.getText(), specializationRequiredError);
        Log.info("Verified specializationRequiredError");
        Thread.sleep(3000);
        clickElement(specialization);

        for (int i=0;i<=specializationList.size()-1;i++){
            specializationList.get(i).click();
            System.out.println(specializationList.get(i).getText());
        }
        Thread.sleep(3000);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Thread.sleep(2000);
//        clickElement(specialization);
//        Thread.sleep(3000);
//        for (int i=specializationList.size()-3;i>=0;i--){
//            specializationList.get(i).click();
//            System.out.println(specializationList);
//        }
//        Thread.sleep(3000);
//        clickElement(okBtn);

        Log.info("Selected Valid Specialization/s");
    }

    public void verifyAndEnterValidExperience() throws InterruptedException {
        waitForElementVisible(experience);
        clickElement(experience);
        pressTab(experience);
//        waitForElementVisible(specialization);
//        clickElement(specialization);
        Thread.sleep(3000);
        waitForElementVisible(requiredExperienceMsg);
        String experienceRequiredError = requiredExperienceMsg.getText();
        Assert.assertEquals(requiredExperienceMsg.getText(), experienceRequiredError);
        Log.info("Verified experienceRequiredError");
        experience.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_Experience"));
        pressTab(experience);
        Thread.sleep(2000);
        waitForElementVisible(invalidExperience);
        String experienceInvalidError = invalidExperience.getText();
        Assert.assertEquals(invalidExperience.getText(), experienceInvalidError);
        Log.info("Verified experienceInvalidError");
        Thread.sleep(3000);
        experience.clear();
        experience.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_Experience"));
//        Log.info("Entered valid experience");
        pressTab(experience);

//        waitForElementVisible(certificate);
//        clickElement(certificate);
//        Thread.sleep(5000);
//        Log.info("click upload certificate");
//        waitForElementVisible(nextBtn);
//        clickElement(nextBtn);
//        Log.info("click On nextBtn");
//        Thread.sleep(3000);


//        waitForElementVisible(invalidExperienceMsg);
//        String experienceInvalidText=invalidExperienceMsg.getText();
//        Assert.assertEquals(invalidExperienceMsg.getText(),experienceInvalidText);
//        Log.info("Invalid TextMsg Assertion complete");
//        waitForElementVisible(okBtn);
//        clickElement(okBtn);
//        Log.info("click on ok Error Textbox");
//        Thread.sleep(3000);
//        waitForElementVisible(backBtn);
//        clickElement(backBtn);
//        gotoBackAndUpdateDOB();
//        Thread.sleep(4000);
//        waitForElementVisible(nextBtn);
//        clickElement(nextBtn);
//        Log.info("click nextBtn");

//        Log.info("Verified And Entered Valid Experience or update DOB");
        Log.info("Entered valid experience");
    }

    public void gotoBackAndUpdateDOB() throws InterruptedException {
        waitForElementVisible(dateOfBirth);
        dateOfBirth.clear();
        dateOfBirth.sendKeys("05/28/1995");
        clickElement(dateOfBirth);
        Thread.sleep(2000);
        waitForElementVisible(cancel);
        clickElement(cancel);
        Thread.sleep(2000);
        dateOfBirth.clear();
        dateOfBirth.sendKeys("05/28/1995");
        clickElement(dateOfBirth);
        Thread.sleep(2000);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        pressTab(dateOfBirth);
        Thread.sleep(2000);

//        waitForElementVisible(dateOfBirth);
//        clickElement(dateOfBirth);
//        dateOfBirth.clear();
//        Thread.sleep(3000);
//        dateOfBirth.sendKeys("05/28/1995");
////        clickElement(dateOfBirth);
////        Thread.sleep(4000);
////        waitForElementVisible(setBtn);
////        clickElement(setBtn);
//        Thread.sleep(2000);
//        clickElement(fullName);
//        Thread.sleep(2000);
//        clickElement(dateOfBirth);
//        Thread.sleep(4000);
//        waitForElementVisible(setBtn);
//        clickElement(setBtn);



        Thread.sleep(3000);
        Log.info("Click on DOB and Update");
        waitForElementVisible(nextBtn);
        clickElement(nextBtn);
        Log.info("Click on Next");
        Thread.sleep(3000);
        waitForElementVisible(backBtn);
        clickElement(backBtn);
        Log.info("Click on Back");
        Thread.sleep(5000);
        waitForElementVisible(nextBtn);
        clickElement(nextBtn);
        Log.info("Click on Next");

    }

    public void verifyAndEnterValidCertificate() throws InterruptedException, AWTException {
        tryToUploadPDFFileForSetCertificate();
        tryToUploadZIPFileForSetCertificate();
        tryToUploadMSWordFileForSetCertificate();
        tryToUploadPNGFileForSetCertificate();
        waitForElementVisible(nextBtn);
        clickElement(nextBtn);
        Log.info("click On nextBtn");

    }

    public void tryToUploadPDFFileForSetCertificate() throws InterruptedException, AWTException {
        Log.info("Uploading PDF Format");
        StringSelection stringSelectionJpg = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\PDF-PrasadTesting.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionJpg,null);
        waitForElementVisible(certificate);
        clickElement(certificate);
        Thread.sleep(2000);
        pasteText();
        Thread.sleep(2000);
        pressEnter();
        Thread.sleep(2000);
    }
    public void tryToUploadZIPFileForSetCertificate() throws InterruptedException, AWTException {
        Log.info("Uploading ZIP Format");
        StringSelection stringSelectionJpg = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\Zip-PrasadTesting.zip");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionJpg,null);
        waitForElementVisible(certificate);
        clickElement(certificate);
        Thread.sleep(2000);
        pasteText();
        Thread.sleep(2000);
        pressEnter();
        Thread.sleep(2000);
    }

    public void tryToUploadMSWordFileForSetCertificate() throws InterruptedException, AWTException {
        Log.info("Uploading MSWord Format");
        StringSelection stringSelectionJpg = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\MS_Word-PrasadTesting.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionJpg,null);
        waitForElementVisible(certificate);
        clickElement(certificate);
        Thread.sleep(2000);
        pasteText();
        Thread.sleep(2000);
        pressEnter();
        Thread.sleep(2000);
    }

    public void tryToUploadPNGFileForSetCertificate() throws InterruptedException, AWTException {
        Log.info("Uploading Jpg Format");
        StringSelection stringSelectionJpg = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\PNG-PrasadTesting.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionJpg,null);
        waitForElementVisible(certificate);
        clickElement(certificate);
        Thread.sleep(2000);
        pasteText();
        Thread.sleep(2000);
        pressEnter();
        Thread.sleep(2000);
    }

    public void verifyAndEnterValidClinicName() throws InterruptedException {
        waitForElementVisible(clinicName);
        clickElement(clinicName);
        clickElement(addressLine1);
        waitForElementVisible(requiredClinicName);
        String clinicNameRequiredError = requiredClinicName.getText();
        Assert.assertEquals(requiredClinicName.getText(), clinicNameRequiredError);
        Log.info("Verified clinicNameRequiredError");
        Thread.sleep(2000);
        clickElement(clinicName);
        clinicName.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_ClinicName"));
        pressTab(clinicName);
        waitForElementVisible(InvalidClinicName);
        String ClinicNameInvalidError = InvalidClinicName.getText();
        Assert.assertEquals(InvalidClinicName.getText(), ClinicNameInvalidError);
        Log.info("Verified ClinicNameInvalidError");
        Thread.sleep(2000);
        clickElement(clinicName);
        clinicName.clear();
        clinicName.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_ClicnicName"));
        pressTab(clinicName);
        Thread.sleep(2000);
        Log.info("Entered Valid Clinic Name");
    }

    public void verifyAndEnterValidAddress() throws InterruptedException {
        waitForElementVisible(addressLine1);
        clickElement(addressLine1);
        clickElement(addressLine2);
        waitForElementVisible(requiredAddressLine1);
        System.out.println(requiredAddressLine1.getText());
        String address1RequiredError = requiredAddressLine1.getText();
        Assert.assertEquals(requiredAddressLine1.getText(), address1RequiredError);
        Log.info("Verified address1RequiredError");
        Thread.sleep(2000);
        clickElement(addressLine1);
        addressLine1.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_AddressLine1"));
        pressTab(addressLine1);
        Thread.sleep(2000);
        clickElement(addressLine1);
        addressLine1.clear();
        addressLine1.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_AddressLine1"));
        pressTab(addressLine1);
        Thread.sleep(2000);
        clickElement(addressLine2);
        addressLine2.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_AddressLine2"));
        Thread.sleep(2000);
        Log.info("Entered Valid Address");
    }

    public void verifyAndEnterValidCity() throws InterruptedException {
        waitForElementVisible(city);
        clickElement(city);
        clickElement(addressLine1);
        waitForElementVisible(requiredCityErrorMsg);
        String cityRequiredError = requiredCityErrorMsg.getText();
        Assert.assertEquals(requiredCityErrorMsg.getText(), cityRequiredError);
        Log.info("Verified cityRequiredError");
        Thread.sleep(2000);
        clickElement(city);
        city.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_City"));
        pressTab(city);
        waitForElementVisible(invalidCityErrorMsg);
        String cityInvalidError = invalidCityErrorMsg.getText();
        Assert.assertEquals(invalidCityErrorMsg.getText(), cityInvalidError);
        Log.info("Verified cityInvalidError");
        Thread.sleep(2000);
        clickElement(city);
        city.clear();
        city.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_City"));
        pressTab(city);
        Thread.sleep(2000);
        Log.info("Entered Valid City");
    }

    public void verifyAndEnterValidState() throws InterruptedException {
        waitForElementVisible(state);
        clickElement(state);
        clickElement(city);
        waitForElementVisible(requiredStateErrorMsg);
        String stateRequiredError = requiredStateErrorMsg.getText();
        Assert.assertEquals(requiredStateErrorMsg.getText(), stateRequiredError);
        Log.info("Verified stateRequiredError");
        Thread.sleep(2000);
        clickElement(state);
        state.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_State"));
        pressTab(state);
        waitForElementVisible(invalidStateErrorMsg);
        String stateInvalidError = invalidStateErrorMsg.getText();
        Assert.assertEquals(invalidStateErrorMsg.getText(), stateInvalidError);
        Log.info("Verified stateInvalidError");
        Thread.sleep(2000);
        clickElement(state);
        state.clear();
        state.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_State"));
        pressTab(state);
        Thread.sleep(2000);
        Log.info("Entered Valid State");
    }

    public void verifyAndEnterPinCode() throws InterruptedException {
        waitForElementVisible(pinCode);
        clickElement(pinCode);
        clickElement(state);
        waitForElementVisible(requiredPinCodeErrorMsg);
        String pinCodeRequiredError = requiredPinCodeErrorMsg.getText();
        Assert.assertEquals(requiredPinCodeErrorMsg.getText(), pinCodeRequiredError);
        Log.info("Verified pinCodeRequiredError");
        Thread.sleep(2000);
        clickElement(pinCode);
        pinCode.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_PinCode"));
        pressTab(pinCode);
        waitForElementVisible(invalidPinCodeErrorMsg);
        String pinCodeInvalidError = invalidPinCodeErrorMsg.getText();
        Assert.assertEquals(invalidPinCodeErrorMsg.getText(), pinCodeInvalidError);
        Log.info("Verified pinCodeInvalidError");
        Thread.sleep(2000);
        clickElement(pinCode);
        pinCode.clear();
        pinCode.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_PinCode"));
        pressTab(pinCode);
        Thread.sleep(2000);
        Log.info("Entered Valid PinCode");
    }

    public void verifyAndEnterCountry() throws InterruptedException {
        waitForElementVisible(country);
        clickElement(country);
        clickElement(pinCode);
        waitForElementVisible(requiredCountryErrorMsg);
        String countryRequiredError = requiredCountryErrorMsg.getText();
        Assert.assertEquals(requiredCountryErrorMsg.getText(), countryRequiredError);
        Log.info("Verified countryRequiredError");
        Thread.sleep(2000);
        clickElement(country);
        country.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_Country"));
        pressTab(country);
        waitForElementVisible(invalidCountryErrorMsg);
        String countryInvalidError = invalidCountryErrorMsg.getText();
        Assert.assertEquals(invalidCountryErrorMsg.getText(), countryInvalidError);
        Log.info("Verified countryInvalidError");
        Thread.sleep(2000);
        clickElement(country);
        country.clear();
        country.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_Country"));
        pressTab(country);
        Thread.sleep(2000);
        Log.info("Entered Valid Country");
    }

    public void verifyAndEnterHoliday() throws InterruptedException {
        waitForElementVisible(holiday);
        clickElement(holiday);
        clickElement(country);
        Thread.sleep(2000);
        clickElement(holiday);
        holiday.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_Holiday"));
        pressTab(holiday);
        Thread.sleep(2000);
        holiday.click();
        clickElement(holiday);
        waitForElementVisible(selectHoliday);
        clickElement(selectHoliday);
        Thread.sleep(2000);
        holiday.clear();
        holiday.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_Holiday"));
        pressEscape(holiday);
        Thread.sleep(2000);
        Log.info("Verified And Entered Holiday");
    }

    public void verifyAndEnterAvailability() throws InterruptedException {
        waitForElementVisible(availability);
        clickElement(availability);
        Log.info("Click On Availability");
        waitForElementVisible(selectAvailability);
        clickElement(selectAvailability);
        Log.info("Click On Select Availability");
        Thread.sleep(2000);
//        waitForElementVisible(monday);
//        clickElement(monday);
        Thread.sleep(2000);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Thread.sleep(2000);
        waitForElementVisible(selectAvailability);
        clickElement(selectAvailability);

        for (int i = 0; i <= dayList.size() - 3; i++) {
            dayList.get(i).click();
            System.out.println(dayList.get(i).getText());
        }
        Thread.sleep(2000);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Thread.sleep(2000);
        Log.info("Verified And Entered Availability");
    }

    public void verifyAndEnterSlotPerPerson() throws InterruptedException {
        waitForElementVisible(timeSlot);
        clickElement(timeSlot);
        Log.info("click on time slot");
        waitForElementVisible(fifteenMinutes);
        clickElement(fifteenMinutes);
        Thread.sleep(3000);
        Log.info("Select 15 min");
        waitForElementVisible(timeCancelBtn);
        clickElement(timeCancelBtn);
        Thread.sleep(3000);
        waitForElementVisible(timeSlot);
        clickElement(timeSlot);
        waitForElementVisible(thirtyMinutes);
        clickElement(thirtyMinutes);
        Thread.sleep(3000);
        Log.info("Select 30 min");
        waitForElementVisible(timeCancelBtn);
        clickElement(timeCancelBtn);
        Thread.sleep(2000);
        waitForElementVisible(timeSlot);
        clickElement(timeSlot);
        Thread.sleep(3000);
        waitForElementVisible(sixtyMinutes);
        clickElement(sixtyMinutes);
        Thread.sleep(3000);
        Log.info("Select 60 min");
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Thread.sleep(2000);

        Log.info("Verified And Entered Slot Patient Time");
    }

    public void verifyAndEnterFromAndToShiftTime() throws InterruptedException {
        waitForElementVisible(from);
        from.clear();
        from.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_FromTime"));
//        clickElement(from);
        Thread.sleep(2000);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        pressEscape(from);
        pressTab(from);
        Log.info("send wrong time from");
        waitForElementVisible(to);
        to.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_TOTime"));
        Thread.sleep(2000);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        Log.info("send wrong time to");
        pressEscape(to);
        pressTab(to);
        Thread.sleep(3000);
        waitForElementVisible(toGreaterErrorMsg);
        String shiftTimeErrorText = toGreaterErrorMsg.getText();
        Assert.assertEquals(toGreaterErrorMsg.getText(), shiftTimeErrorText);
        Thread.sleep(3000);
        Log.info("Assert complete for Greater value of shift time");
        clickElement(to);
        to.clear();
        to.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_TOEarlierTime"));
        Thread.sleep(2000);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        pressEscape(to);
        pressTab(to);
        waitForElementVisible(toEarlierErrorMsg);
        String toEarlierErrorText = toEarlierErrorMsg.getText();
        Assert.assertEquals(toEarlierErrorMsg.getText(), toEarlierErrorText);
        Thread.sleep(3000);
        waitForElementVisible(from);
        from.clear();
        from.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_FromTime"));
        Thread.sleep(3000);
        clickElement(setBtn);
        pressEscape(from);
        pressTab(from);
        Log.info("Verified And Entered From Shift Time");
        Thread.sleep(2000);
        waitForElementVisible(to);
        to.clear();
        to.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_ToTime"));
        Thread.sleep(2000);
        clickElement(to);
        pressEscape(to);
//        scrollUpTo(pm);
        Thread.sleep(5000);
        clickElement(to);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        pressEscape(to);
        pressTab(to);
        Log.info("Verified And Entered To Shift Time");
        Log.info("Verified And Entered Valid Shift Time");
        ////////////add Schedule/////////////////
        verifyAndEnterAddNewSchedule();

    }

    public void verifyAndEnterAddNewSchedule() throws InterruptedException {
        waitForElementVisible(addSchedule);
        clickElement(addSchedule);
        Thread.sleep(4000);
        waitForElementVisible(removeAddSchedule);
        clickElement(removeAddSchedule);
        Thread.sleep(4000);
//        waitForElementVisible(addSchedule);
//        clickElement(addSchedule);
//        Thread.sleep(2000);
//        verifyAndEnterAvailability();
//        verifyAndEnterSlotPerPerson();
//        verifyAndEnterFromAndToShiftTime();

    }


    public void verifyAndEnterPaymentCurrency() throws InterruptedException {
        waitForElementVisible(feeStructure);
        clickElement(feeStructure);
        Thread.sleep(2000);
        Log.info("click on feeStructure ");
        waitForElementVisible(currency);
        clickElement(currency);
        Thread.sleep(2000);
        Log.info("click on currency ");
        waitForElementVisible(poundGBP);
        clickElement(poundGBP);
        Thread.sleep(2000);
        Log.info("click on poundGBP ");
        waitForElementVisible(popupCancelBtn);
        clickElement(popupCancelBtn);
        Log.info("click on oK Cancel");
        Thread.sleep(2000);
        waitForElementVisible(currency);
        clickElement(currency);
        Thread.sleep(2000);
        waitForElementVisible(indianRupee);
        clickElement(indianRupee);
        Thread.sleep(2000);
        Log.info("click on indianRupee ");
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Log.info("click on okBtn");

        Log.info("Verified And Entered Payment Currency");
    }

    public void verifyAndEnterConsultingFee() throws InterruptedException {
        waitForElementVisible(consultFee);
        clickElement(consultFee);
        pressTab(consultFee);
        waitForElementVisible(requiredConsultFee);
        String consultFeeRequiredError = requiredConsultFee.getText();
        Assert.assertEquals(requiredConsultFee.getText(), consultFeeRequiredError);
        Log.info("Assert required consult fee");
        Thread.sleep(2000);
        clickElement(consultFee);
        consultFee.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_consultFee"));
        pressTab(consultFee);
        waitForElementVisible(exceedValueConsultFee);
        String consultFeeInvalidError = exceedValueConsultFee.getText();
        Assert.assertEquals(exceedValueConsultFee.getText(), consultFeeInvalidError);
        Log.info("Assert exceed consult fee");
        Thread.sleep(2000);
        clickElement(consultFee);
        consultFee.clear();
        consultFee.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_ConsultFee"));
        pressTab(consultFee);
        Thread.sleep(2000);
        Log.info("Verified And Entered Consulting Fee");

    }


    public void verifyAndEnterFollowUpFee() throws InterruptedException {
        waitForElementVisible(followUpFee);
        clickElement(followUpFee);
        pressTab(followUpFee);
        waitForElementVisible(requiredFollowUpFee);
        String followUpFeeRequiredError = requiredFollowUpFee.getText();
        Assert.assertEquals(requiredFollowUpFee.getText(), followUpFeeRequiredError);
        Log.info("Assert required followup fee");
        Thread.sleep(2000);
        clickElement(followUpFee);
        followUpFee.sendKeys(prop.getProperty("doctorNewSignupWrongDetails_FollowUpFee"));
        pressTab(followUpFee);
        waitForElementVisible(exceedValueFollowFee);
        String followUpFeeExceedError = exceedValueFollowFee.getText();
        Assert.assertEquals(exceedValueFollowFee.getText(), followUpFeeExceedError);
        Log.info("Assert Exceed followup fee");
        Thread.sleep(2000);
        clickElement(followUpFee);
        followUpFee.clear();
        followUpFee.sendKeys(prop.getProperty("doctorNewSignupCorrectDetails_FollowUpFee"));
        pressTab(followUpFee);
        Thread.sleep(2000);

        waitForElementVisible(skipClinicSetupBtn);
        clickElement(skipClinicSetupBtn);
        Thread.sleep(2000);
        waitForElementVisible(skipClinicSetupPopUpText);
        String skipClinicSetupErrortext = skipClinicSetupPopUpText.getText();
        Assert.assertEquals(skipClinicSetupPopUpText.getText(), skipClinicSetupErrortext);
        Log.info("Verified skipClinicSetupErrortext");
        Thread.sleep(2000);
        waitForElementVisible(conformBtn);
        clickElement(conformBtn);
        Thread.sleep(2000);
        waitForElementVisible(backBtn);
        clickElement(backBtn);
        Log.info("click on BackBtn");
        scrollUpTo(skipClinicSetupBtn);
        Thread.sleep(2000);
        waitForElementVisible(skipClinicSetupBtn);
        clickElement(skipClinicSetupBtn);
        Thread.sleep(2000);
        waitForElementVisible(popupCancelBtn);
        clickElement(popupCancelBtn);
        Thread.sleep(2000);
        verifyAndEnterAvailability();
        verifyAndEnterSlotPerPerson();
        verifyAndEnterFromAndToShiftTime();
        verifyAndEnterAddNewSchedule();
        Thread.sleep(3000);
        waitForElementVisible(nextBtn);
        clickElement(nextBtn);
//        Log.info("click on BackBtn");
        Log.info("click on nextBtn");
        Thread.sleep(2000);
        Log.info("Verified And Entered FollowUp Fee");

    }

    public void verifyAndAcceptTermsAndConditions() throws InterruptedException {
        waitForElementVisible(checkBox);
        clickElement(checkBox);
        Log.info("click on checkBox of AcceptTermsAndConditions");
//        waitForElementVisible(saveBtn);
//        clickElement(saveBtn);
//        Log.info("click on saveBtn");
        Thread.sleep(3000);
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
        Thread.sleep(5000);
        Log.info("Clicked Save Button");
    }

    public void refreshPageAndLogout() throws InterruptedException {
        pageLoadWait();
        refreshWebPage();
        waitForElementVisible(logoutBtn);
        clickElement(logoutBtn);
        Log.info("Clicked on Logout");
        Thread.sleep(5000);
    }
//    public void logOutOption(){
//        try {
//            waitForElementVisible(logoutBtn);
//            clickElement(logoutBtn);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }

}
