package com.company;

import com.company.card.masterCard.CardMasterCardElectronic;
import com.company.card.masterCard.CardMasterCardMaestro;
import com.company.card.masterCard.CardMasterICardMasterCard;
import com.company.card.mir.CardMirClassic;
import com.company.card.mir.CardMirDebet;
import com.company.card.mir.CardMirPremium;
import com.company.card.visa.CardVisaClassic;
import com.company.card.visa.CardVisaElectron;
import com.company.card.visa.CardVisaGold;

/**
 * Class implements the enumeration card
 */
public enum CardList {
    CARDVISAGOLD(CardVisaGold.class),
    CARDVISACLASSIC(CardVisaClassic.class),
    CARDVISAELECTRON(CardVisaElectron.class),
    CARDMASTERCARDMASTERCARD(CardMasterICardMasterCard.class),
    CARDMASTERCARDELECTRONIC(CardMasterCardElectronic.class),
    CARDMASTERCARDMAESTRO(CardMasterCardMaestro.class),
    CARDMIRCLASSIC(CardMirClassic.class),
    CARDMIRPREMIUM(CardMirPremium.class),
    CARDMIRDEBET(CardMirDebet.class);

    private Class card;

    /**
     * Constructor with card parameter
     * @param card type card
     */
    CardList(Class card) {
        this.card = card;
    }

    /**
     * Method returning class card
     * @return returning class card
     */
    public Class getCard() {
        return card;
    }
}
