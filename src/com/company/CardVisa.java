package com.company;

public class CardVisa implements Card{

    private String NumberFirst = "4";
    private int NumberLength = 16;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(NumberFirst, NumberLength);

        return number;
    }
}
