package com.anhtester.testcases;

import com.anhtester.common.BaseTestDemoApp;
import com.anhtester.drivers.DriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class LocatorsDemoApp extends BaseTestDemoApp {
    @Test
    public void testDemoLocators(){
        WebElement headerPage1= DriverManager.getDriver().findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/productIV"));
        System.out.println(headerPage1.getText());
        WebElement headerPage2 = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("title"));
        System.out.println(headerPage2.getText());
        WebElement productName1 = DriverManager.getDriver().findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Product Title\" and @text=\"Sauce Labs Backpack\"]\n"));
        System.out.println(productName1.getText());
        WebElement productName2 = DriverManager.getDriver().findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")"));
        System.out.println(productName2.getText());

        DriverManager.getDriver().findElement(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]")).click();
        DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Tap to add product to cart")).click();
        sleep(3);
        DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Tap to add product to cart")).click();
        sleep(3);



        // WebElement productImage = DriverManager.getDriver().findElement(AppiumBy.iOSNsPredicateString(""));
    //    productImage.click();
    }
}
