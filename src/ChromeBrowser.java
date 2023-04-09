import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseURL = "https://www.saucedemo.com/";
        //SetUp Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseURL);
        //implicit wait to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Print the title of the page
        driver.getTitle();
        //Print the current URL
        System.out.println("Current URL:" + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source "+ driver.getPageSource());
        //Enter email in the email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user");
        //password in the password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //close the browser
        driver.close();

    }
}
