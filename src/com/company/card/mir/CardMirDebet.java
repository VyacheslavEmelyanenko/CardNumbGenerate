package com.company.card.mir;

import com.company.utils.CardGenerate;

/**
 * Class creating CardMasterCardElectronic
 */
public class CardMirDebet implements ICardMir {

    private String numberFeaCard = "5555";
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
