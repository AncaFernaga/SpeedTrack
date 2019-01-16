package org.fasttrackit;

import org.fasttrackit.cheater.CheatingCar;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Game game = new Game();

        game.addCompetitors(2);
        game.displayCompetitors();

        game.addTrack(0, new Track("Highway", 300));
        game.addTrack(1, new Track("Seaside", 100));

        game.displayAvailableTracks();


        //modulo operator
        System.out.println(4 % 2);
        System.out.println(4 % 3);

        Vehicle cheatingCar = new CheatingCar();
        cheatingCar.accelerate(10, 2);


        //declaring a variable and instantiating a Car object
        //this is also called initializing a variable
        Car firstCompetitor = new Car(new Engine());
        firstCompetitor.setName("Dacia");
        firstCompetitor.setColor("black");
        firstCompetitor.doorCount = 5;
        firstCompetitor.setMileage(9.5);
//
        //local variables are variables declared inside a class
        //they don't receive default values
        Car secondCompetitor = new Car(new Engine());
        secondCompetitor.setName("Golf");
//
        Engine firstEngine = new Engine();
        firstEngine.manufacturer = "Renault";

        CheatingCar cheatingCompetitor = new CheatingCar();
        cheatingCompetitor.setName("Test1");
        double distance = cheatingCompetitor.accelerate(70);

        System.out.println("Cheating travels the distance of" + distance);
//
        //sout prints a message to the console
        System.out.println(firstEngine.manufacturer);
//
        firstCompetitor.engine = firstEngine;
        firstCompetitor.engine.manufacturer = "BMW";
//
        System.out.println(firstEngine.manufacturer);
        System.out.println(firstCompetitor.engine.manufacturer);
//
        double traveledDistance = firstCompetitor.accelerate(100, 30);
        System.out.println(" Traveled distance " + traveledDistance);

        Engine autoVehicleEngine = new Engine();
        autoVehicleEngine.manufacturer = "Renault";
        AutoVehicle autoVehicle = new AutoVehicle(autoVehicleEngine);
//
        Vehicle vehicle = new Vehicle();
        vehicle.applicationTotalNumberOfVehicles = 10;
        System.out.println("Total from vehicle 1 + vehicle.applicationTotalNumberOfVehicles");

        vehicle = new Vehicle();
        vehicle.applicationTotalNumberOfVehicles = 2;
        System.out.println("Total from vehicle 2 + vehicle2.applicationTotalNumberOfVehicles");
        System.out.println("Total from vehicle 1 + vehicle.applicationTotalNumberOfVehicles");


    }

}
