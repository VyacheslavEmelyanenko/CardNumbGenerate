package com.company.cards;

import com.company.cards.masterCard.CardMasterCardElectronic;
import com.company.cards.masterCard.CardMasterCardMaestro;
import com.company.cards.masterCard.CardMasterCardStandard;
import com.company.cards.mir.CardMirClassic;
import com.company.cards.mir.CardMirDebet;
import com.company.cards.mir.CardMirPremium;
import com.company.cards.visa.CardVisaClassic;
import com.company.cards.visa.CardVisaElectron;
import com.company.cards.visa.CardVisaGold;

/**
 * Class implements the enumeration cards
 */
public enum CardList {
    CARDVISAGOLD(CardVisaGold.class),
    CARDVISACLASSIC(CardVisaClassic.class),
    CARDVISAELECTRON(CardVisaElectron.class),
    CARDMASTERCARDSTANDARD(CardMasterCardStandard.class),
    CARDMASTERCARDELECTRONIC(CardMasterCardElectronic.class),
    CARDMASTERCARDMAESTRO(CardMasterCardMaestro.class),
    CARDMIRCLASSIC(CardMirClassic.class),
    CARDMIRPREMIUM(CardMirPremium.class),
    CARDMIRDEBET(CardMirDebet.class);

    private Class card;

    /**
     * Constructor with cards parameter
     * @param card type cards
     */
    CardList(Class card) {
        this.card = card;
    }

    /**
     * Method returning class cards
     * @return returning class cards
     */
    public Class getCard() {
        return card;
    }
}
