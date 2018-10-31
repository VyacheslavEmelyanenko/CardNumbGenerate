package com.company;

import com.company.utils.CardFactory;
import com.company.valid.CardValidate;
import com.company.valid.LuhnValidate;

/**
 * Class managing other classes
 * @author Vyacheslav Emelyanenko
 */
public class Main {
    /**
     * Main method class
     * @param args set programm arguments
     */
    public static void main(String[] args) {
        CardValidate validator = new LuhnValidate();
        for (String typeCard : args) {

            ICard card = CardFactory.getCard(typeCard.toUpperCase());

            String number = card.getNumber();

            System.out.println(number + " " + validator.validateCard(number));
        }
    }
}