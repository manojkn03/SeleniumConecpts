package testing.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium01 {

    @Test
    public void test(){

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.orangehrm.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getTitle(), "Human Resources Management Software | OrangeHRM");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.orangehrm.com/");
        driver.close();

    }
}
