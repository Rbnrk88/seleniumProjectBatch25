package com.cydeo.tests.day09_javafaker;



public class Singleton {

    //Creaate private consructor

    private Singleton (){


    }

    private static String key;
    public static String getKey(){
        if(key == null){
            key="Rabia";
            System.out.println("key is defined");

        }else{

            System.out.println("key already has defined");

        }
        return  key;

    }



}
