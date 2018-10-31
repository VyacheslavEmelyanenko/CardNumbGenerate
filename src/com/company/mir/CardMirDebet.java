package com.company.mir;

import com.company.generate.CardGenerate;

public class CardMirDebet implements ICardMir {

    private String numberFeaCard = "5555";
    private int numberLength = 17;

    @Override
    public String getNumber() {
        String numberBIN = NUMBERFIRST + numberFeaCard;
        String number = new CardGenerate().generate(numberBIN, numberLength);

        return number;
    }
}
