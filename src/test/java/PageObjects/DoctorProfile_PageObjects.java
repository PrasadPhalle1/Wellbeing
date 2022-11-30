package PageObjects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

import static common.Utility.*;
import static common.Utility.pressEnter;

public class DoctorProfile_PageObjects extends BasePage {

    @FindBy(xpath = "//ion-label[text()='Login']")
    public WebElement loginBTN;

    @FindBy(xpath = "//input[@placeholder='your@email.address']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordText;

    @FindBy(xpath = "//ion-button[text()=' Login ']")
    public WebElement submitBTN;

    @FindBy(xpath = "//ion-label[text()='Profile']")
    public WebElement profilePage;

    @FindBy(xpath = "//ion-label[text()=' Change password ']")
    public WebElement changePassword;

    @FindBy(xpath = "//input[@name='cPass']")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@name='nPass']")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@name='coPass']")
    public WebElement confirmPassword;

    @FindBy(xpath = "(//ion-icon[@name='eye'])[2]")
    public WebElement currentPasswordEyeIcon;

    @FindBy(xpath = "(//ion-icon[@name='eye'])[3]")
    public WebElement newPasswordEyeIcon;

    @FindBy(xpath = "(//ion-icon[@name='eye'])[4]")
    public WebElement confirmPasswordEyeIcon;

    @FindBy(xpath = "//ion-button[text()=' Save ']")
    public WebElement passwordSaveBtn;

    @FindBy(xpath = "//ion-button[text()='Cancel']")
    public WebElement passwordCancelBtn;

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

    @FindBy(xpath = "//input[@name='fName']")
    public WebElement fullName;

    @FindBy(xpath = "//ion-label[text()=' Full name required, cannot be empty ']")
    public WebElement fullNameRequired;

    @FindBy(xpath = "//ion-label[text()='Full name is invalid ']")
    public WebElement fullNameInvalid;

    @FindBy(xpath = "//input[@name='dateOfBirth']")
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

    @FindBy(xpath = "//ion-select[contains(@aria-label,'Specializations*')]")
    public WebElement specialization;

    @FindBy(xpath = "//div[text()=' Ayurvedic specialist ']")
    public WebElement ayurvedicSpecialist;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement specializationOkBtn;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement SpecializationCancelBtn;

    @FindBy(xpath = "//ion-label[text()=' Atleast one specialization required ']")
    public WebElement specializationError;

    @FindBy(xpath = "//input[@name='exp']")
    public WebElement experience;

    @FindBy(xpath = "//ion-label[text()=' Please mention your experience ']")
    public WebElement experienceMentionError;

    @FindBy(xpath = "//ion-label[text()=' Incorrect format ']")
    public WebElement experienceFormatError;
    
    @FindBy(xpath = "//h2[text()='Invalid Experience']")
    public WebElement invalidExperiencepopUp;

    @FindBy(xpath = "//div[text()='Please Enter Valid Experience']")
    public WebElement invalidExperience;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement invalidExperienceOkBtn;

    @FindBy(xpath = "//ion-button[text()='Save ']")
    public WebElement saveBtn;

    @FindBy(xpath = "//h2[text()='Success']")
    public WebElement profileSuccesspopUp;

    @FindBy(xpath = "//div[text()='Profile updated successfully.']")
    public WebElement profileSuccesspopUpMessage;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement profileSaveOkBtn;

    @FindBy(xpath = "(//ion-label[.='Logout'])[2]")
    public WebElement logout;

    public DoctorProfile_PageObjects(){
        PageFactory.initElements(driver,this);
    }

    public void loginToUpdateNewDoctorProfile() throws InterruptedException {
        waitForElementVisible(loginBTN);
        clickElement(loginBTN);
        Log.info("Click on login button");
        Thread.sleep(1000);
        waitForElementVisible(emailText);
//        emailText.sendKeys("pgatest.swqa+pp_2311_d10@gmail.com");
        emailText.sendKeys(prop.getProperty("doctorNewSignupCorrectMail"));
        Log.info("Provided valid email for loginToUpdateNewDoctorProfile");
        Thread.sleep(1000);
        waitForElementVisible(passwordText);
//        passwordText.sendKeys("P@ssw0rd!001");
        passwordText.sendKeys(prop.getProperty("doctorNewSignupCorrectPassword"));
        Log.info("Provided valid password for loginToUpdateNewDoctorProfile");
        Thread.sleep(1000);
        waitForElementVisible(submitBTN);
        clickElement(submitBTN);
        Log.info("Click on submit ");
        Thread.sleep(1000);
        Log.info("Logged in To Update New Doctor Profile");
        pageLoadWait();
    }

    public void profilePageOption() throws InterruptedException {
        Thread.sleep(3000);
        waitForElementVisible(profilePage);
        clickElement(profilePage);
        Log.info("Clicked on the Profile");
        Thread.sleep(2000);
        pageLoadWait();
    }

    public void clickingOnPasswordTextField(){
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        Log.info("Clicked on changePassword");
        waitForElementVisible(currentPassword);
        clickElement(currentPassword);
        Log.info("Clicked on currentPassword");
        waitForElementVisible(newPassword);
        clickElement(newPassword);
        Log.info("Clicked on newPassword");
        waitForElementVisible(currentPassRequired);
        String currentPassReqMessage = "Current password required";
        Assert.assertEquals(currentPassRequired.getText(), currentPassReqMessage);
        Log.info("Asserted currentPassReqMessage");
        waitForElementVisible(confirmPassword);
        clickElement(confirmPassword);
        waitForElementVisible(newPassRequired);
        String newPassReqMessage = "New password required";
        Assert.assertEquals(newPassRequired.getText(),newPassReqMessage);
        Log.info("Asserted newPassReqMessage");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        Log.info("Clicked on changePassword");
        waitForElementVisible(cnfmPassRequired);
        String cnfmPassReqMessage = "Password confirmation required";
        Assert.assertEquals(cnfmPassRequired.getText(),cnfmPassReqMessage);
        Log.info("Asserted cnfmPassReqMessage");
        waitForElementVisible(passwordCancelBtn);
        clickElement(passwordCancelBtn);
        Log.info("Clicked on passwordCancelBtn");
    }

    public void invalidCurrentPasswordOption() throws InterruptedException {
        Log.info("Typing an invalid Current Password");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(currentPassword);
        currentPassword.sendKeys("P@ssw0rd!002");
        waitForElementVisible(currentPasswordEyeIcon);
        clickElement(currentPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(currentPasswordEyeIcon);
        clickElement(currentPasswordEyeIcon);
        waitForElementVisible(newPassword);
        newPassword.sendKeys("P@ssw0rd!00");
        waitForElementVisible(newPasswordEyeIcon);
        clickElement(newPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(newPasswordEyeIcon);
        clickElement(newPasswordEyeIcon);
        waitForElementVisible(confirmPassword);
        confirmPassword.sendKeys("P@ssw0rd!00");
        waitForElementVisible(confirmPasswordEyeIcon);
        clickElement(confirmPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(confirmPasswordEyeIcon);
        clickElement(confirmPasswordEyeIcon);
        waitForElementVisible(passwordSaveBtn);
        clickElement(passwordSaveBtn);
        waitForElementVisible(passNotCorrect);
        String passNotCorrectMessage = "Password is incorrect";
        Assert.assertEquals(passNotCorrect.getText(), passNotCorrectMessage);
        Log.info("Asserted passNotCorrectMessage");
        waitForElementVisible(passwordCancelBtn);
        clickElement(passwordCancelBtn);
    }

    public void currentAndNewPasswordSameOption() throws InterruptedException {
        Log.info("Typing an Current and New Password Same");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(currentPassword);
        currentPassword.sendKeys("P@ssw0rd!001");
        waitForElementVisible(currentPasswordEyeIcon);
        clickElement(currentPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(currentPasswordEyeIcon);
        clickElement(currentPasswordEyeIcon);
        waitForElementVisible(newPassword);
        newPassword.sendKeys("P@ssw0rd!001");
        waitForElementVisible(newPasswordEyeIcon);
        clickElement(newPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(newPasswordEyeIcon);
        clickElement(newPasswordEyeIcon);
        waitForElementVisible(currentAndNewPass);
        String samePass = "Current and new password cannot be same";
        Assert.assertEquals(currentAndNewPass.getText(),samePass);
        Log.info("Asserted samePass");
        waitForElementVisible(passwordCancelBtn);
        clickElement(passwordCancelBtn);
    }

    public void newAndConfirmPasswordDifferentOption() throws InterruptedException {
        Log.info("Typing an New and Confirm Password Different");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(currentPassword);
        currentPassword.sendKeys("P@ssw0rd!001");
        waitForElementVisible(currentPasswordEyeIcon);
        clickElement(currentPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(currentPasswordEyeIcon);
        clickElement(currentPasswordEyeIcon);
        waitForElementVisible(newPassword);
        newPassword.sendKeys("P@ssw0rd!000");
        waitForElementVisible(newPasswordEyeIcon);
        clickElement(newPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(newPasswordEyeIcon);
        clickElement(newPasswordEyeIcon);
        waitForElementVisible(confirmPassword);
        confirmPassword.sendKeys("P@ssw0rd!002");
        waitForElementVisible(confirmPasswordEyeIcon);
        clickElement(confirmPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(confirmPasswordEyeIcon);
        clickElement(confirmPasswordEyeIcon);
        waitForElementVisible(passNotMatch);
        String noMatchMessage = "Passwords does not match";
        Assert.assertEquals(passNotMatch.getText(),noMatchMessage);
        Log.info("Asserted noMatchMessage");
        waitForElementVisible(passwordCancelBtn);
        clickElement(passwordCancelBtn);
    }

    public void lessThenEightCharPasswordOption() throws InterruptedException {
        Log.info("Typing a password less than 8 character");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(newPassword);
        newPassword.sendKeys("P@ss");
        waitForElementVisible(newPasswordEyeIcon);
        clickElement(newPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(newPasswordEyeIcon);
        clickElement(newPasswordEyeIcon);
        waitForElementVisible(passlessChar);
        String lessCharacter = "Password has to be at least 8 characters long";
        Assert.assertEquals(passlessChar.getText(),lessCharacter);
        Log.info("Asserted lessCharacter");
        waitForElementVisible(passwordCancelBtn);
        clickElement(passwordCancelBtn);
    }

    public void validChangePasswordOption() throws InterruptedException {
        Log.info("Typing a Valid Passwords in Three Text Fields");
        waitForElementVisible(changePassword);
        clickElement(changePassword);
        waitForElementVisible(currentPassword);
        currentPassword.sendKeys("P@ssw0rd!001");
        waitForElementVisible(currentPasswordEyeIcon);
        clickElement(currentPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(currentPasswordEyeIcon);
        clickElement(currentPasswordEyeIcon);
        waitForElementVisible(newPassword);
        newPassword.sendKeys("P@ssw0rd!002");
        waitForElementVisible(newPasswordEyeIcon);
        clickElement(newPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(newPasswordEyeIcon);
        clickElement(newPasswordEyeIcon);
        waitForElementVisible(confirmPassword);
        confirmPassword.sendKeys("P@ssw0rd!002");
        waitForElementVisible(confirmPasswordEyeIcon);
        clickElement(confirmPasswordEyeIcon);
        Thread.sleep(2000);
        waitForElementVisible(confirmPasswordEyeIcon);
        clickElement(confirmPasswordEyeIcon);
        waitForElementVisible(passwordSaveBtn);
        clickElement(passwordSaveBtn);
        waitForElementVisible(successPass);
        String successPassMessage = "Success";
        Assert.assertEquals(successPass.getText(),successPassMessage);
        Log.info("Asserted successPassMessage");
        waitForElementVisible(passUpdated);
        String updatedMessage = "Password updated successfully.";
        Assert.assertEquals(passUpdated.getText(),updatedMessage);
        Log.info("Asserted updatedMessage");
        waitForElementVisible(okBtn);
        clickElement(okBtn);
        Log.info("Successfully password changed");
    }

    public void setProfileExcelOption() throws AWTException, InterruptedException {
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
        Log.info("Excel file uploaded");
    }

    public void setProfileZipOption() throws InterruptedException, AWTException {
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
        Log.info("zip file uploaded");
    }

    public void setProfilePdfOption() throws InterruptedException, AWTException {
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
        Log.info("pdf file uploaded");
    }

    public void setProfileWordDocxOption() throws InterruptedException, AWTException {
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
        Log.info("Word file uploaded");
    }

    public void setProfileVideoOption() throws InterruptedException, AWTException {
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
        Log.info("Webm file uploaded");
    }

    public void setProfileJpgOption() throws InterruptedException, AWTException {
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
        Log.info("Asserted remove");
        waitForElementVisible(removePopupMsg);
        String message = "Do you want to remove Profile Pic?";
        Assert.assertEquals(removePopupMsg.getText(),message);             //Asserting the Message
        Log.info("Asserted message");
        Thread.sleep(2000);
        waitForElementVisible(noBtn);
        clickElement(noBtn);
        Thread.sleep(2000);
        waitForElementVisible(removeProfile);
        clickElement(removeProfile);
        waitForElementVisible(yesBtn);
        clickElement(yesBtn);
        Log.info("Jpg file uploaded");
    }

    public void verifyAndEnterValidFullNameForDoctorProfile() throws InterruptedException, AWTException {
        Log.info("Typing a valid and invalid Full Name");
        waitForElementVisible(fullName);
        clickElement(fullName);
        selectAllText();
        cutText();
        clickElement(fullName);
        Thread.sleep(2000);
        waitForElementVisible(fullNameRequired);
        String fullNameRequiredErrorMsg = "Full name required, cannot be empty";
        Assert.assertEquals(fullNameRequired.getText(), fullNameRequiredErrorMsg);
        Log.info("Asserted fullNameRequiredErrorMsg");

        fullName.clear();
        fullName.sendKeys("123");
        Thread.sleep(2000);
        waitForElementVisible(fullNameInvalid);
        String fullNameInvalidErrorMsg = "Full name is invalid";
        Assert.assertEquals(fullNameInvalid.getText(), fullNameInvalidErrorMsg);
        Log.info("Asserted fullNameInvalidErrorMsg");

        fullName.clear();
        fullName.click();
        pasteText();
        Log.info("Entered Valid Full Name For Doctor Profile");
        Thread.sleep(2000);
    }

    public void verifyAndEnterValidDOBForDoctorProfile() throws InterruptedException, AWTException {
        Log.info("Checking the valid and invalid Date-Of-Birth");
        waitForElementVisible(dateOfBirth);
        clickElement(dateOfBirth);
        selectAllText();
        cutText();
        pressTab(dateOfBirth);
        Thread.sleep(2000);
        waitForElementVisible(dobRequiredError);
        String dobRequiredErrorMsg = "Date of Birth Required";
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
        Log.info("Entered Valid Date OF Birth For Doctor Profile");
        Thread.sleep(2000);
    }

    public void verifyAndEnterValidContactNumberForDoctorProfile() throws InterruptedException, AWTException {
        Log.info("Typing the valid and invalid Contact Number");
        waitForElementVisible(contact);
        clickElement(contact);
        selectAllText();
        cutText();
        clickElement(contact);
        Thread.sleep(2000);
        waitForElementVisible(contactNumberRequiredError);
//        String contactNumberRequiredErrorMsg = " Contact Number Required";
        String contactNumberRequiredErrorMsg = contactNumberRequiredError.getText();
        Assert.assertEquals(contactNumberRequiredError.getText(), contactNumberRequiredErrorMsg);
        Log.info("Asserted contactNumberRequiredErrorMsg");
        contact.sendKeys("123");
        Thread.sleep(2000);
        waitForElementVisible(contactNumberInvalidError);
        String contactNumberInvalidErrorMsg = "Contact Number is Invalid";
        Assert.assertEquals(contactNumberInvalidError.getText(), contactNumberInvalidErrorMsg);
        Log.info("Asserted contactNumberInvalidErrorErrorMsg");
        contact.clear();
        clickElement(contact);
        pasteText();
        Thread.sleep(2000);
        Log.info("Entered Valid Contact Number For Doctor Profile");
    }

    public void verifyAndSelectSpecializationForDoctorProfile() throws InterruptedException {
        Log.info("Checking the specialization of doctor");
//        scrollUsingJavaScriptExecutor(dateOfBirth);
        scrollUpTo(dateOfBirth);
        waitForElementVisible(specialization);
        clickElement(specialization);
        Thread.sleep(2000);
//        waitForElementVisible(ayurvedicSpecialist);
//        clickElement(ayurvedicSpecialist);
//        waitForElementVisible(SpecializationCancelBtn);
//        clickElement(SpecializationCancelBtn);
//        waitForElementVisible(specialization);
//        clickElement(specialization);
//        waitForElementVisible(ayurvedicSpecialist);
//        clickElement(ayurvedicSpecialist);
//        waitForElementVisible(specializationOkBtn);
//        clickElement(specializationOkBtn);
//        String specializationErrorMessage = "Atleast one specialization required";
//        Assert.assertEquals(specializationError.getText(),specializationErrorMessage);
//        Log.info("Asserted specializationErrorMessage");
//        waitForElementVisible(specialization);
//        clickElement(specialization);
//        waitForElementVisible(ayurvedicSpecialist);
//        clickElement(ayurvedicSpecialist);
        waitForElementVisible(specializationOkBtn);
        clickElement(specializationOkBtn);
        Log.info("Entered Valid Specialization for Doctor Profile");
        Thread.sleep(2000);
    }

    public void verifyAndEnterExperience() throws AWTException {
        waitForElementVisible(experience);
        clickElement(experience);
        selectAllText();
        deleteText();
        waitForElementVisible(experienceMentionError);
        String experienceMentionErrorMessage = "Please mention your experience";
        Assert.assertEquals(experienceMentionError.getText(),experienceMentionErrorMessage);
        Log.info("Asserted experienceMentionErrorMessage");

        waitForElementVisible(experience);
        experience.sendKeys("40");
        waitForElementVisible(saveBtn);
        clickElement(saveBtn);
        waitForElementVisible(invalidExperiencepopUp);
        waitForElementVisible(invalidExperience);
        String invalidExperiencepopUpMessage = "Invalid Experience";
        String invalidExperienceMessage = "Please Enter Valid Experience";
        Assert.assertEquals(invalidExperiencepopUp.getText(),invalidExperiencepopUpMessage);
        Log.info("Asserted invalidExperiencepopUpMessage");
        Assert.assertEquals(invalidExperience.getText(),invalidExperienceMessage);
        Log.info("Asserted invalidExperienceMessage");
        waitForElementVisible(invalidExperienceOkBtn);
        clickElement(invalidExperienceOkBtn);

        waitForElementVisible(experience);
        clickElement(experience);
        selectAllText();
        deleteText();
        experience.sendKeys("ab@s");
        waitForElementVisible(experienceFormatError);
        String experienceFormatErrorMessage = "Incorrect format";
        Assert.assertEquals(experienceFormatError.getText(),experienceFormatErrorMessage);
        Log.info("Asserted experienceFormatMessage");

        waitForElementVisible(experience);
        clickElement(experience);
        selectAllText();
        deleteText();
        experience.sendKeys("7");
        waitForElementVisible(saveBtn);
        clickElement(saveBtn);
        waitForElementVisible(profileSuccesspopUp);
        waitForElementVisible(profileSuccesspopUpMessage);
        String profileSuccess = "Success";
        String profileSuccessMessage = "Profile updated successfully.";
        Assert.assertEquals(profileSuccesspopUp.getText(),profileSuccess);
        Log.info("Asserted profileSuccess");
        Assert.assertEquals(profileSuccesspopUpMessage.getText(),profileSuccessMessage);
        Log.info("Asserted profileSuccessMessage");
        waitForElementVisible(profileSaveOkBtn);
        clickElement(profileSaveOkBtn);
        Log.info("Entered Valid Experience for Experience for Doctor Profile");
    }

    public void logoutOption(){
        Log.info("Clicking on logout");
        waitForElementVisible(logout);
        clickElement(logout);
    }

    public void doctorProfile() throws InterruptedException, AWTException {
        Log.info("Testing the doctor profile");
        loginToUpdateNewDoctorProfile();
        profilePageOption();
        clickingOnPasswordTextField();
        invalidCurrentPasswordOption();
        currentAndNewPasswordSameOption();
        newAndConfirmPasswordDifferentOption();
        lessThenEightCharPasswordOption();
        validChangePasswordOption();
        setProfileExcelOption();
        setProfileZipOption();
        setProfilePdfOption();
        setProfileWordDocxOption();
        setProfileVideoOption();
        setProfileJpgOption();
        verifyAndEnterValidFullNameForDoctorProfile();
        verifyAndEnterValidDOBForDoctorProfile();
        verifyAndEnterValidContactNumberForDoctorProfile();
        verifyAndSelectSpecializationForDoctorProfile();
        verifyAndEnterExperience();
        logoutOption();
        Log.info("Successfully Tested the doctor profile");
    }

}
