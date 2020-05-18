package assignments_08;

import org.junit.BeforeClass;
import org.junit.Test;

public class Test_B extends MyActions{

    @BeforeClass
    public static void setDriver(){
        setChromeDriver();
    }

    @Test
    public void test_1(){
        driverChrome.get("https://dgotlieb.github.io/WebCalculator/");
    }
}
