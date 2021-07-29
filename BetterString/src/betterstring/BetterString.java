/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterstring;

import java.util.Scanner;
import java.util.function.BiPredicate;

/**
 *
 * @author mayar
 */
public class BetterString {

     
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Enter first string");
        String firstString = myObj.nextLine();  // Read user input
        
        System.out.println("Enter second string");
        String secondString = myObj.nextLine();  // Read user input
        
        String longer = StringUtils.getBetterString(firstString, secondString, (s1,s2)->s1.length()>s2.length());
        System.out.print(longer);
        
    }
    
}


    