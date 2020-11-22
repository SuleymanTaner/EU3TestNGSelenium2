package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); //API
        //WebDriverManager is a library. can you make chrome ready for me to automate
        //We have to enter this line every time we want to open chrome


        WebDriver driver=new ChromeDriver();
        //Webdriver represent the browser
        //we are creating driver for chrome browser
        //new ChromeDriver() --> this part will open chrome browser

        driver.get("https://cybertekschool.com");
        //.get(url) method used for navigation to page

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://facebook.com");






    }
}
