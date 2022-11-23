package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static common.Utility.*;
import static common.Utility.pressTab;

public class GaneshPatientProfile_PageObjects extends BasePage {
    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;

//    @FindBy(xpath = "(//ion-label[text()='Profile'])[2]")
    @FindBy(xpath = "//ion-label[text()='Profile']")
    public WebElement profile;

    @FindBy(xpath = "//ion-label[text()=' Change password ']")
    public WebElement changePassword;

    @FindBy(xpath = "//input[@name='cPass']")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@name='nPass']")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@name='coPass']")
    public WebElement confirmPassword;

    @FindBy(xpath = "(//ion-icon[@name='eye'])[2]")
    public WebElement eyeOne;

    @FindBy(xpath = "(//ion-icon[@name='eye'])[3]")
    public WebElement eyeTwo;

    @FindBy(xpath = "(//ion-icon[@name='eye'])[4]")
    public WebElement eyeThree;

    @FindBy(xpath = "//ion-button[text()=' Save ']")
    public WebElement saveBtn;

    @FindBy(xpath = "//ion-button[text()='Cancel']")
    public WebElement cancelBtn;

    //    Not entering anything in password TF
    @FindBy(xpath = "//ion-label[text()='Current password required']")
    public WebElement currentPassRequired;

    @FindBy(xpath = "//ion-label[text()='New password required']")
    public WebElement newPassRequired;

    @FindBy(xpath = "//ion-label[text()='Password confirmation required']")
    public WebElement cnfmPassRequired;

    //    Entering the wrong Current password
    @FindBy(xpath = "//ion-label[text()='Password is incorrect']")
    public WebElement passNotCorrect;

    //    Entering the Current and New password Same
    @FindBy(xpath = "//ion-label[text()='Current and new password cannot be same']")
    public WebElement currentAndNewPass;

    //    Entering New password and Confirm password different
    @FindBy(xpath = "//ion-label[text()='Passwords does not match']")
    public WebElement passNotMatch;

    //    Entering password less than 8 characters
    @FindBy(xpath = "//ion-label[text()='Password has to be at least 8 characters long']")
    public WebElement passlessChar;

    //    Entering the valid details
    @FindBy(xpath = "//h2[text()='Success']")
    public WebElement successPass;

    @FindBy(xpath = "//div[text()='Password updated successfully.']")
    public WebElement passUpdated;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement okBtn;

    @FindBy(xpath = "//label[text()='Set profile Picture']")
    public WebElement setProfile;

    @FindBy(xpath = "//ion-label[text()='Remove profile picture ']")
    public WebElement removeProfile;

    @FindBy(xpath = "//h2[text()='Remove']")
    public WebElement removePopupWindow;

    @FindBy(xpath = "//div[text()='Do you want to remove Profile Pic?']")
    public WebElement removePopupMsg;

    @FindBy(xpath = "//span[text()='No']")
    public WebElement noBtn;

    @FindBy(xpath = "//span[text()='Yes']")
    public WebElement yesBtn;

    @FindBy(xpath = "//input[@name=\"fName\"]")
    public WebElement fullName;

    @FindBy(xpath = "//ion-label[text()=' Full name required, cannot be empty ']")
    public WebElement fullNameRequired;

    @FindBy(xpath = "//ion-label[text()='Full name is invalid ']")
    public WebElement fullNameInvalid;

    @FindBy(xpath = "//input[@name=\"dateOfBirth\"]")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//ion-label[text()=' Date of Birth Required ']")
    public WebElement dobRequiredError;

    @FindBy(xpath = "//*[text()=' Cancel ']")
    public WebElement cancelDOBBtn;

    @FindBy(xpath = "//*[text()=' Set ']")
    public WebElement setDOBBtn;

    @FindBy(xpath = "//input[@name='contact']")
    public WebElement contact;

    @FindBy(xpath = "//ion-label[text()=' Contact Number Required']")
    public WebElement contactNumberRequiredError;

    @FindBy(xpath = "//ion-label[text()='Contact Number is Invalid']")
    public WebElement contactNumberInvalidError;

    @FindBy(xpath = "//input[@name='address1']")
    public WebElement addressLineOneInput;

    @FindBy(xpath = "//ion-label[text()='Please provide an address']")
    public WebElement addressLineOneProvideError;

    @FindBy(xpath = "//input[@name='address2']")
    public WebElement addressLineTwoInput;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityInput;

    @FindBy(xpath = "//ion-label[text()='City cannot be empty']")
    public WebElement cityEmptyError;

