package testing.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAuthenticatedAlert {
    @Test
    public void test(){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


        // here authenticated popup/alert are be handled using swithTo() command and also using explicit wait
        // we need to pass the username and password in the url only with proper syntax
        //syntax is
        // https://username:password@actualurl without https
        //  https://admin:admin@the-internet.herokuapp.com/basic_auth
// process is called Injecting the username and pass along with url

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");  // modified url

    }
}
