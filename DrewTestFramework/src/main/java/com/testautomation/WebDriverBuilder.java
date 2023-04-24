package com.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverBuilder {

    public final static String BASE_URL = "https://github.com/";


    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drew\\CodeProjects\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        return driver;
    }
}
