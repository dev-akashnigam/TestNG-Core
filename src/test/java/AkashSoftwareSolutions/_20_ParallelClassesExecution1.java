package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _20_ParallelClassesExecution1 {

    @Test
    public void testA() throws InterruptedException {
        Thread.sleep(2*1000);
        System.out.println("testA() finished execution..");
    }

    @Test
    public void testB() throws InterruptedException {
        Thread.sleep(3*1000);
        System.out.println("testB() finished execution..");
    }

}
