package com.company.utils;

import java.util.Random;

/**
 *Class generating number card
 */
public class CardGenerate {
    private static final Random RNG = new Random(System.currentTimeMillis());

    private static final int DIGIT_UPPER_LIMIT = 10;

    /**Depends on the type of card*/
    private int CARD_NUMBER_LENGTH;

    /**
     * Method generating random number
     * @param bankIdNumber BIN number card
     * @param NumberLength length number card
     * @return number card
     */
    public String generate(String bankIdNumber, int NumberLength) {
        CARD_NUMBER_LENGTH = NumberLength;
        //int randomNumberLength = CARD_NUMBER_LENGTH - (bankIdNumber.length() + 1);
        int randomNumberLength = CARD_NUMBER_LENGTH - (bankIdNumber.length());

        StringBuilder builder = new StringBuilder(bankIdNumber);

        for (int i = 0; i < randomNumberLength; i++) {
            builder.append(RNG.nextInt(DIGIT_UPPER_LIMIT));
        }

        return builder.toString();
    }
}
