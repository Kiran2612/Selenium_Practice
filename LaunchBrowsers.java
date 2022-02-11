package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class LaunchBrowsers {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\IdeaProjects\\Software\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(5000);
        driver.close();
        Thread.sleep(3000);

        System.setProperty("webdriver.edge.driver", "C:\\Users\\kiran\\IdeaProjects\\Software\\msedgedriver.exe");
        WebDriver driver1 = new EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://www.bing.com/");
        Thread.sleep(5000);
        driver1.close();
        Thread.sleep(3000);

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\IdeaProjects\\Software\\geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.mozilla.org/en-GB/");
        Thread.sleep(5000);
        driver2.close();
        Thread.sleep(3000);

    }
}
