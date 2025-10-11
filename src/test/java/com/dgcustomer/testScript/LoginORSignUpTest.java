package com.dgcustomer.testScript;

import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.LoginORSignUp;

public class LoginORSignUpTest extends BaseTest {

    @Test(priority=1) //Enter Phone number and Otp flow
    public void testEnterNumberLoginWithOtp() throws Exception {
    	logger.info("***Entering OTP***");
        LoginORSignUp login = new LoginORSignUp(driver);
        Thread.sleep(10000);       
        login.enterMobileNumber("9341644070");
        login.clickLogin();
        Thread.sleep(15000);       
        logger.info("***OTP Succesfully Entered***");
    }
   
}
