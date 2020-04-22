/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.statistics;

/**
 *
 * @author PC
 */
public class Country {
    String Country;
    String CountryCode;
    String Slug;
    int NewConfirmed;
    int TotalConfirmed;
    int NewDeaths;
    int TotalDeaths;
    int NewRecovered;
    int TotalRecovered;
    String Date;
    
    @Override
    public String toString()
    {
        String str;
        str = "Country: " + Country + "\n";
        str += "NewConfirmed: " + NewConfirmed + "\n";
        str += "TotalConfirmed: " + TotalConfirmed + "\n";
        str += "NewDeaths: " + NewDeaths + "\n";
        str += "TotalDeaths: " + TotalDeaths + "\n";
        str += "NewRecovered: " + NewRecovered + "\n";
        str += "TotalRecovered: " + TotalRecovered + "\n";
        str += "Date: " + Date + "\n";
        
        return str;
    }
}
