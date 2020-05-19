package assignments_08;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static java.lang.System.out;

public class Test_D extends MyActions {
    protected static NgWebDriver ngDriver;
    protected static String myName, actualName;
    protected static WebElement firstName;

    @BeforeClass
    public static void setDriver(){
        setChromeDriver();
    }

    @AfterClass
    public static void quitDriiver() throws InterruptedException {
        Thread.sleep(3000);
        driverChrome.quit();
    }

    @Test
    public void test_1(){
        driverChrome.get("https://dgotlieb.github.io/AngularJS/main.html");
        ngDriver = new NgWebDriver((JavascriptExecutor) driverChrome);
        ngDriver.waitForAngularRequestsToFinish();
    }

    @Test
    public void test_2() throws InterruptedException {
        firstName = driverChrome.findElement(ByAngular.model("firstName"));
        Thread.sleep(3000);
        firstName.clear();
    }

    @Test
    public void test_3(){
        myName = "Mayer";
        firstName.sendKeys(myName);
    }

    @Test
    public void test_4(){
        actualName = driverChrome.findElement(ByAngular.binding("firstName")).getText();
        Assert.assertEquals(myName,actualName);
    }
}
