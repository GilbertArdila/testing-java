package com.platzi.stringUtil;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void string_is_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void string_is_not_empty(){
        assertFalse(StringUtil.isEmpty("LALALA"));
    }
    @Test
    public void string_is_nully(){
        assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void string_has_spaces(){
        assertTrue(StringUtil.isEmpty("  "));
    }

}