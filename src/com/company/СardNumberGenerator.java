package com.company;

import com.company.cards.Card;
import com.company.utils.CardFactory;
import com.company.validate.CardValidate;
import com.company.validate.LuhnValidate;

/**
 * Class managing other classes
 * @author Vyacheslav Emelyanenko
 */
public class СardNumberGenerator {
    /**
     * Main method class
     * @param args set program arguments
     */
    public static void main(String[] args) {
        CardValidate validator = new LuhnValidate();
        for (String typeCard : args) {
            Card card = CardFactory.getCard(typeCard.toUpperCase());

            if (card == null) {
                continue;
            }
            String number = card.getNumber();

            System.out.println(card.getClass().getSimpleName().toUpperCase() + ": " + number + " " + validator.validateCard(number));
        }
    }
}