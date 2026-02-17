package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class BillingPage {

    WebDriver driver;
    WebDriverWait wait;

    public BillingPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    // Locators using correct IDs from your HTML

    By streetField = By.id("billingAddress-street");

    By cityField = By.id("billingAddress-city");

    By stateField = By.id("billingAddress-state");

    By emailField = By.id("billingAddress-email");

    By phoneField = By.id("billingAddress-phone");

    By editPositionBtn = By.xpath("//button[contains(text(),'Edit Position On Map')]");

    By latitudeText = By.xpath("//label[contains(text(),'Latitude')]/following::p[1]");

    By longitudeText = By.xpath("//label[contains(text(),'Longitude')]/following::p[1]");


    // Method to enter billing info

    public void enterBillingInfo(
            String street,
            String city,
            String state,
            String email,
            String phone) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(streetField)).sendKeys(street);

        wait.until(ExpectedConditions.visibilityOfElementLocated(cityField)).sendKeys(city);

        wait.until(ExpectedConditions.visibilityOfElementLocated(stateField)).sendKeys(state);

        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);

        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneField)).sendKeys(phone);

    }


    // Click Edit Position on Map

    public void clickEditPositionOnMap() {

        wait.until(ExpectedConditions.elementToBeClickable(editPositionBtn)).click();

    }


    // Verify Latitude and Longitude

    public void verifyLatLong() {

        WebElement latitude = wait.until(
                ExpectedConditions.visibilityOfElementLocated(latitudeText)
        );

        WebElement longitude = wait.until(
                ExpectedConditions.visibilityOfElementLocated(longitudeText)
        );

        System.out.println("Latitude: " + latitude.getText());

        System.out.println("Longitude: " + longitude.getText());

    }

}
