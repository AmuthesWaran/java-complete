package raji2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/guru99home/");

        driver.switchTo().frame("a077aa5e");  // Switch to the frame by name or ID
        WebElement jmeterLink = driver.findElement(By.xpath("//*[contains(text(),'JMeter Made Easy')]"));
        jmeterLink.click();

        driver.quit();
    }
}
