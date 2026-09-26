package AkashSoftwareSolutions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _04_BeforeAndAfterTest5 {
    
    @BeforeTest  
    public void login() {
        System.out.println("Within login() - Test5 class");
    }

    @Test 
    public void display5() {
        System.out.println("Within display5() - Test5 class");
    }

    @AfterTest 
    public void logout() {
        System.out.println("Within logout() - Test5 class");
    }

}
