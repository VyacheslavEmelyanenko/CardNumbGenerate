package com.company.masterCard;

import com.company.generate.CardGenerate;

public class CardMasterICardMasterCard implements ICardMasterCard {

    private String number25 = "3333";
     private String numberFirst = "5";

    private int numberLength = 19;

    @Override
    public String getNumber() {
        String number = new CardGenerate().generate(numberFirst, numberLength);
        return number;
    }
}
