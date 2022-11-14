package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import static common.Utility.*;

public class DoctorSignup_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//*[text()=' Sign Up '])[1]")
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

    @FindBy(xpath = "//*[contains(text(), 'Validate Email')]")
    public WebElement validateEmailPopUp;

    @FindBy(xpath = "//*[contains(text(), 'Thanks')]")
    public WebElement validateEmailMsg;


    @FindBy(xpath = "//span[text()='OK']")
    public WebElement okBtn;
    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement email;
    @FindBy(xpath = "//ion-label[text()='Should be a valid email address!']")
    public WebElement invalidEmail;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "//ion-label[text()='Should be at least 8 characters long!']")
    public WebElement errortextPassword;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBtn;

    @FindBy(xpath = "//input[@name='registrationNumber']")
    public WebElement registerationID;
    @FindBy(xpath = "//ion-label[text()=' Registration number is required ']")
    public WebElement requiredRegisterationID;
    @FindBy(xpath = "//ion-label[text()=' Registration number is invalid ']")
    public WebElement invalidRegisterationID;

      @FindBy(xpath = "//input[@name='fullName']")
    public WebElement fullName;
    @FindBy(xpath = "//ion-label[text()=' Full Name Required ']")
    public WebElement requiredFullName;
    @FindBy(xpath = "//ion-label[text()=' Full Name Invalid ']")
    public WebElement invalidFullName;

        @FindBy(xpath = "//input[@name='dateOfBirth']")
    public WebElement dateOfBirth;
     @FindBy(xpath = "//*[text()='May']")
    public WebElement month;
        @FindBy(xpath = "//*[text()='28']")
    public WebElement date;
        @FindBy(xpath = "//*[text()='1995']")
    public WebElement year;
        @FindBy(xpath = "//*[text()=' Set ']")
    public WebElement setBtn;
    @FindBy(xpath = "//*[text()=' Cancel ']")
    public WebElement cancel;
        @FindBy(xpath ="//ion-select[@name='gender']")
    public WebElement gender;
        @FindBy(xpath = "//div[text()='Male']")
    public WebElement male;
        @FindBy(xpath = "//div[text()='Female']")
    public WebElement female;
        @FindBy(xpath = "//div[text()='Other']")
    public WebElement other;
        @FindBy(xpath = "//span[text()='OK']")
    public WebElement genderOkBtn;
    //@FindBy(xpath = "//input[@name='contact' and @placeholder='Mobile Number']")    updated-Aaysha-04-11-2022

        @FindBy(xpath = "//input[@name='contact' and @placeholder='Contact Number']")
    public WebElement contactNumber;
    @FindBy(xpath = "//ion-label[text()=' Contact Number Required ']")
    public WebElement requiredContactNumber;
    @FindBy(xpath = "//ion-label[text()=' Contact Number is Invalid ']")
    public WebElement invalidContactNumber;

        @FindBy(xpath = "//ion-button[text()='Next']")
    public WebElement nextBtn;
        @FindBy(xpath = "//*[@aria-label='Specialization,  Specialization ']")
    public WebElement special;
    @FindBy(xpath = "//ion-label[text()=' Specialization Required ']")
    public WebElement requiredSpecial;


