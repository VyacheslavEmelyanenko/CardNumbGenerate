package com.company.card.masterCard;

import com.company.CardBasic;

/**
 * Class creating CardMasterCardElectronic
 */
public class CardMasterCardElectronic extends CardBasic implements ICardMasterCard {

    /**
     *Method generating number card
     * @return number card
     */
    public CardMasterCardElectronic() {
        super(NUMBERFIRST + "1111", 17);
    }
}
