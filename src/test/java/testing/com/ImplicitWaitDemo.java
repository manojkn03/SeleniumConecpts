package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWaitDemo {
    @Test
    public void test1(){

        //2. Implicit wait provided by selenium Webdriver
        //-this is like a global statement which we write once after creating driver instance and it is applicable to all the elements
        // driver.manage().timeouts().implicitlyWait(DURATION.inSeconds(5));
        //  advantage is 1. easy to use and one line statement, 2. Performance is better compare to Thread.sleep(), bcz if element is available at 1 second it will continue with rest of the code without waiting complete specified time
        // Dis advantage is if the specified time is not sufficiant we wil get exception


        WebDriver driver1 = new ChromeDriver();

        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver1.get("https://app.vwo.com");
        WebElement username1=driver1.findElement(By.id("login-username"));
        username1.sendKeys("admin@admin.com");
        WebElement password1=driver1.findElement(By.id("login-password"));
        password1.sendKeys("admin");
        WebElement loginButton1=driver1.findElement(By.xpath("//button[@data-qa='sibequkica']"));
        loginButton1.click();

        WebElement error1 = driver1.findElement(By.cssSelector("div#js-notification-box-msg"));
        String error_text1= error1.getText();

        Assert.assertEquals(error_text1,"Your email, password, IP address or location did not match" );
        driver1.close();


    }
}
