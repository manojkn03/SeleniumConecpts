package testing.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleAlertsUsingExplicitWait {
    //Handling alert without driver.switchTo().alert()
    @Test
    public void test(){
    // handling alert using explicit wait
        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));// declaration of exp wait

        driver.findElement(By.xpath("//button[text()='Alert']")).click();

       Alert myAlert=  wait.until(ExpectedConditions.alertIsPresent());
       myAlert.accept();



    }
}
