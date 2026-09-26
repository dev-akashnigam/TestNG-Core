package AkashSoftwareSolutions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class _05_BeforeSuiteAndAfterSuite0 {

    @BeforeSuite 
    public void login() {
        System.out.println("Within login() method");
    }

    @AfterSuite 
    public void logout() {
        System.out.println("Within logout() method");
    }
    
}
