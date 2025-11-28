package com.dgcustomer.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

public class DriverFactory {
    private static AppiumDriver driver;
    private static Properties props;

    public static AppiumDriver getDriver() throws Exception {
        if (driver == null) {
            props = new Properties();
            props.load(new FileInputStream("config/config.properties"));

            UiAutomator2Options options = new UiAutomator2Options();

            options.setPlatformName(props.getProperty("platformName"));
            options.setDeviceName(props.getProperty("deviceName"));
            options.setUdid(props.getProperty("udid"));
            options.setPlatformVersion(props.getProperty("platformVersion"));
            options.setAutomationName(props.getProperty("automationName"));

            options.setAppPackage(props.getProperty("appPackage"));
            options.setAppActivity(props.getProperty("appActivity"));

            options.setNoReset(Boolean.parseBoolean(props.getProperty("noReset")));
            options.setFullReset(Boolean.parseBoolean(props.getProperty("fullReset")));

            options.setCapability("ignoreHiddenApiPolicyError", 
                    Boolean.parseBoolean(props.getProperty("ignoreHiddenApiPolicyError")));
            options.setCapability("autoGrantPermissions", 
                    Boolean.parseBoolean(props.getProperty("ignoreHiddenApiPolicyError")));

            driver = new AndroidDriver(new URL(props.getProperty("serverURL")), options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
