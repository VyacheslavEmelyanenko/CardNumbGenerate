package com.company.cards.mir;

import com.company.cards.CardBasic;

/**
 * Class creating CardMirPremium
 */
public class CardMirPremium extends CardBasic {
    private static final String BIN_NUMBER = "466666";
    private static final int LENGTH_NUMBER_CARD = 17;
    /**
     *Method generating number cards
     * @return number cards
     */
public CardMirPremium() {
    super(BIN_NUMBER, LENGTH_NUMBER_CARD);
}
}
