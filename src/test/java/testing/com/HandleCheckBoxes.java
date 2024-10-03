package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HandleCheckBoxes {
    @Test
    public void test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //1. Selecting indivisual checkbox

        // driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2. selecting all the checkboxes in a webpage
        //input[@class='form-check-input' and @type='checkbox'] find a common attribute in all and filter with checkbox
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        /*
        //1way easy with for each read all checkbox one by one and click
        for(WebElement checkbox:checkboxes) {
            checkbox.click();
        }

       // 2 way
        for (int i=0;i< checkboxes.size();i++){
            checkboxes.get(i).click();
        }
*/
        //3. Selecting last 3 checkboxes
        // total no pf checkboxes-the no checkboxes we want to select= starting index
        //7-3=4

        /*for (int i = 4; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }*/

        //4. To select the first 3 checkboxes
        // 0, 1, 2 index will be clicked
        for (int i=0; i<3; i++){
            checkboxes.get(i).click();
        }
        Thread.sleep(7);

        // to unselect the selected checkbox

        for (int i=0; i<checkboxes.size();i++){
            if(checkboxes.get(i).isSelected()){
                checkboxes.get(i).click();
            }
        }


    }
}
