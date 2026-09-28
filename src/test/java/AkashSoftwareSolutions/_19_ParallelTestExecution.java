package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _19_ParallelTestExecution {

    @Test
    public void testA() throws InterruptedException {
        Thread.sleep(2*1000);
        System.out.println("testA() finished execution..");
    }

    @Test
    public void testB() throws InterruptedException {
        Thread.sleep(1*1000);
        System.out.println("testB() finished execution..");
    }

    @Test
    public void testC() throws InterruptedException {
        Thread.sleep(4*1000);
        System.out.println("testC() finished execution..");
    }

    @Test
    public void testD() throws InterruptedException {
        Thread.sleep(2*1000);
        System.out.println("testD() finished execution..");
    }

}
