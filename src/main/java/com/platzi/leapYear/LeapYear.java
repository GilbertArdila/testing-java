package com.platzi.leapYear;

public class LeapYear {

    public static boolean isLeapYear(int year){
        boolean response = false;
        if(year % 400 == 0  | (year % 4 == 0 & year % 10 !=0) ){
            response =  true;
        }
    else if((year % 4 != 0) | (year % 100 == 0 & year % 400 !=0)){
            response =  false;
        }
        return response;
    }
}
