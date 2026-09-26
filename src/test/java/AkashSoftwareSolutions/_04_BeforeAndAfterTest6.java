package AkashSoftwareSolutions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _04_BeforeAndAfterTest6 {

    @BeforeTest  
    public void login() {
        System.out.println("Within login() - Test6 class");
    }

    @Test 
    public void display6() {
        System.out.println("Within display6() - Test6 class");
    }

    @AfterTest 
    public void logout() {
        System.out.println("Within logout() - Test6 class");
    }
}
