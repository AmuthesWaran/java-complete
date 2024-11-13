package raji2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        username.sendKeys("student");
        password.sendKeys("Password123");
        submitButton.click();

        String successMessage = driver.findElement(By.className("post-title")).getText();
        if(successMessage.equals("Logged In Successfully")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }

        driver.quit();
    }
}
