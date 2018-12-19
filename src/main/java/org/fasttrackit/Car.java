package org.fasttrackit;

public // inheritance or "is-a" relationship
class Car extends AutoVehicle {

    //instance variables (declared as properties of a class)
    //they receive default values (null for objects, 0 for number, false for booleans)

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }
}
