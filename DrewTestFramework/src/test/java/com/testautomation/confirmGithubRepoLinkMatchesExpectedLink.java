package com.testautomation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class confirmGithubRepoLinkMatchesExpectedLink {

    @Test
    void confirmGithubRepoLinkMatchesExpectedLink() {

        // Arrange
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drew\\CodeProjects\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String user = "drewdailey";
        driver.get("https://github.com/" + user);

        // Act
        WebElement repoLink = driver.findElement(By.cssSelector("a[href='/drewdailey/testautomation']"));
        repoLink.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualURL = driver.getCurrentUrl();

        // Assert
        String repo = "/drewdailey/testautomation";
        Assertions.assertEquals("https://github.com" + repo, actualURL);

        // Tear down
        driver.quit();
    }

}
