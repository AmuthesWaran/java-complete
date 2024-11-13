package raji2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleWebTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows in the table: " + rows.size());

        driver.quit();
    }
}
