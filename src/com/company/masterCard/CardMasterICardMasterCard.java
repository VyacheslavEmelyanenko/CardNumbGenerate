package com.company.masterCard;

import com.company.generate.CardGenerate;

public class CardMasterICardMasterCard implements ICardMasterCard {

    private String numberFeaCard = "3333";
    private int numberLength = 19;

    @Override
    public String getNumber() {
        String numberBIN = NUMBERFIRST + numberFeaCard;
        String number = new CardGenerate().generate(NUMBERFIRST, numberLength);
        return number;
    }
}
