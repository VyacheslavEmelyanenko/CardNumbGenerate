package com.company.masterCard;

import com.company.generate.CardGenerate;

public class CardMasterCardMaestro implements ICardMasterCard {

    private String numberFeaCard = "2222";
    private int numberLength = 16;

    @Override
    public String getNumber() {
        String numberBIN = NUMBERFIRST + numberFeaCard;
        String number = new CardGenerate().generate(numberBIN, numberLength);

        return number;
    }
}