//    @FindBy(xpath = "//ion-label[text()='Incorrect format']")
//    public WebElement cityIncorrectFormatError;

    @FindBy(xpath = "//ion-label[text()='Incorrect format']")
    public WebElement cityIncorrectFormatError;

    @FindBy(xpath = "//input[@name='country']")
    public WebElement countryInput;

    @FindBy(xpath = "//ion-label[text()='Country cannot be empty']")
    public WebElement countryEmptyError;

//    @FindBy(xpath = "(//ion-label[text()='Incorrect format'])[2]")
//    public WebElement countryIncorrectFormatError;

    @FindBy(xpath = "//ion-label[text()='Incorrect format']")
    public WebElement countryIncorrectFormatError;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateInput;

    @FindBy(xpath = "//ion-label[text()='State cannot be empty']")
    public WebElement stateEmptyError;

//    @FindBy(xpath = "(//ion-label[text()='Incorrect format'])[3]")
//    public WebElement stateIncorrectFormatError;

    @FindBy(xpath = "//ion-label[text()='Incorrect format']")
    public WebElement stateIncorrectFormatError;

    @FindBy(xpath = "//input[@name='zipcode']")
    public WebElement zipCodeInput;

    @FindBy(xpath = "//ion-label[text()=' Zip/Postal code cannot be empty ']")
    public WebElement zipCodeEmptyError;

    @FindBy(xpath = "//ion-label[text()=' Zip Code Invalid ']")
    public WebElement zipCodeInvalidError;

    @FindBy(xpath = "//ion-button[contains(text(), 'Save')]")
    public WebElement saveBTN;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutBTN;




    public GaneshPatientProfile_PageObjects(){
        PageFactory.initElements(driver,this);
    }

    public void loadWellbeingURL() {
        loadUrl(prop.getProperty("WellbeingURL"));
        pageLoadWait();
        Log.info("Wellbeing URL is loaded");
    }

    public void loginOption() {
        Log.info("Checking the Login and logout");
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        Log.info("Click on login button");
        waitForElementVisible(emailText);
//        emailText.sendKeys(prop.getProperty("patientNewSignupCorrectMail"));
        emailText.sendKeys(prop.getProperty("patientNewSignupCorrectMail"));
        Log.info("Click on email");
        waitForElementVisible(passwordText);
        passwordText.sendKeys(prop.getProperty("patientNewSignupCorrectPassword"));
//        passwordText.sendKeys("P@ssw0rd!002");
        Log.info("Click on password");
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        Log.info("Click on submit ");
    }

    public void clickOnProfile() throws InterruptedException {
        Thread.sleep(3000);
        waitForElementVisible(profile);
        clickElement(profile);
        Thread.sleep(2000);
        Log.info("Clicked On Profile");
    }

    public void verifyRequiredAndInvalidChangePasswordForPatientProfile() throws InterruptedException {
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(currentPassword);
        clickElement(currentPassword);
        waitForElementVisible(newPassword);
        clickElement(newPassword);
        waitForElementVisible(currentPassRequired);
        String currentPassReqMessage = "Current password required";
        Assert.assertEquals(currentPassRequired.getText(), currentPassReqMessage);
        Thread.sleep(2000);
        waitForElementVisible(confirmPassword);
        clickElement(confirmPassword);
        waitForElementVisible(newPassRequired);
        String newPassReqMessage = "New password required";
        Assert.assertEquals(newPassRequired.getText(),newPassReqMessage);
        Thread.sleep(2000);
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(cnfmPassRequired);
        String cnfmPassReqMessage = "Password confirmation required";
        Assert.assertEquals(cnfmPassRequired.getText(),cnfmPassReqMessage);
        Thread.sleep(2000);
        waitForElementVisible(cancelBtn);
        clickElement(cancelBtn);
        Log.info("Verified Required And Invalid Error Messages For Patient Profile Change Password");
    }

    public void verifyInvalidCurrentPasswordOption() throws InterruptedException {
        Log.info("Typing an invalid Current Password");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(currentPassword);
//        currentPassword.sendKeys("P@ssw0rd!002");
        currentPassword.sendKeys("P@ssw0rd!002");
        waitForElementVisible(eyeOne);
        clickElement(eyeOne);
        waitForElementVisible(eyeOne);
        clickElement(eyeOne);
        waitForElementVisible(newPassword);
//        newPassword.sendKeys("P@ssw0rd!00");
        newPassword.sendKeys("pp1234pp1234");
        waitForElementVisible(eyeTwo);
        clickElement(eyeTwo);
        waitForElementVisible(eyeTwo);
        clickElement(eyeTwo);
        waitForElementVisible(confirmPassword);
//        confirmPassword.sendKeys("P@ssw0rd!00");
        confirmPassword.sendKeys("pp1234pp1234");
        waitForElementVisible(eyeThree);
        clickElement(eyeThree);
        waitForElementVisible(eyeThree);
        clickElement(eyeThree);
        waitForElementVisible(saveBtn);
        clickElement(saveBtn);
        waitForElementVisible(passNotCorrect);
        String passNotCorrectMessage = "Password is incorrect";
        Assert.assertEquals(passNotCorrect.getText(), passNotCorrectMessage);
        Thread.sleep(2000);
        waitForElementVisible(cancelBtn);
        clickElement(cancelBtn);
        Log.info("Verified Invalid Current Password Error Messages For Patient Profile Change Password");
    }

    public void verifyCurrentAndNewPasswordSame() throws InterruptedException {
        Log.info("Typing an Current and New Password Same");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(currentPassword);
        currentPassword.sendKeys("P@ssw0rd!001");
        waitForElementVisible(newPassword);
        newPassword.sendKeys("P@ssw0rd!001");
        waitForElementVisible(currentAndNewPass);
        String samePass = "Current and new password cannot be same";
        Assert.assertEquals(currentAndNewPass.getText(),samePass);
        Thread.sleep(2000);
        waitForElementVisible(cancelBtn);
        clickElement(cancelBtn);
        Log.info("Verified Current And New Password Same Error Messages For Patient Profile Change Password");
    }

    public void verifyNewAndConfirmPasswordDifferent() throws InterruptedException {
        Log.info("Typing an New and Confirm Password Different");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(currentPassword);
        currentPassword.sendKeys("P@ssw0rd!001");
        waitForElementVisible(newPassword);
        newPassword.sendKeys("P@ssw0rd!000");
        waitForElementVisible(confirmPassword);
        confirmPassword.sendKeys("P@ssw0rd!002");
        waitForElementVisible(passNotMatch);
        String noMatchMessage = "Passwords does not match";
        Assert.assertEquals(passNotMatch.getText(),noMatchMessage);
        Thread.sleep(2000);
        waitForElementVisible(cancelBtn);
        clickElement(cancelBtn);
        Log.info("Verified New And Confirm Password Different Error Messages For Patient Profile Change Password");
    }

    public void verifyLessThenEightCharPassword() throws InterruptedException {
        Log.info("Typing a password less than 8 character");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(newPassword);
        newPassword.sendKeys("P@ss");
        waitForElementVisible(passlessChar);
        String lessCharacter = "Password has to be at least 8 characters long";
        Assert.assertEquals(passlessChar.getText(),lessCharacter);
        Thread.sleep(2000);
        waitForElementVisible(cancelBtn);
        clickElement(cancelBtn);
        Log.info("Verified Less Then Eight Char Password Error Messages For Patient Profile Change Password");
    }

    public void validChangePassword() throws InterruptedException {
        Log.info("Typing a Valid Passwords in Three Text Fields");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(currentPassword);
        currentPassword.sendKeys("P@ssw0rd!001");
        waitForElementVisible(newPassword);
        newPassword.sendKeys("P@ssw0rd!002");
        waitForElementVisible(confirmPassword);
        confirmPassword.sendKeys("P@ssw0rd!002");
        waitForElementVisible(saveBtn);
        clickElement(saveBtn);
        waitForElementVisible(successPass);
        String successPassMessage = "Success";
        Assert.assertEquals(successPass.getText(),successPassMessage);
        Thread.sleep(2000);
        waitForElementVisible(passUpdated);
        String updatedMessage = "Password updated successfully.";
        Assert.assertEquals(passUpdated.getText(),updatedMessage);
        Thread.sleep(2000);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Log.info("Entered Valid Password for Patient Profile Change Password");
    }

    public void tryToUploadExcelFileForSetProfilePicture() throws AWTException, InterruptedException {
        Log.info("Uploading Excel Format");
        StringSelection stringSelectionExcel = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\Excel-PrasadTesting.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionExcel,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        pasteText();
        Thread.sleep(2000);
        pressEnter();
        Thread.sleep(2000);
    }

    public void tryToUploadZipFileForSetProfilePicture() throws InterruptedException, AWTException {
        Log.info("Uploading Zip Format");
        StringSelection stringSelectionZip = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\Zip-PrasadTesting.zip");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionZip,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        pasteText();
        Thread.sleep(2000);
        pressEnter();
        Thread.sleep(2000);
    }

    public void tryToUploadPDFFileForSetProfilePicture() throws InterruptedException, AWTException {
        Log.info("Uploading Pdf Format");
        StringSelection stringSelectionPdf = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\PDF-PrasadTesting.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionPdf,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        pasteText();
        Thread.sleep(2000);
        pressEnter();
        Thread.sleep(2000);
    }

    public void tryToUploadMSWordFileForSetProfilePicture() throws InterruptedException, AWTException {
        Log.info("Uploading Word Format");
        StringSelection stringSelectionWord = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\MS_Word-PrasadTesting.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionWord,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        pasteText();
        Thread.sleep(2000);
        pressEnter();
        Thread.sleep(2000);
    }

    public void tryToUploadWEBMFileForSetProfilePicture() throws InterruptedException, AWTException {
        Log.info("Uploading Video Format");
        StringSelection stringSelectionWebm = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\WEBM-PrasadTesting.webm");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionWebm,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        pasteText();
        Thread.sleep(2000);
        pressEnter();
        Thread.sleep(2000);
    }

    public void tryToUploadJPGFileForSetProfilePicture() throws InterruptedException, AWTException {
        Log.info("Uploading Jpg Format");
        StringSelection stringSelectionJpg = new StringSelection("D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\files\\JPG-PrasadTesting.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectionJpg,null);
        waitForElementVisible(setProfile);
        clickElement(setProfile);
        Thread.sleep(2000);
        pasteText();
        Thread.sleep(2000);
        pressEnter();
        Thread.sleep(2000);
        waitForElementVisible(removeProfile);
        clickElement(removeProfile);
        waitForElementVisible(removePopupWindow);
        String remove = "Remove";
        Assert.assertEquals(removePopupWindow.getText(),remove);        //Asserting the Remove word
        waitForElementVisible(removePopupMsg);
        String message = "Do you want to remove Profile Pic?";
        Assert.assertEquals(removePopupMsg.getText(),message);             //Asserting the Message
        Thread.sleep(2000);
        waitForElementVisible(noBtn);
        clickElement(noBtn);
        Thread.sleep(2000);
        waitForElementVisible(removeProfile);
        clickElement(removeProfile);
        waitForElementVisible(yesBtn);
        clickElement(yesBtn);
    }

    public void scrollUpToZipCode() throws InterruptedException {
//        waitForElementVisible(zipCodeInput);
        scrollUpTo(zipCodeInput);
        Thread.sleep(2000);
    }

    public void verifyAndEnterValidFullNameForPatientProfile() throws InterruptedException, AWTException {
        waitForElementVisible(fullName);
        clickElement(fullName);

        selectAllText();
        cutText();
        clickElement(fullName);
        Thread.sleep(2000);
        waitForElementVisible(fullNameRequired);
        String fullNameRequiredErrorMsg = fullNameRequired.getText();
        Assert.assertEquals(fullNameRequired.getText(), fullNameRequiredErrorMsg);
        Log.info("Asserted fullNameRequiredErrorMsg");

        fullName.clear();
        fullName.sendKeys("123");
        Thread.sleep(2000);
        waitForElementVisible(fullNameInvalid);
        String fullNameInvalidErrorMsg = fullNameInvalid.getText();
        Assert.assertEquals(fullNameInvalid.getText(), fullNameInvalidErrorMsg);
        Log.info("Asserted fullNameInvalidErrorMsg");

        fullName.clear();
        fullName.click();
        pasteText();
        Log.info("Entered Valid Full Name For Patient Profile");
        Thread.sleep(2000);
    }

    public void verifyAndEnterValidDOBForPatientProfile() throws InterruptedException, AWTException {
        waitForElementVisible(dateOfBirth);
        clickElement(dateOfBirth);

        selectAllText();
        cutText();

        pressTab(dateOfBirth);
        Thread.sleep(2000);
        waitForElementVisible(dobRequiredError);
        String dobRequiredErrorMsg = dobRequiredError.getText();
        Assert.assertEquals(dobRequiredError.getText(), dobRequiredErrorMsg);
        Log.info("Asserted dobRequiredErrorMsg");

        clickElement(dateOfBirth);
        pasteText();
        Thread.sleep(2000);

        pressTab(dateOfBirth);
        waitForElementVisible(cancelDOBBtn);
        clickElement(cancelDOBBtn);
        clickElement(dateOfBirth);
        waitForElementVisible(setDOBBtn);
        clickElement(setDOBBtn);
        Log.info("Entered Valid Date OF Birth For Patient Profile");
        Thread.sleep(2000);
    }

    public void verifyAndEnterValidContactNumberForPatientProfile() throws InterruptedException, AWTException {
        waitForElementVisible(contact);
        clickElement(contact);

        selectAllText();
        cutText();

        clickElement(contact);
        Thread.sleep(2000);
        waitForElementVisible(contactNumberRequiredError);
        String contactNumberRequiredErrorMsg = contactNumberRequiredError.getText();
        Assert.assertEquals(contactNumberRequiredError.getText(), contactNumberRequiredErrorMsg);
        Log.info("Asserted contactNumberRequiredErrorMsg");
        contact.sendKeys("123");
        Thread.sleep(2000);
        waitForElementVisible(contactNumberInvalidError);
        String contactNumberInvalidErrorMsg = contactNumberInvalidError.getText();
        Assert.assertEquals(contactNumberInvalidError.getText(), contactNumberInvalidErrorMsg);
        Log.info("Asserted contactNumberInvalidErrorErrorMsg");

        contact.clear();
        clickElement(contact);
        pasteText();
        Thread.sleep(2000);
        Log.info("Entered Valid Contact Number For Patient Profile");
    }

    public void verifyAndEnterValidAddressForPatientProfile() throws InterruptedException, AWTException {
        waitForElementVisible(addressLineOneInput);
        clickElement(addressLineOneInput);

        selectAllText();
        cutText();
        pressTab(addressLineOneInput);

        clickElement(addressLineOneInput);
        Thread.sleep(2000);
        waitForElementVisible(addressLineOneProvideError);
        String addressLineOneProvideErrorMsg = addressLineOneProvideError.getText();
        Assert.assertEquals(addressLineOneProvideError.getText(), addressLineOneProvideErrorMsg);
        Log.info("Asserted addressLineOneProvideErrorMsg");

        clickElement(addressLineOneInput);
        pasteText();
        Thread.sleep(2000);
        Log.info("Entered Valid Address Line One For Patient Profile");
    }

    public void verifyAndEnterValidCityForPatientProfile() throws InterruptedException, AWTException {
        waitForElementVisible(cityInput);
        clickElement(cityInput);

        selectAllText();
        cutText();

        clickElement(cityInput);
        Thread.sleep(2000);
        waitForElementVisible(cityEmptyError);
        String cityEmptyErrorMsg = cityEmptyError.getText();
        Assert.assertEquals(cityEmptyError.getText(), cityEmptyErrorMsg);
        Log.info("Asserted cityEmptyErrorMsg");
        cityInput.sendKeys("123 City");
        Thread.sleep(2000);
        waitForElementVisible(cityIncorrectFormatError);
        String cityIncorrectFormatErrorMsg = cityIncorrectFormatError.getText();
        Assert.assertEquals(cityIncorrectFormatError.getText(), cityIncorrectFormatErrorMsg);
        Log.info("Asserted cityIncorrectFormatErrorMsg");

//        cityInput.clear();
        clickElement(cityInput);
        selectAllText();
        pasteText();
        Thread.sleep(2000);
        Log.info("Entered Valid City For Patient Profile");
    }

    public void verifyAndEnterValidCountryForPatientProfile() throws InterruptedException, AWTException {
        waitForElementVisible(countryInput);
        clickElement(countryInput);

        selectAllText();
        cutText();

        clickElement(countryInput);
        Thread.sleep(2000);
        waitForElementVisible(countryEmptyError);
        String countryEmptyErrorMsg = countryEmptyError.getText();
        Assert.assertEquals(countryEmptyError.getText(), countryEmptyErrorMsg);
        Log.info("Asserted countryEmptyErrorMsg");
        countryInput.sendKeys("123 Country");
        Thread.sleep(2000);
        waitForElementVisible(countryIncorrectFormatError);
        String countryIncorrectFormatErrorMsg = countryIncorrectFormatError.getText();
        Assert.assertEquals(countryIncorrectFormatError.getText(), countryIncorrectFormatErrorMsg);
        Log.info("Asserted countryIncorrectFormatErrorMsg");

//        cityInput.clear();
        clickElement(countryInput);
        selectAllText();
        pasteText();
        Thread.sleep(2000);
        Log.info("Entered Valid Country For Patient Profile");
    }

    public void verifyAndEnterValidStateForPatientProfile() throws InterruptedException, AWTException {
        waitForElementVisible(stateInput);
        clickElement(stateInput);

        selectAllText();
        cutText();

        clickElement(stateInput);
        Thread.sleep(2000);
        waitForElementVisible(stateEmptyError);
        String stateEmptyErrorMsg = stateEmptyError.getText();
        Assert.assertEquals(stateEmptyError.getText(), stateEmptyErrorMsg);
        Log.info("Asserted stateEmptyErrorMsg");
        stateInput.sendKeys("123");
        Thread.sleep(2000);
        waitForElementVisible(stateIncorrectFormatError);
        String stateIncorrectFormatErrorMsg = stateIncorrectFormatError.getText();
        Assert.assertEquals(stateIncorrectFormatError.getText(), stateIncorrectFormatErrorMsg);
        Log.info("Asserted stateIncorrectFormatErrorMsg");

//        stateInput.clear();
        clickElement(stateInput);
        selectAllText();
        pasteText();
        Thread.sleep(2000);
        Log.info("Entered Valid State For Patient Profile");
    }

    public void verifyAndEnterValidZipCodeForPatientProfile() throws InterruptedException, AWTException {
        waitForElementVisible(zipCodeInput);
        clickElement(zipCodeInput);

        selectAllText();
        cutText();

        clickElement(stateInput);
        Thread.sleep(2000);
        clickElement(zipCodeInput);
        Thread.sleep(2000);
        waitForElementVisible(zipCodeEmptyError);
        String zipCodeEmptyErrorMsg = zipCodeEmptyError.getText();
        Assert.assertEquals(zipCodeEmptyError.getText(), zipCodeEmptyErrorMsg);
        Log.info("Asserted zipCodeEmptyErrorMsg");
        zipCodeInput.sendKeys("@@@@");
        Thread.sleep(2000);
        waitForElementVisible(zipCodeInvalidError);
        String zipCodeInvalidErrorMsg = zipCodeInvalidError.getText();
        Assert.assertEquals(zipCodeInvalidError.getText(), zipCodeInvalidErrorMsg);
        Log.info("Asserted zipCodeInvalidErrorMsg");

//        zipCodeInput.clear();
        clickElement(zipCodeInput);
        selectAllText();
        pasteText();
        Thread.sleep(2000);
        Log.info("Entered Valid Zipcode For Patient Profile");
    }

    public void clickOnSaveButtonForPatientProfile() throws InterruptedException {
        waitForElementVisible(saveBTN);
        clickElement(saveBTN);
        Thread.sleep(2000);
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Thread.sleep(2000);
    }

    public void patientLogout() throws InterruptedException {
//        pageLoadWait();
        refreshWebPage();
        waitForElementVisible(logoutBTN);
        clickElement(logoutBTN);
        Log.info("Clicked on Logout for Patient");
        Thread.sleep(3000);
    }

}
