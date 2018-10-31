package com.company.card.visa;

import com.company.generate.CardGenerate;

/**
 * Class creating CardMasterCardElectronic
 */
public class CardVisaElectron implements ICardVisa {

    private String numberFeaCard = "8888";
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
