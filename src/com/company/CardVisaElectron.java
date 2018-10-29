package com.company;

public class CardVisaElectron implements CardVisaInterf {

    private String numberFirst = "4";
    private int numberLength = 16;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(numberFirst, numberLength);

        return number;
    }
}
