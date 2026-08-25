package tests;

import driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;
import pages.OtpPage;

public class LoginTest {

    @BeforeMethod
    @Parameters("platform")
    public void setUp(String platform) throws Exception {
        // write  code to initialise the driver  according to the chosen platform
    }

    @Test
    public void successfulLogin() {

        // write a successful login test for mobile app login scenario by :
        //1. Entering username and password in the LoginPage and click the Login Button
        //2. Entering OtpInput in the OtpPage and click verify
        //3. Finally verify that the HomePage with home label is displayed , if not fail the test with the message "Home Page is not displayed".
    }

    @AfterMethod
    public void tearDown() {
        // write  code to close all driver instances
    }
}