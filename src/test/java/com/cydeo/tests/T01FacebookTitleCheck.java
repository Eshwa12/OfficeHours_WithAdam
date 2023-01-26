package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01FacebookTitleCheck {
    public static void main(String[] args) {
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.facebook.com
        driver.navigate().to("https://www.facebook.com");
        //String url=""https://www.facebook.com";
        //driver.get(url)

        //3. Verify title:
        //Expected: “Facebook – log in or sign up”
        String actualTitle=driver.getTitle();
        String expectedTitle="Facebook – log in or sign up";

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title Verification PASSED!!");
        }else{
            System.err.println("Title Verification PASSED!!");
        }



    driver.close();



    }
}
/*
TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook – log in or sign up”
 */