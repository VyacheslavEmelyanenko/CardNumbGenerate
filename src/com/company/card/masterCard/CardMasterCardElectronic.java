package com.company.card.masterCard;

import com.company.utils.CardGenerate;

/**
 * Class creating CardMasterCardElectronic
 */
public class CardMasterCardElectronic implements ICardMasterCard {

    private String numberFeaCard = "1111";
    private int numberLength = 19;

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
