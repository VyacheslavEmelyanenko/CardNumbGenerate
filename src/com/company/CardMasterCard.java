package com.company;

public class CardMasterCard implements Card{

    private String numberFirst = "5";
    private int numberLength = 19;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(numberFirst, numberLength);

        return number;
    }
}
