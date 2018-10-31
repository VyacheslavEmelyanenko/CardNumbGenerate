package com.company.card.masterCard;

import com.company.CardBasic;

public class CardMasterCardStandard extends CardBasic implements ICardMasterCard  {

    /**
     *Method generating number card
     * @return number card
     */
    public CardMasterCardStandard() {
        super(NUMBERFIRST + "3333", 18);
    }
}
