package com.kavinschool.generics;

import java.util.ArrayList;
import java.util.List;

// Base class for products
class Product {
    private final String productId;
    private final String name;

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
}

// Software product class
class Software extends Product {
    public Software(String productId, String name) {
        super(productId, name);
    }
}

// Hardware product class
class Hardware extends Product {
    public Hardware(String productId, String name) {
        super(productId, name);
    }
}

// ProductCatalog with generic methods
class ProductCatalog {
    public <T extends Product> void addProduct(List<T> catalog, T product) {
        catalog.add(product);
    }

    public <T extends Product> void printProductDetails(List<T> catalog) {
        for (Product product : catalog) {
            System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getName());
        }
    }
}

public class ProductCatalogSystem {
    public static void main(String[] args) {
        List<Software> softwareCatalog = new ArrayList<>();
        List<Hardware> hardwareCatalog = new ArrayList<>();

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(softwareCatalog, new Software("SW123", "Antivirus"));
        catalog.addProduct(hardwareCatalog, new Hardware("HW123", "Laptop"));

        catalog.printProductDetails(softwareCatalog);
        catalog.printProductDetails(hardwareCatalog);
    }
}
