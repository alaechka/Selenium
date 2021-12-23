package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void sleep(int second){
        try{
            Thread.sleep( second*1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
    static WebDriver driver;

    public static void openURL(String url){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public static WebDriver getDriver(){
        return driver;

    }
    public static void quitWebPage(){
        driver.quit();
    }




}
