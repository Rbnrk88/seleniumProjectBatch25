package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

        //3- Verify “remember me” label text is as expected: Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLAbel = rememberMeLabel.getText();

        if (actualRememberMeLAbel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED");
        }else{
            System.err.println("Label verification FAILED");
        }

        //4- Verify “forgot password” link text is as expected: Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLink = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLink = forgotPasswordLink.getText();

        if (actualForgotPasswordLink.equals(expectedForgotPasswordLink)){
            System.out.println("Forgot Password Link verification PASSED");
        }else {
            //********if you get failed you can check
            // System.out.println("actualForgotPasswordLink = " + actualForgotPasswordLink);
            // System.out.println("expectedForgotPasswordLink = " + expectedForgotPasswordLink);
            System.err.println("Forgot Password Link verification FAILED");
        }
           // 5- Verify “forgot password” href attribute’s value contains expected: Expected: forgot_password=yes
           String expectedInHref = "forgot_password=yes";
           String actualInHrefAttributeValue = forgotPasswordLink.getAttribute("href");

           // System.out.println("actualInHrefAttributeValue = " + actualInHrefAttributeValue);

            if(actualInHrefAttributeValue.contains(expectedInHref)){
                System.out.println("HREF attribute value verification PASSED");
            }else{
                System.err.println("HREF attribute value verification FAILED");
            }



        }
    }






/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes



PS: Inspect and decide which locator you should be using to locate web
elements.
 */