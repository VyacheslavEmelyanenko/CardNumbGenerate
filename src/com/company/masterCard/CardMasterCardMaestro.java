package com.company.masterCard;

import com.company.generate.CardGenerate;

public class CardMasterCardMaestro implements ICardMasterCard {

    private String numberFirst = "5";
    private String number25 = "2222";
    private int numberLength = 16;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(numberFirst, numberLength);

        return number;
    }
}
