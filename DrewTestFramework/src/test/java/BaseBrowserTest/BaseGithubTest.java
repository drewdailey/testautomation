package BaseBrowserTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import static com.testautomation.WebDriverBuilder.getChromeDriver;

public class BaseGithubTest {

    // Constant variables
    protected static WebDriver driver;

    @BeforeAll
    static void setup() {
        driver = getChromeDriver();
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
