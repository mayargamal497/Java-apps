/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mayar
 */
public class PyramidCSVDAO implements PyramidInterface {

    public List<Pyramid> readPyramidFromCSV(String fileName) {
        List<Pyramid> pyramidsArraylist = new ArrayList<Pyramid>(); // Create an ArrayList object

        BufferedReader csvReader;
        try {
            csvReader = new BufferedReader(new FileReader(fileName));
            String line = csvReader.readLine();
            do {
                line = csvReader.readLine();
                if (line != null) {
                    String[] attributes = line.split(",");
                    Pyramid newPyramidObject = createPyramid(attributes);
                    pyramidsArraylist.add(newPyramidObject);
                    for (String part : attributes) {
                        System.out.println(part + " ");
                    }
                    System.out.println("");
                }
            } while (line != null);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pyramidsArraylist;
    }

    public Pyramid createPyramid(String[] metadata) {
        String height = metadata[7];
        if (height.equals("")) {
            height = "0.0";

        }
        Pyramid pr = new Pyramid(metadata[0], metadata[2], metadata[4], Double.parseDouble(height));

        return pr;

    }
}
