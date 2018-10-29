package com.company;

public class CardMasterCardElectronic implements CardMasterCardInterf {

    private String numberFirst = "5";
    private int numberLength = 19;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(numberFirst, numberLength);

        return number;
    }
}
