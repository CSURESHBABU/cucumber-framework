package Utility;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static WebDriver driver;

    public static void setup(WebDriver driver)
    {
        DriverManager.driver = driver;
    }

    public static WebDriver getDriver()
    {
        return DriverManager.driver;
    }

    public static void quit()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }
}
