package countrycityapplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryCSV {

    List<Country> countriesArraylist = new ArrayList<Country>(); // Create an ArrayList object

    public List<Country> readCountryFromCSV(String fileName) throws FileNotFoundException, IOException {

        BufferedReader csvReader;
        csvReader = new BufferedReader(new FileReader(fileName));
        String line;
        do {
            line = csvReader.readLine();
            if (line != null) {
                String[] attributes = line.split(",");
                Country newCountryObject = createCountry(attributes);
                countriesArraylist.add(newCountryObject);
                for (String part : attributes) {
                    // System.out.println(part + " ");
                }
                // System.out.println("");
            }
        } while (line != null);

        return countriesArraylist;

    }

    public Country createCountry(String[] metadata) {

        Country cn = new Country(metadata[0], metadata[1], metadata[2], Integer.parseInt(metadata[3]), (int) Double.parseDouble(metadata[4]), Double.parseDouble(metadata[5]), Integer.parseInt(metadata[6]));
        return cn;

    }

    public List<Country> printCountries() {
        int i = 0;
        for (Country c : countriesArraylist) {
            System.out.println("#" + (i++) + c);
        }
        // System.out.println(cities);
        return countriesArraylist;
    }
}
