package example.instagram.instagram_android;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class instagram_and extends example.instagram.base {

    public instagram_and() throws IOException {
        super(makeDriver("Android"));
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        instagram_and instance = new instagram_and();
        AppiumDriver<MobileElement> driver = instance.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        DoOpenAppScenario(driver);
        DoLoginScenario(driver);
        DoProfileScenario(driver);
        DoShareScenario(driver);
        DoLiveScenario(driver);
        DoFollowScenario(driver);
        DoMessageScenario(driver);
        DoVoiceScenario(driver);
        DoCallScenario(driver);
        DoVideoScenario(driver);
        DoSearchScenario(driver);
        DoClipScenario(driver);
        DoShoppingScenario(driver);
        DoOptionsScenario(driver);
        DoSignoutScenario(driver);
    }

    public static void DoOpenAppScenario(AppiumDriver<MobileElement> driver) throws InterruptedException {

        driver.findElementByXPath("//android.widget.TextView[@text='Instagram']").click();
        driver.findElementByXPath("//android.widget.Button[@text='YUKARIDAKİLERDEN HİÇBİRİ']").click();
        TimeUnit.SECONDS.sleep(20);

    }

    public static void DoLoginScenario(AppiumDriver<MobileElement> driver) throws InterruptedException {

        System.out.println("Login scenario is starting.");
        driver.findElementByXPath("//android.widget.Button[@text='Giriş Yap']").click();
        TimeUnit.SECONDS.sleep(15);
        System.out.println("Login scenario completed.");
        System.out.println("*********************************************************");

    }

    public static void DoShareScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException {

        System.out.println("Share foto scenario is starting.");
        driver.findElementById("com.instagram.android:id/action_bar_left_button").click();
        driver.findElementByXPath("//android.widget.Button[@content-desc='Gönderi']").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/next_button_imageview").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/next_button_imageview").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/next_button_imageview").click();
        System.out.println("Share foto scenario completed.");
        System.out.println("*********************************************************");
    }

    public static void DoLiveScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException {

        System.out.println("Live scenario is starting.");
        driver.findElementById("com.instagram.android:id/action_bar_left_button").click();
        driver.findElementByXPath("//android.widget.Button[@content-desc='Canlı']").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/ar_effect_in_tray_icon").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementById("com.instagram.android:id/iglive_header_close").click();
        driver.findElementByXPath("//android.widget.Button[@text='Videoyu Bitir']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Medyayı Sil']").click();
        driver.findElementByXPath("//android.widget.Button[@text='Sil']").click();
        System.out.println("Live scenario completed.");
        System.out.println("*********************************************************");
    }

    public static void DoFollowScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException {

        System.out.println("Follow scenario is starting");
        driver.findElementByXPath("//android.widget.Button[@content-desc='Hareketler']").click();
        driver.findElementById("com.instagram.android:id/row_recommended_user_follow_button").click();
        driver.findElementByXPath("//android.widget.Button[@text='Takip Et']").click();
        driver.findElementByXPath("//android.widget.Button[@text='Takip Et']").click();
        driver.navigate().back();
        System.out.println("Follow scenario is completed");
        System.out.println("*********************************************************");

    }

    public static void DoMessageScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Message scenario is starting");
        driver.findElementByXPath("//android.widget.Button[@content-desc='Mesaj']").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc='Samir Aslanlı']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Mesaj...']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Mesaj...']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.Button[@text='Gönder']").click();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Message scenario is completed");
        System.out.println("*********************************************************");
    }

    public static void DoVoiceScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Voice scenario is starting");
        MobileElement longpress = driver.findElementById("com.instagram.android:id/row_thread_composer_voice");
        LongPressOptions longPressOptions = new LongPressOptions();
        longPressOptions.withDuration(Duration.ofSeconds(10)).withElement(ElementOption.element(longpress));
        TouchAction action = new TouchAction(driver);
        action.longPress(longPressOptions).release().perform();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Voice scenario is completed");
        System.out.println("*********************************************************");
    }

    public static void DoCallScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Call scenario is starting");
        driver.findElementByXPath("//android.widget.Button[@content-desc='Instagram Sesli Arama']").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='Aramayı bitir']").click();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Voice scenario is completed");
        System.out.println("*********************************************************");
    }

    public static void DoVideoScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Call scenario is starting");
        driver.findElementByXPath("//android.widget.Button[@content-desc='Instagram Video Araması']").click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='Aramayı bitir']").click();
        TimeUnit.SECONDS.sleep(5);
        driver.navigate().back();
        driver.navigate().back();
        System.out.println("Voice scenario is completed");
        System.out.println("*********************************************************");
    }

    public static void DoProfileScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Profile scenario is starting");
        driver.findElementById("com.instagram.android:id/row_feed_profile_header").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/media_set_row_content_identifier").click();
        driver.findElementById("com.instagram.android:id/row_feed_button_like").click();
        driver.findElementById("com.instagram.android:id/row_feed_button_save").click();
        driver.findElementById("com.instagram.android:id/row_feed_button_comment").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Yorum ekle...']").sendKeys("nice");
        driver.findElementByXPath("//android.widget.TextView[@text='Paylaş']").click();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElementById("com.instagram.android:id/feed_tab").click();
        System.out.println("Voice scenario is completed");
        System.out.println("*********************************************************");
    }

    public static void DoSearchScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Search scenario is starting");
        driver.findElementById("com.instagram.android:id/search_tab").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Ara']").click();
        driver.findElementById("com.instagram.android:id/action_bar_search_edit_text").sendKeys("hadise");
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/row_search_user_info_container").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/search_tab").click();
        driver.findElementById("com.instagram.android:id/image_button").click();
        driver.findElementById("com.instagram.android:id/feed_tab").click();
        System.out.println("Search scenario is completed");
        System.out.println("*********************************************************");
    }

    public static void DoClipScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Clip scenario is starting");
        driver.findElementById("com.instagram.android:id/clips_tab").click();
        driver.findElementById("com.instagram.android:id/like_button").click();
        driver.findElementById("com.instagram.android:id/comment_button").click();
        driver.findElementById("com.instagram.android:id/layout_comment_thread_edittext").sendKeys("good");
        driver.findElementByXPath("//android.widget.TextView[@text='Paylaş']").click();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElementById("com.instagram.android:id/feed_tab").click();
        System.out.println("Clip scenario is completed");
        System.out.println("*********************************************************");
    }

    public static void DoShoppingScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Shopping scenario is starting");
        driver.findElementById("com.instagram.android:id/shopping_tab").click();
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc='Mağazalar Düğmesi']").click();
        driver.findElementByXPath("//android.widget.Button[@text='Mağazayı Gör']").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/shopping_tab").click();
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc='Videolar Düğmesi']").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/metadata_overlay").click();
        TimeUnit.SECONDS.sleep(5);
        driver.navigate().back();
        driver.findElementById("com.instagram.android:id/shopping_tab").click();
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc='Editörün seçtikleri Düğmesi']").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/image").click();
        TimeUnit.SECONDS.sleep(5);
        driver.navigate().back();
        driver.findElementById("com.instagram.android:id/shopping_tab").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementByXPath("//android.widget.Button[@content-desc='Dilek Listesi']").click();
        TimeUnit.SECONDS.sleep(10);
        driver.navigate().back();
        driver.findElementById("com.instagram.android:id/shopping_tab").click();
        System.out.println("Shopping scenario is completed");
        System.out.println("*********************************************************");
    }

    public static void DoOptionsScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Options scenario is starting");
        driver.findElementById("com.instagram.android:id/wrapper").click();
        driver.findElementByXPath("//android.widget.Button[@content-desc='Seçenekler']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Arşiv']").click();
        driver.findElementById("com.instagram.android:id/day_cover_image").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/archive_download_button").click();
        TimeUnit.SECONDS.sleep(10);
        driver.navigate().back();
        System.out.println("Options scenario is completed");
        System.out.println("*********************************************************");
    }

    public static void DoSignoutScenario(AppiumDriver<MobileElement> driver)
            throws InterruptedException, MalformedURLException {

        System.out.println("Signout scenario is starting");
        driver.findElementByXPath("//android.widget.Button[@content-desc='Seçenekler']").click();
        driver.findElementById("com.instagram.android:id/menu_option_text").click();

        driver.findElementById("com.instagram.android:id/row_search_edit_text").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("com.instagram.android:id/row_search_edit_text").sendKeys("Çıkış Yap");
        driver.findElementByXPath("//android.widget.TextView[@text='Çıkış Yap']").click();
        driver.findElementByXPath("//android.widget.Button[@text='Çıkış Yap']").click();
        TimeUnit.SECONDS.sleep(5);
        driver.navigate().back();
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        driver.findElementByXPath("//android.widget.Button[@text='Tümünü kapat']").click();
        System.out.println("Signout scenario is completed");
        System.out.println("*********************************************************");
    }

}