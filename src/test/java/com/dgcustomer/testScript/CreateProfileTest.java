package com.dgcustomer.testScript;

import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.CreateProfile;
import com.dgcustomer.payload.LoginORSignUp;

public class CreateProfileTest extends BaseTest{

    @Test(priority=1) //Enter Customer Details
    public void testCreateProfile() {
    	logger.info("***Profile Creation Started***");
    	CreateProfile pfl = new CreateProfile(driver);
    	pfl.setFullName();
    	pfl.setEmail();
    	pfl.setGender();
    	pfl.setDob();
    	pfl.saveDetails();
    	logger.info("***Profile Creation Succesfull***");
    }
}
