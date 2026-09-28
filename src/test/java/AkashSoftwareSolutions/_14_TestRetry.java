package AkashSoftwareSolutions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class _14_TestRetry implements IRetryAnalyzer {
    int retryCount = 0;
    int maxRetries = 3;

    @Override 
    public boolean retry(ITestResult result) {
        if(retryCount < maxRetries) {
            retryCount++;
            return true;
        }
        return false;
    }
}
