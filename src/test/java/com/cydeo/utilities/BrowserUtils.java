package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


public static void switchWindowAndVerify(WebDriver driver,String expectedURL,String expectedTitle){
    Set<String> allWindowHandles=driver.getWindowHandles();

    for (String each : allWindowHandles) {
        driver.switchTo().window(each);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        if(driver.getCurrentUrl().contains(expectedURL)){
            break;
        }



    }
    //5. Assert: Title contains “Etsy”

    String actualTitle=driver.getTitle();
    Assert.assertTrue(actualTitle.contains(expectedTitle));

}

public static void verifyTitle(WebDriver driver,String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);

}

    public static void verifyTitleContains(WebDriver driver,String expectedInTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedInTitle));

    }





}
