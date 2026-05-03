package Utility;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {

    private static WebDriver driver;

    @Before
    public static void setDriver()
    {
        driver = new ChromeDriver();
        DriverManager.setup(driver);
    }


}
