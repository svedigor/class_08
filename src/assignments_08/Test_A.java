package assignments_08;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static java.lang.System.out;

public class Test_A extends MyActions {

    private String number = "35";

    @BeforeClass
    public static void setDriver(){
        setChromeDriver();
        driverChrome.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @AfterClass
    public static void quitDriver(){
        driverChrome.quit();
    }

    @Test
    public void test_2() {
        WebElement seven = driverChrome.findElement(By.id("seven"));
        out.println("height = " + seven.getSize().height+ "px;");
        out.println("width = " + seven.getSize().width+ "px;");
    }

    @Test
    public void test_3(){
        out.println(driverChrome.findElement(By.id("six")).isDisplayed());
     }

     @Test
    public void test_4_5_6(){
        int actualNumber = 7 * 5;
        Assert.assertEquals(actualNumber,Integer.parseInt(number));
     }
}
