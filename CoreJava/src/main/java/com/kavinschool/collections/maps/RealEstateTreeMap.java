package com.kavinschool.collections.maps;

import java.util.TreeMap;

/**
 * <p>RealEstateTreeMap class.</p>
 *
 * @author kangs
 */
public class RealEstateTreeMap {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        System.out.println("Real Estate TreeMap");
        TreeMap<Integer, String> propertyListings = new TreeMap<>();
        propertyListings.put(500000, "PROP001");
        propertyListings.put(300000, "PROP002");
        propertyListings.put(750000, "PROP003");
        System.out.println("Property Listings: " + propertyListings);
        System.out.println("Cheapest Property: " + propertyListings.firstEntry());
        System.out.println("Most Expensive Property: " + propertyListings.lastEntry());

    }
}
