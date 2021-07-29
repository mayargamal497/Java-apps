
package countrycityapplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CityCSV {
    List<City> citiesArraylist = new ArrayList<City>(); // Create an ArrayList object

    public List<City> readCityFromCSV(String fileName) throws FileNotFoundException, IOException {

        BufferedReader csvReader;
        csvReader = new BufferedReader(new FileReader(fileName));
        String line;
        
        do {
            
                line = csvReader.readLine();
                if (line != null) {
                    String[] attributes = line.split(",");
                    City newCityObject = createCity(attributes);
                    citiesArraylist.add(newCityObject);
                    for (String part : attributes) {
                        //System.out.println(part + " ");
                    }
                   // System.out.println("");
                }
            } while (line != null);
        
        return citiesArraylist;

    }
     public City createCity(String[] metadata) {
        
        City ct = new City(Integer.parseInt(metadata[0]), metadata[1], Integer.parseInt(metadata[2]), metadata[3]);

        return ct;

    }
     public List<City> printCities(){
         int i = 0;
        for (City c : citiesArraylist) {
            System.out.println("#" + (i++) + c);
        }
        // System.out.println(cities);
        return citiesArraylist;
     }

}


