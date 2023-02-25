package com.platzi.password;

import com.platzi.password.PasswordUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

@Test
    public void weakTest_lessThan8Characters(){
    assertEquals(PasswordUtil.SecurityLevel.WEAK,PasswordUtil.assesPassword("1234567"));
}
    @Test
    public void weakTest_onlyLetters(){
        assertEquals(PasswordUtil.SecurityLevel.WEAK,PasswordUtil.assesPassword("abcdefgh"));
    }
    @Test
    public void mediumTest_hasLetters_andNumbers(){
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM,PasswordUtil.assesPassword("abcd1234"));
    }
    @Test
    public void strongTest_hasLetters_numbers_symbols(){
        assertEquals(PasswordUtil.SecurityLevel.STRONG,PasswordUtil.assesPassword("!bcd1234"));
    }



}