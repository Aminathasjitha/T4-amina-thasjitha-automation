package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {

        this.driver = driver;

    }

    By profile = By.id("profile");

    By logoutBtn = By.id("logout");

    public void logout() {

        driver.findElement(profile).click();

        driver.findElement(logoutBtn).click();

    }

}
