/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.statistics;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class CovidData {
    Global Global;
    ArrayList<Country> Countries;
    
    @Override
    public String toString()
    {
        return Global.toString() + "\n" + Countries.toString();
    }
}
