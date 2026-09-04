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
        
    }

    @Test
    public void successfulLogin() {

        
    }

    @AfterMethod
    public void tearDown() {
       
    }
}
