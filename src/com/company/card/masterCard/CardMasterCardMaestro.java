package com.company.card.masterCard;

import com.company.generate.CardGenerate;

/**
 * Class creating CardMasterCardMaestro
 */
public class CardMasterCardMaestro implements ICardMasterCard {

    private String numberFeaCard = "2222";
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
