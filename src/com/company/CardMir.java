package com.company;

public class CardMir implements Card{

    private String numberFirst = "2";
    private int numberLength = 17;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(numberFirst, numberLength);

        return number;
    }
}
