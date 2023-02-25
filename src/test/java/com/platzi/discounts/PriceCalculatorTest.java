package com.platzi.discounts;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void total_zero_when_no_price(){
       PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), CoreMatchers.is(0.0));
    }

    @Test
    public void total_is_the_sum_of_both_prices(){
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.00);
        calculator.addPrice(15.00);
        assertThat(calculator.getTotal(), CoreMatchers.is(25.0));
    }

    @Test
    public void apply_discount_to_price(){
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(20.00);
        calculator.addPrice(10.00);
        calculator.setDiscount(10);
        assertThat(calculator.getTotal(), CoreMatchers.is(27.0));
    }
}