package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import java.awt.*;
import java.awt.event.KeyEvent;

import static common.Utility.*;

public class DoctorSignup_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//*[text()=' Sign Up '])[1]")
    public WebElement signupLink;

    @FindBy(xpath = "(//ion-segment-button)[2]")
    public WebElement doctorLink;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    public WebElement confirmPasswordText;

    @FindBy(xpath = "//ion-button[text()=' Register ']")
    public WebElement registerBtn;

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

    @FindBy(xpath = "//input[@name='registrationNumber']")
    public WebElement registerationID;

    @FindBy(xpath = "//input[@name='fullName']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@name='dateOfBirth']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//*[text()='January']")
    public WebElement month;

    @FindBy(xpath = "//*[text()='03']")
    public WebElement date;

    @FindBy(xpath = "//*[text()='2001']")
    public WebElement year;

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

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement genderOkBtn;

    @FindBy(xpath = "//input[@name='contact' and @placeholder='Mobile Number']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//ion-button[text()='Next']")
    public WebElement nextBtn;

    @FindBy(xpath = "//*[@aria-label='Specialization,  Specialization ']")
    public WebElement special;

    @FindBy(xpath = "//div[text()=' Aerospace Medicine ']")
    public WebElement aerospaceMedicine;

    @FindBy(xpath = "//div[text()=' Geriatrics ']")
    public WebElement geriatrics;

    @FindBy(xpath = "//div[text()=' Tropical Medicine ']")
    public WebElement tropicalMedicine;

//    okBtn

    @FindBy(xpath = "//input[@name='experience']")
    public WebElement experience;

    @FindBy(xpath = "//input[@name='cert']")
    public WebElement certificate;

//    nextBtn

    @FindBy(xpath = "//input[@name='clinicName']")
    public WebElement clinicName;

    @FindBy(xpath = "//input[@name='address1' and @placeholder='Address Line 1']")
    public WebElement addressLine1;

    @FindBy(xpath = "//input[@name='address2' and @placeholder='Address Line 2']")
    public WebElement addressLine2;

    @FindBy(xpath = "//input[@name='city' and @placeholder='City']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state' and @placeholder='State/Province/Region']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='zipcode' and @placeholder='Zip/Postal Code']")
    public WebElement pinCode;

    @FindBy(xpath = "//input[@name='country' and @placeholder='Country']")
    public WebElement country;

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

    @FindBy(xpath = "//input[@name='to-0']")
    public WebElement to;

