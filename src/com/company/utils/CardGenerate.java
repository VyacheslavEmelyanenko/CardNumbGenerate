package com.company.utils;

import java.util.Random;

/**
 *Class generating number cards
 */
public class CardGenerate {
    private static final Random RNG = new Random(System.currentTimeMillis());

    private static final int DIGIT_UPPER_LIMIT = 10;

    /**Depends on the type of cards*/
    private int CARD_NUMBER_LENGTH;

    /**
     * Method generating random number
     * @param bankIdNumber BIN number cards
     * @param NumberLength length number cards
     * @return number cards
     */
    public String generate(String bankIdNumber, int NumberLength) {
        CARD_NUMBER_LENGTH = NumberLength;
        int randomNumberLength = CARD_NUMBER_LENGTH - (bankIdNumber.length() - 1);
        StringBuilder builder = new StringBuilder(bankIdNumber);
        for (int i = 0; i < randomNumberLength; i++) {
            builder.append(RNG.nextInt(DIGIT_UPPER_LIMIT));
        }
        builder.append(getCheckDigit(builder.toString()));
        return builder.toString();
    }

    /**
     *Generate a correct card number
     * @param numberCard random number card
     * @return true number
     */
    private static int getCheckDigit(String numberCard) {
        int sum = 0;
        int numberRest = ((numberCard.length() % 2) == 0) ? 1 : 0;
        for (int i = 0; i < numberCard.length(); i++) {
            int digit = Integer.parseInt(numberCard.substring(i, (i + 1)));
            if ((i % 2) == numberRest) {
                digit = digit * 2;
                if (digit > 9)
                    digit = (digit / 10) + (digit % 10);
            }
            sum += digit;
        }
        int mod = sum % 10;
        return ((mod == 0) ? 0 : 10 - mod);
    }
}
