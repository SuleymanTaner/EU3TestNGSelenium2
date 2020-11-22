package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {

//        open browser
//        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
//        enter any email
//        verify that email is displayed in the input box
//        click on Retrieve password
//        verify that confirmation message says ‘Your e-mail’s been sent!’


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password ");

        //http://practice.cybertekschool.com/forgot_password
        WebElement emailInputBox= driver.findElement(By.name("email"));

        String expectedEmail= "mike@cybertek.com";

        emailInputBox.sendKeys(expectedEmail);

        String actualEmail = emailInputBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);

        if(expectedEmail.equals(actualEmail)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();

        WebElement actualConfirmationMessage= driver.findElement(By.name("confirmation_message"));

        System.out.println(actualConfirmationMessage.getText());

        String expectedMessage= "Your e-mail's been sent!";
        String actualMessage = actualConfirmationMessage.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }


        Thread.sleep(3000);
        driver.quit();






    }
}
