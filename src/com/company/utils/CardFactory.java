package com.company.utils;

import com.company.CardList;
import com.company.ICard;

public class CardFactory {
    public static ICard getCard(String typeCard) {
        ICard card = null;

        try {
            card = (ICard) CardList.valueOf(typeCard).getCard().newInstance();
           } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
           }
        //TODO ошибки при неверном типе карты

        return card;
    }
}