//    setBtn

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

    @FindBy(xpath = "//input[@name='consultingFee']")
    public WebElement consultFee;

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

    public void signupOption() throws InterruptedException, AWTException {
        waitForElementVisible(loginBtn);
        clickElement(loginBtn);
        waitForElementVisible(signupLink);
        clickElement(signupLink);
        waitForElementVisible(doctorLink);
        clickElement(doctorLink);
        waitForElementVisible(emailText);
        emailText.sendKeys(prop.getProperty("doctorSignupMail"));
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("doctorSignupPassword"));
        waitForElementVisible(confirmPasswordText);
        confirmPasswordText.sendKeys(prop.getProperty("doctorSignupConfirmPassword"));
        waitForElementVisible(registerBtn);
        clickElement(registerBtn);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Thread.sleep(8000);
        waitForElementVisible(loginLink);
        clickElement(loginLink);
        waitForElementVisible(email);
        email.sendKeys(prop.getProperty("doctorSignupMail"));
        waitForElementVisible(password);
        password.sendKeys(prop.getProperty("doctorSignupPassword"));
        waitForElementVisible(submitBtn);
        clickElement(submitBtn);
        waitForElementVisible(registerationID);
        registerationID.sendKeys(prop.getProperty("doctorSignupRegistrationID"));
        waitForElementVisible(fullName);
        fullName.sendKeys(prop.getProperty("doctorSignupFullname"));
        waitForElementVisible(dateOfBirth);
        clickElement(dateOfBirth);
        scrollUsingJavaScriptExecutor(month);
        waitForElementVisible(month);
        clickElement(month);
        scrollUsingJavaScriptExecutor(date);
        waitForElementVisible(date);
        clickElement(date);
        scrollUsingJavaScriptExecutor(year);
        waitForElementVisible(year);
        clickElement(year);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        waitForElementVisible(gender);
        clickElement(gender);
        waitForElementVisible(male);
        clickElement(male);
        scrollUsingJavaScriptExecutor(phoneNumber);
        waitForElementVisible(phoneNumber);
        phoneNumber.sendKeys(prop.getProperty("doctorSignupPhoneNumber"));
        waitForElementVisible(nextBtn);
        clickElement(nextBtn);
        waitForElementVisible(special);
        clickElement(special);
        waitForElementVisible(aerospaceMedicine);
        clickElement(aerospaceMedicine);
        waitForElementVisible(geriatrics);
        clickElement(geriatrics);
        waitForElementVisible(tropicalMedicine);
        clickElement(tropicalMedicine);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        waitForElementVisible(experience);
        experience.sendKeys(prop.getProperty("doctorSignupExperience"));
        waitForElementVisible(certificate);
        certificate.sendKeys("C:\\Users\\Manish Chowke\\IdeaProjects\\Automation_Wellbeing\\src\\test\\resources\\files\\patient.jpg");
        waitForElementVisible(nextBtn);
        if(nextBtn.isEnabled()) {
            clickElement(nextBtn);
        }
        waitForElementVisible(clinicName);
        clinicName.sendKeys(prop.getProperty("doctorSignupClinicName"));
        waitForElementVisible(addressLine1);
        addressLine1.sendKeys(prop.getProperty("doctorSignupAddressLine1"));
        waitForElementVisible(addressLine2);
        addressLine2.sendKeys(prop.getProperty("doctorSignupAddressLine2"));
        waitForElementVisible(city);
        city.sendKeys(prop.getProperty("doctorSignupCity"));
        waitForElementVisible(state);
        state.sendKeys(prop.getProperty("doctorSignupState"));
        scrollUsingJavaScriptExecutor(pinCode);
        waitForElementVisible(pinCode);
        pinCode.sendKeys(prop.getProperty("doctorSignupPinCode"));
        waitForElementVisible(country);
        country.sendKeys(prop.getProperty("doctorSignupCountry"));
        waitForElementVisible(availability);
        clickElement(availability);
        waitForElementVisible(selectAvailability);
        clickElement(selectAvailability);
        waitForElementVisible(monday);
        clickElement(monday);
        waitForElementVisible(tuesday);
        clickElement(tuesday);
        waitForElementVisible(wednesday);
        clickElement(wednesday);
        waitForElementVisible(thursday);
        clickElement(thursday);
        waitForElementVisible(friday);
        clickElement(friday);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        waitForElementVisible(timeSlot);
        clickElement(timeSlot);
        waitForElementVisible(thirtyMinutes);
        clickElement(thirtyMinutes);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Robot robot = new Robot();
        waitForElementVisible(from);
        from.sendKeys(prop.getProperty("doctorSignupFrom"));
        robot.keyPress(KeyEvent.VK_ENTER);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        waitForElementVisible(to);
        to.sendKeys(prop.getProperty("doctorSignupTo"));
        robot.keyPress(KeyEvent.VK_ENTER);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        waitForElementVisible(to);
        clickElement(to);
        waitForElementVisible(pm);
        clickElement(pm);
        waitForElementVisible(setBtn);
        clickElement(setBtn);
        waitForElementVisible(feeStructure);
        clickElement(feeStructure);
        waitForElementVisible(currency);
        clickElement(currency);
        waitForElementVisible(indianRupee);
        clickElement(indianRupee);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        waitForElementVisible(consultFee);
        consultFee.sendKeys(prop.getProperty("doctorSignupConsultFee"));
        waitForElementVisible(followUpFee);
        followUpFee.sendKeys(prop.getProperty("doctorSignupFollowupFee"));
        waitForElementVisible(nextBtn);
        clickElement(nextBtn);
        waitForElementVisible(termsAndConditions);
        clickElement(termsAndConditions);
        waitForElementVisible(okBttn);
        clickElement(okBttn);
        waitForElementVisible(checkBox);
        clickElement(checkBox);
        waitForElementVisible(saveBtn);
        clickElement(saveBtn);
        Thread.sleep(1000);
        waitForElementVisible(logoutBtn);
        clickElement(logoutBtn);
    }




}
