package ru.mkala.beeraplication;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by badruttin on 04.01.17.
 */
public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;

    }
}
