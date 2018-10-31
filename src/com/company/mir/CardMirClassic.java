package com.company.mir;

import com.company.generate.CardGenerate;

public class CardMirClassic implements ICardMir {

    private String numberFeaCard = "4444";
    private int numberLength = 16;

    @Override
    public String getNumber() {
        String numberBIN = NUMBERFIRST + numberFeaCard;
        String number = new CardGenerate().generate(numberBIN, numberLength);

        return number;
    }
}
