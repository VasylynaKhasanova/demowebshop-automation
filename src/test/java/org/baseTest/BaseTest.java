package org.baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver webDriver;
    private Logger logger = Logger.getLogger(getClass());

    @Before
    public void setup() {
        webDriver = initDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logger.info("Browser was opened");
    }

    @After
    public void tearDown() {
        webDriver.quit();
        logger.info("Browser was closed");
    }

    private WebDriver initDriver() {
        String browserFromProperty = System.getProperty("browser");
        logger.info("Browser is " + browserFromProperty);
        if ((browserFromProperty == null) ||
                (browserFromProperty.equalsIgnoreCase("chrome"))) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
            logger.info("Browser is Chrome");
        } else if (browserFromProperty.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();
        } else if ("ie".equals(browserFromProperty.toLowerCase())) {
            WebDriverManager.iedriver().setup();
            webDriver = new InternetExplorerDriver();
        } else if ("safari".equalsIgnoreCase(browserFromProperty)) {
            WebDriverManager.safaridriver().setup();
            webDriver = new SafariDriver();
        } else if ("edge".equalsIgnoreCase(browserFromProperty)) {
            WebDriverManager.edgedriver().setup();
            webDriver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Browser " + browserFromProperty + " is not supported");
        }
        return webDriver;
    }
}
