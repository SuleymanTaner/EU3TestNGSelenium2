package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLChanged {

    public static void main(String[] args) throws InterruptedException {


//        Verify URL changed
//        open browser
//        go to http://practice.cybertekschool.com/forgot_password Links to an external site.//  http://practice.cybertekschool.com/forgot_password //        click on Retrieve password
//        verify that url changed to http://practice.cybertekschool.com/email_sent

        WebDriver driver = WebDriverFactory.getDriver("chrome");

            driver.get("http://practice.cybertekschool.com/forgot_password ");

        //http://practice.cybertekschool.com/forgot_password
        WebElement emailInputBox= driver.findElement(By.name("email"));

            emailInputBox.sendKeys("mike@cybertek.com");

                String currentUrl = driver.getCurrentUrl();

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

            retrievePasswordButton.click();

                String actualUrl= driver.getCurrentUrl();

        if(currentUrl.equals(actualUrl)){
            System.out.println("fail");
        }else{
            System.out.println("pass");
            System.out.println("actualUral = " + actualUrl);
        }

        Thread.sleep(3000);
        driver.quit();








    }
}
