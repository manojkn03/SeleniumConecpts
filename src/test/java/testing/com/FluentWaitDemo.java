package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitDemo {
    @Test
    public void test1(){
        // Work more efficiatly than explicit however little advanced and complex.
        // The diffrence here is polling time

        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");

          // Declaration of wait statement
        Wait<WebDriver> myWait= new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10)) // maximum wait
                .pollingEvery(Duration.ofSeconds(4)) // it checks the element for evert 2 seconds
                .ignoring(NoSuchElementException.class);

        //usage
        WebElement txtUsername= myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.id("login-username"));
            }
        });
        txtUsername.sendKeys("Manoj");


        WebElement password= myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.id("login-password"));
            }
        });
        password.sendKeys("Manoj");

        WebElement signin_button= myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath("//button[@id='js-login-btn']"));
            }
        });
        signin_button.click();

       WebElement error= myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.id("js-notification-box-msg"));
            }
        });



        //Assert.assertEquals(error_text1,"Your email, password, IP address or location did not match");





    }
}
