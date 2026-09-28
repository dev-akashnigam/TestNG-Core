package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _18_DefiningMaxTestExecutionTime {

    @Test(timeOut = 2*1000)
    public void testA() throws InterruptedException {
        System.out.println("Within testA()");
        Thread.sleep(5*1000);
    }

}
