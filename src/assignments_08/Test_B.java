package assignments_08;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import static java.lang.System.in;
import static java.lang.System.out;

public class Test_B extends MyActions{

    @BeforeClass
    public static void setDriver(){
        setChromeDriver();
    }

    @AfterClass
    public static void quitDriver(){
        driverChrome.quit();
    }

    @Test
    public void test_1(){
        driverChrome.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test
    public void test_2(){
        out.println("height of button '2' is " + driverChrome.findElement(By.id("two")).getSize().height+"px");
    }

    @Test
    public void test_3(){
        out.println("width of button '6' is " + driverChrome.findElement(By.id("six")).getSize().width+"px");
    }

    @Test
    public void test_4(){
        int myX = 843;
        int myY = 163;
        Point nineLocation = driverChrome.findElement(By.id("nine")).getLocation();
        Assert.assertEquals(myX,nineLocation.x);
        Assert.assertEquals(myY,nineLocation.y);
    }
}
