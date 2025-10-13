package com.dgcustomer.base;

import io.appium.java_client.AppiumDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.dgcustomer.utilities.DriverFactory;
import com.dgcustomer.utilities.ExtentReportManager;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
    protected AppiumDriver driver;
    protected static ExtentReports extent;
    protected static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    protected static final Logger logger = Logger.getLogger(BaseTest.class);

    @BeforeSuite
    public void setupReport() {
        extent = ExtentReportManager.getInstance();
    }

    @BeforeClass
    public void setUp() throws Exception {
    	logger.info("***Test Started***");
        driver = DriverFactory.getDriver();
    }

    @BeforeMethod
    public void startTest(Method method) {
        ExtentTest extentTest = extent.createTest(method.getName());
        test.set(extentTest);
    }

    @AfterMethod
    public void captureResult(ITestResult result) throws IOException {
        ExtentTest extentTest = test.get();
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = takeScreenshot(result.getName());
            extentTest.fail("Test Failed: " + result.getThrowable())
			          .addScreenCaptureFromPath(screenshotPath);
            logger.info("**Test Failed****");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.pass("Test Passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.skip("Test Skipped");
        }
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
        logger.info("*** Test Ended ***");
    }

    @AfterSuite
    public void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }

    // Screenshot utility
    public String takeScreenshot(String testName) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String path = "test-output/screenshots/" + testName + "_" + timestamp + ".png";
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
}
