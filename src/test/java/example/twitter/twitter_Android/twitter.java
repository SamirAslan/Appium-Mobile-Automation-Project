package example.twitter.twitter_Android;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class twitter extends example.twitter.base {

    public twitter() throws IOException {
        super(makeDriver("Android"));

    }

    public static void main(String[] args) throws InterruptedException, IOException {
        twitter instance = new twitter();
        AppiumDriver<MobileElement> driver = instance.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        DoOpenAppScenario(driver);
        DologinScenario(driver);
        DoCommendScenario(driver);
        DoLikeScenario(driver);
        DoRetweetScenario(driver);
        DoRetweet2Scenario(driver);
        DoTwitScenario(driver);
        DoMesageScenario(driver);
        DoFollowScenario(driver);
        DoVoiceScenario(driver);
        DoSignOutScenario(driver);

    }

    public static void DoOpenAppScenario(AppiumDriver<MobileElement> driver)
            throws MalformedURLException, InterruptedException {

        driver.findElementByXPath("//android.widget.TextView[@text='Twitter']").click();
        TimeUnit.SECONDS.sleep(10);
        System.out.println("App is opening...");
        System.out.println("**************************************************************");
    }

    public static void DologinScenario(AppiumDriver<MobileElement> driver)
            throws MalformedURLException, InterruptedException {

        System.out.println("Login scenario is starting.");
        driver.findElementByXPath("//android.widget.TextView[@text='stick not']").click();
        TimeUnit.SECONDS.sleep(20);
        System.out.println("Login scenario completed.");
        System.out.println("**************************************************************");

    }

    public static void DoTwitScenario(AppiumDriver<MobileElement> driver)
            throws MalformedURLException, InterruptedException {

        System.out.println("Twit scenario is starting.");
        driver.findElementById("com.twitter.android:id/composer_write").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementById("com.twitter.android:id/composer_write").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Neler oluyor?']").sendKeys("hello");
        driver.findElementById("com.twitter.android:id/button_tweet").click();
        System.out.println("Twit scenario completed.");
        System.out.println("**************************************************************");
        TimeUnit.SECONDS.sleep(10);

    }

    public static void DoLikeScenario(AppiumDriver<MobileElement> driver)
            throws MalformedURLException, InterruptedException {

        System.out.println("Like scenario is starting.");
        driver.findElementById("com.twitter.android:id/inline_like").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementById("com.twitter.android:id/channels").click();
        System.out.println("Like scenario completed.");
        System.out.println("**************************************************************");

    }

    public static void DoCommendScenario(AppiumDriver<MobileElement> driver)
            throws MalformedURLException, InterruptedException {

        System.out.println("Commend scenario is starting.");
        driver.findElementById("com.twitter.android:id/inline_reply").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementById("com.twitter.android:id/tweet_text").sendKeys("hello");
        driver.findElementById("com.twitter.android:id/button_tweet").click();
        System.out.println("Commend scenario completed.");
        System.out.println("**************************************************************");
        TimeUnit.SECONDS.sleep(10);

    }

    public static void DoRetweetScenario(AppiumDriver<MobileElement> driver)
            throws MalformedURLException, InterruptedException {

        System.out.println("Retweet scenario is starting.");
        driver.findElementById("com.twitter.android:id/inline_retweet").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.TextView[@text='Retweetle']").click();
        System.out.println("Retweet scenario completed.");
        System.out.println("**************************************************************");
        TimeUnit.SECONDS.sleep(10);

    }

    public static void DoRetweet2Scenario(AppiumDriver<MobileElement> driver)
            throws MalformedURLException, InterruptedException {

        System.out.println("Retweet2 scenario is starting.");
        driver.findElementById("com.twitter.android:id/inline_retweet").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.TextView[@text='Tweeti Alıntıla']").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.EditText[@text='Yorum ekle…']").sendKeys("Aaaaaa");
        driver.findElementById("com.twitter.android:id/button_tweet").click();
        System.out.println("Retweet2 scenario completed.");
        System.out.println("**************************************************************");
        TimeUnit.SECONDS.sleep(10);

    }

    public static void DoMesageScenario(AppiumDriver<MobileElement> driver)
            throws MalformedURLException, InterruptedException {

        System.out.println("Mesage scenario is starting.");
        driver.findElementById("com.twitter.android:id/dms").click();
        driver.findElementByXPath("//android.widget.RelativeLayout[@index='0']").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.EditText[@text='Bir mesaj başlat']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Bir mesaj başlat']").sendKeys("hello");
        driver.findElementById("com.twitter.android:id/send_dm_button").click();
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(10);
        driver.navigate().back();
        driver.findElementByXPath("//android.widget.LinearLayout[@content-desc='Anasayfa. Yeni öğeler']").click();
        System.out.println("Live scenario completed.");
        System.out.println("**************************************************************");

    }

    public static void DoFollowScenario(AppiumDriver<MobileElement> driver)
            throws MalformedURLException, InterruptedException {

        System.out.println("Follow scenario is starting.");
        driver.findElementByXPath("//android.widget.LinearLayout[@content-desc='Ara ve Keşfet']").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementById("com.twitter.android:id/trend_autoplayable_view_host").click();
        driver.findElementById("com.twitter.android:id/tweet_profile_image").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.Button[@text='TAKİP ET']").click();
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(10);
        driver.navigate().back();
        driver.findElementByXPath("//android.widget.LinearLayout[@content-desc='Anasayfa. Yeni öğeler']").click();
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Follow scenario completed.");
        System.out.println("**************************************************************");

    }

    public static void DoVoiceScenario(AppiumDriver<MobileElement> driver)
            throws MalformedURLException, InterruptedException {

        System.out.println("Voice scenario is starting.");
        driver.findElementById("com.twitter.android:id/dms").click();
        driver.findElementByXPath("//android.widget.RelativeLayout[@index='0']").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Kaydet']").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Kaydetmeyi durdur']").click();
        driver.findElementById("com.twitter.android:id/send_dm_button").click();
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(10);
        driver.navigate().back();
        driver.findElementByXPath("//android.widget.LinearLayout[@content-desc='Anasayfa. Yeni öğeler']").click();
        System.out.println("Voice scenario completed.");
        System.out.println("**************************************************************");

    }

    public static void DoSignOutScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Sign Out scenario is starting.");
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        driver.findElementByXPath("//android.widget.Button[@text='Tümünü kapat']").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.TextView[@text='Ayarlar']").click();
        driver.findElementByXPath("//android.widget.Button[@content-desc='Ara']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Ara']").sendKeys("twitter");
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.TextView[@text='Twitter']").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.TextView[@text='Depolama']").click();
        driver.findElementByXPath("//android.widget.Button[@text='Veriyi sil']").click();
        driver.findElementByXPath("//android.widget.Button[@text='Tamam']").click();
        TimeUnit.SECONDS.sleep(20);
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        driver.findElementByXPath("//android.widget.Button[@text='Tümünü kapat']").click();
        System.out.println("Sign Out scenario completed.");
        System.out.println("*********************************************************");
    }
}