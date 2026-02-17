package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PriceBookPage {

    WebDriver driver;

    public PriceBookPage(WebDriver driver) {

        this.driver = driver;

    }

    By priceField1 = By.id("price1");

    By priceField2 = By.id("price2");

    public void updatePrices() {

        driver.findElement(priceField1).sendKeys("100");

        driver.findElement(priceField2).sendKeys("200");

    }

}
