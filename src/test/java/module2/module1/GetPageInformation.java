package module2.module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetPageInformation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url = "http://dev-hrm.yoll.io/";

        driver.get(url);

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        String currentUrl = driver.getCurrentUrl();

        System.out.println("Actual URL: " + currentUrl);

        Thread.sleep(3000);
        Thread.sleep(Duration.ofSeconds(5));
        driver.quit();


    }
}
