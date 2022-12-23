package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    public static WebDriver driver() {
        return driver("chrome");
    }

    public static WebDriver driver(String browser) {


        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:

                    ChromeOptions options = new ChromeOptions();
                    //   options.addArguments("user-data-dir="+System.getProperty("user.home")+"\\AppData\\Local\\Google\\Chrome\\User Data");
                    options.addArguments("--start-maximized");
                    //options.addExtensions(new File("C:\\Users\\Huseyin\\Desktop\\Google-Ceviri.crx"));
                    // options.addArguments("--headless");

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);


            }

        }

        driver.manage().window().maximize();
        return driver;

    }

    public static WebDriverWait driverWait() {

        return driverWait(5);

    }

    public static WebDriverWait driverWait(int sec) {

        return new WebDriverWait(driver, Duration.ofSeconds(sec));

    }

}
