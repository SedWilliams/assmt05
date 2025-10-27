/**************************************************************** 
 * File: CohesiveExample.java
 * @author: Shedrick Williams
 * @since: 10/25/25
 * 
 * Description: Program showcases the class design principle of inheritance.
 * The Dog class stongly IS-A Animal, and weakly is Playable (can play games like fetch, frisbee, racing).
*****************************************************************/

// Weekend before or week before thanksgiving
// if he keeps pushing it back it might just be online

/****************************************************************************************
 * Class: Dog
 * Description: Represents a dog, a subclass of Animal 
 * @see Animal.java for the base class.
 * @see Playable.java for the interface.
 ****************************************************************************************/
public class Dog extends Animal implements Playable {

    /********************************************************************
    * Instance variables
    ********************************************************************/
    private String breed;
    private Boolean isWild;
    private String familyStructure;

    /********************************************************************
    * Constructor(s)
    ********************************************************************/
    Dog(final String breed, final Boolean isWild, final String familyStructure) {
        super(isWild, familyStructure);
        this.breed = breed;
    }

    /********************************************************************
    * Methods: makeNoise(), eat(), sleep(), playFetch(), playFrisbee(), playRacing()
    ********************************************************************/

    /********************************************************************
    * @method Make the dog make noise
    * @override Animal.makeNoise()
    * @return void
    *
    * @see Animal.java
    ********************************************************************/
    public void makeNoise(){
        System.out.println("The dog is barking.");
    }

    /********************************************************************
    * @method Make the dog eat
    * @override Animal.eat()
    * @return void
    *
    * @see Animal.java
    ********************************************************************/
    public void eat(){
        System.out.println("The dog is eating.");
    }

    /********************************************************************
    * @method Make the dog sleep
    * @override Animal.sleep()
    * @return void
    *
    * @see Animal.java
    ********************************************************************/
    public void sleep(){
        System.out.println("The dog is sleeping.");
    }

    /********************************************************************
    * @method Make the dog play fetch
    * @implements Playable.playFetch()
    * @return void
    *
    * @see Playable.java
    ********************************************************************/
    public void playFetch() {
        System.out.println("The dog is playing fetch.");
    }

    /********************************************************************
    * @method Make the dog play frisbee
    * @implements Playable.playFrisbee()
    * @return void
    *
    * @see Playable.java
    ********************************************************************/
    public void playFrisbee() {
        System.out.println("The dog is playing frisbee.");
    }

    /********************************************************************
    * @method Make the dog play racing
    * @implements Playable.playRacing()
    * @return void
    *
    * @see Playable.java
    ********************************************************************/
    public void playRacing() {
        System.out.println("The dog is playing racing.");
    }
}
