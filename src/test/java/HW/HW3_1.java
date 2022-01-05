package HW;

import Class1.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HW3_1 {

    @Test
    public void CorrectTemp() {
        practice.openURL("https://www.darksky.net/");
        String taketempnow = "//span[@class='summary swap']";
        By tempnowLocator = By.xpath(taketempnow);
        WebElement tempnowElement = practice.getDriver().findElement(tempnowLocator);
        String curTempfar = tempnowElement.getText();

        String currentTempFar = "//div[@id='header']/div[1]/div[1]/div[2]/span[1]";
        By farLocator = By.xpath(currentTempFar);
        WebElement farElement = practice.getDriver().findElement(farLocator);
        farElement.click();

        practice.sleep(2);

        String c_xpa = "//div[@id='header']//li[starts-with(text(),'˚C')][1]";
        By cLocator = By.xpath(c_xpa);
        WebElement change = practice.getDriver().findElement(cLocator);
        change.click();

        String xPathTemp = "//span[@class='summary swap']";
        By cLocatorTemp = By.xpath(xPathTemp);
        WebElement cElement = practice.getDriver().findElement(cLocatorTemp);
        String ctemp = cElement.getText();
        Assert.assertEquals(ctemp, "2˚ Clear.", "temperature changed");


    }

    @Test
    public void errorDisplayed() {

        practice.openURL("https://www.facebook.com/");

        practice.sleep(2);

        String takeText = "Create new account";
        By TextLocator = By.linkText(takeText);
        WebElement Button = practice.getDriver().findElement(TextLocator);
        Button.click();

        practice.sleep(2);

        String name = "firstname";
        By nameLocator = By.name(name);
        WebElement nameElement = practice.getDriver().findElement(nameLocator);
        nameElement.sendKeys("name");


        String lastName = "lastname";
        By lastNameLocator = By.name(lastName);
        WebElement lastNameElement = practice.getDriver().findElement(lastNameLocator);
        lastNameElement.sendKeys("SecondName");

        String number = "//input[@aria-label='Mobile number or email']";
        By numberLocator = By.xpath(number);
        WebElement numberElement = practice.getDriver().findElement(numberLocator);
        numberElement.sendKeys("322322453");

        String createPassword = "//input[@data-type='password']";
        By createPasswordLocator = By.xpath(createPassword);
        WebElement passwordElement = practice.getDriver().findElement(createPasswordLocator);
        passwordElement.sendKeys("zum322!");

        By monthLocator = By.id("month");
        WebElement monthElement = practice.getDriver().findElement(monthLocator);
        Select month = new Select(monthElement);
        month.selectByVisibleText("Nov");

        By dayLocator = By.name("birthday_day");
        WebElement dayElement = practice.getDriver().findElement(dayLocator);
        Select day = new Select(dayElement);
        day.selectByValue("7");

        By yearLocator = By.xpath("//select[@aria-label='Year']");
        WebElement yearElement = practice.getDriver().findElement(yearLocator);
        Select year = new Select(yearElement);
        year.selectByVisibleText("1994");

        String signInButtonValue = "websubmit";
        By signInLocator_button = By.name(signInButtonValue);
        WebElement signInButton = practice.getDriver().findElement(signInLocator_button);
        signInButton.click();

        practice.sleep(2);

        String message = "//div[starts-with(text(),'Please choose a gender')]";
        By messageLocator = By.xpath(message);
        WebElement messageElement = practice.getDriver().findElement(messageLocator);
        boolean messageDisp = messageElement.isDisplayed();
        Assert.assertTrue(messageDisp, "Error");

        practice.quitWebPage();
    }

    @Test
    public void BlogPostverify() {


        practice.openURL("https://www.darksky.net/");

        String textPart = "Dark Sky API";
        By textLocator = By.partialLinkText(textPart);
        WebElement textElement = practice.getDriver().findElement(textLocator);
        textElement.click();

        practice.sleep(2);

        String partText = "blog post";
        By partLocator = By.partialLinkText(partText);
        WebElement partElement = practice.getDriver().findElement(partLocator);
        partElement.click();

        String xpath_date = "//time[contains(text(),'June 7, 2021')]";
        By dateLocator = By.xpath(xpath_date);
        WebElement dateElement = practice.getDriver().findElement(dateLocator);
        String date = dateElement.getText();


        SimpleDateFormat day = new SimpleDateFormat("MMMM d, yyyy");

        boolean isMatch = true;
        try {
            day.format(day.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(true, date + "change format");

        practice.quitWebPage();

    }

    @Test
    public void verifyTempa() {


        practice.openURL("https://www.darksky.net/");

        String tempa = "feels-like-text";
        By tempaLocator = By.className(tempa);
        WebElement tempaElement = practice.getDriver().findElement(tempaLocator);
        String feelsLikeTemp = tempaElement.getText();
        String[] temp = feelsLikeTemp.split("˚");
        int tempNum = Integer.valueOf(temp[0]);

        String tempaLow = "low-temp-text";
        By tempaLowLocator = By.className(tempaLow);
        WebElement tempaLowElement = practice.getDriver().findElement(tempaLowLocator);
        String lowTemp = tempaLowElement.getText();
        String[] temp2 = lowTemp.split("˚");
        int tempNum2 = Integer.valueOf(temp2[0]);

        String tempaHigh = "high-temp-text";
        By tempaHighLocator = By.className(tempaHigh);
        WebElement tempaHighElement = practice.getDriver().findElement(tempaHighLocator);
        String highTemp = tempaHighElement.getText();
        String[] temp3 = highTemp.split("˚");
        int tempNum3 = Integer.valueOf(temp3[0]);

        boolean middle = ((tempNum < tempNum3) && (tempNum > tempNum2));

        Assert.assertTrue(middle, "failed");

        practice.quitWebPage();
    }
}




