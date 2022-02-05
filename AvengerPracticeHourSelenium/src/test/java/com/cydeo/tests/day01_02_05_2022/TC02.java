package com.cydeo.tests.day01_02_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02 {

    private static WebDriver driver;

    public static void main(String[] args) {


        forEachVerification("https://app.vytrack.com/user/login");

        //- Verify the url contains "vytrack"

        verifyingURlContains("vytrack");


        //- Verify the title contains "Login"
        VerifyingTitleContains("Login");


        //- Verify the label "Login"
        verifyingLabel("login");

        //login

        login("abcd", "abcd");


        //- Verify the message "Invalid user name or password"
        verifyingMessage("Invalid user name or password.");
    }

    private static void verifyingMessage(String expectedMessage) {
        WebElement messageElement = driver.findElement(By.className("alert"));
        String actualMessage = messageElement.getText();
        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Message is PASSED");
        } else {
            System.err.println("Message is FAILED");
        }
    }

    private static void login(String username, String password) {
        WebElement usernameWebElement = driver.findElement(By.name("_username"));
        usernameWebElement.sendKeys(username);

        WebElement passwordWebElement = driver.findElement(By.id("prependedInput2"));
        passwordWebElement.sendKeys(password);

        driver.findElement(By.id("_submit")).click();


    }

    private static void verifyingLabel(String expectedLabel) {
        WebElement labelElement = driver.findElement(By.tagName("h2"));
        String actualLabelText = labelElement.getText();
        if (actualLabelText.contains(expectedLabel)) {
            System.out.println("Label is PASSED!");
        } else {
            System.err.println("Label is FAILED");
        }


    }

    private static void VerifyingTitleContains(String expectedWord) {
        String actualtitle = driver.getTitle();
        if (actualtitle.contains(expectedWord)) {
            System.out.println("Title is PASSED!");
        } else {
            System.err.println("Title is FAILED");
        }

    }

    private static void verifyingURlContains(String expectedURL) {

        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)) {
            System.out.println("URL verification PASSED");
        } else {
            System.err.println("URL verification FAILED");
        }

    }

    private static void forEachVerification(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //- Go to "https://app.vytrack.com/user/login"

        driver.get(url);

    }
}

