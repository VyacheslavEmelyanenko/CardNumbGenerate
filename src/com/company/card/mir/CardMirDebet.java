package com.company.card.mir;

import com.company.CardBasic;

/**
 * Class creating CardMirDebet
 */
public class CardMirDebet extends CardBasic implements ICardMir {

    /**
     *Method generating number card
     * @return number card
     */
    public CardMirDebet() {
        super(NUMBERFIRST + "5555", 16);
    }
}
