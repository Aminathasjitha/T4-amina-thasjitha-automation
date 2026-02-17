package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By username = By.id("login-email");
    By password = By.id("login-password");
    By loginBtn = By.cssSelector("button[type='submit']");

    // Login Method
    public void login(String user, String pass) {

        WebElement usernameField = wait.until(
            ExpectedConditions.visibilityOfElementLocated(username));
        usernameField.clear();
        usernameField.sendKeys(user);

        WebElement passwordField = wait.until(
            ExpectedConditions.visibilityOfElementLocated(password));
        passwordField.clear();
        passwordField.sendKeys(pass);

        WebElement loginButton = wait.until(
            ExpectedConditions.elementToBeClickable(loginBtn));
        loginButton.click();
    }
}
