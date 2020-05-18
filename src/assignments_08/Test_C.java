package assignments_08;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static java.lang.System.out;
import java.util.List;

public class Test_C extends MyActions{

    @BeforeClass
    public static void setDriver(){
        setChromeDriver();
    }

    @AfterClass
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driverChrome.quit();
    }

    @Test
    public void test_1(){
        driverChrome.get("https://dgotlieb.github.io/Selenium/synchronization.html");
    }

    @Test
        public void test_2() throws InterruptedException {
        driverChrome.findElement(By.id("btn")).click();
        Thread.sleep(5000);
        List<WebElement> checkBoxes = driverChrome.findElements(By.xpath("//input[@type = 'checkbox' and @id='checkbox']"));
        checkBoxes.get(0).click();
    }

    @Test
    public void test_3() throws InterruptedException {
        driverChrome.findElement(By.id("hidden")).click();
        Thread.sleep(5000);
        out.println(driverChrome.findElement(By.xpath("//*[text() = 'My Hidden Element!']")));
    }

    @Test
    public void test_4(){
        driverChrome.findElement(By.id("rendered")).click();
        WebElement hiddenElement = driverChrome.findElement(By.xpath("//*[text() = 'This is a new element']"));
        WebDriverWait wait = new WebDriverWait(driverChrome, 10);
        wait.until(ExpectedConditions.visibilityOf(hiddenElement));
        out.println(hiddenElement);
    }
}
