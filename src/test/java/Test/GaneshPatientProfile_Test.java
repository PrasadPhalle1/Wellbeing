package Test;

import PageObjects.GaneshPatientProfile_PageObjects;
import common.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;

import static common.Utility.refreshWebPage;
import static common.Utility.scrollUpTo;
import static utils.extentreports.ExtentTestManager.startTest;

public class GaneshPatientProfile_Test extends BasePage {

    GaneshPatientProfile_PageObjects patientprofile;

    @BeforeTest
    public void setup() {
        initialize();
        patientprofile = new GaneshPatientProfile_PageObjects();
    }

    @Test
    public void patientProfileUpdateTest(Method method) throws InterruptedException, AWTException {
        startTest(method.getName(), "Checking the Patient Appointment Massage");
//        patientprofile.loadWellbeingURL();
        patientprofile.loginOption();
        patientprofile.clickOnProfile();

        patientprofile.verifyRequiredAndInvalidChangePasswordForPatientProfile();
        patientprofile.verifyInvalidCurrentPasswordOption();
        patientprofile.verifyCurrentAndNewPasswordSame();
        patientprofile.verifyNewAndConfirmPasswordDifferent();
        patientprofile.verifyLessThenEightCharPassword();
        patientprofile.validChangePassword();

        patientprofile.tryToUploadExcelFileForSetProfilePicture();
        patientprofile.tryToUploadZipFileForSetProfilePicture();
        patientprofile.tryToUploadPDFFileForSetProfilePicture();
        patientprofile.tryToUploadMSWordFileForSetProfilePicture();
        patientprofile.tryToUploadWEBMFileForSetProfilePicture();
        patientprofile.tryToUploadJPGFileForSetProfilePicture();

        patientprofile.verifyAndEnterValidFullNameForPatientProfile();
        patientprofile.verifyAndEnterValidDOBForPatientProfile();
        patientprofile.verifyAndEnterValidContactNumberForPatientProfile();
        patientprofile.scrollUpToZipCode();
        patientprofile.verifyAndEnterValidAddressForPatientProfile();
        patientprofile.verifyAndEnterValidCityForPatientProfile();
        patientprofile.verifyAndEnterValidCountryForPatientProfile();
        patientprofile.verifyAndEnterValidStateForPatientProfile();
        patientprofile.verifyAndEnterValidZipCodeForPatientProfile();
        patientprofile.clickOnSaveButtonForPatientProfile();

        patientprofile.patientLogout();
    }

    @AfterTest
    public void tearDown() {
        closeDriver();
    }
}


