package com.company;

import com.company.valid.CardValidate;
import com.company.valid.LuhnValidate;

public class Main {

    public static void main(String[] args) {
        CardValidate validator = new LuhnValidate();
        for (String typeCard : args) {

            Card card = null;
            try {
                card = (Card) CardList.valueOf(typeCard).getCard().newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            String number = card.getNumber();

            System.out.println(number + " " + validator.validateCard(number));
        }
    }
}