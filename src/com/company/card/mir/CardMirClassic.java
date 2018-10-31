package com.company.card.mir;

import com.company.generate.CardGenerate;

/**
 * Class creating CardMasterCardElectronic
 */
public class CardMirClassic implements ICardMir {

    private String numberFeaCard = "4444";
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
