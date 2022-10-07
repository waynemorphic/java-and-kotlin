/*
 * References
 * https://www.javatpoint.com/object-and-class-in-java
 * https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 * 
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
         * - process where a single object acquires properties and behavior of a parent object.
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
         * - java class is an example of encapsulatinon while java bean is a fully encapsulated class since 
         *   all data members are private
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
         * - weakly cohesive method splits a task into separate tasks
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
         * - it is a way to achieve association
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
         * - Should start with lowercase verb such as main(), print(), in camel case
         * 
         * 4. Variable
         * - should start with lower letter, like, id, name, and avoid one character variables like x, y, z
         * 
         * 5. Package
         * - should be lower case letter
         * - if multiple words, separate with dots ie java.util, java.lang etc
         * 
         * 6. Constant
         * - Should be all uppercase letters ie YELLOW
         * - Multipple words should be separated with an underscore ie YELLOW_COLOR
         * 
         * 7. Constructor
         * - constructor name should be the same as the class name
         * - it must have no explicit return type
         * - it cannot be abstract, static, final and synchronized 
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
         * 
         * - Instance variable - a variable created inside a class but outside a method is known as an instance variable.
         * - They get their memory at runtime, not at compile time.
         * 
         * - New keyword is used to allocate memory at runtime
         */

package learning;

public class jObjects{

    // doors, wheels and driver are instance variables
    public class Vehicle{
        int doors;
        int wheels;
        String driver;
    }
    /*
     * - the main method is the point of compilation for all methods and class instances
     * - all methods created outside the main method have to be called in the main method
     * - main method MUST have void as it often does not return anything
     * - objects are created in the main method
     */
    public static void main(String[] args){
        /*
        * - we have two classes, therefore, we need to have an instance of the main class in order to 
        *   create an instance/object of the child class
        * - syntax is a.new b() where, a is instance of the parent class and b is the child class
        * - rideVehicle is an instance of the class Vehicle or an object
        */ 
        jObjects myInstance = new jObjects();
        Vehicle rideVehicle = myInstance.new Vehicle();

        /*
        * - There are three ways of initializing objects in java. They are:
        * 1. By reference variable
        * 2. By method
        * 3. By constructor

        ----reference variable initialization-----
         * - based on the newly created object, we will initialize the object using reference variables
         *   which uses the dot(.) notation          
         */
        System.out.println("Reference variable initialization");
        rideVehicle.doors = 5;
        rideVehicle.driver = "John";
        rideVehicle.wheels = 4;
        System.out.println(rideVehicle.driver);
        System.out.println(rideVehicle.wheels);
        System.out.println(rideVehicle.doors);


        /*
         * - we have another class NuclearFamily. We are using it to demo method initialization of an object
         * - remember that we have already created a class instance of the parent class, jObject which is, myInstance
         */
        System.out.println("Method initialization of objects");
        NuclearFamily callNuclearFamily = myInstance.new NuclearFamily();
        NuclearFamily anotherNuclearFamily = myInstance.new NuclearFamily();
        callNuclearFamily.mainNuclearFamily("John Doe", "Jane Doe", "James Doe", "Mary Doe", 4);
        anotherNuclearFamily.mainNuclearFamily("Jimmy Doe", "Janet Doe", "Jameson Doe", "Maryam Doe", 4);

        // --- calling the methods ---
        callNuclearFamily.familyMembers();
        anotherNuclearFamily.familyMembers();


        // calling the constructors
        // System.out.println("Using constructors to initialize objects");
        // Company companyConstructors1 = myInstance.new Company();
        // companyConstructors1.mainCompany();
        String names[] = {"asdsd", "asdasd", "wdqwd"};
        Company companyConstructors2 = myInstance.new Company("John Ngumi", "Ndegwa", names);

        // companyConstructors2.mainCompany();
        companyConstructors2.setName("Myname");

        System.out.println(companyConstructors2.getName());

        }
        
    /*
     * ------- method initialization for an object-------
     */
    class NuclearFamily{
        String father;
        String mother;
        String firstBorn;
        String secondBorn;
        int familyNumber;

    /* - since we have a non static class, the methods that are within the non-static class have to be non static.
     * - this is because, instance variables in non-static class are non static, therefore, they cannot be called in a 
     *   static method
     */

    void mainNuclearFamily(String dad, String mum, String kidOne, String kidTwo, int familyNum){
        father = dad;
        mother = mum;
        firstBorn = kidOne;
        secondBorn = kidTwo;
        familyNumber = familyNum;
    }
    void familyMembers(){
        System.out.println("The name of the father is " + " " + father);
        System.out.println("The name of the mother is " + " " + mother);
        System.out.println("The name of the first born child is " + " " + firstBorn);
        System.out.println("The name of the second born child is " + " " + secondBorn);
        System.out.println("This nuclear family has " + " " + familyNumber + " " + "members");
    }
    }
    /*
     * ----- using constructors -----
     * - cosntructors are called when an instance of a class is created.
     * - it is used to initialize the object
     * - default constructor's are created at compilation time and memory for the object is created in the memory
     * 
     * - types are: 
     *      - no-arg/default constructor
     *      - parameterilized constructor
     * 
     * - constructor overloading
     * - this is a method of having more than one constructor with different parameter lists
     * - their arrangement is in such a way that every constructor performs a distinct tasks
     * - they can be of different types
     */

    public class Company{
        String name;
        String location;
        String director;
        String manager;
        // String employees;
        String[] employees = new String[4];

        

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        Company(String regName, String countyName){
            name = regName;
            location = countyName;
        }

        Company(String directorName, String managerName, String[] employeeNames){
            director = directorName;
            manager = managerName;
            employees =  employeeNames;
        }

        void mainCompany(){
            System.out.println(this.name);
            System.out.println(this.location);
            System.out.println(this.director);
            // System.out.println(Company);

            // System.out.println("The name of the company is ".concat(name).concat("and it is located at").concat(location));
        }
        /*
         * - Company() are parameterilized constructors
         * - they are of two types:
         *      - Strings and arrays
         * 
         * - to use them, we have to initialize the object Company and call them within a method preferably the main() method
         */
    }

}