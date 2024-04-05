package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuyPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bestbuy.com/");

        Thread.sleep(5000);

        WebElement searchInputBox = driver.findElement(By.className("search-input"));
        WebElement searchButton = driver.findElement(By.className("header-search-button"));

        searchInputBox.sendKeys("IPhone15");
        Thread.sleep(5000);

        searchButton.click();

        String currentUrl= driver.getCurrentUrl();
        System.out.println("Current URL : " + currentUrl);

        if(currentUrl.contains("searchpage")) {
            System.out.println("Test PAST!");

        }else{
            System.out.println("Test FAIL!");
        }

        driver.quit();


    }
}
