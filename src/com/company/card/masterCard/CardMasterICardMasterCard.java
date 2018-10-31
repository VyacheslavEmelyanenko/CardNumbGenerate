package com.company.card.masterCard;

import com.company.CardBasic;

/**
 * Class creating CardMasterICardMasterCard
 */
public class CardMasterICardMasterCard extends CardBasic implements ICardMasterCard {

    /**
     *Method generating number card
     * @return number card
     */
    public CardMasterICardMasterCard() {
        super(NUMBERFIRST + "3333", 18);
    }
}
