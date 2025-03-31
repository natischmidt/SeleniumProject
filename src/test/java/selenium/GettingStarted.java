package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;
public class GettingStarted {
    @Test
    public void testGoogleSearch() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
        Thread.sleep(5000);
        driver.quit();
    }
}