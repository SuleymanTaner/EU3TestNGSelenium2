package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }

    @Test
    public void oneImage() {
        driver.get("http://practice.cybertekschool.com/hovers");


        WebElement img = driver.findElement(By.tagName("img"));
        Actions actions= new Actions(driver);
        actions.moveToElement(img).perform();

        WebElement oneImage = driver.findElement(By.xpath("//h5[.='name: user1']"));

        Assert.assertTrue(oneImage.isDisplayed(), "verify text is displayed");
    }




    // hover each image in the website
    //verify each name: user text is displayed
    @Test
    public void test2() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/hovers");

        for (int i=1; i <=3; i++ ) {

            // normalde xpath uzantisi " (//img)[1] " child kodlamayla bu durumu string manipulation
            // ile lopp degerine atadik
            //(//img)[2] for img 2
            //img)[3]  for img 3

            String xpathImg = "(//img)[" + i + "]";
            WebElement img = driver.findElement(By.xpath(xpathImg));

            Actions actions=new Actions(driver);
            Thread.sleep(3000);
            actions.moveToElement(img).perform();

            String textXpath= "//h5[.='name: user"+i+"']";
            WebElement oneImage = driver.findElement(By.xpath(textXpath));

            System.out.println(textXpath);
            Assert.assertTrue(oneImage.isDisplayed(), "verify text is displayed");


        }


    }
    }
