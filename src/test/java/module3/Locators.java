package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        driver.get("http://dev-hrm.yoll.io/");
        Thread.sleep(5000);

        WebElement usernameInput= driver.findElement(By.name("txtUsername"));
        WebElement passwordInput= driver.findElement(By.name("txtPassword"));

        usernameInput .sendKeys("unini");
        Thread.sleep(3000);
        usernameInput.clear();
        Thread.sleep(3000);
        usernameInput .sendKeys("yoll-student");
        Thread.sleep(3000);
        passwordInput.sendKeys("Bootcamp5#");
        Thread.sleep(3000);

        WebElement loginButton =  driver.findElement(By.id("btnLogin"));

        loginButton.click();

        Thread.sleep(3000);

        driver.quit();






    }
}
