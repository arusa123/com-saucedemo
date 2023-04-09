import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Edge";
    static WebDriver driver;
    static String baseURL = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        //setup browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Invalid browser");
        }
        //open URL
        driver.get(baseURL);
        //implicit wait to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Print the title of URL
        driver.getTitle();
        //Print the Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source"+ driver.getPageSource());
        //Enter email id in the email field
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        //password in the password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //close the browser
        driver.close();
    }
}
