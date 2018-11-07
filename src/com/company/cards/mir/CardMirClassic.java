package com.company.cards.mir;

import com.company.cards.CardBasic;

/**
 * Class creating CardMirClassic
 */
public class CardMirClassic extends CardBasic {
    private static final String BIN_NUMBER = "444444";
    private static final int LENGTH_NUMBER_CARD = 18;
    /**
     *Method generating number cards
     * @return number cards
     */
    public CardMirClassic() {
        super(BIN_NUMBER, LENGTH_NUMBER_CARD);
    }
}
