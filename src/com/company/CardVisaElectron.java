package com.company;

public class CardVisaElectron implements CardVisaInterf {

    private String number15 = "";
    private String numberFirst = "4";
    private String number25 = "8888";
    private int numberLength = 16;

    @Override
    public String getNumber() {
        number15 = numberFirst + number25;
        String number = new CardGenerate().generate(number15, numberLength);

        return number;
    }
}
