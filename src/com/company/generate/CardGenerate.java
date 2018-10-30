package com.company.generate;

import java.util.Random;

//В зависимости от типа карты(длинны её номера) в метод generate сбрасывать два параметра bankIdNumber и CARD_NUMBER_LENGTH.
//bankIdNumber предворительно формировать от типа карты.
public class CardGenerate {
    private static final Random RNG = new Random(System.currentTimeMillis());

    private static final int DIGIT_UPPER_LIMIT = 10;
    private int CARD_NUMBER_LENGTH;//Зависит от типа карты

    public String generate(String bankIdNumber, int NumberLength) {
        CARD_NUMBER_LENGTH = NumberLength;
        int randomNumberLength = CARD_NUMBER_LENGTH - (bankIdNumber.length() + 1);

        StringBuilder builder = new StringBuilder(bankIdNumber);

        for (int i = 0; i < randomNumberLength; i++) {
            builder.append(RNG.nextInt(DIGIT_UPPER_LIMIT));
        }
        //Add the missing number
        builder.append(getCheckDigit(builder.toString()));//

        return builder.toString();
    }
    //Find the missing number for true
    private int getCheckDigit(String numberCard) {
        int sum = 0;
        for (int i = 0; i < numberCard.length(); i++) {
            int digit = Integer.parseInt(numberCard.substring(i, (i + 1)));
            if ((i % 2) == 0) {
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
