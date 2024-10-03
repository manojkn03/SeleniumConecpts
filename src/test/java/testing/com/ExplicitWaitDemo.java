package testing.com;

import net.bytebuddy.implementation.attribute.FieldAttributeAppender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitDemo {

    @Test
    public void test1(){

        //3. Explicit wait provided by selenium Webdriver
        // explicit wait works based on some condition , if condition is true it will return the element and go to next statement without waiting complete specified time
        // it is condition based so it will work more effectively
        //  advantage is Better than implicit wait ,

        WebDriver driver1 = new ChromeDriver();

        WebDriverWait wait= new WebDriverWait(driver1, Duration.ofSeconds(10)); // explicit wait declaration

        driver1.get("https://app.vwo.com");

       WebElement username1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
       username1.sendKeys("admin@admin.com");

        WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));
        password.sendKeys("admin@admin.com");


        WebElement loginButton1=driver1.findElement(By.xpath("//button[@data-qa='sibequkica']"));
        loginButton1.click();

        WebElement error1 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#js-notification-box-msg")));
        String error_text1= error1.getText();

        Assert.assertEquals(error_text1,"Your email, password, IP address or location did not match" );
        driver1.close();


    }
}
