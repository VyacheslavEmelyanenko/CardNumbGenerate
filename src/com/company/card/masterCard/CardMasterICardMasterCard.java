package com.company.card.masterCard;

import com.company.utils.CardGenerate;

/**
 * Class creating CardMasterICardMasterCard
 */
public class CardMasterICardMasterCard implements ICardMasterCard {

    private String numberFeaCard = "3333";
    private int numberLength = 19;

    /**
     *Method generating number card
     * @return number card
     */
    @Override
    public String getNumber() {
        String numberBIN = NUMBERFIRST + numberFeaCard;
        String number = new CardGenerate().generate(NUMBERFIRST, numberLength);
        return number;
    }
}
