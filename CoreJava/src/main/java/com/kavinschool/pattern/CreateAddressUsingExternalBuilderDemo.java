package com.kavinschool.pattern;

/**
 * <p>CreateAddressUsingExternalBuilderDemo class.</p>
 *
 * @author kangs
 */
public class CreateAddressUsingExternalBuilderDemo {

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        Address address1 = new AddressBuilder().setAddressLine1("100 1st St").setCity("San Francisco").setState("CA").setZipCode("94001").createAddress();
        System.out.println("address1 = " + address1);
        Address address2 = new AddressBuilder().setAddressLine1("1334 Mission St").setCity("Fremont").setAddressLine1("CA").createAddress();
        System.out.println("address2 = " + address2);
    }
}
