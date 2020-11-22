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

public class
SelectDropDownTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver= WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 1. locate your webelement as usual with unique locator
        WebElement dropDownElement = driver.findElement(By.id("state"));

        //2. Creating new object from Select class and constructor
        Select stateDropDown=new Select(dropDownElement);

        // 3. get options => returns all the available options from the dropdown

        List<WebElement> options = stateDropDown.getOptions();

        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        }
        @Test
        public void test2() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/dropdown");

            // 1. locate your webelement as usual with unique locator
            WebElement dropDownElement = driver.findElement(By.id("state"));

            //2. Creating new object from Select class and constructor
            Select stateDropDown=new Select(dropDownElement);

            //verify that first selection is Select a state
            String expectedOption= "Select a State";
            String actualOption = stateDropDown.getFirstSelectedOption().getText();

            Assert.assertEquals(actualOption,expectedOption, "verify first selection");

            // how to select options from dropdown
           // 1. select using visible text

            Thread.sleep(2000);

            stateDropDown.selectByVisibleText("Virginia");

            expectedOption="Virginia";
            actualOption = stateDropDown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption,expectedOption, "verify first selection");

            // 2.select using index
            Thread.sleep(3000);
            stateDropDown.selectByIndex(51);

            expectedOption="Wyoming";
            actualOption = stateDropDown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption,expectedOption, "verify first selection");

            //3. SELECT BY VALUE

            Thread.sleep(3000);
            stateDropDown.selectByValue("TX");

            expectedOption="Texas";
            actualOption = stateDropDown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption,expectedOption, "verify first selection");



        }
}
