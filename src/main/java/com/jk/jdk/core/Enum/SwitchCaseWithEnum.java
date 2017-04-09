/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.Enum;

import com.jk.jdk.core.Enum.CurrencyEnum;

/**
 *
 * @author Jitendra
 */
public class SwitchCaseWithEnum {
    public static void main(String[] args) {
        CurrencyEnum usCoin = CurrencyEnum.DIME;
        switch (usCoin) {
            case PENNY:
                    System.out.println("Penny coin");
                    break;
            case NICKLE:
                    System.out.println("Nickle coin");
                    break;
            case DIME:
                    System.out.println("Dime coin");
                    break;
            case QUARTER:
                    System.out.println("Quarter coin");
        }
        
        for(CurrencyEnum curr : CurrencyEnum.values())
            System.out.println(curr);
    }
}
