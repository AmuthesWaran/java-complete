package raji2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement countryDropdown = driver.findElement(By.name("country"));
        Select selectCountry = new Select(countryDropdown);
        selectCountry.selectByVisibleText("INDIA");

        driver.findElement(By.name("submit")).click();

        driver.quit();
    }
}
