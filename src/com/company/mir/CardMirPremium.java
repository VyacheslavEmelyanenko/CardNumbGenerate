package com.company.mir;

import com.company.generate.CardGenerate;

public class CardMirPremium implements ICardMir {

    private String number15 = "";
    private String numberFirst = "2";
    private String number25 = "6666";
    private int numberLength = 17;

    @Override
    public String getNumber() {
        number15 = numberFirst + number25;
        String number = new CardGenerate().generate(number15, numberLength);

        return number;
    }
}
