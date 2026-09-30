package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _21_RunningGroupFromCmd1 {

    @Test(groups = "regression")
    public void testA() {
        System.out.println("Within testA() - _21_RunningGroupFromCmd1");
    }

    @Test(groups = "smoke")
    public void testB() {
        System.out.println("Within testB() - _21_RunningGroupFromCmd1");
    }
    
}
