package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //make our page full screen
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String currentTitle = driver.getTitle();

        if(currentTitle.equals(expectedTitle)) {
            System.out.println("Title is an expected. Verification PASSES!");
        }else{
            System.out.println("Title is NOT as expected. Verification FSILED!");
        }


    }


}
/*
TC #1: Yahoo Title Verification
1.Open Chrome browser
2.Go to https://www.yahoo.com
3.Verify title:
Expected: Yahoo
 */