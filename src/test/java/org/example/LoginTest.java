package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("VERSION", "11");
        capabilities.setCapability("deviceName","ZF622732C8");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appActivity","com.mmt.travel.app.home.ui.SplashActivity");
        capabilities.setCapability("appPackage","com.makemytrip");
        capabilities.setCapability("app","C:\\Users\\vaibh\\OneDrive\\Desktop\\QA Testing\\MakeMyTrip - Flights & Hotels_9.3.1_APKPure\\com.makemytrip.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Automation Started.......");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("com.makemytrip:id/continueButton")).click();
        driver.findElement(By.id("com.google.android.gms:id/credential_avatar")).click();
        Thread.sleep(4000);
    }

//
//    @Test(priority = 1)
//    public void login() throws InterruptedException {
//        driver.findElement(By.id("com.makemytrip:id/continueButton")).click();
//        driver.findElement(By.id("com.google.android.gms:id/credential_avatar")).click();
//        Thread.sleep(4000);
//    }


    @Test
    public void bookFlight() throws InterruptedException {
        String flightIcon = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.Button";

        String from = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.RelativeLayout";

        String fromAirport = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]";

        String toAirport = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]";

        String passenger = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[2]";

        String flight = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]";

        String addPassenger = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView";

        String firstName = "//android.view.ViewGroup[@content-desc=\"FIRST_NAME\"]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText";

        String lastName = "//android.view.ViewGroup[@content-desc=\"LAST_NAME\"]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText";

        String seat1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.view.ViewGroup[71]/android.widget.ImageView";

        String seat2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.view.ViewGroup[70]/android.widget.ImageView";

        driver.findElement(By.xpath(flightIcon)).click();
        driver.findElement(By.id("com.makemytrip:id/selected_from_city_text_layout")).click();
        driver.findElement(By.id("com.makemytrip:id/departure_city_input")).sendKeys("Bengaluru");
        driver.findElement(By.xpath(fromAirport)).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.makemytrip:id/selected_to_city_text_layout")).click();
        driver.findElement(By.id("com.makemytrip:id/arrival_city_input")).sendKeys("Mumbai");
        driver.findElement(By.xpath(toAirport)).click();
        driver.findElement(By.id("com.makemytrip:id/constraintLayout5")).click();
        driver.findElement(By.xpath("//f[@content-desc=\"15 AUG 2024 Tap to select\"]")).click();
        driver.findElement(By.id("com.makemytrip:id/btnDone")).click();
        driver.findElement(By.id("com.makemytrip:id/traveller_and_cabin_layout")).click();
        driver.findElement(By.xpath(passenger)).click();
        driver.findElement(By.id("com.makemytrip:id/done_button")).click();
        driver.findElement(By.id("com.makemytrip:id/search_button_flat")).click();
        driver.findElement(By.id("com.makemytrip:id/iv_selected")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"20:00\").instance(0))"));
        driver.findElement(By.xpath(flight)).click();
        driver.findElement(By.id("com.makemytrip:id/btnBookNow")).click();
        driver.findElement(By.id("com.makemytrip:id/fare_family_cont")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"No, I will book without trip secure.\").instance(0))"));
        driver.findElement(By.id("com.makemytrip:id/tvNo")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"+ ADD NEW ADULT\").instance(0))"));
        driver.findElement(By.xpath(addPassenger)).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"GENDER\"]/android.widget.LinearLayout/android.widget.TextView[1]")).click();
        driver.findElement(By.xpath(firstName)).sendKeys("Vaibhav");
        driver.findElement(By.xpath(lastName)).sendKeys("Kumbhar");
        driver.findElement(By.id("com.makemytrip:id/confirm_button")).click();
        driver.findElement(By.xpath(addPassenger)).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"GENDER\"]/android.widget.LinearLayout/android.widget.TextView[1]")).click();
        driver.findElement(By.xpath(firstName)).sendKeys("Hari");
        driver.findElement(By.xpath(lastName)).sendKeys("Mane");
        driver.findElement(By.id("com.makemytrip:id/confirm_button")).click();
        driver.findElement(By.id("com.makemytrip:id/review_tv")).click();
        driver.findElement(By.id("com.makemytrip:id/right_cta")).click();
        driver.findElement(By.xpath(seat1)).click();
        driver.findElement(By.xpath(seat2)).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.makemytrip:id/review_tv")).click();
        driver.findElement(By.id("com.makemytrip:id/review_tv")).click();

    }

    @Test
    public void trainBooking() throws InterruptedException {

        String trainIcon = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.Button/android.widget.ImageView";
        String bookTrain = "//android.view.ViewGroup[@content-desc=\"Book Trains Tickets\"]/android.widget.TextView";
        String from = "//android.view.ViewGroup[@content-desc=\"From, Enter City, Station name or Station code\"]";
        String fromData = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText";
        String fromStation = "\t\n" +
                "//android.view.ViewGroup[@content-desc=\"Mumbai, Lokmanya Tilak Terminus Railway Station, Mumbai, , Maharashtra, LTT\"]/android.widget.TextView[2]";
        String to = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText";
        String toStation = "//android.view.ViewGroup[@content-desc=\"Nagpur, Junction, Nagpur, , Maharashtra, NGP\"]";
        String calender = "//android.view.ViewGroup[@content-desc=\"DATE, 26 Jul, Today, Friday\"]/android.widget.TextView[2]";
        String date = "(//android.view.ViewGroup[@content-desc=\"1\"])[2]";
        String search = "//android.view.ViewGroup[@content-desc=\"SEARCH\"]/android.widget.TextView";

        driver.findElement(By.xpath(trainIcon)).click();
        driver.findElement(By.xpath(bookTrain)).click();
        driver.findElement(By.xpath(from)).click();
        driver.findElement(By.xpath(fromData)).sendKeys("Mumbai");
        driver.findElement(By.xpath(to)).sendKeys("Nagpur");
        Thread.sleep(3000);
        driver.findElement(By.xpath(toStation)).click();
        driver.findElement(By.xpath(calender)).click();
        driver.findElement(By.xpath(date)).click();
        driver.findElement(By.xpath(search)).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Vidarbha Express\").instance(0))"));
        driver.findElement(By.id("train_listing__trainCard_5_trainAvailabilityCardList_available_GN_3A")).click();

    }
}
