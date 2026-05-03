//package Utility;
package stepDefinitions;
import Utility.DriverManager;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {

    @Before
    public void setDriver() {
        /*
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");   // important for Jenkins
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        */
        WebDriver driver = new ChromeDriver();
        DriverManager.setup(driver);   // ⭐ MOST IMPORTANT
    }

    @After
    public void tearDown() {
        DriverManager.quit();
    }
}