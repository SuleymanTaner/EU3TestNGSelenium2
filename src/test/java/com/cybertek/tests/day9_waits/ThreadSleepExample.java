package com.cybertek.tests.day9_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ThreadSleepExample {


    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

        @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        // driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");

        Thread.sleep(6000);

        driver.findElement(By.id("username")).sendKeys(" Mike Smith");

    }

}
