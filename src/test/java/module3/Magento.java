package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String url = "//magento.softwaretestingboard.com";
        driver.get(url);

        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//a[@class='logo']/img"));
        WebElement cart = driver.findElement(By.xpath("//a[@class='action showcart']"));
        WebElement inputBox = driver.findElement(By.xpath("//input[@id= 'search']"));
        WebElement sale = driver.findElement(By.xpath("//span[@class = 'more button']"));

        WebElement hoodies =driver.findElement(By.xpath("(//ul[@class = 'items'])[2]/li[1]"));
        WebElement jackets = driver.findElement(By.xpath("(//ul[@class = 'items'])[2]/li[2]"));


    }
}
