package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoLoginFunctionality {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\IdeaProjects\\Software\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("kiranvaland@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("Unify123");
        Thread.sleep(3000);
        driver.findElement(By.className("login-button")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();
        Thread.sleep(6000);
        driver.close();

        System.out.println("Automation Login Functionality for NopCommerce website successful");

    }
}
