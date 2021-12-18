package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseTest {
    @Test
    public void verifyAmazon(){
        //int result= 2+2;
       // Assert.assertEquals(result, 4,"Error");

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");

        WebDriver driver= new ChromeDriver();
       driver.get("https://www.amazon.com/");

        String url="https://www.amazon.com/";
        driver.navigate().to(url);

        String webUrl=driver.getCurrentUrl();
        Assert.assertEquals(url,webUrl,"Error");
        driver.quit();
    }
}
