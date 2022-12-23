package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import static utils.Driver.*;

public class Test2 {

    WebDriver driver=driver();

    @Test
    public void test1(){

        String url="https://www.google.com/";

        By username = By.cssSelector("#identifierId");
        driver.get(url);

       // driver.findElement(username).sendKeys("huseyin86kartal@gmail.com", Keys.ENTER);





    }

    public static void main(String[] args) {

        System.getProperties().forEach((k, v) -> System.out.println(k+" : "+v) );

    }

    public void click(By locator){
        new Actions(driver).moveToElement(driver.findElement(locator)).click().perform();


    }

    public void TAB(){
        new Actions(driver).sendKeys(Keys.TAB).build().perform();

    }


    @Test
    public void test3(){
        String url="https://www.w3schools.com/cssref/tryit.php?filename=trycss_overflow";
        //scroll down
    }

}
