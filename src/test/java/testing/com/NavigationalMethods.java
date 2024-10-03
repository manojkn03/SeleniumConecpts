package testing.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalMethods {
    @Test
    public void test() throws MalformedURLException {

        // driver.navigate().to(URL)
        // driver.navigate().forward()
        // driver.navigate().back()
        //driver.navigate().refresh().

        WebDriver driver= new ChromeDriver();
       // driver.get("https://demo.nopcommerce.com/);  - acceps the url only in the string format

        driver.navigate().to("https://demo.nopcommerce.com/");  // String format
        driver.navigate().to("https://bethsofttechnologies.com/");  //String format
        // internally it calls get method only
        // accepts String url format and also Url object

        // URL myURL= new URL("https://demo.nopcommerce.com/");   url in object form
        //driver.navigate().to(myURL);

        driver.navigate().to("https://bethsofttechnologies.com/");


        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();




    }
}
