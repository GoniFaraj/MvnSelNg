package module4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException  {


    WebDriver driver = new ChromeDriver();
    driver.get("http://dev-hrm.yoll.io/");

    String title = driver.getTitle();
    Thread.sleep(3000);
    System.out.println(title);

    driver.quit();

    }
}
