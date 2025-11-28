package com.dgcustomer.testScript;

import org.testng.annotations.Test;
import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.LoginORSignUp;
import com.dgcustomer.utilities.WaitUtils;

public class LoginORSignUpTest extends BaseTest {

    @Test(priority = 1, description = "Enter the phone number and validate otp")
    public void testEnterNumberLoginWithOtp() {
        logger.info("Starting Login/SignUp test");

        LoginORSignUp login = new LoginORSignUp(driver);

        WaitUtils.waitForSeconds(5);
        login.enterMobileNumber("9341644070");
        logger.info("Entered mobile number successfully");

        login.clickLogin();
        logger.info("Clicked Login/Proceed button");
        
        WaitUtils.waitForSeconds(10);
        login.clickVerify();
        logger.info("OTP verified");
        
        logger.info("Login/SignUp page Test Ended");
    }
}
