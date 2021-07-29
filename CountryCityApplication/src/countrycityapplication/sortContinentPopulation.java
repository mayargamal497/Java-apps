/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countrycityapplication;

import java.util.Comparator;

/**
 *
 * @author mayar
 */
public class sortContinentPopulation implements Comparator<Country> {
    public int compare(Country a, Country b)
    {
        
        return (int) (a.population - b.population);
    }

}
