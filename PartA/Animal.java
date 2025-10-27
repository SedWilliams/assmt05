/****************************************************************************************
 * File: Animal.java
 * @author: Shedrick Williams
 * @since: 10/25/25
 * 
 * Description: Provides the base class for all animals.
****************************************************************************************/


/****************************************************************************************
* Class: Animal
* Description: This is the base class for all animals.
****************************************************************************************/
public class Animal {
    private final Boolean isWild;
    private final String familyStructure;

    /*********************************************************************
    * Constructors
    ********************************************************************/

    /*********************************************************************
    * Constructor for Animal class (with arguments)
    * @param isWild - Whether the animal is wild
    * @param familyStructure - The family structure of the animal
    ********************************************************************/
    Animal(final Boolean isWild, final String familyStructure) {
        this.isWild = isWild;
        this.familyStructure = familyStructure;
    }


    /********************************************************************
    * Constructor for Animal class (no arguments)
    ********************************************************************/
    Animal() {
        this.breed = "Unknown";
        this.isWild = false;
        this.familyStructure = "Unknown";
    }

    /********************************************************************
    * Methods
    ********************************************************************/

    /********************************************************************
    * Method to make the animal make noise
    * @return void
    ********************************************************************/
    public void makeNoise(){};

    /********************************************************************
    * Method to make the animal eat
    * @return void
    ********************************************************************/
    public void eat(){};

    /********************************************************************
    * Method to make the animal sleep
    * @return void
    ********************************************************************/
    public void sleep(){};

}