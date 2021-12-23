package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lastCl {
    @Test
    public void useLocators(){
        practice.openURL("https://www.facebook.com/");
        String loginEmailIdValue="email";
        By loginEmailLocator=By.id(loginEmailIdValue);
        WebElement loginEmailBox=practice.getDriver().findElement(loginEmailLocator);
        loginEmailBox.sendKeys("testing@test.com");

        String loginPassidValue="pass";
        By loginPassLocator=By.id(loginPassidValue);
        WebElement loginPassBox=practice.getDriver().findElement(loginPassLocator);
        loginPassBox.sendKeys("abcd@1234");

        String loginButtonTag="button";
        By loginButtonLocator =By.tagName(loginButtonTag);
        WebElement loginButton=practice.getDriver().findElement(loginButtonLocator);
        loginButton.click();}

        public void useLinkLocator(){
        practice.openURL("https://www.facebook.com/");
        practice.sleep(2);
        String partialTextCreatePage="a Page";
        By createPageLocator= By.partialLinkText(partialTextCreatePage);
        WebElement createPageLink= practice.getDriver().findElement(createPageLocator);

    }

    public void checkEnabled (){

        practice.openURL("https://www.facebook.com/");
        practice.sleep(2);

        String loginButtonTag="button";
        By loginButtonLocator=By.tagName(loginButtonTag);
        WebElement loginButton=practice.getDriver().findElement(loginButtonLocator);
        boolean isLoginButtonEnabled=loginButton.isEnabled();
        Assert.assertTrue(isLoginButtonEnabled,"Login button is not enable");
        practice.quitWebPage();

        practice.openURL("https://www.facebook.com/");
        practice.sleep(2);
        String partialTextCreatePage="a Page";
        By createPageLocator=By.partialLinkText(partialTextCreatePage);
        WebElement createPageLink=practice.getDriver().findElement(createPageLocator);
        boolean isCreatePageEnabled=createPageLink.isEnabled();
        boolean isCreatepageDisplaed = createPageLink.isDisplayed();
        Assert.assertTrue(isCreatePageEnabled&&isCreatepageDisplaed,"say something");


    }


        /**
         * to type on a webElement
         * Method: sendKeys()
         * input:String(data that we want to type in the webElement)
         */
        /**
         * To click on a webElement
         * Method:click()
         */
        /**
         * To find a webElement
         * Method: findElement
         * input:By(the locator of webElement which we want to find(
         * return type:WebElement
         * if the element is found using the locator,
         * findElement-method return type in the WebElement
         *
         * else
         *  no suchElement Exception
         */
        /**
         * create a locator using tagName
         * in chropath check if tagName unique //tagname
         * By lacatorUsingTagName=By.tagName(tagNameValue")
         *
         */
        /**
         * class attribute to create locator
         * in cropath, check if class-value is unique, use formula
         * By locatorUsingClassName=By.classname(classValue"):
         *
         *
         * Links:
         * 1.Always with 'a'tag
         * text associated with link (or a tag) is known as LinkTag
         * By locatorUsingLinkText= By.  locatorUsingLinkText=By.linkText(link text value");
         *
         */

        /**
         * partialLinkText
         * in chropath check if link text value is unique
         * By locatorUsingPartialLinkText=By.partialLinkText(Link Text")
         */

    /**
     * Xpath
     */

    /**
     * how to find element is enabled or not
     * return type boolean
     * Method: isEnabled
     * (find unique address to reach webelement
     * create locator
     * use locator to find web element
     */

    /**
     * if webElement displayed or not
     * Method isDisplayed()
     * return Type: boolean
     */

    /**if webElement selected or not
     * Method: isSelected()
     * return type:boolean
     */
}

