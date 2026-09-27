package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _09_UsingMultipleGroupDependencies {

    @Test(dependsOnGroups = {"smoke", "regression"})
    public void testA() {
        System.out.println("Within testA() - _09_UsingMultipleGroupDependencies");
    }

    @Test(groups = "regression")
    public void testB() {
        System.out.println("Within testB() - _09_UsingMultipleGroupDependencies");
    }

    @Test(groups = "smoke")
    public void testC() {
        System.out.println("Within testC() - _09_UsingMultipleGroupDependencies");
    }
    
}
