/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.statistics;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Nick DiPasquale
 */
@WebService(serviceName = "StatisticsWS")
public class StatisticsWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCountryData")
    public String getCountryData(@WebParam(name = "country") String country) {
        try {
            URL url = new URL("https://api.covid19api.com/summary");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.connect();

            int code = connection.getResponseCode();
            InputStream inputStream = connection.getInputStream();

            String response = null;
            try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
                response = scanner.useDelimiter("\\A").next();
            }

            Gson g = new Gson();
            CovidData cd = g.fromJson(response, CovidData.class);

            for (int i = 0; i < cd.Countries.size(); i++) {
                if (country.equals(cd.Countries.get(i).Country) || country.equals(cd.Countries.get(i).CountryCode)) {
                    return cd.Countries.get(i).toString();
                }
            }
            
            return "Country Not Found";

        } catch (Exception e) {
        }
        return "Error";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getGlobalData")
    public String getGlobalData() {
        try {
            URL url = new URL("https://api.covid19api.com/summary");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.connect();

            int code = connection.getResponseCode();
            InputStream inputStream = connection.getInputStream();

            String response = null;
            try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
                response = scanner.useDelimiter("\\A").next();
            }

            Gson g = new Gson();
            CovidData cd = g.fromJson(response, CovidData.class);
            
            return cd.Global.toString();

        } catch (Exception e) {
        }
        return "Error";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMostDeaths")
    public String getMostDeaths() {
        try {
            URL url = new URL("https://api.covid19api.com/summary");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.connect();

            int code = connection.getResponseCode();
            InputStream inputStream = connection.getInputStream();

            String response = null;
            try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
                response = scanner.useDelimiter("\\A").next();
            }

            Gson g = new Gson();
            CovidData cd = g.fromJson(response, CovidData.class);
            
            int index = 0;

            for (int i = 0; i < cd.Countries.size(); i++) {
                if (cd.Countries.get(i).TotalDeaths > cd.Countries.get(index).TotalDeaths) {
                    if(!cd.Countries.get(i).Country.equals("Global"))
                        index = i;
                }
            }
            
            return cd.Countries.get(index).toString();

        } catch (Exception e) {
        }
        return "Error";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMostInfected")
    public String getMostInfections() {
        try {
            URL url = new URL("https://api.covid19api.com/summary");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.connect();

            int code = connection.getResponseCode();
            InputStream inputStream = connection.getInputStream();

            String response = null;
            try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
                response = scanner.useDelimiter("\\A").next();
            }

            Gson g = new Gson();
            CovidData cd = g.fromJson(response, CovidData.class);
            
            int index = 0;

            for (int i = 0; i < cd.Countries.size(); i++) {
                if (cd.Countries.get(i).TotalConfirmed > cd.Countries.get(index).TotalDeaths) {
                    if(!cd.Countries.get(i).Country.equals("Global"))
                        index = i;
                }
            }
            
            return cd.Countries.get(index).toString();

        } catch (Exception e) {
        }
        return "Error";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMostNewCases")
    public String getMostNewCases() {
        try {
            URL url = new URL("https://api.covid19api.com/summary");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.connect();

            int code = connection.getResponseCode();
            InputStream inputStream = connection.getInputStream();

            String response = null;
            try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
                response = scanner.useDelimiter("\\A").next();
            }

            Gson g = new Gson();
            CovidData cd = g.fromJson(response, CovidData.class);
            
            int index = 0;

            for (int i = 0; i < cd.Countries.size(); i++) {
                if (cd.Countries.get(i).NewConfirmed > cd.Countries.get(index).NewConfirmed) {
                    if(!cd.Countries.get(i).Country.equals("Global"))
                        index = i;
                }
            }
            
            return cd.Countries.get(index).toString();

        } catch (Exception e) {
        }
        return "Error";
    }
}
