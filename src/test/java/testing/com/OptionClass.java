package testing.com;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OptionClass {

    @Test
    public void launchBrowser()
    {

        // option class is user to set the arguments to browser before doing some action in the browser
        ChromeOptions options= new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--start-maximized");

        options.addArguments("--disable-popup-blocking");
        options.addArguments("--incognito");

         // page load stratergy
        //  options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver1= new ChromeDriver(options);
        driver1.get("https://www.orangehrm.com");
        driver1.close();



    }
}
