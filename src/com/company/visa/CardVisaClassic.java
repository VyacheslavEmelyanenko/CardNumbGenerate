package com.company.visa;

import com.company.generate.CardGenerate;

public class CardVisaClassic implements ICardVisa {

    private String number15 = "";
    private String numberFirst = "4";
    private String number25 = "7777";
    private int numberLength = 16;

    @Override
    public String getNumber() {
        number15 = numberFirst + number25;
        String number = new CardGenerate().generate(number15, numberLength);

        return number;
    }
}
