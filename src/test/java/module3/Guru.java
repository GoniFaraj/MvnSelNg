package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/newtours/");

        Thread.sleep(5000);

        WebElement usernameInput= driver.findElement (By.name("userName"));

        WebElement passwordInput= driver.findElement (By.name("password"));



        usernameInput .sendKeys ("test@email.com");
        Thread.sleep(3000);
        passwordInput.sendKeys("test");
        Thread.sleep(3000);

        WebElement submitButton =  driver.findElement (By.name("submit"));

        submitButton.click();
        Thread.sleep(3000);

        WebElement vacations= driver.findElement(By.partialLinkText("Vacations"));
        vacations.click();

        Thread.sleep(10000);

        WebElement register = driver.findElement(By.linkText("REGISTER"));
        register.click();

        Thread.sleep(10000);

        String expectedUrlPostFix= "/register.php";

        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.endsWith(expectedUrlPostFix)){
            System.out.println("Registration page Test: PASSED");
        }else{
            System.err.println("Registration : FAILED");
        }



        driver.quit();




    }
}