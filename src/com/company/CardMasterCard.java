package com.company;

public class CardMasterCard implements Card{

    private String NumberFirst = "5";
    private int NumberLength = 19;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(NumberFirst, NumberLength);

        return number;
    }
}
