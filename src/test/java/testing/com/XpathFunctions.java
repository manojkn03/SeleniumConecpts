package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathFunctions {
    @Test
    public void test(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        // Xpath functions helps to locate the dynamic web elements

        // 1. xpath with text() function we can use with any html tag however match should be complete text not partial
         // <button class="btn btn-info" id="submit" name="submit" ">Button</button>
         driver.findElement(By.xpath("//button[text()='Button']")).click();



        //capturing just innertext(meaning there is no attributes and anchror tag just a label
        //      <span style="margin: 0px; padding: 0px;">First name:</span>
        boolean isDisplayed= driver.findElement(By.xpath("//span[text()='First name:']")).isDisplayed();
        System.out.println(isDisplayed);






        // 2. xpath with contains()  we can use with any attribute and also with text() function.
        // with contains no need to specify full values of the attribute part of the value is enough
        //  //tagname[contains(@id,'part of value')]
        //  //tagname[contains(text(),'part of text']     //button[contains(text(),'Butt')]

        driver.findElement(By.xpath(" //button[contains(text(),'Butt')]")).click(); //with text() function.

        driver.findElement(By.xpath("//button[contains(@id,'subm')]")).click();  // with attribute

        // 3. startswith()
        //  // tagname[starts-with(@attribute,'value']   //button[starts-with(@id,'subm')]
        //  // tagname[starts-with(text(),'value']        //button{starts-with(text(),'But')]

        driver.findElement(By.xpath("//button[starts-with(@id,'sub')]")).click();
        driver.findElement(By.xpath("//button[starts-with(text(),'But')]")).click();

      //





    }



}