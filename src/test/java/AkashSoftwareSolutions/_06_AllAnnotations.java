package AkashSoftwareSolutions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class _06_AllAnnotations {

    @BeforeTest 
    public void test1() {
        System.out.println("Within @BeforeTest");
    }

    @AfterTest  
    public void test2() {
        System.out.println("Within @AfterTest");
    }

    @BeforeSuite 
    public void suite1() {
        System.out.println("Within @BeforeSuite");
    }

    @AfterSuite 
    public void suite2() {
        System.out.println("Within @AfterSuite");
    }

}
