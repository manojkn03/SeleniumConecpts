package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.Set;

public class WebDriverMethods {
    @Test
    public void test() throws InterruptedException {
        // diffrent type of methods generally we use in selenium
        //1. Get methods - we can ccess these methods through WebDriver instance
        // driver.get(URL)- opens the url on the browser
        // driver.getTitle()- returns the title of the page
        // driver.getCurrentUrl()- returns the current url of the page
        ///driver.getWindowHandle()- returns the ID of the single browser window
        // driver.getWindowHandles()- returns the ID's of multiple  browser window

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       String windowID=driver.getWindowHandle();
        System.out.println(windowID);
        System.out.println("-----------");


        /*WebElement link=driver.findElement(By.xpath("//div[@class='social-link']/ul/li[1]/a/div/img"));
        link.click();
       Set<String> windowIDDs= driver.getWindowHandles();
        System.out.println(windowIDDs);*/

        // 2. Conditional methods - access these methods through webelement
        // return boolean values(true/false)
        // isDisplayed() , isEnabled(), isSelected()

        //1. isDisplayed   can be used for any web element
        Thread.sleep(5000);
        WebElement logo=driver.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']"));
        System.out.println("Logo displayed or not:"+logo.isDisplayed());

     // 2. isEnabled used to check weather the field enabled or disabled
        Boolean input_status=driver.findElement(By.cssSelector("input#Form_submitForm_EmailHomePage")).isEnabled();
        System.out.println("Input box enabled or not:" +input_status);

        // isSelected() - we can use to check the element is selected or not( radioboxes, dropdowns and checkboxes)
        driver.get("https://awesomeqa.com/practice.html");
        WebElement radiobox= driver.findElement(By.xpath("//input[@id='sex-0']"));
        radiobox.click();
        System.out.println("Radio box selected or not"+radiobox.isSelected());

        //3 Browser  methods
        // 1. close(), 2. quit()
        // driver.close() will close only the current browser.
        //driver.quit() will close all the browser windows and also terminated the session

        //4.




    }
}
