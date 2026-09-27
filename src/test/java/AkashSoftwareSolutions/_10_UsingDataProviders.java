package AkashSoftwareSolutions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _10_UsingDataProviders {

    @DataProvider(name="users")
    public Object[][] getUserDetails() {
        Object[][] data = {
            {"Akash Nigam", 35, 9140392956L},
            {"Anand Nigam", 31, 7985957880L},
            {"Deepak Nigam", 63, 9335368777L}
        };
        return data;
    }

    @Test(dataProvider = "users")
    public void testA(String fullName, int age, long mobileNo) {
        System.out.printf("Name: %s => Age: %s => Mobile No: %s%n", fullName, age, mobileNo);
    }

}
