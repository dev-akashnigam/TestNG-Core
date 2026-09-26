package AkashSoftwareSolutions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class _04_BeforeAndAfterTest0 {
    @BeforeTest  
    public void login() {
        System.out.println("Within login()");
    }

    @AfterTest 
    public void logout() {
        System.out.println("Within logout()");
    }
}
