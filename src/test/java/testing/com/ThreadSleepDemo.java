package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitMethods {
    @Test
    public void test1() throws InterruptedException {
         // Sunchronization: When selenium execution is faster and application response is low we will get this problem

        // we can handle this by using wait statements

        // 1. Thread.sleep()- provided by java, not ideal way
        // Provided by java not in selenium, it will halt the java execution by specified time
        // advanatge is easy to use
        // disadvantage is 1. if time is not sufficient exception occurs, and 2. automation scipts performance become slow bcz if element is available at 1 second still waits for complete specified seconds.

        ChromeOptions options= new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        WebElement username=driver.findElement(By.id("login-username"));
        username.sendKeys("admin@admin.com");
        WebElement password=driver.findElement(By.id("login-password"));
        password.sendKeys("admin");
        WebElement loginButton=driver.findElement(By.xpath("//button[@data-qa='sibequkica']"));
        loginButton.click();

        Thread.sleep(3000); // halts java program exection by 3 seconds

        WebElement error = driver.findElement(By.cssSelector("div#js-notification-box-msg"));
        String error_text= error.getText();

        Assert.assertEquals(error_text,"Your email, password, IP address or location did not match" );
        driver.close();

        //2. Implicit wait provided by selenium Webdriver
        //-this is like a global statement which we write once after creating driver instance and it is applicable to all the elements
        // driver.manage().timeouts().implicitlyWait(DURATION.inSeconds(5));
        //  advantage is 1. no need to write everytime, 2. Performance is better compare to Thread.sleep(), bcz if element is available at 1 second it will continue with rest of the code without waiting complete specified time
        // Dis advantage is if the specified time is not sufficiant we wil get exception
        // Slightly better than Thread.sleep()

        WebDriver driver1 = new ChromeDriver(options);

        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://app.vwo.com");
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


        //3. Explicit wait provided by Webdriver



    }
}
