package com.alpine;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {
    @Test
    public void test() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 4 API 33");
        options.setApp("//Users//r_hasan//Desktop//appium-starter//src//main//resources//TLOps_7August2022_Local.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("01819616939");
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]")).click();

        driver.quit();
    }
}
