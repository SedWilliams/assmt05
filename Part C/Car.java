/********************************************************************
 * File: Car.java
 * @author: Shedrick Williams
 * @since: 10/25/25
 * 
 * Description: Represents a car, a subclass of Vehicle and implements IsDriveable interface.
 * @see Vehicle.java for the base class.
 * @see IsDriveable.java for the interface.
 ********************************************************************/

public class Car extends Vehicle implements IsDriveable {
  
    private final String vin;

    /********************************************************************
    * Constructors
    * @param make - The make of the car
    * @param model - The model of the car
    * @param year - The year of the car
    * @param color - The color of the car
    * @param vin - The VIN of the car
    *********************************************************************/
    public Car(String make, String model, String year, String color, String vin) {
        super(make, model, year, color);
        this.vin = vin;
    }

    /********************************************************************
    * IsDriveable Interface Implementations
    ********************************************************************/
    public void forward() {
        System.out.println("The car is moving forward.");
    }
    public void backwards() {
        System.out.println("The car is moving backwards.");
    }
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
    public void brake() {
        System.out.println("The car is braking.");
    }
    public void turnLeft() {
        System.out.println("The car is turning left.");
    }
    public void turnRight() {
        System.out.println("The car is turning right.");
    }
}
