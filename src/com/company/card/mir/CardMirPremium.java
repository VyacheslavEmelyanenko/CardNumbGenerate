package com.company.card.mir;

import com.company.generate.CardGenerate;

/**
 * Class creating CardMasterCardElectronic
 */
public class CardMirPremium implements ICardMir {

    private String numberFeaCard = "6666";
    private int numberLength = 17;

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
