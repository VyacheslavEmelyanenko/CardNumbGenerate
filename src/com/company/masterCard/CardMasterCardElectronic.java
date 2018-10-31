package com.company.masterCard;

import com.company.generate.CardGenerate;

public class CardMasterCardElectronic implements ICardMasterCard {

    private String numberFeaCard = "1111";
    private int numberLength = 19;

    @Override
    public String getNumber() {
        String numberBIN = NUMBERFIRST + numberFeaCard;
        String number = new CardGenerate().generate(numberBIN, numberLength);

        return number;
    }
}
