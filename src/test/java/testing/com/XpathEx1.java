package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathEx1 {

    // when we not able to find the element using basic html locators we should use Xpath

    // Xpath is nothing but a address of an element
    // Xpath helps us to locate and interact with web element using html tag hirarchy

    // two types of xpath 1. full/absolute xpath    ex; /html/body/header/div/a
    // 2. partial/relative xpath.                  ex: //*[@id="btn-make-appointment"]
    // absolute xpath nobody uses and it's not recommonded it's not readable

    // partial xpath Basic Synatx  //tagname[@attribute='value']
    // ex  //input[@id='user-name']
    // UI automation is all about finding unique element locator which doesn't changes frequently and small and efficiant locator

     // <a
    // id="btn-make-appointment"
     // href="./profile.php#login"
     // class="btn btn-dark btn-lg">
     // Make Appointment
     // </a>
@Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //a[@id='btn-make-appointment']  1 way
        //a[@class='btn btn-dark btn-lg']  2 way
        // anchor tag so link text and partial text
        driver.findElement(By.xpath("//a[ @id='btn-make-appointment']"));


        // xpath with single attribute
        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();

        //xpath with multiple attribute
        driver.findElement(By.xpath("//a[@id='txt-username'][@name='username']")).sendKeys("manu");

    }
}
