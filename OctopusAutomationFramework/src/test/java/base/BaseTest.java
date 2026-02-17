package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;
import utilities.DriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {

        ConfigReader.loadConfig();  // MUST be here

        driver = DriverFactory.initDriver();

        driver.get(ConfigReader.getProperty("baseUrl"));

    }


    @AfterMethod
    public void teardown() {

        driver.quit();

    }
}
