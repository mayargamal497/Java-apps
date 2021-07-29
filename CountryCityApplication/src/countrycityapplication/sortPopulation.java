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
public class sortPopulation implements Comparator<City> {
    public int compare(City a, City b)
    {
        
        return (int) (a.population - b.population);
    }

   
    
}
