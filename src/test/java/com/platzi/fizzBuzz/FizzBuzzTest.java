package com.platzi.fizzBuzz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void Should_return_Fizz(){
        Assert.assertEquals("Fizz",FizzBuzz.returnFizzBuzz(6));
    }
    @Test
    public void Should_return_Buzz(){
        Assert.assertEquals("Buzz",FizzBuzz.returnFizzBuzz(10));
    }

    @Test
    public void Should_return_FizzBuzz(){
        Assert.assertEquals("FizzBuzz",FizzBuzz.returnFizzBuzz(30));
    }

    @Test
    public void Should_return_theNumber(){
        Assert.assertEquals("2",FizzBuzz.returnFizzBuzz(2));
    }

}