//    @FindBy(xpath = "//div[text()=' Aerospace Medicine ']")
//    public WebElement aerospaceMedicine;
//    @FindBy(xpath = "//div[text()=' Geriatrics ']")
//    public WebElement geriatrics;
//    @FindBy(xpath = "//div[text()=' Tropical Medicine ']")
//    public WebElement tropicalMedicine;

    @FindBy(xpath = "//div[text()=' Dentist ']")                                        //updated-Aaysha-04-11-2022
    public WebElement dentist;
    @FindBy(xpath = "//div[text()=' Cardiologist ']")                                 //updated-Aaysha-04-11-2022
    public WebElement cardiologist;

    //    okBtn
     @FindBy(xpath = "//input[@name='experience']")
    public WebElement experience;
    @FindBy(xpath = "//ion-label[text()=' Experience Required ']")
    public WebElement requiredExperience;
    @FindBy(xpath = "//ion-label[text()=' Experience Invalid ']")
    public WebElement invalidExperience;

        @FindBy(xpath = "//*[text()='Upload Certificate ']")
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
    @FindBy(xpath = "///ion-label[text()=' Address Required ']")
    public WebElement invalidAddressLine1;

     @FindBy(xpath = "//input[@name='address2' and @placeholder='Address Line 2']")
    public WebElement addressLine2;
     @FindBy(xpath = "//input[@name='city' and @placeholder='City']")
    public WebElement city;
    @FindBy(xpath = "//ion-label[text()=' City Required ']")
    public WebElement requiredCity;
    @FindBy(xpath = "//ion-label[text()=' City Invalid ']")
    public WebElement invalidCity;

     @FindBy(xpath = "//input[@name='state' and @placeholder='State/Province/Region']")
    public WebElement state;
    @FindBy(xpath = "//ion-label[text()=' State Required ']")
    public WebElement requiredState;
    @FindBy(xpath = "//ion-label[text()=' State Invalid ']")
    public WebElement invalidState;

     @FindBy(xpath = "//input[@name='zipcode' and @placeholder='Zip/Postal Code']")
    public WebElement pinCode;
    @FindBy(xpath = "//ion-label[text()=' Zip Code Required ']")
    public WebElement requiredPinCode;
    @FindBy(xpath = "//ion-label[text()=' Zip Code Invalid ']")
    public WebElement invalidPinCode;

        @FindBy(xpath = "//input[@name='country' and @placeholder='Country']")
    public WebElement country;
    @FindBy(xpath = "//ion-label[text()=' Country Required ']")
    public WebElement requiredCountry;
    @FindBy(xpath = "//ion-label[text()=' Country Invalid ']")
    public WebElement invalidCountry;

    @FindBy(xpath = "//*[text()='Availability']")
    public WebElement availability;
    @FindBy(xpath = "//*[contains(@aria-label,'Select Availability')]")
    public WebElement selectAvailability;
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
    @FindBy(xpath = "//*[@aria-label='Select Patient Slot Time,  Slots per Patient ']")
    public WebElement timeSlot;
    @FindBy(xpath = "//div[text()=' 15 minutes ']")
    public WebElement fifteenMinutes;
    @FindBy(xpath = "//div[text()=' 30 minutes ']")
    public WebElement thirtyMinutes;
    @FindBy(xpath = "//div[text()=' 45 minutes ']")
    public WebElement fortyFiveMinutes;
    @FindBy(xpath = "//div[text()=' 60 minutes ']")
    public WebElement sixtyMinutes;
    //    okBtn
    @FindBy(xpath = "//input[@name='from-0']")
    public WebElement from;
    //    setBtn
    @FindBy(xpath = "( //mbsc-wheel-item[@ng-reflect-index='10'])[1]")
    public WebElement selectHoursFrom;
    @FindBy(xpath = "(//mbsc-wheel-item[@ng-reflect-index='0'])[2]")
    public WebElement selectMinites;
    @FindBy(xpath = "//input[@name='to-0']")
    public WebElement to;
    //    setBtn
    @FindBy(xpath = "( //mbsc-wheel-item[@ng-reflect-index='4'])[1]")
    public WebElement selectHoursTo;
    @FindBy(xpath = "//mbsc-wheel-item[.='PM']")
    public WebElement pm;
    @FindBy(xpath = "//mbsc-wheel-item[.='AM']")
    public WebElement am;
    @FindBy(xpath = "//*[text()='Fee structure']")
    public WebElement feeStructure;
    @FindBy(xpath = "//*[@aria-label='Currency,  Payment Currency ']")
    public WebElement currency;
    @FindBy(xpath = "//div[text()='Indian Rupee (INR) ']")
    public WebElement indianRupee;
    //    okBtn
    @FindBy(xpath = "//ion-label[text()=' Consulting Fee Exceed Max Value ']")
    public  WebElement invalidConsultFee;
    @FindBy(xpath = "//input[@name='consultingFee']")
    public WebElement consultFee;
    @FindBy(xpath = "//ion-label[text()=' Follow Up Fee Exceed Max Value ']")
    public WebElement invalidfollowUpFee;
    @FindBy(xpath = "//input[@name='followUpFee']")
    public WebElement followUpFee;

    //      nextBtn
    @FindBy(xpath = "//span[text()='Terms and Conditions']")
    public WebElement termsAndConditions;
    @FindBy(xpath = "//ion-button[text()='OK']")
    public WebElement okBttn;
    @FindBy(xpath = "//div[@class='accept']//ion-checkbox[@aria-checked='false']")
    public WebElement checkBox;
    @FindBy(xpath = "//ion-button[text()='Save']")
    public WebElement saveBtn;
    @FindBy(xpath = "//ion-label[text()='Logout']")
    public WebElement logoutBtn;

    public DoctorSignup_PageObjects(){

        PageFactory.initElements(driver,this);
    }

