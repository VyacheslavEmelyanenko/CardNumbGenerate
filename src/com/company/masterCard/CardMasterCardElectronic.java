package com.company.masterCard;

import com.company.generate.CardGenerate;

public class CardMasterCardElectronic implements ICardMasterCard {

    //todo исправить ...
    private String number25 = "1111";
    private int numberLength = 19;

    @Override
    public String getNumber() {
        String number15 = numberFirst + number25;
        String number = new CardGenerate().generate(number15, numberLength);

        return number;
    }
}
