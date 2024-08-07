package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathOperators {
    @Test
    public void test1(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // there are two operators 1. and  2. or

        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();

        //xpath with and operator : it will work when both attributes are correct
        driver.findElement(By.xpath("//input[@id='txt-username' and @name='username']")).sendKeys("manu");

        //xpath with or operator  : if any one attribute is correct then it will find the element
        driver.findElement(By.xpath("//input[@id='txt-password' or @name='pass']")).sendKeys("123");




    }
}
