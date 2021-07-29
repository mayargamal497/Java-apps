/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countrycityapplication;

import java.util.List;
import java.util.Map;

/**
 *
 * @author mayar
 */
public interface CityCountryApplicationInterface {
    public Map manipulateCityData(String fileName);
    public List<City> getCountryCodewithPop(List cities, String fileName);
    public int compare(City a, City b);
}
