package com.company.card.visa;

import com.company.CardBasic;

/**
 * Class creating CardVisaClassic
 */
public class CardVisaClassic extends CardBasic implements ICardVisa {

    /**
     *Method generating number card
     * @return number card
     */
    public CardVisaClassic() {
        super(NUMBERFIRST + "7777", 16);
    }
}
