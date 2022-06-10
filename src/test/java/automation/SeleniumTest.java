package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String a[]) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver","D:\\Prashant\\Automation\\fromGit\\batch\\march2022\\src\\test\\resources\\drivers\\chromedriver_win.exe");

        String basePath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",basePath+"/src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        Thread.sleep(5000);

        driver.close();
    }
}