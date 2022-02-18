package SeleniumSession;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoRegisteration {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\IdeaProjects\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Kiran");
        driver.findElement(By.id("LastName")).sendKeys("Valand");
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        Select select = new Select(day);
        select.selectByIndex(26);
        Select select1 = new Select(month);
        select1.selectByIndex(12);
        Select select2 = new Select(year);
        select2.selectByVisibleText("1985");
        driver.findElement(By.id("Email")).sendKeys("kiranvaland@hotmail.com");
        driver.findElement(By.id("Company")).sendKeys("UnifyTesting");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("Unify123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Unify123");
        driver.findElement(By.id("register-button"));

        driver.getTitle();
        System.out.println(driver.getTitle());

    }
}