/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countrycityapplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManipulateData {

    public Map manipulateCityData(String fileName) throws IOException {

        CityCSV ct = new CityCSV();
        List<City> cities = ct.readCityFromCSV(fileName);
        Map<String, List<String>> myMaps = new HashMap<>();
        List<String> s = new ArrayList<>();

        for (City item : cities) {
            if (!myMaps.containsKey(item.getCountryCode())) {
                myMaps.put(item.getCountryCode(), new ArrayList<String>());
            }

            myMaps.get(item.getCountryCode()).add(String.valueOf(item.getPopulation()));

        }
        System.out.print(myMaps);

        return myMaps;

    }

    public List<City> getCountryCodewithPop(List cities, String fileName) throws IOException {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Country Code");
        String countryCode;
        countryCode = myObj.nextLine();

        CityCSV cnP = new CityCSV();
        List<City> cities_cnP = cnP.readCityFromCSV(fileName);
        //print sorted arraylist with population
        Collections.sort(cities_cnP, new sortPopulation());

        //Scan country code and print according to population
        List<City> rows = cities_cnP.stream()
                .filter(l -> l.getCountryCode().contains(countryCode))
                .collect(Collectors.toList());
        rows.forEach(System.out::println);
        System.out.print("Highest Population in " + countryCode + " " + rows.get(rows.size() - 1));

        return null;
    }

    public String getSummaryOfPop(List countries, String fileName) throws IOException {

        CountryCSV cn = new CountryCSV();
        List<Country> countries_c = cn.readCountryFromCSV(fileName);
        List<Integer> newPobulationList = new ArrayList<>(); // Create an ArrayList object

        for (Country c : countries_c) {
            newPobulationList.add(c.getPopulation());
        }

        Double Paverage = newPobulationList.stream().mapToDouble(l -> l).average().getAsDouble();
        //System.out.println("Pobulation Average: "+Paverage);

        Integer Pmax = newPobulationList.stream().max(Integer::compare).get();
        //System.out.println("Pobulation Max: "+Pmax);

        Integer Pmin = newPobulationList.stream().min(Integer::compare).get();
        //System.out.println("Population Min: "+Pmin);

        String str = "Pobulation Average: " + Paverage + "\n" + "Pobulation Max: " + Pmax
                + "\n" + "Population Min: " + Pmin;
        System.out.println(str);

        return null;
    }

    public List<City> HighestPopulationCapital(List countries, String fileName) throws IOException {
        CountryCSV cn = new CountryCSV();
        List<Country> countries_c = cn.readCountryFromCSV(fileName);

        Collections.sort(countries_c, new sortContinentPopulation());
        String continent = countries_c.get(countries_c.size() - 1).getContinent();
        int continentPop = countries_c.get(countries_c.size() - 1).getPopulation();

        Map<String, Integer> continentPopulation = new HashMap<>();
        continentPopulation.put(continent, continentPop);
        System.out.print(continentPopulation);

        return null;
    }

}
