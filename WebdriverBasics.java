package SeleniumSession;

import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

    public static void main(String[] args) throws InterruptedException {

        //set the path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\IdeaProjects\\Software\\chromedriver.exe");

        WebDriver driver  = new ChromeDriver(); // Child class object can be referred by parent interface
                                                // indirectly we have created instance of webdriver
        //navigate to a webpage

        driver.manage().window().maximize(); // maximises the window opened

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

       String title = driver.getTitle();
       System.out.println(title); // gets the webpage name
                                    // verify expected and actual results if website homepage is working
       driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driver.navigate().back();
        System.out.println(driver.getTitle());

        driver.navigate().forward();
        System.out.println(driver.getTitle());

        driver.navigate().back();
        System.out.println(driver.getTitle()); // lets the user go forwards and backwards

        if (title.equals("nopCommerce demo store")) {
           System.out.println("Correct title");
       }else{
           System.out.println("Incorrect title");
       }

       // close the browser
        driver.close();
       //driver.quit(); // another way to close the window
        Thread.sleep(5000);


    }
}
