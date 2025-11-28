package com.dgcustomer.testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.HomePage;
import com.dgcustomer.payload.LoginORSignUp;
import com.dgcustomer.payload.OneWay;
import com.dgcustomer.payload.ProfilePage;
import com.dgcustomer.payload.SettingsPage;
import com.dgcustomer.utilities.WaitUtils;

public class TC02_VerifyNavigationAndButtonsTest extends BaseTest{
	//Enter Mobile Number 
	@Test(priority=1)
    public void enterMobileNumber() {
		logger.info("ENTERING MOBILE NUMBER");
        LoginORSignUp ls = new LoginORSignUp(driver);
        WaitUtils.waitForSeconds(4);
        ls.enterMobileNumber("9341644070");
        String enteredPhNo = ls.getEnteredMobileNumber();
        Assert.assertEquals(enteredPhNo, "9341644070");
        logger.info("MOBILE NUMBER ENTERED SUCCESFULY:"+enteredPhNo);
    }
	//Accept Terms and condition and click login
    @Test(priority=2)
    public void acceptTermsAndClickVerify() {
    	logger.info("ACCEPTING T&C AND CLICKING LOGIN");
        LoginORSignUp ls = new LoginORSignUp(driver);
        ls.clickLogin();
        Assert.assertTrue(true, "Login button clicked successfully");
        logger.info("ACCEPTED T&C AND CLICKED LOGIN SUCCESFULLY");
    }
    //Get OTP and click Verify
    @Test(priority=3)
    public void getOtpAndclickVerifyButton() {
    	logger.info("OTP VERFICATION TEST STARTED");
        LoginORSignUp ls = new LoginORSignUp(driver);
        WaitUtils.waitForSeconds(6);
        ls.clickVerify();
        Assert.assertTrue(true, "OTP verified & navigated to Home Screen");   
        HomePage hp = new HomePage(driver);
	    WaitUtils.waitForSeconds(7);     
	    hp.confirmWelcomeMessage(); 
	    logger.info("OTP VERIFIED SUCCESFLY AND ENTERED HOME SCREEN");
	    ls.clickLocationDeny();
    }
    //Verify PickUp Location Text Box Navigation
	@Test(priority=4)
	public void verifyPickUpLocationNavigation() throws Exception {						
		 HomePage hp = new HomePage(driver);
		 WaitUtils.waitForSeconds(5);		      
		 hp.clickPickUpLocation();
		 Assert.assertEquals(hp.isPickUpLocationTextboxNavigated(),"Round Trip","FAIL - EnterPickUpLocation not navigated properly");
		logger.info("PASS - PickUp Location navigation verified");
	}
	//Verify One Way Navigation
	@Test(priority=5)
	public void verifyOneWayNavigation() {
		HomePage hp=new HomePage(driver);
		WaitUtils.waitForSeconds(2);
		Assert.assertTrue(hp.clickPickUpLocation(),"FAIL - PickUp Location textBox is not clickable");
		logger.info("PASS - PickUp Location textbox is clickable");
		WaitUtils.waitForSeconds(2);
		Assert.assertEquals(hp.isPickUpLocationTextboxNavigated(),"One Way","FAIL - One Way not navigated properly");
		logger.info("PASS - One Way navigation verified");
		hp.clickbackButton();
	}
	//Verify Round Trip Navigation
	@Test(priority=6)
	public void verifyRoundTripNavigation() {
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(hp.clickRoundTrip(),"FAIL - RoundTrip Button is not clickable");
		logger.info("PASS - RoundTrip Button is clickable");
		WaitUtils.waitForSeconds(2);
		Assert.assertEquals(hp.isRoundTripNavigated(),"Round Trip","FAIL - RoundTrip not navigated properly");
		logger.info("PASS - RoundTrip navigation verified");
		hp.clickbackButton();
	}	
	//Verify Out Station Navigation
	@Test(priority=7)
	public void verifyOutStationNavigation() {
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(hp.clickOutStation(),"FAIL -OutStation Button is not clickable");
		logger.info("PASS - OutStation Button is clickable");
		WaitUtils.waitForSeconds(2);
		Assert.assertEquals(hp.isOutStationBtnNavigated(),"Out Station","FAIL - Out Station not navigated properly");
		logger.info("PASS - Out Station navigation verified");
		hp.clickbackButton();
	}	
	//Verify Hire Driver Button
	@Test(priority=8)
	public void verifyHireDriverNavigation() {
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(hp.clickHireDriverButton(),"FAIL - Button is not clickable");
		logger.info("PASS - Hire Driver Button is clickable");
		WaitUtils.waitForSeconds(2);
		Assert.assertEquals(hp.isHireDriverBtnNavigated(),"Round Trip","FAIL - Hire Driver not navigated properly");
		logger.info("PASS - Hire Driver navigation verified");
		hp.clickbackButton();
	}
	//Verify Car Wash Button
	@Test(priority=9)
	public void verifyCarWashNavigation() {
		HomePage hp=new HomePage(driver);
		boolean washBtnStatus = hp.clickCarWashButton();
		Assert.assertTrue(washBtnStatus, "FAIL- Car Wash button SHOULD NOT be clickable");
		logger.info("PASS - Car Wash button is NOT clickable");
	}	
	//Verify Car Service Button
	@Test(priority=10)
	public void verifyCarServiceNavigation() {
		HomePage hp=new HomePage(driver);
		boolean serviceBtnStatus=hp.clickCarServiceBtn();
		Assert.assertTrue(serviceBtnStatus, "FAIL- Car Service button SHOULD NOT be clickable");
		logger.info("PASS - Car Service button is NOT clickable");
		  OneWay ow=new OneWay(driver);
		    ow.scrollDown();
		WaitUtils.waitForSeconds(2);
	}
	//Verify DG Wallet Navigation
	@Test(priority=11)
	public void verifyDgWalletNavigation() {
		HomePage hp=new HomePage(driver);
		boolean walletClickStatus = hp.clickWalletBtn();
		System.out.println(hp.clickWalletBtn());
		Assert.assertTrue(walletClickStatus, "FAIL - DG Wallet Button is NOT clickable");
		logger.info("PASS - DG Wallet Button is clickable");		
		WaitUtils.waitForSeconds(2);
		Assert.assertEquals(hp.isDgWalletBtnNavigated(), "DG Wallet", "FAIL - DG WALLET not navigated properly");
		logger.info("PASS - DG Wallet Button navigation verified");
		hp.clickSystemBack();
	}	
	//Verify DG COins
	@Test(priority=12)
	public void verifyDgCoinsNavigation() {	
		HomePage hp=new HomePage(driver);
		boolean coinBtnStatus = hp.clickDgCoin();
		Assert.assertTrue(coinBtnStatus, "FAIL- Dg Coin button SHOULD NOT be clickable");
		logger.info("PASS - Dg Coin button is NOT clickable");
	}	
	//Verify Save Address
	@Test(priority=13)
	public void verifySaveAddressNavigation() {	
		HomePage hp=new HomePage(driver);
		hp.swipeRightToLeft();
		
		boolean addressBtnStatus = hp.clickSaveAddress();
		Assert.assertTrue(addressBtnStatus, "FAIL- Save Address button SHOULD NOT be clickable");
		logger.info("PASS - Save Address button is NOT clickable");
	}
	//Verify DG Rewards 
	@Test(priority=14)
	public void verifyDgRewardsNavigation() {
		HomePage hp=new HomePage(driver);
		boolean rewardsBtnStatus = hp.clickDgRewards();
		Assert.assertTrue(rewardsBtnStatus, "FAIL- DG Rewards button SHOULD NOT be clickable");
		logger.info("PASS - DG Rewards button is NOT clickable");
	}
	//Click Profile
	@Test(priority=15)
	public void clickProfile() throws Exception {
		logger.info("CLICKING PROFILE");
		 HomePage hp = new HomePage(driver);
		 hp.clickProfileBtn();
		 logger.info("PROFILE CLICKED SUCCESFULLY");	    		    		
	}
	//click Settings
	@Test(priority=16)
	public void clickSetting() {
		logger.info("CLICKING SETTINGS ");
		ProfilePage pp=new ProfilePage(driver);
		HomePage hp=new HomePage(driver);
		hp.hardTap(957, 2098);
		pp.clickSettings();
		logger.info("CLICKED SETTINGS");
	}
	//Click Logout and confirm
	@Test(priority=17)
	public void clickLogOutAndConfirm() {		
		SettingsPage sp=new SettingsPage(driver);
		logger.info("CLICKING LOGOUT AND CONFIRM");
		sp.clickLogOut();
		WaitUtils.waitForSeconds(2);
		sp.clickConfirmLogOut();
		logger.info("LOGGED OUT SUCCESFULLY");
	}
}
