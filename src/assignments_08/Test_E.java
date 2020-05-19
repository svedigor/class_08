package assignments_08;

import com.example.JSUtils;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test_E extends MyActions{

   protected Actions act = new Actions(driverChrome);
   protected Action action;

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
        act.clickAndHold(closeImg).perform();
    }

    @Test
    public void test_5(){
        WebElement first = driverChrome.findElement(By.xpath("//option[@value = 'pizza']"));
        WebElement second = driverChrome.findElement(By.xpath("//option[@value = 'burger']"));
        action = act
                .moveToElement(first)
                .clickAndHold(first)
                .pause(1000)
                .moveToElement(second)
                .build();
        action.perform();
    }

    @Test
    public void test_6(){
        driverChrome.findElement(By.xpath("//input[@name = 'pic']")).sendKeys( "/Users/igor_shved/Downloads/jshelper.jar");
    }

    @Test
    public void test_7() throws InterruptedException {
        WebElement buttonToClick = driverChrome.findElement(By.id("clickMe"));
        JavascriptExecutor js = (JavascriptExecutor)driverChrome;
        // scroll to element and click;
//        js.executeScript("arguments[0].scrollIntoView(true);", buttonToClick);
//        buttonToClick.click();
//        Thread.sleep(1000);
//        driverChrome.switchTo().alert().accept();
       int x =  buttonToClick.getLocation().getX();
       int y =  buttonToClick.getLocation().getY();
       js.executeScript("javascript:window.scrollBy("+x+","+y+")");
    }
}
