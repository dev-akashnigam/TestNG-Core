package AkashSoftwareSolutions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _06_AllAnnotations2 extends _06_AllAnnotations {

    @BeforeClass 
    public void register() {
        System.out.println("Within @BeforeClass - _06_AllAnnotations2");
    }

    @AfterClass 
    public void deRegister() {
        System.out.println("Within @AfterClass - _06_AllAnnotations2");
    }

    @BeforeMethod 
    public void login() {
        System.out.println("Within @BeforeMethod - _06_AllAnnotations2");
    }

    @AfterMethod
    public void logout() {
        System.out.println("Within @AfterMethod - _06_AllAnnotations2");
    }

    @Test 
    public void actualTest1() {
        System.out.println("Within @Test- actualTest1() - _06_AllAnnotations2");
    }

    @Test 
    public void actualTest2() {
        System.out.println("Within @Test - actualTest2() - _06_AllAnnotations2");
    }
    
}
