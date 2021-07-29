/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.util.Comparator;

/**
 *
 * @author mayar
 */
public class SortbyHeight implements Comparator<Pyramid>  {
    public int compare(Pyramid a, Pyramid b)
    {
        return (int) (a.height - b.height);
    }
    
}
