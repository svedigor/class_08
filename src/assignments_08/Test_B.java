package assignments_08;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static java.lang.System.out;

public class Test_B extends MyActions{

    @BeforeClass
    public static void setDriver(){
        setChromeDriver();
    }

    @Test
    public void test_1(){
        driverChrome.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test
    public void test_2(){
        out.println(driverChrome.findElement(By.id("two")).getSize().height);
    }
}
