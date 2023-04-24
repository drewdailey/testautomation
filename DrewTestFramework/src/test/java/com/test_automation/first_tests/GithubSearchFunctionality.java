package com.test_automation.first_tests;

import BaseBrowserTest.BaseGithubTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.testautomation.WebDriverBuilder.BASE_URL;

public class GithubSearchFunctionality extends BaseGithubTest {

    @Test
    void shouldSendKeysToGithubSearchBox() {
        String user = "drewdailey";
        driver.get(BASE_URL + user);
        driver.manage().window().fullscreen();
        WebElement searchBox = driver.findElement(By.cssSelector("input[class*='form-control js-site-search-focus header-search-input jump-to-field js-jump-to-field js-site-search-field is-clearable']"));
        String keysToSend = "test automation";
        searchBox.sendKeys(keysToSend);
        searchBox.sendKeys(Keys.ENTER);
        WebElement testAutomationLink = driver.findElement(By.cssSelector("a[href='/drewdailey/testautomation']"));
        testAutomationLink.click();
    }
}
