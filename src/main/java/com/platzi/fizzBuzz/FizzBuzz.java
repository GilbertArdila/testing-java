package com.platzi.fizzBuzz;

import java.util.function.BinaryOperator;

public class FizzBuzz {

    public static String returnFizzBuzz(int number) {
        String result = "";
        if(number % 3 == 0){
            result = "Fizz";
        }if(number % 5 == 0){
            result = "Buzz";
        }if (number % 3 == 0 & number % 5 == 0) {
            result ="FizzBuzz";
        }else {
            result = String.valueOf(number);
        }
        return result;
    }
}
