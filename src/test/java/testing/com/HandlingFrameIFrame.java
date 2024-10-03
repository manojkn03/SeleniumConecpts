package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingFrameIFrame {
    @Test
    public void test(){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // frame and iframe are diffrent however handling is same in selenium

        driver.get("https://ui.vision/demo/webtest/frames/");

        //  there are theree ways to switch to frames
        //1. driver.switchTo().frame(id or name) - using id or name
        // 2. driver.switchTo().frame(webelement) - using we element
        //3. driver.switchTo().frame(index)


        // 1. driver.switchTo().frame(webelement) - using web element

        WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); //  passing frame as a webelement
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Manoj");

        driver.switchTo().defaultContent(); // to come out of iframe to normal web page



        //2. if we have id or name we can directly switch to frame
        // driver.switchTo().frame("id value or name value");

        // Handling Frame inside a frame
       //frame 3
        WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("this is frame 3");

       // inner frame- part of frame
        // if we have id or name directly switch to innerframe
        driver.switchTo().frame(0); // switching to innerframe using index
        driver.findElement(By.xpath("//div[@id='i8']/div[3]/div")).click();
        driver.switchTo().defaultContent();// this will directly come out of inner frame as well as frame 3



    }
}
