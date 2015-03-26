package com.dataproviderexample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by mkaleem on 3/26/15.
 */
public class DataProviderTest {
    private static WebDriver driver;
    public static Object [][] Credentials(){

        return new Object[][]{{"testuser_1","Test@123",}, {"testuser_1", "test@123"}};


    }
    @Test(dataprovider = "Authentication");
     driver = nre wfire


    }
}
