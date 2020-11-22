package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {

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
    public void Test1(){
        driver.get("http://practice.cybertekschool.com/upload");

        // locating choose file button
        WebElement chooseFile= driver.findElement(By.name("file"));
        chooseFile.sendKeys("/Users/staner/Desktop/file.txt");

        WebElement uploadButton= driver.findElement(By.id("file-submit"));
        uploadButton.click();

        String actualFileName= driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualFileName,"file.txt");

    }

    @Test

    public void test2(){

        // yukaridaki calismanin filepathexample classinda cekilerek calisilmasi

        driver.get("http://practice.cybertekschool.com/upload");

        // locating choose file button
        WebElement chooseFile= driver.findElement(By.name("file"));
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/textfile.txt";

        String fullPath = projectPath + "/" + filePath;

        chooseFile.sendKeys(fullPath);

        WebElement uploadButton= driver.findElement(By.id("file-submit"));
        uploadButton.click();

        String actualFileName= driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualFileName,"textfile.txt");

    }
    }