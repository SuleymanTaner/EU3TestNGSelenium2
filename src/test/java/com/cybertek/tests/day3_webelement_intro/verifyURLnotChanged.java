package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
    public static void main(String[] args) throws InterruptedException {

//        open browser

//        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
//        click on Retrieve password
//        verify that url did not change

        //open browser
        WebDriver driver  = WebDriverFactory.getDriver("chrome");

        // go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.

        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedURL= driver.getCurrentUrl();

        // click on Retrieve Password
        //Webelement --> Interface that represent elements on the webpage
        //findelement --> method used to find element on page

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        Thread.sleep(2000);http://practice.cybertekschool.com/forgot_password

        retrievePasswordButton.click();

        String actualURL = driver.getCurrentUrl();

        // verify that url did not change

        if(expectedURL.equals(actualURL)){
            System.out.println(" PASS");
        }else {
            System.out.println(" FAIL" );
        }

        //close your browser
        driver.quit();

    }
}
