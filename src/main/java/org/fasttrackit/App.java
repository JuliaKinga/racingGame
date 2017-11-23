package org.fasttrackit;


public class App {
    public static void main(String[] args) {
        Race race = new Race();

        Track track = new Track();
        track.setLenght(100);
        race.setTrack(track);

        Engine engine = new Engine();
        engine.setManufacturer("volvo");

        Car car = new Car(engine);
        car.setName("Volvo");
        car.setColor("black");
        car.setFuelLevel(100.0);
        car.setMileage(12.5);
        car.setDoorCount(4);

        Engine engine2 = new Engine();
        engine.setManufacturer("Honda");

        Car car2 = new Car(engine2);
        car2.setName("Honda");
        car2.setColor("red");
        car2.setFuelLevel(100.0);
        car2.setMileage(13.5);
        car2.setDoorCount(2);


        Vehicle vehicle = new Vehicle();
        vehicle.accelerate(20.5);

        AutoVehicle autoVehicle = new AutoVehicle(new Engine());



    }
}
