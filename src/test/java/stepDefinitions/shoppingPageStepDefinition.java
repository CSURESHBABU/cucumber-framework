package stepDefinitions;

import Utility.DriverManager;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;

public class shoppingPageStepDefinition
{

    //public static WebDriver driver;

    @Given("Land on GreenKart shopping page")
    public void land_on_green_kart_shopping_page() {
       // driver = new ChromeDriver();
        DriverManager.getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }
    @When("Search with {string} shortname and get the product name")
    public void search_with_shortname_and_get_the_product_name(String shortName) {
        DriverManager.getDriver().findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
    }



    @Then("Validate the product name and compare")
   public void validate_the_product_name_and_compare() {

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver().driver, Duration.ofSeconds(5));

        String fullProductText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='product-name']"))
        ).getText();

        String productName = fullProductText.split("-")[0].trim();
        Assert.assertEquals("Tomato",productName);
    }



    @Given("Land on deals page")
    public void land_on_deals_page()
    {
        DriverManager.getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
    }

    @Then("Validate the product name and compare on deals page")
    public void validate_the_product_name_and_compare_on_deals_page() {

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver().driver, Duration.ofSeconds(5));

        String ProductText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr//td[1]"))
        ).getText();

        String productName = ProductText.trim();
        Assert.assertEquals("Tomato",productName);
    }

}
