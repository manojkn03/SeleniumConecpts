package testing.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchingBrowser {

 @Test
    public void launchBrowser()
    {
     //  SearchContext(I) -> WebDriver(I) -> RemoteWebDriver(C) -> ChromeDriver(C), EdgeDriver(C)..
        // Interface interfaceRef= new Class();  class upcasting

        // Launching a browser and getting the page title

        WebDriver driver1= new ChromeDriver();
        WebDriver driver2= new EdgeDriver();
        driver1.get("https://www.google.com");
        driver2.get("https://www.orangehrm.com");
        System.out.println(driver1.getTitle());
        System.out.println(driver2.getTitle());
        driver1.close();

    }

}
