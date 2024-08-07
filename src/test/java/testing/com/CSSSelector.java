package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSSelector {


    @Test
    public void test1(){

        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        // css selector is nothing but a string expression/ html tag hirarchy using which we can locate and interct with a web element.
        // 1st way using tagmane and id
        // Syntx    tagname#id          tagname is optional
        //example   input#login-username
        driver.findElement(By.cssSelector("input#login-username")).sendKeys("manoj");

        // 2nd way using tagmane and class
        // Syntx    tagname.classname          tagname is optional
        //example    span.Login-Button
        driver.get("https://www.underarmour.in/");
        driver.findElement(By.cssSelector("span.Login-Button")).click();


        // 3nd way using tagmane and attribute
        // Syntx    tagname[attribute='value']          tagname is optional
        //example   input[data-qa='hocewoqisi']
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.cssSelector("input[data-qa='hocewoqisi']")).sendKeys("manu");


        // 4th way using tagmane and classname and attribute
        // Syntx    tagname.classname[attribute='value']          tagname is optional
        //example    span.Login-Button[data-qa='hocewoqisi']



    }
}
