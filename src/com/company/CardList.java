package com.company;

import com.company.masterCard.CardMasterCardElectronic;
import com.company.masterCard.CardMasterCardMaestro;
import com.company.masterCard.CardMasterICardMasterCard;
import com.company.mir.CardMirClassic;
import com.company.mir.CardMirDebet;
import com.company.mir.CardMirPremium;
import com.company.visa.CardVisaClassic;
import com.company.visa.CardVisaElectron;
import com.company.visa.CardVisaGold;

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

    CardList(Class card) {
        this.card = card;
    }

    private Class card;

    public Class getCard() {
        return card;
    }
}
