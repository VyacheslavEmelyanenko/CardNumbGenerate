package com.company.validate;

/**
 * Abstract class that implements the validat
 */
public abstract class CardValidate {
    protected CardValidate next;

    /**
     * Method seting next validator
     * @param validator seting next validator
     */
    public void setNext(CardValidate validator) {
        next = validator;
    }

    /**
     * Abstract method validating cards
     * @param cardNumber number cards
     * @return returning true or false
     */
    public abstract boolean validateCard(String cardNumber);
}
