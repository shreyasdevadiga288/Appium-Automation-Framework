package com.dgcustomer.testScript;

import org.testng.annotations.Test;
import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.LoginORSignUp;
import com.dgcustomer.utilities.WaitUtils;

public class LoginORSignUpTest extends BaseTest {

    @Test(priority = 1, description = "Enter the phone number and validate otp")
    public void testEnterNumberLoginWithOtp() {
        logger.info("*** Starting Login Test with OTP ***");

        LoginORSignUp login = new LoginORSignUp(driver);

        WaitUtils.waitForSeconds(5);
        login.enterMobileNumber("9341644070");
        logger.info("Entered mobile number successfully");

        login.clickLogin();
        logger.info("Clicked Login and Proceed buttons");

        WaitUtils.waitForSeconds(10);
        logger.info("*** OTP screen displayed successfully ***");
    }
}
