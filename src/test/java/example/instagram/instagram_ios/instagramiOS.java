package example.instagram.instagram_ios;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class instagramiOS extends example.instagram.base {

    public instagramiOS() throws IOException {
        super(makeDriver("iOS"));
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        instagramiOS instance = new instagramiOS();
        AppiumDriver<MobileElement> driver = instance.getDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        instance.Login(driver);
        instance.ExploreScreen(driver);
        instance.MainScreen(driver);
        instance.ReelsScreen(driver);
        instance.ShoppingScreen(driver);

    }

    /**
     * Failed to create reels scenario must be collected manually
     * 
     * @param driver
     */

    public void Login(AppiumDriver<MobileElement> driver) {

        System.out.println("*** Login scenario is starting... ***");

        GetElementByXP("//XCUIElementTypeLink[@name='login-instead-button']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='username-field']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='username-field']").sendKeys("testi.yapan2@gmail.com");
        GetElementByXP("//XCUIElementTypeSecureTextField[@name='password-field']").click();
        GetElementByXP("//XCUIElementTypeSecureTextField[@name='password-field']").sendKeys("T1e2s3t4.");
        GetElementByXP("//XCUIElementTypeButton[@name='login-button']").click();

    }

    public void MainScreen(AppiumDriver<MobileElement> driver) {

        System.out.println("*** MainScreen scenario is starting... ***");

        GetElementByXP("//XCUIElementTypeButton[@name='mainfeed-tab']").click();

        // Click on post on home page
        GetElementByXP("//XCUIElementTypeButton[@name='feed-item-header-user-button']").click();

        // Followers for another account
        GetElementByXP("//XCUIElementTypeOther[@name='user-detail-header-followers']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='search-text-input']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='search-text-input']").sendKeys("beyza");
        GetElementByXP("//XCUIElementTypeStaticText[@name='Suggested']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Back']").click();
        GetElementByXP("//XCUIElementTypeOther[@name='user-detail-header-following-button']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='search-text-input']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='search-text-input']").sendKeys("kenya");
        GetElementByXP("//XCUIElementTypeButton[@name='Back']").click();

        // Click on post on another profile
        GetElementByXP("//XCUIElementTypeOther[@name='user-detail-header-media-button']").click();
        GetElementByXP("//XCUIElementTypeCell[@name='Reels']").click();
        GetElementByXP("//XCUIElementTypeCell[@name='Video']").click();
        GetElementByXP("//XCUIElementTypeCell[@name='Tagged']").click();

        GetElementByXP("//XCUIElementTypeButton[@name='notification-subscription-button']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='notification-subscription-button']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='user-detail-header-similar-accounts-button']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='user-detail-header-similar-accounts-button']").click();

        GetElementByXP("//XCUIElementTypeButton[@name='About This Account']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='mainfeed-tab']").click();
        GetElementByXP("//XCUIElementTypeCell[@name='Feed']").click();

    }

    public void ExploreScreen(AppiumDriver<MobileElement> driver) {

        System.out.println("*** ExploreScreen scenario is starting... ***");

        GetElementByXP("//XCUIElementTypeButton[@name='explore-tab']").click();
        GetElementByXP("(//XCUIElementTypeImage[@name='media-thumbnail-cell'])[1]").click();
        GetElementByXP("(//XCUIElementTypeButton[@name='feed-item-header-user-button'])[1]").click();
        GetElementByXP("//XCUIElementTypeButton[@name='user-detail-header-follow-button']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Similar posts']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Explore']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='search-text-input']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='search-text-input']").sendKeys("jayz");
        GetElementByXP("//XCUIElementTypeButton[@name='Search']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='search-user']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='search-audio']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='search-tag']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='search-tag']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Cancel']").click();
    }

    public void ReelsScreen(AppiumDriver<MobileElement> driver) {

        System.out.println("*** ReelsScreen scenario is starting... ***");

        GetElementByXP("//XCUIElementTypeButton[@name='reels-tab']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='like-button']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='more-options-button']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Save']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='camera-entry-point-button']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='sundial-camera-close-button']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='reels-tab']").click();

    }

    public void ShoppingScreen(AppiumDriver<MobileElement> driver) {

        System.out.println("*** ShoppingScreen scenario is starting... ***");

        GetElementByXP("//XCUIElementTypeButton[@name='shopping-tab']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='search-text-input']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='search-text-input']").sendKeys("t-shirt");
        GetElementByXP("//XCUIElementTypeCell[@name='search-collection-view-cell-1275555534']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Menu']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='See more actions']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Copy shop URL']").click();

        GetElementByXP("//XCUIElementTypeStaticText[@name='Browse']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='All products']").click();
        GetElementByXP("//XCUIElementTypeOther[@name='Search this shop']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='ig-text-field']").click();
        GetElementByXP("//XCUIElementTypeTextField[@name='ig-text-field']").sendKeys("Unisex T-shirt");
        GetElementByXP("//XCUIElementTypeButton[@name='Search']").click();
        GetElementByXP("(//XCUIElementTypeButton[@name='Save'])[1]").click();
        GetElementByXP("(//XCUIElementTypeButton[@name='Save'])[2]").click();
        GetElementByXP("//XCUIElementTypeButton[@name='shopping-tab']").click();

        GetElementByXP("//XCUIElementTypeStaticText[@name='Cancel']").click();
        GetElementByXP("(//XCUIElementTypeCell[@name='product-tile-cell'])[1]").click();

        GetElementByXP(
                "//XCUIElementTypeApplication[@name='Instagram']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton")
                .click();

        GetElementByXP("//XCUIElementTypeButton[@name='Shop']").click();

        GetElementByXP("//XCUIElementTypeButton[@name='Wishlist']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Shop']").click();

    }

    public void ProfileScreen(AppiumDriver<MobileElement> driver) {

        System.out.println("*** ProfileScreen scenario is starting... ***");

        GetElementByXP("//XCUIElementTypeButton[@name='profile-tab']").click();
        GetElementByXP("//XCUIElementTypeOther[@name='user-detail-header-media-button']").click();
        GetElementByXP("//XCUIElementTypeOther[@name='user-detail-header-followers']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Back']").click();
        GetElementByXP("//XCUIElementTypeOther[@name='user-detail-header-following-button']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Back']").click();

    }

    public void Settings(AppiumDriver<MobileElement> driver) {

        System.out.println("*** Settings scenario is starting... ***");

        GetElementByXP("//XCUIElementTypeButton[@name='profile-tab']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='profile-more-button']").click();
        GetElementByXP("//XCUIElementTypeCell[@name='account-settings']").click();

        // Notification area
        GetElementByXP("//XCUIElementTypeStaticText[@name='Notifications']").click();
        GetElementByXP("//XCUIElementTypeStaticText[@name='Posts, Stories and Comments']").click();
        GetElementByXP("(//XCUIElementTypeOther[@name='Confirm'])[3]").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Notifications']").click();
        GetElementByXP("//XCUIElementTypeStaticText[@name='Following and Followers']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Notifications']").click();
        GetElementByXP("//XCUIElementTypeStaticText[@name='Messages and Calls']").click();
        GetElementByXP("(//XCUIElementTypeOther[@name='Confirm'])[3]").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Notifications']").click();
        GetElementByXP("//XCUIElementTypeStaticText[@name='From Instagram']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Settings']").click();

        // Privacy area
        GetElementByXP("//XCUIElementTypeStaticText[@name='Privacy']").click();
        GetElementByXP("//XCUIElementTypeStaticText[@name='Hidden Words']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Privacy']").click();
        GetElementByXP("//XCUIElementTypeStaticText[@name='Comments']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Back']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Settings']").click();

        // Account area
        GetElementByXP("//XCUIElementTypeStaticText[@name='Account']").click();
        GetElementByXP("//XCUIElementTypeStaticText[@name='Personal information']").click();
        GetElementByXP("//XCUIElementTypeButton[@name='Account']").click();
        GetElementByXP("//XCUIElementTypeStaticText[@name='Saved']").click();

    }

}
