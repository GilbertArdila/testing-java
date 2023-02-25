package com.platzi.player;

public class Player {
    private Dice dice;
    private int minNumberToWin;
    public  boolean play(){
        int diceNumber = dice.roll();
        if(diceNumber > minNumberToWin){
            return true;
        }
        if(diceNumber < minNumberToWin){
            return false;
        }
        return true;
    }

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }
}
