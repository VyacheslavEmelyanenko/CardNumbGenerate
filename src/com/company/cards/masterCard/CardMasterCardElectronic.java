package com.company.cards.masterCard;

import com.company.cards.CardBasic;

/**
 * Class creating CardMasterCardElectronic
 */
public class CardMasterCardElectronic extends CardBasic {
    private static final String BIN_NUMBER = "411111";
    private static final int LENGTH_NUMBER_CARD = 16;
    /**
     *Method generating number cards
     * @return number cards
     */
    public CardMasterCardElectronic() {
        super(BIN_NUMBER,LENGTH_NUMBER_CARD);
    }
}
