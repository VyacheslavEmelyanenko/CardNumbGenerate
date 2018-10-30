package com.company;

public class CardMasterCardMaestro implements CardMasterCardInterf {

    private String numberFirst = "5";
    private String number25 = "2222";
    private int numberLength = 16;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(numberFirst, numberLength);

        return number;
    }
}
