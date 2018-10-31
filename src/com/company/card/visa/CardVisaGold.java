package com.company.card.visa;

import com.company.generate.CardGenerate;

/**
 * Class creating CardMasterCardElectronic
 */
public class CardVisaGold implements ICardVisa {

    private String numberFeaCard = "9999";
    private int numberLength = 16;

    /**
     *Method generating number card
     * @return number card
     */
    @Override
    public String getNumber() {
        String numberBIN = NUMBERFIRST + numberFeaCard;
        String number = new CardGenerate().generate(numberBIN, numberLength);

        return number;
    }
}