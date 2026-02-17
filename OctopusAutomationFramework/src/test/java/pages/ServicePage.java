package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicePage {

    WebDriver driver;

    public ServicePage(WebDriver driver) {

        this.driver = driver;

    }

    By addServiceBtn = By.id("addService");

    public void addService() {

        driver.findElement(addServiceBtn).click();

    }

}
