package AkashSoftwareSolutions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _11_UsingParameters {

    @Parameters({"personName", "personAge", "mobileNo"})
    @Test
    public void testA(String fullName, int age, long mobileNo) {
        System.out.printf("Name: %s => Age: %s => Mobile No: %s%n", fullName, age, mobileNo);
    }
    
}
