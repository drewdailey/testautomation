package com.test_automation.first_tests;

import BaseBrowserTest.BaseGithubTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.testautomation.WebDriverBuilder.BASE_URL;

public class ConfirmGithubRepoLinkMatchesExpectedLink extends BaseGithubTest {

    @Test
    void confirmGithubRepoLinkMatchesExpectedLink() {

        // Arrange
        String user = "drewdailey";
        driver.get(BASE_URL + user);

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
    }

}
