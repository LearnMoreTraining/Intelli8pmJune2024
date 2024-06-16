package utils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserBase {

    public WebDriver driver; //null

    public WebDriver getWebDriver() throws IOException {

        if(driver == null) {
            File f = new File("src/main/resources/configuration/frameworkconfiguration.properties");
            FileInputStream fis = new FileInputStream(f);
            Properties properties = new Properties();
            properties.load(fis);
            switch (properties.getProperty("browser").toLowerCase()){
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    throw new InvalidArgumentException("enter valid input");
            }

            driver.get(properties.getProperty("testenvironment"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        return driver;
    }
}
