package com.test_automation.first_tests;

import BaseBrowserTest.BaseGithubTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.testautomation.WebDriverBuilder.BASE_URL;

public class ConfirmUserNameIsCorrectOnOverviewTab extends BaseGithubTest {

    @Test
    void userNameIsCorrectOnOverviewTab() {

        // Arrange
        String user = "drewdailey";
        driver.get(BASE_URL + user);

        // Act
        String actualUserName = driver.findElement(By.cssSelector("span[class='p-nickname vcard-username d-block']")).getText();

        // Assert
        Assertions.assertEquals(user, actualUserName);

    }
}
