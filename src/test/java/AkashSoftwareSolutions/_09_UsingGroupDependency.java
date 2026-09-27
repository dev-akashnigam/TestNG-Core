package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _09_UsingGroupDependency {

    @Test(dependsOnGroups = "smoke")
    public void testA() {
        System.out.println("Within testA() - _09_UsingGroupDependency");
    }

    @Test(groups = "smoke")
    public void testB() {
        System.out.println("Within testB() - _09_UsingGroupDependency");
    }

    @Test(groups = "smoke")
    public void testC() {
        System.out.println("Within testC() - _09_UsingGroupDependency");
    }
    
}
