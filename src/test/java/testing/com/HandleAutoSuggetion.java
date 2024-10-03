package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HandleAutoSuggetion {
    @Test
    public void test1() throws InterruptedException {
        //
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("macbook");
        Thread.sleep(5000);
        // to handle the autosuggetions we need to enable debugger mode to inspect element
        // in the event listener remove the blur property
        // or use selecter hub to go debugger mode Or in source type debugger and run
        // so we can find the element of suggestions

        List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'YGcVZO _2VHNef')]"));
        System.out.println(options.size());
        System.out.println("-----");

        /*  for (WebElement op:options) {
            if(op.getText().equals("macbook m1")){
                op.click();
            }
             }

        }*/

            for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
            if(options.get(i).getText().equals("macbook m1")){
                options.get(i).click();
                break;
            }

        }
    }
}

