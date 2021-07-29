/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkalpha;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class CheckAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter string");
        String str = myObj.nextLine();  // Read user input

        for (int i = 0; i < str.length(); i++) {
         boolean b1 = Character.isLetter(str.charAt(i));
        }

        if ("".equals(str)) {
            System.out.print(false);
        } else if (str == null) {
            System.out.print(false);
        } else {
            boolean result = str.chars().allMatch(Character::isLetter);
            System.out.print(result);
        }

    }

}
