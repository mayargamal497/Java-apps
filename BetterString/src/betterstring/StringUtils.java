/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterstring;

import java.util.function.BiPredicate;

/**
 *
 * @author mayar
 */
public class StringUtils {

    public static String getBetterString(String s1, String s2, BiPredicate<String, String> p) { //p refrence to piprdicate interface

        boolean b = p.test(s2, s1);
        if (b == true) {
            return s2;
        }
        else {
            return s1;
        }

    }}
