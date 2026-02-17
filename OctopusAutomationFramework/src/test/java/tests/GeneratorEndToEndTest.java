package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.*;
import utilities.ConfigReader;

public class GeneratorEndToEndTest extends BaseTest {

    @Test
    public void automateGeneratorFlow() {

        LoginPage login = new LoginPage(driver);
        login.login(
        		ConfigReader.getProperty("username"),
        	    ConfigReader.getProperty("password")
        	);
        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.clickAddGenerator();

        GeneratorPage generator = new GeneratorPage(driver);
        generator.enterGeneratorDetails("Amina Generator");

        BillingPage billing = new BillingPage(driver);
        billing.enterBillingInfo(
                "Test Street",
                "New York",
                "New York",
                "test@email.com",
                "9999999999"
        );


        billing.verifyLatLong();

        ServicePage service = new ServicePage(driver);
        service.addService();

        RoutePage route = new RoutePage(driver);
        route.assignRoute("Amina Route");

        PriceBookPage price = new PriceBookPage(driver);
        price.updatePrices();

        LogoutPage logout = new LogoutPage(driver);
        logout.logout();

    }
}
