package org.Rosokhatyi;

public class CarShowroom {
    private SUV suv;
    private Sedan sedan;

    public CarShowroom(CarFactory factory) {
        this.suv = factory.createSUV();
        this.sedan = factory.createSedan();
    }

    public void showCars() {
        System.out.println("SUV Type: " + suv.getType());
        System.out.println("SUV Engine: " + suv.getEngine());
        System.out.println("SUV Interior: " + suv.getInterior());
        System.out.println();
        System.out.println("Sedan Type: " + sedan.getType());
        System.out.println("Sedan Engine: " + sedan.getEngine());
        System.out.println("Sedan Interior: " + sedan.getInterior());
    }

    public static void main(String[] args) {
        CarFactory luxuryFactory = new LuxuryCarFactory();
        CarShowroom luxuryShowroom = new CarShowroom(luxuryFactory);
        luxuryShowroom.showCars();

        System.out.println();

        CarFactory economyFactory = new EconomyCarFactory();
        CarShowroom economyShowroom = new CarShowroom(economyFactory);
        economyShowroom.showCars();
    }
}

