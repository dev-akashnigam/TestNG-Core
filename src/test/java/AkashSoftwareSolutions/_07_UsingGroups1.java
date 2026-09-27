package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _07_UsingGroups1 {

    @Test(groups = "regression")
    public void testA() {
        System.out.println("Within testA() - _07_UsingGroups1");
    }

    @Test(groups = "smoke")
    public void testB() {
        System.out.println("Within testB() - _07_UsingGroups1");
    }

    @Test(groups = "regression")
    public void testC() {
        System.out.println("Within testC() - _07_UsingGroups1");
    }

    @Test(groups = "smoke")
    public void testD() {
        System.out.println("Within testD() - _07_UsingGroups1");
    }
    
}
