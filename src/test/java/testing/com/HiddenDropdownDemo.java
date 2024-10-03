package testing.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenDropdownDemo {

    @Test
    public void test1() {
        // there are three types of dropdowns
        //1. Select dopdowns
        //2. Bootstrap dropdown
        //3. Hidden dropdown
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
         //3. Hidden dropdown
         // in the html page  dropdown values and options are not visible
         // latest applications use this hidden dropdown method
         // in selector hub we need use debugger
         // In hidden dropdown usually it is a single select


    }
}
