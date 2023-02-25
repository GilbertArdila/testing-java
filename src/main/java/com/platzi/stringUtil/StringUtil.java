package com.platzi.stringUtil;

public class StringUtil {

    public static boolean isEmpty(String str){
        if(str == null || str.trim().length() == 0){
            return true;
        }
        if(str.length() == 0){
            return true;
        }

        return false;

    }
}
