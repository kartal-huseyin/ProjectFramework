package tests;

import org.bouncycastle.asn1.cms.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

import static utils.Driver.*;
import static actions.InputAction.*;
import static actions.ButtonAction.*;
import static actions.SelectAction.*;
import static actions.PropertyAction.*;

public class Test1 {

    @Test
    public void test1() {

        driver().get(getProperty("url"));
        sendKeys("Username", getProperty("username"));
        sendKeys("Password", getProperty("password"));
        click("Login");
        click("Admin");
        clickSelect("User Role");
        click("Job");


    }


    @Test
    public void test2() {
        driver().get("https://demoqa.com/checkbox");
        By locator = By.xpath("//button[@title=\"Toggle\"]");

        System.out.println("driver().findElement(locator) = " + driver().findElements(locator));
        //  clickNew(locator);


        List<WebElement> element = driver().findElements(locator).stream().filter(e -> {
            try {
                waitNew(5).until(ExpectedConditions.elementToBeClickable(e));
                return true;
            } catch (ElementClickInterceptedException a) {
                return false;
            }
        }).toList();

        clickNew1(locator);

    }

    @Test
    public void test3() {
        driver().get("https://demoqa.com/checkbox");
        By locator = By.xpath("//button[@title=\"Toggle1\"]");

        if (waitNew1(locator)) {
            driver().findElement(locator).click();
        } else {
            throw new RuntimeException();
        }


    }

    @Test
    public void test4() {
        driver().get("https://demoqa.com/checkbox");
        By locator = By.xpath("//li[contains(@class,\"collapsed\")]//button[@title=\"Toggle\"]");
        By locatorLabel = By.xpath("//li//input[@type=\"checkbox\"]/parent::label");


        while (driver().findElements(locator).size() > 0) {
            for (WebElement e : driver().findElements(locator)) {
                clickNew(e);
            }
        }

        for (WebElement e : driver().findElements(locatorLabel)) {
            if (!e.findElement(By.xpath(".//input")).isSelected()) {
                clickNew(e);
            }

        }

    }

    public void clickNew(By locator) {
        waitNew(5).until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void clickNew(WebElement e) {
        waitNew(5).until(ExpectedConditions.elementToBeClickable(e)).click();
    }


    public void clickNew1(By locator) {

        if (waitNew1(locator)) {
            driver().findElement(locator).click();
        } else {
            throw new RuntimeException();
        }
    }

    public WebDriverWait waitNew(long sec) {
        return new WebDriverWait(driver(), Duration.ofSeconds(sec));

    }

    public boolean waitNew1(By locator) {

        LocalTime tfinish = LocalTime.now().plusSeconds(10);

        while (true) {
            try {
                if (Duration.between(LocalTime.now(), tfinish).isNegative()) {
                    return false;
                }
                if (driver().findElement(locator).isDisplayed()) {
                    return true;
                }
            } catch (Exception e) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }
    }







}
