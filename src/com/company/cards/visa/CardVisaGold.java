package com.company.cards.visa;

import com.company.cards.CardBasic;

/**
 * Class creating CardVisaGold
 */
public class CardVisaGold extends CardBasic {
    private static final String BIN_NUMBER = "49999";
    private static final int LENGTH_NUMBER_CARD = 17;
    /**
     *Method generating number cards
     * @return number cards
     */
    public CardVisaGold() {
        super(BIN_NUMBER, LENGTH_NUMBER_CARD);
    }
}
