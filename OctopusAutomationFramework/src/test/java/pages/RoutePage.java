package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RoutePage {

    WebDriver driver;

    public RoutePage(WebDriver driver) {

        this.driver = driver;

    }

    By routeDropdown = By.id("route");

    public void assignRoute(String routeName) {

        driver.findElement(routeDropdown).sendKeys(routeName);

    }

}
