package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTablesDemo {
    @Test
    public void test() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 3 tyeps of web tables are there
        //1. static web table- fixed no of rows and column
        //2. Dynamic web table- data keeps on changing not fixed
        // 3. Table with pagination-

        //1. static web table- fixed no of rows and column
        driver.get("https://testautomationpractice.blogspot.com/");
        // to find the no of rows in a table

        int row_size = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("No of rows are: " + row_size); //7

        // to find the no of columns
        int col_size = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
        System.out.println("No of columns are " + col_size); //4

        // to read data from specific row and specific column( 5th row and 1 column)
        String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(value);

        // to read all the data from the table(1st way)

     /* for (int r=2; r<=row_size; r++){
           for(int c=1; c<=col_size;c++){
               String value1=   driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
               System.out.println(value1);
           }
       }*/

        // to read all the data from the table(2nd way)
        /*
        //table[@name='BookTable']//tr[5]//td[1]
        String first_part = "table[@name='BookTable']tbody//tr[";
        String second_part = "]//td[";
        String third_part = "]";


        for (int i = 2; i <= row_size; i++) {
            for (int j = 1; j <= col_size; j++) {
                String dynamic_xpath = first_part+i+second_part+j+third_part;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data);
            }
        }*/


         // to print book name whose auther name is mukesh
          /*for (int r=2; r<=row_size;r++){
            String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
             if(data.equals("Mukesh")){
                String bookName= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                 System.out.println(bookName);
             }*/

        // to find total price of all books
         int total=0;
          for(int r=2; r<=row_size;r++){
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
              total=total+Integer.parseInt(price);

             }
         System.out.println("Total price is:"+total);

        }
    }

