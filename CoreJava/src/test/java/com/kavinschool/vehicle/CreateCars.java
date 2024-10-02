package com.kavinschool.vehicle;

public class CreateCars {
    public static void main(String[] args) {
        Car toyota = new Car();
        Car bmw = new Car("BMW");
        Car honda = new Car("Honda", "CRV");
        Car nissan = new Car("Nissan", "Sentra", 2010);
        toyota.setMake("Toyota");toyota.setModel("Corolla");toyota.setYear(2022);
        System.out.println("toyota = " + toyota);
        System.out.println("nissan = " + nissan);
        System.out.println("honda = " + honda);
        System.out.println("bmw = " + bmw);

        Car hundai = new Car("Hundai", "Accent", 2022, VehicleState.STOPPED, 4);
        System.out.println(hundai);
    }
}
