package assignments_08;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_C extends MyActions{

    @BeforeClass
    public static void setDriver(){
        setChromeDriver();
    }
//
//    @AfterClass
//    public static void quitDriver(){
//        quitDriver();
//    }

    @Test
    public void test_1(){
        driverChrome.get("https://dgotlieb.github.io/Selenium/synchronization.html");
    }
}
