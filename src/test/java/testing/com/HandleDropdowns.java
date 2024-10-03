package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleDropdowns {
    @Test
    public void test1(){
        // there are three types of dropdowns
        //1. Select dopdowns
        //2. Bootstrap dropdown
        //3. Hidden dropdown
        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1. Select dopdowns
        WebElement dropCountry= driver.findElement(By.xpath("//select[@id='country']"));
        Select select= new Select(dropCountry);
        select.selectByVisibleText("France"); // select the dropdown bases on visible text in dropdown
        select.selectByValue("usa"); // select the dropdown based on value attribute
        select.selectByIndex(5);      // select the dropdown based on index

        // capturing all the options in the dropdown
       List<WebElement> options= select.getOptions();
        System.out.println(options.size());  // given total no of dropdown options

        // printing all option in a console
          for (int i=0; i< options.size();i++){
            System.out.println(options.get(i).getText());
          }


    }
}
