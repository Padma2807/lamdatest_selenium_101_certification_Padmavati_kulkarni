package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

 public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.makemytrip.com");
        
 }

}
