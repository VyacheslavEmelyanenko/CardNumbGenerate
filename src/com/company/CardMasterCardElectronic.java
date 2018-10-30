package com.company;

public class CardMasterCardElectronic implements CardMasterCardInterf {

    private String number15 = "";
    private String numberFirst = "5";
    private String number25 = "1111";
    private int numberLength = 19;

    @Override
    public String getNumber() {
        number15 = numberFirst + number25;
        String number = new CardGenerate().generate(number15, numberLength);

        return number;
    }
}
