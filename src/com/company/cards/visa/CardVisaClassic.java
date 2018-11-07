package com.company.cards.visa;

import com.company.cards.CardBasic;

/**
 * Class creating CardVisaClassic
 */
public class CardVisaClassic extends CardBasic {
    private static final String BIN_NUMBER = "477777";
    private static final int LENGTH_NUMBER_CARD = 16;

    /**
     *Method generating number cards
     * @return number cards
     */
    public CardVisaClassic() {
        super(BIN_NUMBER, LENGTH_NUMBER_CARD);
    }
}
