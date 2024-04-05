package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.bestbuy.com/");

        WebElement searchInput = driver.findElement(By.id("gh-search-input"));
        WebElement searchButton = driver.findElement(By.className("header-search-button"));

        searchInput.sendKeys("IPhone15");

        Thread.sleep(2000);

        searchButton.click();
        Thread.sleep(2000);

        List<WebElement> products= driver.findElements(By.className("sku-title"));

        System.out.println("Items found: "+ products.size());

        for(WebElement product: products){
        String text = product.getText();
            System.out.println("Tytle : " + text);

            if(text.toLowerCase().contains("iPhone")){
                System.out.println("Item Relevant");
            }else{
                System.err.println("Item Irrelevant");
            }
        }


        driver.quit();





    }
}
