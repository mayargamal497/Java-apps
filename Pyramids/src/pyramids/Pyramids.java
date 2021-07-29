/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author mayar
 */
public class Pyramids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidFromCSV("C:\\pyramids.csv");
        List<String> newSiteList = new ArrayList<>(); // Create an ArrayList object

        int i = 0;
        //print sorted arraylist with height
        Collections.sort(pyramids, new SortbyHeight());
        System.out.println("\nSorted by height");
        for (Pyramid p : pyramids) {
             System.out.println("#" + (i++) + p);

        }
        for (Pyramid c : pyramids) {
            newSiteList.add(c.getSite());
        }
        Map<String, Integer> counts = newSiteList.parallelStream().
        collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));
        System.out.println(counts);
        
       
        
        
    }

}
