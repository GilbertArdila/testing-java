package com.platzi.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void lose_when_dice_number_is_too_low(){
        //simulamos el dado
        Dice dice = Mockito.mock(Dice.class);
         Mockito.when(dice.roll()).thenReturn(2);
        Player player =  new Player(dice,3);
        assertEquals(false,player.play());
    }

    @Test
    public void whin_when_dice_number_is_bigger(){
        //simulamos el dado
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);
        Player player =  new Player(dice,3);
        assertEquals(true,player.play());
    }
    @Test
    public void tie_when_dice_number_is_equeal(){
        //simulamos el dado
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);
        Player player =  new Player(dice,5);
        assertEquals(true,player.play());
    }

}