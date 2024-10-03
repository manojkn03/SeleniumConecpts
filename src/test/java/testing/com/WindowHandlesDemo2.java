package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandlesDemo2 {
    @Test
    public void test1() throws InterruptedException {
       /* WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();


       List<WebElement> anc_tag= driver.findElements(By.tagName("a"));
        System.out.println(anc_tag.size());

        for (WebElement elemnent:anc_tag) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            elemnent.click();
        }

        Set<String> setWindowIDS= driver.getWindowHandles();

        List<String> listWindowIDS= new ArrayList(setWindowIDS);

        for (String element :listWindowIDS) {
            String title= driver.switchTo().window(element).getTitle();
            System.out.println(title);

            if(title.equals("Selenium (software) - Wikipedia")){
                driver.close(); // closes only one browser

            }

        }*/
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        Thread.sleep(3000);
        List<WebElement> all_a_tag =driver.findElements(By.tagName("a"));
        System.out.println(all_a_tag.size());
        for (WebElement element:all_a_tag){
            System.out.println(element.getText());
            element.click();

        }

        driver.quit();

    }


    }


