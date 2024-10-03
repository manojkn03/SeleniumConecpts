package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathAxes {

    // using xpath axes we can navigate to any element in the DOM.
    // xpath axes is nothing but a relationship between the current element to the target element
    @Test
    public void test1() throws InterruptedException {
        //  1. locating a parent element
        // Synatx(first write xpath) //tagname[@id='value']/parent::tagname





        // 2. locating a child element
        // systax  //a[@title='Sign In']/child::span[2]



    }



}
