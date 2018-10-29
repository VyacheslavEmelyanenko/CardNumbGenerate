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
        if(typeCard.equals("CardVisaGold"))
            return new CardVisaGold();
        else if(typeCard.equals("CardVisaClassic"))
            return new CardVisaClassic();
        else if(typeCard.equals("CardVisaElectron"))
            return new CardVisaElectron();
        else if(typeCard.equals("CardMasterCardMasterCard"))
            return new CardMasterCardMasterCard();
        else if(typeCard.equals("CardMasterCardElectronic"))
            return new CardMasterCardElectronic();
        else if(typeCard.equals("CardMasterCardMaestro"))
            return new CardMasterCardMaestro();
        else if(typeCard.equals("CardMirClassic"))
            return new CardMirClassic();
        else if(typeCard.equals("CardMirPremium"))
            return new CardMirPremium();
        else if(typeCard.equals("CardMirDebet"))
            return new CardMirDebet();

        throw new RuntimeException("Карта данной платежной системы неизвестна: "+ typeCard);
    }
}
