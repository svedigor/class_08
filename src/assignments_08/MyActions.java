package assignments_08;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MyActions {

    protected static WebDriver driverFirefox, driverChrome;
    protected static NgWebDriver ngDriver;

    protected static void setFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "/Users/igor_shved/Documents/Java/libraries/webDrivers/geckodriver");
        driverFirefox = new FirefoxDriver();
        driverFirefox.manage().window().maximize();
        driverFirefox.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    protected static void setChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/igor_shved/Documents/Java/libraries/webDrivers/chromedriver");
        driverChrome = new ChromeDriver();
    //    driverChrome.manage().window().maximize();
      driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    protected static void setNgWebDriver(){
        ngDriver = new NgWebDriver((JavascriptExecutor)driverChrome);
        ngDriver.waitForAngularRequestsToFinish();
    }
}
