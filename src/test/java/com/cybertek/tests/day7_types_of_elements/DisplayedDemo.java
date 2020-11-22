package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
         driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement userNameInput = driver.findElement(By.id("username"));

        System.out.println("userNameInput.isDisplayed() = " + userNameInput.isDisplayed());

        // Task
        //verify username inputbox is not displayed on the screeen

        Assert.assertFalse(userNameInput.isDisplayed(), "verify inputbox is NOT displayed");
        //click start button
        driver.findElement(By.cssSelector("#start>button")).click();
        Thread.sleep(5000);
        // verify username displayed on the screen
        Assert.assertTrue(userNameInput.isDisplayed(), "verify username inputbox is displayed");




    }

}
