package com.company;

public class CardMirPremium implements CardMirInterf{

    private String numberFirst = "2";
    private int numberLength = 17;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(numberFirst, numberLength);

        return number;
    }
}
