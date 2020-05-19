package assignments_08;

import com.example.JSUtils;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static java.lang.System.out;

public class Test_E extends MyActions{

   protected Actions act = new Actions(driverChrome);

    @BeforeClass
    public static void setWebDriver(){
        setChromeDriver();
    }

    @AfterClass
    public static void quitWebDriver(){
        driverChrome.quit();
    }

    @After
    public void waitAftreEachTest() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    public void test_1(){
        driverChrome.get("https://dgotlieb.github.io/Actions");
    }

    @Test
    public void test_2() {
        WebElement closeImg = driverChrome.findElement(By.xpath("//img[@id ='drag1']"));
        WebElement box = driverChrome.findElement(By.xpath("//div[@id = 'div1']"));
        JSUtils.JavascriptDragAndDrop(driverChrome,closeImg,box);
    }

    @Test
    public void test_3(){
        String expectedtext ="You double clicked";
        WebElement elementToClick = driverChrome.findElement(By.xpath("//*[text() = 'Double-click text to trigger a function.']"));
        act.doubleClick(elementToClick).perform();
        String actualText = driverChrome.findElement(By.id("demo")).getText();
        Assert.assertEquals(expectedtext,actualText);
    }

    @Test
    public void test_4(){
        WebElement closeImg = driverChrome.findElement(By.xpath("//img[@id ='close']"));
        act.moveToElement(closeImg).perform();
    }
}
