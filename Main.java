
/**
public class Main {
    public static void main(String[] args) {
        int number = 0;

        System.out.println(number);
        while (number < 10) {
            System.out.println("Count is: " + number);
            number++;
        }
              
    }
}
*/


/**
public class Main {
    public static void main(String[] args) {
        char copyrightSymbol = '\u00A9';

        System.out.println(copyrightSymbol); // copyright symbol
    }
}
*/

/**public class Main {
    public static void main(String[] args){
        char percentSign = '%';

        System.out.println(percentSign); // %
    }
}
*/


/**
public class Main {
    public static void main(String[] args) {
        boolean isWeekend = false;

        System.out.println(isWeekend); //false
    }
}
*/


/**public class Main {
    public static void main(String[] args) {
        float gpa = 4.8f;
         
        System.out.println("My GPA is " + gpa + ".");
    }
}
*/


/**
public class Main{
    public static void main(String[] args) {
        // <type> <name>
        int age;

        // <name> = <value>
        age = 34;

        //prints the age on the terminal
        System.out.println("I am " + age + " years old.");
    }
}
*/



/**
class Main{
    public static void main(String[] args) {
        // code here
        System.out.println("Hello World!");
    }
}
    */



/** OOP - Classes 
 * Java Learning Path

class Bicycle {
    // These fields represent states of the object
    int cadence = 0; 
    int speed = 0;
    int gear = 1;

// These fields define METHODS - define its interaction
// with the outside world

    void changeCadence(int newValue) {
        cadence = newValue;
}

    void changeGear(int newValue) {
        gear = newValue;
}

    void speedUp(int increment) {
        speed = speed + increment;
}

    void applyBrakes(int decrement) {
        speed = speed - decrement;
 }
 void printStates() {
    System.out.println("Cadence: " + cadence + " Speed: " + speed + " Gear: " + gear);

// This class does not contain a MAIN method because it
// is not a complete application. 
 }

}
*/
/**
class MountainBike extends Bicycle{
    // Mountain bike info would be added here in addittion to Bicycle Class items. 
    // It is a subclass
    // Uses keyword "EXTENDS"
}

// To create an interface
// "class name IMPLEMENTS Bicycle"
// The compiler will now require that methods
// changeCadence, changeGear, speedUp, and applyBrakes
// all be implemented. Compilation will fail if those
// methods are missing from this class.
*/

/**
class BicycleDemo {

    // This application does contain a MAIN method
    // THis application invokes the methods from 
    // "Bicycle" class
    public static void main(String[] args) {
        // Creatre two different Bicycle objects

        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //Invoke methods on those objects

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();


    }
}

*/


