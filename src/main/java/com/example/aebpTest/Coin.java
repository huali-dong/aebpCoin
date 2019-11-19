package com.example.aebpTest;

public class Coin {

    private int value;

    public Coin(int value) {
        if(value > 20000000 || value < 0){
            throw  new RuntimeException();
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean compare(Coin otherCoin){
        if(this.value > otherCoin.value){
            return true;
        }
        return false;
    }
}
