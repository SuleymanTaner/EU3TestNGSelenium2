package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    //task
    // go to amazon.com
    // search for selenium
    // click search button
    // verify 1-48 0f 304 results fro "selenium"

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("https://www.amazon.com");

        WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

                searchbox.sendKeys("selenium");

        WebElement searchButton= driver.findElement(By.xpath("//input[@value='Go'] "));

        searchButton.click();

        WebElement result= driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String resultText = result.getText();
        System.out.println("resultText = " + resultText);

        String expectedResult = "1-48 of 117 results for";

        if(resultText.equals(expectedResult)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }

}
