package com.company;

public class Main {

    public static void main(String[] args) {
        CardValidate validator = new LuhnValidate();
        for (String masterCard: args) {

            String number = new CardGenerate().generate(masterCard);
            System.out.println(number + " " + validator.validateCard(number));
        }
    }
}
