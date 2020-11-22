package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropDown {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropDownElement = driver.findElement(By.id("dropdownMenuLink"));

        //click the dropdown to see available options
        dropDownElement.click();

        List<WebElement> dropDowndOptions = driver.findElements(By.className("dropdown-item"));

        System.out.println("dropDowndOptions.size() = " + dropDowndOptions.size());
        Assert.assertEquals(dropDowndOptions.size(),5,"verify size of options");

        //print them one by one
        for (WebElement option : dropDowndOptions){
            System.out.println(option.getText());
        }

        //click yahoo

        dropDowndOptions.get(2).click();

    }}