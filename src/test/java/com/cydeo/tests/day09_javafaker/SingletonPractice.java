package com.cydeo.tests.day09_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class SingletonPractice {

    @Test
    public void test1() {

        System.out.println(Singleton.getKey());


    }


    @Test
    public void test2() {

        System.out.println(Singleton.getKey());


    }

    @Test
    public void test3() {
        Driver.getDriver().get("https://www.google.com/");



    }

    @Test

    public void test4() {
        BrowserUtils.sleep(2);
        Driver.getDriver().get("https://www.etsy.com/?ref=lgo");


    }


}