//    public void doctorSignupExistsUser() throws InterruptedException {
//        Log.info("Checking the Doctor Signup functions");
//        pageLoadWait();
//        selectDoctorTabThroughSignupLink();
//        verifyWrongSignupCredentialsAndAlreadyRegisteredDoctor();
//    }

    public void selectDoctorTabThroughSignupLink() throws InterruptedException {
        pageLoadWait();
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
        Log.info("Selected Doctor Tab Through Signup Link");
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
        Log.info("Verified Wrong Signup Credentials And Already Registered Doctor");
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

    public void newDoctorSignup() throws InterruptedException {
        waitForElementVisible(emailText);
        emailText.clear();
        emailText.sendKeys(prop.getProperty("doctorSignupWrongMail"));
        clickElement(passwordText);
        waitForElementVisible(invalidEmailTextError);
        Assert.assertEquals(invalidEmailTextError.getText(), "Should be a valid email address!");
        clickElement(emailText);
        emailText.clear();
        emailText.sendKeys(prop.getProperty("doctorNewSignupCorrectMail"));
        passwordText.sendKeys(prop.getProperty("doctorSignupWrongPassword"));
        clickOnPasswordEyeIcon();
        clickElement(confirmPasswordText);
        waitForElementVisible(passwordErrortextSignup);
        Assert.assertEquals(passwordErrortextSignup.getText(), "Should be at least 8 characters long!");
        clickElement(passwordText);
        passwordText.clear();
        passwordText.sendKeys(prop.getProperty("doctorNewSignupCorrectPassword"));
        clickOnPasswordEyeIcon();
        confirmPasswordText.sendKeys(prop.getProperty("doctorSignupWrongConfirmPassword"));
        clickOnConfirmPasswordEyeIcon();
        waitForElementVisible(confirmPasswordTextError);
        Assert.assertEquals(confirmPasswordTextError.getText(), "Confirm password does not match");
        clickElement(confirmPasswordText);
        confirmPasswordText.clear();
        confirmPasswordText.sendKeys(prop.getProperty("doctorNewSignupCorrectConfirmPassword"));
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
        Log.info("New Doctor Signed up");
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

    public void enterDetailsForNewDoctorSignup() throws InterruptedException {
        doctorRegisterFormOne();
        doctorRegisterFormTwo();
        doctorRegisterFormThree();
    }

    public void doctorRegisterFormOne() throws InterruptedException {
        pageLoadWait();
        waitForElementVisible(registerationID);
        registerationID.sendKeys(prop.getProperty("registerationid"));
        Log.info("Enter registration id");
        waitForElementVisible(fullName);
        fullName.sendKeys(prop.getProperty("fullname"));
        Log.info("Enter fullName");
        waitForElementVisible(dateOfBirth);
        clickElement(dateOfBirth);
        waitForElementVisible(cancel);
        clickElement(cancel);
        Log.info("click on cancel ");
        Log.info("Click on dateOfBirth textbox & cancel");
        waitForElementVisible(dateOfBirth);
        clickElement(dateOfBirth);
        Log.info("Click on dateOfBirth  ");
//        scrollUpTo(month);
//        waitForElementVisible(month);
//        clickElement(month);
//        Thread.sleep(2000);
//        Log.info("Select month");
//        scrollUpTo(date);
//        waitForElementVisible(date);
//        clickElement(date);
//        Thread.sleep(2000);
//        Log.info("Select date");
//        scrollUpTo(year);
//        waitForElementVisible(year);
//        clickElement(year);
//        Thread.sleep(2000);
//        Log.info("Select year");
        dateOfBirth.sendKeys("09/06/1981");
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        Log.info("Click on DOB set Button");
        waitForElementVisible(gender);
        clickElement(gender);
        Log.info("Click on gender textbox");
//        waitForElementVisible(female);
//        clickElement(female);
        waitForElementVisible(male);
        clickElement(male);
        Log.info("Click on female radio Button");
        waitForElementVisible(genderOkBtn);
        clickElement(genderOkBtn);
        Log.info("Click on ok Button");
        Thread.sleep(2000);
        waitForElementVisible(contactNumber);
        contactNumber.sendKeys(prop.getProperty("contactnum"));
        Log.info("Enter contact number");
        Thread.sleep(5000);
        waitForElementVisible(nextBtn);
        clickElement(nextBtn);
        Log.info("Click on ok nextBtn");
        Log.info("Filled Doctor Registration Form One");
    }

    public void doctorRegisterFormTwo() throws InterruptedException {
        pageLoadWait();
        waitForElementVisible(special);
        clickElement(special);
        Log.info("Click on specialization textbox");
        waitForElementVisible(cardiologist);
        clickElement(cardiologist);
        Thread.sleep(2000);
        waitForElementVisible(dentist);
        clickElement(dentist);
        Log.info("Click on specialization dentist & dentist");
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Thread.sleep(2000);
        Log.info("Click on ok button");
        waitForElementVisible(experience);
        experience.sendKeys(prop.getProperty("experience"));
        Log.info("Enter experience ");
        waitForElementVisible(certificate);
//        clickElement(certificate);
//        Thread.sleep(5000);
        certificate.sendKeys("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\certificate.pdf");
        Log.info("click upload certificate");
        waitForElementVisible(nextBtn);
        if(nextBtn.isEnabled()) {
            clickElement(nextBtn);
        }
        Log.info("clicked Next Button");
        Log.info("Filled Doctor Registration Form Two");
    }

    public void doctorRegisterFormThree() throws InterruptedException {
        pageLoadWait();
        waitForElementVisible(clinicName);
        clinicName.sendKeys(prop.getProperty("clinicname"));
        Log.info("Enter clinic name ");
        waitForElementVisible(addressLine1);
        addressLine1.sendKeys(prop.getProperty("address1"));
        Log.info("Enter address1 ");
        waitForElementVisible(addressLine2);
        addressLine2.sendKeys(prop.getProperty("address2"));
        Log.info("Enter address2 ");
        waitForElementVisible(city);
        city.sendKeys(prop.getProperty("city"));
        Log.info("Enter city ");
        scrollUpTo(nextBtn);
        waitForElementVisible(state);
        state.sendKeys(prop.getProperty("state"));
        Log.info("Enter state ");
        waitForElementVisible(pinCode);
        pinCode.sendKeys(prop.getProperty("pincode"));
        Log.info("Enter pincode ");
        waitForElementVisible(country);
        country.sendKeys(prop.getProperty("country"));
        Log.info("Enter country ");

        waitForElementVisible(availability);
        clickElement(availability);
        Log.info("click availability tab");
        waitForElementVisible(selectAvailability);
        clickElement(selectAvailability);
        Log.info("click selectAvailability");
        waitForElementVisible(monday);
        clickElement(monday);
        Log.info("click monday");
        waitForElementVisible(tuesday);
        clickElement(tuesday);
        Log.info("click tuesday");
        waitForElementVisible(wednesday);
        clickElement(wednesday);
        Log.info("click wednesday");
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Log.info("click wednesday");
        //   selectday();
        Thread.sleep(3000);

        waitForElementVisible(timeSlot);
        clickElement(timeSlot);
        Log.info("click on from tab");
        waitForElementVisible(thirtyMinutes);
        clickElement(thirtyMinutes);
        Thread.sleep(2000);
        Log.info("Select 30 min");
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Thread.sleep(2000);
        Log.info("click on ok btn");
        waitForElementVisible(from);
        clickElement(from);
//        from.sendKeys("10:30 AM");
//        waitForElementVisible();
//        clickElement();
//        waitForElementVisible(scrollOne);
//        clickElement(scrollOne);

        scrollUpTo(selectHoursFrom);
        waitForElementVisible(selectHoursFrom);
        clickElement(selectHoursFrom);
        Thread.sleep(2000);
//        waitForElementVisible(scrollTwo);
//        clickElement(scrollTwo);
        waitForElementVisible(selectMinites);
        clickElement(selectMinites);
        Thread.sleep(2000);
        Log.info("click on from and select time");
        waitForElementVisible(am);
        clickElement(am);
        Log.info("select am ");
        Thread.sleep(2000);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        Log.info("click on setBtn ");
        waitForElementVisible(to);
//        to.sendKeys("03:00 PM");
        clickElement(to);
        Thread.sleep(2000);
        waitForElementVisible(selectHoursTo);
        scrollUpTo(selectHoursTo);
        clickElement(selectHoursTo);
        Thread.sleep(2000);
        waitForElementVisible(selectMinites);
        clickElement(selectMinites);
        Thread.sleep(2000);
        Log.info("click on to and select time ");
        waitForElementVisible(pm);
        clickElement(pm);
        Log.info("select pm");
        Thread.sleep(2000);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        Log.info("click on setBtn ");
        waitForElementVisible(feeStructure);
        clickElement(feeStructure);
        Thread.sleep(2000);
        Log.info("click on feeStructure ");
        waitForElementVisible(currency);
        clickElement(currency);
        Thread.sleep(2000);
        Log.info("click on currency ");
//        scrollUsingJavaScriptExecutor(indianRupee);
        waitForElementVisible(indianRupee);
        clickElement(indianRupee);
        Thread.sleep(2000);
        Log.info("click on indianRupee ");
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Log.info("click on okBt");
        waitForElementVisible(consultFee);
        consultFee.sendKeys(prop.getProperty("consultFee"));
        Log.info("send consultFee");
        waitForElementVisible(followUpFee);
        followUpFee.sendKeys(prop.getProperty("followUpFee"));
        Log.info("send followUpFee");
        waitForElementVisible(nextBtn);
        clickElement(nextBtn);
        Log.info("click on nextBtn");
        Thread.sleep(2000);
//        waitForElementVisible(termsAndConditions);
//        clickElement(termsAndConditions);
//        Thread.sleep(4000);
//        driver.navigate().back();
//        Log.info("click on termsAndConditions");
//        waitForElementVisible(okBttn);
//        clickElement(okBttn);
//        Log.info("click on okBttn");
        waitForElementVisible(checkBox);
        clickElement(checkBox);
        Log.info("click on checkBox");
        waitForElementVisible(saveBtn);
        clickElement(saveBtn);
        Log.info("click on saveBtn");
        Thread.sleep(3000);
        waitForElementVisible(logoutBtn);
        clickElement(logoutBtn);
        Log.info("click on logout");
    }

//    public void verifyLoginWithWrongCredentialsAndCheckExistsDoctor() throws InterruptedException {
//        Log.info("Checking the sign and login");
////        waitForElementVisible(loginBtn);
////        clickElement(loginBtn);
////        Log.info("Click login btn");
//        waitForElementVisible(loginLink);
//        clickElement(loginLink);
//        Log.info("Click login link");
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
//
//        waitForElementVisible(email);
//        emailText.sendKeys(prop.getProperty("doctorSignupWrongMail"));
//        clickElement(password);
//        Assert.assertEquals(invalidEmailTextError.getText(), "Should be a valid email address!");
//        clickElement(email);
//        email.clear();
//
//        waitForElementVisible(email);
//        email.sendKeys(prop.getProperty("email1"));
//        Log.info("Send email");
//
//        waitForElementVisible(passwordText);
//        passwordText.sendKeys(prop.getProperty("doctorSignupWrongPassword"));
//        clickOnPasswordEyeIcon();
//        clickElement(emailText);
//        Assert.assertEquals(passwordErrortextSignup.getText(), "Should be at least 8 characters long!");
//        clickElement(passwordText);
//        passwordText.clear();
//
//        waitForElementVisible(password);
//        password.sendKeys(prop.getProperty("password1"));
//        Log.info("Send password");
//        Thread.sleep(5000);
//        waitForElementVisible(submitBtn);
//        clickElement(submitBtn);
//        Log.info("Click on login for submit");
////        waitForElementVisible(logoutBtn);
////        clickElement(logoutBtn);
////        Log.info("Click on logout Option");
//    }
//
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
//
//    public void signupWithValidCredentialsAndVerifyAndLogin() throws InterruptedException {
//        Log.info("Signup check");
//        waitForElementVisible(loginBtn);
//        clickElement(loginBtn);
//        waitForElementVisible(signupLink);
//        clickElement(signupLink);
//        Log.info("Click signup link");
//        waitForElementVisible(doctorLink);
//        clickElement(doctorLink);
//        Log.info("Click doctor link");
//        waitForElementVisible(emailText);
//        emailText.sendKeys(prop.getProperty("doctorSignupNewMail"));
//        Log.info("Send new Email Id");
//        waitForElementVisible(passwordText);
//        passwordText.sendKeys(prop.getProperty("doctorSignupNewPassword"));
//        Log.info("Send new password");
//        waitForElementVisible(confirmPasswordText);
//        confirmPasswordText.sendKeys(prop.getProperty("doctorSignupNewPassword"));
//        Log.info("Send  new confirm password");
//        waitForElementVisible(registerBtn);
//        clickElement(registerBtn);
//        Log.info("Click on register button");
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
//        Log.info("Click on login for submit");
//
//    }


}
