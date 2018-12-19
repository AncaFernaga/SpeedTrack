package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //declaring a variable and instantiating a Car object
        //this is also called initializing a variable
        Car firstCompetitor = new Car (new Engine());
        firstCompetitor.setName("Dacia");
        firstCompetitor.setColor("black");
        firstCompetitor.doorCount = 5;
        firstCompetitor.setMileage(9.5);

        //local variables are variables declared inside a class
        //they don't receive default values
        Car secondCompetitor = new Car(new Engine());
        secondCompetitor.setName("Golf");

        Engine firstEngine = new Engine ();
        firstEngine.manufacturer = "Renault";

        //sout prints a message to the console
        System.out.println(firstEngine.manufacturer);

        firstCompetitor.engine = firstEngine;
        firstCompetitor.engine.manufacturer = "BMW";

        System.out.println(firstEngine.manufacturer);
        System.out.println(firstCompetitor.engine.manufacturer);

        double traveledDistance = firstCompetitor.accelerate(100, 30);
        System.out.println(" Traveled distance " + traveledDistance);

    }

}
