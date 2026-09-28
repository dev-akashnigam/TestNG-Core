package AkashSoftwareSolutions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class _15_CustomTestStartListener implements ITestListener, IRetryAnalyzer {

    private int retryCount = 0;
    private int maxRetries = 2;
    
    @Override 
    public void onTestStart(ITestResult iTestResult) {
        System.out.printf(">>>>>> STARTING TEST: %s <<<<<<%n", iTestResult.getName());
    }

    @Override 
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.printf(">>>>>> TEST PASSED: %s <<<<<<%n", iTestResult.getName());
    }

    @Override 
    public void onTestFailure(ITestResult iTestResult) {
        System.out.printf(">>>>>> TEST FAILED: %s <<<<<<%n", iTestResult.getName());
    }

    @Override 
    public boolean retry(ITestResult iTestResult) {
        System.out.printf(">>>>>> TEST FAILED: %s .... RETRYING <<<<<<%n", iTestResult.getName());
        if(retryCount < maxRetries) {
            retryCount++;
            return true;
        }
        return false;
    }
}
