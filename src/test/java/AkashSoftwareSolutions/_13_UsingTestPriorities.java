package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _13_UsingTestPriorities {

    @Test(priority=58)
    public void testA() {
        System.out.println("Within testA() method, priority 58, _13_UsingTestPriorities");
    } 

    @Test(priority=29)
    public void testB() {
        System.out.println("Within testB() method, priority 29 - _13_UsingTestPriorities");
    }

    @Test(priority = 42)
    public void testC() {
        System.out.println("Within testC() method, priority 42 - _13_UsingTestPriorities");
    }

    @Test
    public void testD() {
        System.out.println("Within testD() method, priority NA - _13_UsingTestPriorities");
    }
    
}
