package com.dgcustomer.testScript;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.CreateProfile;

public class CreateProfileTest extends BaseTest {



    @Test(priority = 1)
    public void testCreateProfile() {
        logger.info("Profile Creation Started");

        CreateProfile pfl = new CreateProfile(driver);
        pfl.setFullName();
        pfl.setEmail();
        pfl.setGender();
        pfl.setDob();
        pfl.saveDetails();
        logger.info("Entered All Details");
        logger.info("Profile Creation Successful");
    }
}
