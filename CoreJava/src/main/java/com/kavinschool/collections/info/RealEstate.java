package com.kavinschool.collections.info;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.LinkedHashSet;

class Property {
    int id;
    String address;
    double price;

    Property(int id, String address, double price) {
        this.id = id;
        this.address = address;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Property{id=" + id + ", address='" + address + "', price=" + price + "}";
    }
}

class Agent {
    int id;
    String name;
    LinkedList<Property> properties;

    Agent(int id, String name) {
        this.id = id;
        this.name = name;
        this.properties = new LinkedList<>();
    }

    void addProperty(Property property) {
        properties.add(property);
    }

    @Override
    public String toString() {
        return "Agent{id=" + id + ", name='" + name + "', properties=" + properties + "}";
    }
}

class Client {
    int id;
    String name;
    LinkedHashSet<Property> interestedProperties;

    Client(int id, String name) {
        this.id = id;
        this.name = name;
        this.interestedProperties = new LinkedHashSet<>();
    }

    void addInterestedProperty(Property property) {
        interestedProperties.add(property);
    }

    @Override
    public String toString() {
        return "Client{id=" + id + ", name='" + name + "', interestedProperties=" + interestedProperties + "}";
    }
}

public class RealEstate {
    public static void main(String[] args) {
        // Create properties
        Property p1 = new Property(1, "123 Main St", 250000);
        Property p2 = new Property(2, "456 Elm St", 300000);
        Property p3 = new Property(3, "789 Oak St", 200000);

        // Store properties in a HashMap
        HashMap<Integer, Property> propertyMap = new HashMap<>();
        propertyMap.put(p1.id, p1);
        propertyMap.put(p2.id, p2);
        propertyMap.put(p3.id, p3);

        // Create agents and add properties to them
        Agent agent1 = new Agent(1, "Alice");
        agent1.addProperty(p1);
        agent1.addProperty(p2);

        Agent agent2 = new Agent(2, "Bob");
        agent2.addProperty(p3);

        // Store agents in a LinkedList
        LinkedList<Agent> agents = new LinkedList<>();
        agents.add(agent1);
        agents.add(agent2);

        // Create clients and add interested properties to them
        Client client1 = new Client(1, "Charlie");
        client1.addInterestedProperty(p1);
        client1.addInterestedProperty(p3);

        Client client2 = new Client(2, "Diana");
        client2.addInterestedProperty(p2);

        // Print out the data
        System.out.println("Properties: " + propertyMap);
        System.out.println("Agents: " + agents);
        System.out.println("Clients: " + client1);
        System.out.println("Clients: " + client2);
    }
}