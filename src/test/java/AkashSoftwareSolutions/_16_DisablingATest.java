package AkashSoftwareSolutions;

import org.testng.annotations.Test;

public class _16_DisablingATest {

    @Test
    public void testA() {
        System.out.println("Within testA()");
    }

    @Test(enabled = false)
    public void testB() {
        System.out.println("Within testB()");
    }

    @Test
    public void testC() {
        System.out.println("Within testC()");
    }

    @Test
    public void testD() {
        System.out.println("Within testD()");
    }
    
}
