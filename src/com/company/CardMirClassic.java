package com.company;

public class CardMirClassic implements CardMirInterf{

    private String numberFirst = "2";
    private int numberLength = 16;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(numberFirst, numberLength);

        return number;
    }
}
