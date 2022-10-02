/*
 * References
 * https://www.javatpoint.com/object-and-class-in-java
 * https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 * 
 */

package weekend;

public class Index {
    String address;
    public static void main(String[] args) {
        
        // nested if statements
        String address = "Kiambu, Ruiru";

        if (address.endsWith("Ruiru")){
            if (address.contains("Kihunguro")){
                System.out.println("Your estate is Kihunguro");                
            }
            else if (address.contains("ByPass")){
                System.out.println("Your estate is Bypass");
            }
            else {
                System.out.println(address.split(",")[0]);
            }
        }
        /*
         * Here, we have used several string methods like; 
         * a. endsWith()
         * b. contains()
         * c. split()
         */

        //  for each loop
        String[] programmingLanguages = {"Java", "C", "Python"};
        System.out.println("We are printing the programming languages elements in the array");

        for (String language : programmingLanguages){
            System.out.println(language);
        }
        /*
         * The syntax of for each loop is:
         * for (data_type Var : array_name){
         * statements
         * }
         */

        //  while loop - used to iterate a number of statements when number of iterations is unknown in advance.

        int n = 0;
        int sum = 0;
        System.out.println("Printing the first five numbers");

        while (n <= 5){
            System.out.println(n);
            n = n + 1;
            sum = sum + n;
        }
        System.out.println("The sum of the first five numbers is " + sum);

        /*
         * While loop is used to iterate a number of statements when number of iterations is unknown in advance
         * syntax is:
         * while (condition){
         * statements
         * }
         */


        // for loop
        System.out.println("Printing the sum of the first seven numbers");
        int i;
        for (i = 0; i <= 7; i++){
            sum = sum + i;
        }
        System.out.println("The sum of the first seven natural numbers is " + sum);


        // do while loop
        int x = 1;
        System.out.println("Printing the first ten odd numbers");
        do {
            System.out.println(x);
            x = x + 2;
        }
        while (x <= 10);
    
        /*
         * - do while checks the condition at the end of the loop after executing the loop statements.
         * - Used when the number of iteration is unknown and have to execute the loop at least once.
         */


        //  Object oriented programming (OOPs)
        /*
         * Concepts in OOPs are:
         * 1. object
         * - this is defined as an instance of a class.
         * - they communicate without knowing the details of each other's data or code.
         * - they consume space
         * 
         * 2. class
         * - this is a collection of objects
         * - they do not consume space
         * - it is a blueprint from which an individual object can be created
         * 
         * 3. inheritance
         *  - process where a single object acquires properties and behavior of a parent object.
         * - enables code reusability and helps achieve runtime polymorphism
         * 
         * 4. polymorphism
         * - performing a task in different ways.
         * - achieved through method overloading and overriding
         * 
         * 5. abstraction
         * - hiding internal details and showing functionality
         * - usage is in abstract class and interface
         * 
         * 6. encapsulation
         * - binding or wrapping code and data together into a single unit
         * - java class is an example of encapsulatinon while java bean is a fully encapsulated class since all data members are private
         * 
         * ----other concepts are ----
         * 7. coupling
         * - this is dependency between classes.
         * - strong coupling is when a class has information of another class
         * - private, protected and public modifiers are used to display the visibility level of a class, method or field.
         * - interfaces can be used to achieve weaker coupling
         * 
         * 8. cohesion
         * - definition of the level with which a component performs a task.
         * - highly cohesive method performs a single, well defined task
         * - weakly cohesive method splits a task into separate task
         * - java.io package is a highly cohesive package as I/O classes and interfaces are related
         * - java.util package is a weakly cohesive package as it has unrelated classes and interfaces
         * 
         * 9. association
         * - this is the realationship between the objects. Types include:
         * a. one to one
         * b. one to many
         * c. many to one
         * d. many to many
         * 
         * 10. aggregation
         * - it is a way to achive association
         * - represents the relationship where one object contains other objects as part of its state. 
         * - representative of weak relationships between objects 
         * 
         * 11. composition
         * - it is a way of achieving association.
         * - represents the relationship where one object contains other objects as part of its state
         * - state where containing objects do not have independent existence.
         * 
         */


        //  Naming conventions in Java
        /*
         * 1. Class
         * - should start with an uppercase noun in appropriate words, not acronyms
         * 
         * 2. Interface
         * - should start with uppercase adjective such as Runnable, ActionListener etc and not acronyms
         * 
         * 3. Method
         * - Should start with lowercase verb such as main(), print() in camel case
         * 
         * 4. Variable
         * - should start with lower letter like id, name and avoid one character variables like x, y, z
         * 
         * 5. Package
         * - should be lower case letter
         * - if multiple words, separate with dots ie java.util, java.lang etc
         * 
         * 6. Constant
         * - Should be all uppercase letters ie YELLOW
         * - Multipple words should be separated with an underscore ie YELLOW_COLOR
         * 
         */

        //  Objects and classes
        /*
         * Object is the physical and logical entity that has state and behaviour while class is the logical entity only.
         * Object xtics:
         * 1. State - reps data/value of an object
         * 2. Behavior - reps functionality of an object ie withdraw etc         
         * 3. Identity - Unique id used internally by the JVM
         * 
         * Class is a group of objects with similar properties. Its a blueprint from which objects are created.
         * Can contain:
         * 1. Fields
         * 2. Methods
         * 3. Constructors
         * 4. Blocks
         * 5. Nested class and interface
         */

    }
}

class AnotherIndexClass{
    public String secondary(String[] args){
        Index newAddress = new Index();
        System.out.println(newAddress.address);
        return "My non key word";
    }
}