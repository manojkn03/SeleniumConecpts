package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HtmlLocators {

    @Test
    public void test() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebElement username= driver.findElement(By.id("login-username")); // finding an element using id locator
        username.sendKeys("admin@gmail.com");

        WebElement password=driver.findElement(By.name("password")); // finding an element using name locator
        password.sendKeys("123");

        WebElement signInButton=driver.findElement(By.id("js-login-btn"));
        signInButton.click();

            Thread.sleep(3000); // waiting mechanium using JVM not recommonded



        WebElement error_msg= driver.findElement(By.id("js-notification-box-msg"));
         String err_msg= error_msg.getText();

        Assert.assertEquals(err_msg, "Your email, password, IP address or location did not match");

        driver.close();



    }
}
