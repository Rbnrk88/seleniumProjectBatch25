package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTask1_CydeoVerification {

    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");


        //3. Verify URL contains
        //Expected: cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED");
        }else{
            System.err.println("URL verification FAILED");
        }

        /*
        if (driver.getCurrentUrl().contains("cydeo")) {
            System.out.println("This URL contains the specified word, test passed");
        } else {
            throw new RuntimeException("This URL does not have the specified word, test failed");

        }
 */
        // 4. Verify title:
        //Expected: Practice
        String expectedTitle= "Practice";
        String actualTitle= driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.err.println("Title verification FAILED");
        }
driver.close();



       /* String expectedTitle = "Practice";

        if (driver.getTitle().equals("Practice")) {
            System.out.println("The title is matched, test passed");
        } else {
            throw new RuntimeException("The title is not matched, test failed");
        }

        */


    }


}
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 Expected: Practice
 */