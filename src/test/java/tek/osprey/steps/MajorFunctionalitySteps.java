package tek.osprey.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MajorFunctionalitySteps {

    private ChromeDriver driver;

    @Given("Open Browser and Navigate to retail app")
    public void openBrowserAndNavigate() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("Validate top left corner is {string}")
    public void validateTopLeftCornerTitle(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       String actualText = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.className("top-nav__logo")))
                .getText();

        Assert.assertEquals(expectedTitle, actualText);
    }

    @Then("Close Browser")
    public void closeBrowser() {
        driver.quit();
    }

}
