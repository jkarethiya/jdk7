/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.Enum;


/**
 *
 * @author Jitendra
 */
public enum CurrencyEnum {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    private int value;

    private CurrencyEnum(int value) {
        this.value = value;
    }
};