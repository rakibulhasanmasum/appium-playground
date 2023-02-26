package com.alpine;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("TestBethi");
        options.setApp("/run/media/mdrakibulhasan/IF/trucklagbe_qa/appium-playground/src/main/resources/TL_OPS_19jan2023.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);

        WebElement phoneNumberField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
        phoneNumberField.sendKeys("01575629801");
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]")).click();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("8888");
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]")).click();
//        8888
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(5000);

        driver.quit();
    }
}
