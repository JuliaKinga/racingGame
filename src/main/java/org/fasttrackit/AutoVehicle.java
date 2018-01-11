package org.fasttrackit;

public class AutoVehicle extends Vehicle {


    private Engine engine;


    public AutoVehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Custom contructor called");
    }


    public AutoVehicle() {
        this(new Engine());
    }



    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
