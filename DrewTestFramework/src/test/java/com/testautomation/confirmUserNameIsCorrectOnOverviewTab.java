package com.testautomation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class confirmUserNameIsCorrectOnOverviewTab {

    @Test
    void userNameIsCorrectOnOverviewTab() {
        // Arrange
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drew\\CodeProjects\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String user = "drewdailey";
        driver.get("https://github.com/" + user);

        // Act
        String actualUserName = driver.findElement(By.cssSelector("span[class='p-nickname vcard-username d-block']")).getText();

        // Assert
        Assertions.assertEquals(user, actualUserName);

        // Teardown
        driver.quit();

    }
}
