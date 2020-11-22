package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {
    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement chekBox1= driver.findElement(By.xpath("//input[1]"));
        WebElement chekBox2= driver.findElement(By.xpath("//input[2]"));

        // how to verify checkbox is selected ot not

        System.out.println("chekBox1.isSelected() = " + chekBox1.isSelected());
        System.out.println("chekBox2.isSelected() = " + chekBox2.isSelected());

        Assert.assertFalse(chekBox1.isSelected(), "verify checkbox is not Selected");
        Assert.assertTrue(chekBox2.isSelected(), "verify checkbox is  Selected");

        //how to check boxes

        Thread.sleep(2000);
        chekBox1.click();

        //verify after click

        Assert.assertTrue(chekBox1.isSelected(), "verify checkbox is  Selected");
        Assert.assertTrue(chekBox2.isSelected(), "verify checkbox is  Selected");

        Thread.sleep(5000);

        driver.quit();

    }
}
