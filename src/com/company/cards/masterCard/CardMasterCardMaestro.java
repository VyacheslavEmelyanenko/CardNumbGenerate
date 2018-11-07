package com.company.cards.masterCard;

import com.company.cards.CardBasic;

import java.util.List;

/**
 * Class creating CardMasterCardMaestro
 */
public class CardMasterCardMaestro extends CardBasic {
    private static final String BIN_NUMBER = "422222";
    private static final int LENGTH_NUMBER_CARD = 16;
    /**
     *Method generating number cards
     * @return number cards
     */
    public CardMasterCardMaestro() {
        super(BIN_NUMBER, LENGTH_NUMBER_CARD);
    }
}
