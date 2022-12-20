package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Driver {

  private static WebDriver driver;



   public static WebDriver driver() {

       if(driver==null){
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();

       }

       driver.manage().window().maximize();
       return driver;

   }

   public static WebDriverWait driverWait(){

      return driverWait(5);

   }

    public static WebDriverWait driverWait(int sec){

        return new WebDriverWait(driver, Duration.ofSeconds(sec));

    }

}
