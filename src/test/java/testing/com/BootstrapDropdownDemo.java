package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class BootstrapDropdownDemo {
    @Test
    public void test1() {
        // there are three types of dropdowns
        //1. Select dopdowns
        //2. Bootstrap dropdown
        //3. Hidden dropdown
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        //2. Bootstrap dropdown
        // in bootstarp dropdown we don't have builtin methods we have to handle completely using xpath
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); // open the other dropdown options

        // selecting single option in dropdown
       // driver.findElement(By.xpath("//input[@value='Java']")).click();

        // to select all the options and find out the size
     List<WebElement>  options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
     System.out.println(options.size());
     System.out.println("------------------");

     /*for (WebElement op:options) {    // using foreach
         System.out.println(op.getText());
         op.click();
        }*/
    // to select multi options only

        for (WebElement op:options){
            if(op.getText().equals("Java") || op.getText().equals("Python")){
                op.click();
            }else {
                System.out.println("Values are not matching");
            }

        }


    }
}
