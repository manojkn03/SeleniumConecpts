package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandleDemo {
    @Test
    public void test1(){
        WebDriver driver= new ChromeDriver();

        driver.get("https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//div[@class='MainNavBar_MainNavBar__ctaContainer__d6DcN']/a[2]/span")).click();

         Set<String> windowIDs=driver.getWindowHandles(); // in this we don't have get method so we can't extract individual windowid


        List<String> listWindowIDs= new ArrayList(windowIDs);// converting to list bcz it contains get(index) so we can get individual window
// Approach 1 when we have only 2 windows
        String parentWindow= listWindowIDs.get(0);
        System.out.println("Parent window is: "+parentWindow);
        String childWindow= listWindowIDs.get(1);
        System.out.println("Child window is: "+childWindow);
        System.out.println("-----------");
        // switch to child window
        driver.switchTo().window(childWindow);
        System.out.println(driver.getTitle());
        System.out.println("---------");
        //switch to parent window
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());


// Approach 2 when we have multiple windows

        for (String windID:listWindowIDs)
        {
           String title= driver.switchTo().window(windID).getTitle();

           if(title.equals("Best Selenium Practice Websites for Test Automation")){
               System.out.println(driver.getCurrentUrl());
               // also perform additional validations
               driver.close(); // just closes one the current driver window that is parent
           }
        }



    }
}
