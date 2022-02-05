package com.cydeo.tests.day01_02_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
    public static void main(String[] args)  {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://www.selenium.dev");
                driver.getCurrentUrl();
        String expectedURL = "https://www.selenium.dev";
        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED");
        }else{
            System.err.println("URL verification FAILED");
        }
    }

}
/*
//Setup the "browser driver"

        //Go to "https://www.selenium.dev/"

        //Verify the URL
 */