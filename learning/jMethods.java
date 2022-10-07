/*
 * References
 * https://www.javatpoint.com/object-and-class-in-java
 * https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 * 
 */

/*
* - methods declaration syntax is:
        public int sum (int a, int b){
            statements
        }
        where : 
            - public is an access modifier
            - int is the return type
            - sum is the name of the method
            - int a, int b are the parameters

* - some types of access modifiers include:
        - public: method is accessible by all classes
        - private: method is accessible only in classes it is defined
        - protected: method is accessible within the same package or subclasses in a different package
        - default: when none of the modifiers are used, default is used meaning method is accessible from the same package only
        
* - method overloading is the case where a method has another name as another method

* - types of methods are:
        - predefined method
            - built-in methods ie length() and other Math methods
        - user-defined method
            - defined accroding to the user requirements

* - static key word
*       - a method with the keyword 'static' is one that belongs to a class rather than an instance of a class
*       - its advantage is that it can be called without creating an object
*       - static methods can only access static data members

* - instance method
*       - this is a method of a class that is non-static and is defined in the class
*       - before it is called, an object of its class is first created
*           - there are two types of instance methods
*               - accessor method
*                   - this is the method that reads the instance variables. 
*                   - identifiable with the prefix word, get ie getMain
*                   - returns the value of the private field
*               - mutator method
*                   - reads the instance variables and can modify the values
*                   - identifiable with the prefix word set
*                   - does not return anything but accepts a parameter of the same data type that depends on the field
*                   - sets the value of the private field
* - abstract method
*       - it is declared in the abstract class and does not have a method body to implement it
*/ 

package learning;

import java.util.Scanner;

public class jMethods {

    /*
     * ------ user defined method with the key word static -----
     */
    // method for finding if number is odd or even
    public static void evenOdd(int num){
        if (num % 2 == 0){
            System.out.println("Even number " + " " + num + " " + "entered");
        }
        System.out.println("Odd number " + " " + num + " " + "entered");
    }

    /*
     * ----- instance method that first requires instance of a class before it is invoked ----     
     */

    public class AddingNumbers{
        int a;
        int b;
        int c;

        public int mainAddition(int num1, int num2){
            a = num1;
            b = num2;
            c = num1 + num2;
            return c;
        }
        void addedNumbers(){
            System.out.println("The sum of the numbers entered is " + " " + c);
        }
    }
    public static void main(String[] args){
        // new scanner class instance
        Scanner numberEntry = new Scanner(System.in);
        System.out.println("Enter a number: ");

        // reading user entered number
        int res = numberEntry.nextInt();

        // calling the evenOdd() user defined method
        evenOdd(res);

        /*
         * --- instance of the class AddingNumbers
         * 
         * - we have two classes, where one class is the parent class and the other is the child class
         * - first we create the instance of the parent class
         * - then use the instance of the parent class to create the instance of the child class
         * 
         * - we use the builtin class scanner to ask for user's response
         * 
         * - call the instance method using the object created from the scanner class
         */
        jMethods jMethodsInstance = new jMethods();
        AddingNumbers additionInstance = jMethodsInstance.new AddingNumbers();

        Scanner additionEntry1 = new Scanner(System.in);
        System.out.println("Enter first number to calculate sum: ");
        int sumRes1 = additionEntry1.nextInt();

        Scanner additionEntry2 = new Scanner(System.in);
        System.out.println("Enter second number to calculate sum: ");
        int sumRes2 = additionEntry2.nextInt();

        // calling the instance method
        additionInstance.mainAddition(sumRes1, sumRes2);
        additionInstance.addedNumbers();

    }
}
