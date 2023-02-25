package com.platzi.leapYear;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearTest {

    @Test
    public void shouldReturnTrueWhenYearDivisibleBy400(){

        assertThat(LeapYear.isLeapYear(1600),CoreMatchers.is(true));
        assertThat(LeapYear.isLeapYear(2000),CoreMatchers.is(true));
        assertThat(LeapYear.isLeapYear(2400),CoreMatchers.is(true));
    }
    @Test
    public void shouldReturnFalseWhenYearDivisibleBy100ButNotBy400(){
        assertThat(LeapYear.isLeapYear(1700),CoreMatchers.is(false));
        assertThat(LeapYear.isLeapYear(1800),CoreMatchers.is(false));
        assertThat(LeapYear.isLeapYear(1900),CoreMatchers.is(false));
    }
    @Test
    public void shouldReturnTrueWhenYearDivisibleBy4ButNotBy100(){
        assertThat(LeapYear.isLeapYear(1996),CoreMatchers.is(true));
        assertThat(LeapYear.isLeapYear(2004),CoreMatchers.is(true));
        assertThat(LeapYear.isLeapYear(2008),CoreMatchers.is(true));
    }
    @Test
    public void shouldReturnFalseWhenYearNotDivisibleBy4(){
        assertThat(LeapYear.isLeapYear(2017),CoreMatchers.is(false));
        assertThat(LeapYear.isLeapYear(2018),CoreMatchers.is(false));
        assertThat(LeapYear.isLeapYear(2019),CoreMatchers.is(false));
    }

}