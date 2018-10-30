package com.company.valid;
/*
*Abstract class that implements the validat
 */
public abstract class CardValidate {
    protected CardValidate next;

    public void setNext(CardValidate validator) {
        next = validator;
    }

    public abstract boolean validateCard(String cardNumber);
}
