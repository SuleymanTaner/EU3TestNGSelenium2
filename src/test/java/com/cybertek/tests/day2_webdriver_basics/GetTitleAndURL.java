package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndURL {
    public static void main(String[] args) {
        //Task

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       driver.get("http://practice.cybertekschool.com");

       //getting title with selenium
        String title = driver.getTitle();

        //soutv + enter to print variable name and value
        System.out.println("title = " + title);
        // getCurrentUrl --> the the url from browser
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        //getPageSource()--> gets the source of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

        driver.quit();


    }
}

