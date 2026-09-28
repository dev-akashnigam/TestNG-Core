package AkashSoftwareSolutions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _14_CreatingNUsingCustomRetryLogic {

    @Test(retryAnalyzer = _14_TestRetry.class)
    public void testA() {
        System.out.println("Within testA() - _14_CreatingNUsingCustomRetryLogic");
        Assert.assertTrue(false);
    }
    
}
