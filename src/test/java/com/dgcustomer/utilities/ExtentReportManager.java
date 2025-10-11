package com.dgcustomer.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = createInstance("reports/ExtentReport.html");
        }
        return extent;
    }

    private static ExtentReports createInstance(String fileName) {
        ExtentSparkReporter spark = new ExtentSparkReporter(fileName);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Appium Test Execution Report");

        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(spark);

        // Add environment details
        extentReports.setSystemInfo("Platform", "Android");
        extentReports.setSystemInfo("Tester", "Shreyas");

        return extentReports;
    }
}
