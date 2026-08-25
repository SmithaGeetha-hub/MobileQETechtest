package driver;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AppiumDriver driver;

    public static void initDriver(String platform) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", platform);

        if (platform.equalsIgnoreCase("android")) {

            caps.setCapability("appium:automationName", "UiAutomator2");
            caps.setCapability("appium:deviceName", "Android Emulator");
            caps.setCapability("appium:appPackage", "com.example.app");
            caps.setCapability("appium:appActivity", ".MainActivity");

            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723"),
                    caps
            );

        } else if (platform.equalsIgnoreCase("ios")) {

            caps.setCapability("appium:automationName", "XCUITest");
            caps.setCapability("appium:deviceName", "iPhone Simulator");
            caps.setCapability("appium:bundleId", "com.example.app");

            driver = new IOSDriver(
                    new URL("http://127.0.0.1:4723"),
                    caps
            );
        }
    }
    public static AppiumDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

