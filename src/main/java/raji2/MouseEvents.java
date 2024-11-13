package raji2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://intranet.natwestgrouppeople.com");

        Actions actions = new Actions(driver);
        WebElement humanResource = driver.findElement(By.linkText("Human Resource"));
        actions.moveToElement(humanResource).perform();

        WebElement beyond = driver.findElement(By.linkText("Beyond"));
        beyond.click();

        driver.quit();
    }
}
