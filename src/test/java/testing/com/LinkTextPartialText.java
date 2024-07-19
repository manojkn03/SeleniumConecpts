package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkTextPartialText {


    @Test
    public void test(){

        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");

        // we can locate an element using LinkText and PartialLinkText but it's applicable only for anchor <a /a> tag

        /*WebElement anc_tag= driver.findElement(By.linkText("Start a free trial")); // using link text in needs full exact match text
        System.out.println(anc_tag.getAttribute("href"));
        anc_tag.click();*/

        WebElement anc_tag1= driver.findElement(By.partialLinkText("Start a free")); // using link text in needs full exact match text
        System.out.println(anc_tag1.getAttribute("href"));
        anc_tag1.click();

        driver.quit();

    }
}
