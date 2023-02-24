package com.platzi.javatest.util;



public class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat( "hola",3);
        assertEqual(result,"holaholahola");

        String result2 = StringUtil.repeat( "hola",1);
        assertEqual(result2,"hola");


    }

    private static void assertEqual(String actual,String expected){
        if(!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal than "+expected);
        }else{
            System.out.println("Success testing");
        }
    }

}

