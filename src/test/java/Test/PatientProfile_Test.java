package Test;

import PageObjects.PatientProfile_PageObjects;
import common.BasePage;
import org.testng.annotations.*;

import java.awt.*;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class PatientProfile_Test extends BasePage {

    PatientProfile_PageObjects patientprofile;

    @BeforeClass
    public void setup() {
        initialize();
        patientprofile = new PatientProfile_PageObjects();
    }

    @Test
    public void patientProfileUpdateTest(Method method) throws InterruptedException, AWTException {
        startTest(method.getName(), "Checking the Patient Appointment Massage");
//        patientprofile.loadWellbeingURL();
        patientprofile.loginToUpdateNewPatientProfile();
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

    @AfterClass
    public void tearDown() {
        closeDriver();
    }
}


