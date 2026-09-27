package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _08_UsingMethodDependency {

    @Test
    public void testA() {
        System.out.println("Within testA() - _07_UsingGroups1");
    }

    @Test(dependsOnMethods = "testC")
    public void testB() {
        System.out.println("Within testB() - _07_UsingGroups1");
    }

    @Test(dependsOnMethods = "testA")
    public void testC() {
        System.out.println("Within testC() - _07_UsingGroups1");
    }

    @Test(dependsOnMethods = "testB")
    public void testD() {
        System.out.println("Within testD() - _07_UsingGroups1");
    }
}
