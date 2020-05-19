package assignments_08;

import com.example.JSUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import static java.lang.System.out;

public class Test_E extends MyActions{
    @BeforeClass
    public static void setWebDriver(){
        setChromeDriver();
    }

//    @AfterClass
//    public static void quitWebDriver() throws InterruptedException {
//        Thread.sleep(2000);
//        driverChrome.quit();
//    }

    @Test
    public void test_1(){
        driverChrome.get("https://dgotlieb.github.io/Actions");
    }

    @Test
    public void test_2() throws InterruptedException {
        WebElement closeImg = driverChrome.findElement(By.xpath("//img[@id ='drag1']"));
        WebElement box = driverChrome.findElement(By.xpath("//div[@id = 'div1']"));
        JSUtils.JavascriptDragAndDrop(driverChrome,closeImg,box);
    }
}
