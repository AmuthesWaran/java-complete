package raji2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAndClose {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.quit();

    }

}
