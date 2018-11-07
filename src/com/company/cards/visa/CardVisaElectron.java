package com.company.cards.visa;

import com.company.cards.CardBasic;

/**
 * Class creating CardVisaElectron
 */
public class CardVisaElectron extends CardBasic {
    private static final String BIN_NUMBER = "48888";
    private static final int LENGTH_NUMBER_CARD = 16;

    /**
     *Method generating number cards
     * @return number cards
     */
    public CardVisaElectron() {
        super(BIN_NUMBER, LENGTH_NUMBER_CARD);
    }
}
