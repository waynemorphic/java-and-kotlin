/*
* ---- Interface in java ----
* - it is a blueprint of a class with static constants and abstract methods
* - used to achieve abstraction and multiple inheritance in java
* - they can have abstract methods and variables but cannot have a method body
* - however, if they have a method body, then the method needs to have a default keyword
* - they can also have static methods
* - cannot be instantiated, just as is the case in an abstract class
*
* --- why use interface in java
*   1. for abstraction purposes
*   2. supports multiple inheritance that is not supported in class inheritance
*   3. helps achieve loose coupling
*
* --- syntax:
*   interface <interface_name>{
*   constant fields
*   abstract methods
*   }
*
* --- note
* - a class extends another class, an interface extends another interface but a class implements an interface
* */

package learning.java;

public class jInterface {
    public static void main(String[] args){
        MainInterface myInterfaceInstance = new MyDance();
        myInterfaceInstance.dance();
        myInterfaceInstance.defaultDance();
    }
}

interface MainInterface {
    void dance();

    default void defaultDance(){
        System.out.println("The only dance i know is Odi dance");
    }
}

class MyDance implements MainInterface{
    public void dance(){
        System.out.println("Other kenyan dances are slow-rhumba and chakacha");
    }
}

