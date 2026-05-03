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
        return driver;
    }

    public static void quit()
    {
        getDriver().quit();
    }
}
