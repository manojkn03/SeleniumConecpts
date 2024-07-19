package testing.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NaviagteCommand {

    // driver.get(); doesn't support back(), farward() and refresh()

    // So we need to use navigate().to()

    @Test
    public void test() throws InterruptedException, MalformedURLException {
       ChromeDriver driver = new ChromeDriver();


        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://www.orangehrm.com"));
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);

        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
    }
}

