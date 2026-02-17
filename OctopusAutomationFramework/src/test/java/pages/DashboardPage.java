package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class DashboardPage {

    WebDriver driver;
    WebDriverWait wait;

    public DashboardPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    // Add New dropdown button (the button that opens dropdown)
    By addNewDropdown = By.xpath("//button[contains(.,'Add New')]");

    // Generator option inside dropdown
    By generatorOption = By.xpath("//li[normalize-space()='Generator']");



    public void clickAddGenerator() {

        // Click Add New dropdown
        WebElement addBtn = wait.until(
            ExpectedConditions.elementToBeClickable(addNewDropdown)
        );

        ((JavascriptExecutor) driver)
            .executeScript("arguments[0].click();", addBtn);



        // Click Generator option
        WebElement generator = wait.until(
            ExpectedConditions.elementToBeClickable(generatorOption)
        );

        ((JavascriptExecutor) driver)
            .executeScript("arguments[0].click();", generator);

    }

}
