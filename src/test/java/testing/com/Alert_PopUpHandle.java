package testing.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alert_PopUpHandle {
@Test
    public void test() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

       // 3 types of alerts are there
        // 1. normal alert, 2. Conform box, 2. Prompt alert
        // Alerts are not web elements we can't insepct and find elements


        //1. Handling normal alert
        driver.get("https://testautomationpractice.blogspot.com/");
        /*
        WebElement normal_alert= driver.findElement(By.xpath("//button[text()='Alert']"));
        normal_alert.click();
        Thread.sleep(5000);
       // 1 way to accept  driver.switchTo().alert().accept();  directly accepts without any validation

     // 2nd way if need to validate text

         Alert myAlert= driver.switchTo().alert();
         String alertText= myAlert.getText();
         Assert.assertEquals(alertText, "I am an alert box!");
         myAlert.accept();
         */


        //2. Handling confirm box alerts - using OK button or Cancel button
      /*
        driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();// closes the alert using OK button
       // driver.switchTo().alert().dismiss(); closes the alert using Cancel button
     */


      // 3. Handling Prompt box alert - Input box with OK and Cancel button
        driver.findElement(By.xpath("//button[text()='Prompt']")).click();
        Thread.sleep(5000);
        Alert myAlert=driver.switchTo().alert();
        myAlert.sendKeys("Hello Welcome");  // enters the data in alert input box
        myAlert.accept();                              // clicks OK button



    }
}
