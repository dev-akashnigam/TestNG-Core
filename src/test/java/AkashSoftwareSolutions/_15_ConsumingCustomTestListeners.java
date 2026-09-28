package AkashSoftwareSolutions;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(_15_CustomTestStartListener.class)
public class _15_ConsumingCustomTestListeners {

    @Test
    public void testA() {
        System.out.println("Within testA()");
        Assert.assertTrue(true);
    }
    
    @Test(retryAnalyzer = _15_CustomTestStartListener.class)
    public void testB() {
        System.out.println("Within testB()");
        Assert.assertTrue(false);
    }

}
