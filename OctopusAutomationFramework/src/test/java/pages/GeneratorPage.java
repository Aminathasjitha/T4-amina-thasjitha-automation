package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class GeneratorPage {

    WebDriver driver;
    WebDriverWait wait;

    public GeneratorPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    // Reliable locators using placeholder

    By generatorNameField =
            By.xpath("//input[@placeholder='Enter generator name']");

    //By internalAccountField =
            //By.xpath("//input[@placeholder='Enter internal account number']");

    By addGeneratorButton =
    		By.cssSelector("button[type='submit']");


    public void enterGeneratorDetails(String generatorName) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(
    		        By.cssSelector("div.absolute.inset-0.bg-white.bg-opacity-70")
    		    ));

        // Wait until popup appears by waiting for name field
        WebElement nameField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(generatorNameField)
        );

        nameField.sendKeys(generatorName);


        //WebElement accountField = wait.until(
       //         ExpectedConditions.visibilityOfElementLocated(internalAccountField)
        //);

        //accountField.sendKeys(accountNumber);


        WebElement addButton = wait.until(
                ExpectedConditions.elementToBeClickable(addGeneratorButton)
        );

        addButton.click();

    }

}
