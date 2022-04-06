package example.instagram;

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import example.util.test_utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public abstract class base extends test_utils {

    public base(AppiumDriver<MobileElement> d) throws IOException {
        super(d);
        driver = d;
    }

    private AppiumDriver<MobileElement> driver;

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public static AppiumDriver<MobileElement> makeDriver(String platform_name) throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        AppiumDriver<MobileElement> driver = null;

        if (platform_name.equals("Android")) {

            System.out.println("Android test script starting...");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-G950F");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            capabilities.setCapability("appWaitActivity", "com.instagram.android:id/vpnContainer");
            capabilities.setCapability("appWaitPackage", "com.instagram.android");

            System.out.println(capabilities.toJson());

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } else if (platform_name.equals("iOS")) {

            System.out.println("iOS test script starting...");

            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.1");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone SE");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
            capabilities.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID, "2224QHQG6H");
            capabilities.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID, "iPhone Developer");
            capabilities.setCapability("udid", "00008030-000974393C10402E");
            capabilities.setCapability("commandTimeouts", "12000");

            driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        }
        return driver;

    }

}
