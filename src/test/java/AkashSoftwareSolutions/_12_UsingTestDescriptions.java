package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _12_UsingTestDescriptions {

    @Test(description = "Verify that Mars is a planet in the solar system")
    public void testA() {
        System.out.println("Within testA() method - _12_UsingTestDescriptions");
    } 

    @Test(description = "Verify that Cow is an animal")
    public void testB() {
        System.out.println("Within testB() method - _12_UsingTestDescriptions");
    }

    @Test(description = "Verify that humans have 10 fingers")
    public void testC() {
        System.out.println("Within testC() method - _12_UsingTestDescriptions");
    }
    
}
