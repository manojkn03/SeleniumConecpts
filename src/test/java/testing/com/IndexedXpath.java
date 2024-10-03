package testing.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IndexedXpath {
    @Test
    public void test(){

        WebDriver driver= new ChromeDriver();
        /*  Indexed XPath:
        This helps you target a specific element within a group of matching elements, using the index position.
        For example: (//div[@class='item'])[3]   */

    }
}
