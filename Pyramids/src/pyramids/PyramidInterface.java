/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.util.List;

/**
 *
 * @author mayar
 */
public interface PyramidInterface {
    public List<Pyramid> readPyramidFromCSV(String fileName); // interface method (does not have a body)
    public Pyramid createPyramid(String[] metadata); // interface method (does not have a body)  
    
}
