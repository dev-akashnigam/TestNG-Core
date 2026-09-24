package AkashSoftwareSolutions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class _03_BeforeAndAfterClass {

    @BeforeClass 
    public void login() {
        System.out.println("Successfully logged in.");
    }

    @Test 
    public void display1() {
        System.out.println("Hello Seattle!");
    }

    @Test 
    public void display2() {
        System.out.println("Hello Moscow!");
    }
    
    @AfterClass 
    public void logout() {
        System.out.println("Successfully logged out.");
    }
}
