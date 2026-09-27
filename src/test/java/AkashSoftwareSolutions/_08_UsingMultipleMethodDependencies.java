package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _08_UsingMultipleMethodDependencies {

    @Test
    public void testA() {
        System.out.println("Within testA() - _07_UsingGroups1");
    }

    @Test(dependsOnMethods = {"testC", "testA"})
    public void testB() {
        System.out.println("Within testB() - _07_UsingGroups1");
    }

    @Test
    public void testC() {
        System.out.println("Within testC() - _07_UsingGroups1");
    }
}
