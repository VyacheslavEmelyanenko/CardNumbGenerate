package com.company.visa;

import com.company.generate.CardGenerate;

public class CardVisaElectron implements ICardVisa {

    private String numberFeaCard = "8888";
    private int numberLength = 16;

    @Override
    public String getNumber() {
        String numberBIN = NUMBERFIRST + numberFeaCard;
        String number = new CardGenerate().generate(numberBIN, numberLength);

        return number;
    }
}
