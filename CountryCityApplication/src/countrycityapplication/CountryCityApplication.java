package countrycityapplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountryCityApplication {

    public static void main(String[] args) throws IOException {

        int i = 0;
        //get list of cities
        CityCSV ct = new CityCSV();
        List<City> cities = ct.readCityFromCSV("C:\\Cities2.csv");
        //ct.printCities();

        //get list of countries
        CountryCSV cn = new CountryCSV();
        List<Country> countries = cn.readCountryFromCSV("C:\\Countries2.csv");
        //cn.printCountries();

        //Map country code with its list of cities
        ManipulateData myObj = new ManipulateData();
        myObj.manipulateCityData("C:\\Cities2.csv");

        //scan country code and get list of cities sorted by population and highest list population
        myObj.getCountryCodewithPop(cities, "C:\\Cities2.csv");
        
        //summary of population(avg, max,min)
        myObj.getSummaryOfPop(countries, "C:\\Countries.csv");
        
        
        //get highest capital population
        myObj.HighestPopulationCapital(countries,"C:\\Countries2.csv");
       
     
    }
}
