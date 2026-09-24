package AkashSoftwareSolutions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _02_BeforeAndAfterMethod {

    @BeforeMethod 
    public void login() {
        System.out.println("Logged in successfully.");
    }

    @Test 
    public void display1() {
        System.out.println("Hello Seattle!");
        Assert.assertTrue(true);
    }

    @Test 
    public void display2() {
        System.out.println("Hello Moscow!");
        Assert.assertTrue(true);
    }

    @AfterMethod 
    public void logout() {
        System.out.println("Logged out successfully.");
    }
}