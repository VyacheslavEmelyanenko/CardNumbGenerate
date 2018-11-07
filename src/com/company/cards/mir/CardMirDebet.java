package com.company.cards.mir;

import com.company.cards.CardBasic;

/**
 * Class creating CardMirDebet
 */
public class CardMirDebet extends CardBasic {
    private static final String BIN_NUMBER = "455555";
    private static final int LENGTH_NUMBER_CARD = 16;
    /**
     *Method generating number cards
     * @return number cards
     */
    public CardMirDebet() {
        super(BIN_NUMBER, LENGTH_NUMBER_CARD);
    }
}
