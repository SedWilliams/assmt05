/********************************************************************
 * File: Vehicle.java
 * @author: Shedrick Williams
 * @since: 10/25/25
 * 
 * Description: Provides the base class for all vehicles.
 ********************************************************************/

public class Vehicle {

    /********************************************************************
    * Instance variables
    *********************************************************************/
    private String make;
    private String model;
    private String year;
    private String color;

    /********************************************************************
    * Constructors
    *********************************************************************/

    /********************************************************************
    * Constructor for Vehicle class (with arguments)
    * @param make - The make of the vehicle
    * @param model - The model of the vehicle
    * @param year - The year of the vehicle
    * @param color - The color of the vehicle
    *********************************************************************/
    public Vehicle(String make, String model, String year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    /********************************************************************
    * Constructor for Vehicle class (no arguments)
    *********************************************************************/
    Vehicle() {

    }

    /********************************************************************
    * Getters/Setters for classes/subclasses of Vehicle
    *********************************************************************/
    public String getMake() {
        return make;
    }

    private void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }
    public String getYear() {
        return year;
    }

    private void setYear(String year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }
}
