package com.company;

import com.company.utils.CardGenerate;

/**
 * Base class for all card
 */
public class CardBasic implements ICard {

    protected String numberBIN;
    protected int numberLength;

    /**
     * Class generating number card, setting BIN and Length card
     * @param numberBIN BIN card
     * @param numberLength length number card
     */
    public CardBasic(String numberBIN, int numberLength) {

        this.numberBIN = numberBIN;
        this.numberLength = numberLength;

    }

    /**
     * Method generating number card
     * @return number card
     */
    @Override
    public String getNumber() {
        return new CardGenerate().generate(numberBIN, numberLength);
    }
}
