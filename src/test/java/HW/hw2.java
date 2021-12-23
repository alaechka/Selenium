package HW;

import Class1.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hw2 {
    @Test
    public void hw2(){

      practice.openURL("https://www.facebook.com/");
      String loginEmailIdValue="email";
      By loginEmailLocator=By.id(loginEmailIdValue);
      WebElement loginEmailBox=practice.getDriver().findElement(loginEmailLocator);
      loginEmailBox.sendKeys("%^&&*()");

       String loginPassidValue="pass";
       By loginPassLocator=By.id(loginPassidValue);
       WebElement loginPassBox=practice.getDriver().findElement(loginPassLocator);
       loginPassBox.sendKeys("abcd@1234");

       //String loginButtonTag="button";
       //By loginButtonLocator =By.tagName(loginButtonTag);
       //WebElement loginButton=practice.getDriver().findElement(loginButtonLocator);
       //loginButton.click();

        practice.sleep(2);
        By locatorUsingLinkText=By.linkText("Найдите свой аккаунт и войдите в систему.");
        WebElement createPageLink=practice.getDriver().findElement(locatorUsingLinkText);
        boolean isCreatepageDisplaed =createPageLink.isDisplayed();
        Assert.assertTrue(isCreatepageDisplaed,"say something");

    }
    @Test
    public void hw2Task2(){
        practice.openURL("https://www.facebook.com/");
        String linkText="Messenger";
        By locatorLinkText=By.linkText(linkText);
        WebElement locatorForMesseng=practice.getDriver().findElement(locatorLinkText);
        locatorForMesseng.click();

        //String loginEmailIdValue="email";
        //By loginEmailLocator=By.id(loginEmailIdValue);
        //WebElement loginEmailBox=practice.getDriver().findElement(loginEmailLocator);
        //loginEmailBox.sendKeys("");

        //String loginPassidValue="pass";
        //By loginPassLocator=By.id(loginPassidValue);
        //WebElement loginPassBox=practice.getDriver().findElement(loginPassLocator);
        //loginPassBox.sendKeys("");
        practice.sleep(5);

        String loginButtonTag="button";
        By loginButtonLocator =By.tagName(loginButtonTag);
        WebElement loginButton=practice.getDriver().findElement(loginButtonLocator);
        loginButton.click();
        practice.sleep(2);


    }
}
