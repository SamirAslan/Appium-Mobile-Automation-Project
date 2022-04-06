package example.util;

import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class test_utils {

    public test_utils(AppiumDriver<MobileElement> object) {
        driver = object;
    }

    public void PerformSwipeAction(MobileElement element) throws InterruptedException {
        Dimension dimensionFirst = element.getSize();

        int Anchor = dimensionFirst.getHeight() / 2;

        double firstScreenWidthStart = dimensionFirst.getWidth() * 0.8;
        int scrollStart1 = (int) firstScreenWidthStart;

        double firstScreenWidthEnd = dimensionFirst.getWidth() * 0.05;
        int scrollEnd1 = (int) firstScreenWidthEnd;

        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(scrollStart1, Anchor))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(250)))
                .moveTo(PointOption.point(scrollEnd1, Anchor)).release().perform();

        Thread.sleep(1000);
    }

    private static AppiumDriver<MobileElement> driver;

    public void ScrolliOSPlatform() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        MobileElement logoutElement = driver.findElementByXPath("//XCUIElementTypeButton[@name='Log Out']");

        scrollObject.put("direction", "down");
        scrollObject.put("element", ((RemoteWebElement) logoutElement).getId());
        js.executeScript("mobile: scroll", scrollObject);
    }

    public MobileElement GetElementByRID(String element_id) {
        return driver.findElementById(element_id);
    }

    public MobileElement GetElementByCN(String class_name) {
        return driver.findElementByClassName(class_name);
    }

    public MobileElement GetElementByXP(String xpath) {
        return driver.findElementByXPath(xpath);
    }

    /**
     * Performs screen swipe
     *
     * @param dir the direction of swipe
     * @version java-client: 7.3.0
     **/
    public static void mobileSwipeScreenIOS(Direction dir) {
        System.out.println("mobileSwipeScreenIOS(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        // - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 100; // ms
        final HashMap<String, String> scrollObject = new HashMap<String, String>();

        switch (dir) {
            case DOWN: // from up to down (! differs from mobile:scroll)
                scrollObject.put("direction", "down");
                break;
            case UP: // from down to up (! differs from mobile:scroll)
                scrollObject.put("direction", "up");
                break;
            case LEFT: // from right to left (! differs from mobile:scroll)
                scrollObject.put("direction", "left");
                break;
            case RIGHT: // from left to right (! differs from mobile:scroll)
                scrollObject.put("direction", "right");
                break;
            default:
                throw new IllegalArgumentException("mobileSwipeScreenIOS(): dir: '" + dir + "' NOT supported");
        }

        final int MAX_SWIPES = 5;
        for (int i = 0; i < MAX_SWIPES; i++) {
            try {
                driver.executeScript("mobile:swipe", scrollObject);
                Thread.sleep(ANIMATION_TIME); // always allow swipe action to complete
            } catch (Exception e) {
                System.err.println("mobileSwipeScreenIOS(): FAILED\n" + e.getMessage());
                return;
            }
        }
    }

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

}
