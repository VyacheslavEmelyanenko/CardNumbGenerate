package com.company;

public class CardMir implements Card{
    private String NumberFirst = "2";
    private int NumberLength = 17;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(NumberFirst, NumberLength);

        return number;
    }
}
