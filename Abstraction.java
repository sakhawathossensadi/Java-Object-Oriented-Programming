abstract class Vehicle
{
    abstract void start();
}

class Car extends Vehicle
{
    void start()
    {
        System.out.println("Car starts with key");
    }      
}

class Motorcycle extends Vehicle
{
    void start()
    {
        System.out.println("Motorcycle starts with kick");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start();
    }
}
