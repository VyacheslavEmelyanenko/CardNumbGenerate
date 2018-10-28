package com.company;

public class Main {

    public static void main(String[] args) {
        CardValidate validator = new LuhnValidate();
        for (String typeCard: args) {

            Card card = getCardForType(typeCard);
            String number = card.getNumber();

            System.out.println(number + " " + validator.validateCard(number));
        }
    }

    public static Card getCardForType(String typeCard){
        if(typeCard.equals("Visa"))
            return new CardVisa();
        else if(typeCard.equals("MasterCard"))
            return new CardMasterCard();
        else if(typeCard.equals("Mir"))
            return new CardMir();

        throw new RuntimeException("Карта данной платежной системы неизвестна: "+ typeCard);
    }
}
