package testing.com;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindElements {

    @Description(" get all the anchor tags in app.vwo page")
    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");

      List<WebElement>  anchor_tags= driver.findElements(By.tagName("a")); // it will get list of a tags in one page
        Thread.sleep(3000);
        //anchor_tags.get(0).click(); // to click on first link
        System.out.println(anchor_tags.size());



        for ( WebElement element: anchor_tags)
        {


            System.out.println(element.getText());

        }
     driver.quit();
    }
}
