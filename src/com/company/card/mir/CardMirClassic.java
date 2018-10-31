package com.company.card.mir;

import com.company.CardBasic;

/**
 * Class creating CardMirClassic
 */
public class CardMirClassic extends CardBasic implements ICardMir {

    /**
     *Method generating number card
     * @return number card
     */
    public CardMirClassic() {
        super(NUMBERFIRST + "4444", 18);
    }
}
