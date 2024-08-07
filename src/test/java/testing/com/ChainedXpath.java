package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChainedXpath {

     @Test
    public void test(){

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=common/home");

        // in chained xpath we first find the xpath for parent element then we navigate to child elements
       //Example 1
        boolean status= driver.findElement(By.xpath("//div[@class='navbar-header']/a/img")).isDisplayed();
        System.out.println(status);

        driver.findElement(By.xpath("//div[@class='navbar-right hidden-xs']/a[1]")).click();


        //example 2
        driver.get("https://www.tommybahama.com");
        driver.findElement(By.xpath("//div[@class='hide-md-down']/div/a/span[2]")).click();


    }
}
