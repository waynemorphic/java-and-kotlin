/*
* ---- polymorphism in java ----
* - concept that refers to performing an action in different ways
* - polymorphism in java is achieved through method overloading and method overriding
* - the two types of polymorphism are:
*   1. compile time polymorphism
*   2. runtime polymorphism
*
* -- runtime polymorphism
* - also referred to as dynamic method dispatch is a process where an overridden method is resolved at runtime
*   rather than compile time
* - an overridden method is called through a reference variable of a superclass
*
* --- upcasting
* - occurs where the reference variable of a parent class refers to the object of the child class
* ---- example of upcasting:
*       class A{
*       }
*       class B extends A{
*       }
*       A a = new B(); --> this is upcasting
* */

/*
* - in this example, I will use an example of a good sold by a whole seller and a retailer
* - the whole seller sells it at a fixed price to all retailers, but the retailers sell it a different prices
* */
package learning.java;

public class jPolymorphism {
    public static void main(String[] args){
       NationalOil diesel;
       diesel = new Shell();
       System.out.println("The price of diesel at Shell fuel station is " + diesel.dieselPrice());

       diesel = new Kenol();
       System.out.println("The price of diesel at Kenol fuel station is " + diesel.dieselPrice());
    }
}

class NationalOil{
    double dieselPrice(){
        return 95.98;
    }
}
class Shell extends NationalOil{
    @Override
    double dieselPrice(){
        return 103.4;
    }
}
class Kenol extends NationalOil{
    @Override
    double dieselPrice(){
        return 103.67;
    }
}

/*
* ---- compile time polymorphism ----
* - programs encounter compile time polymorphism at the compilation stage
* - in compile time polymorphism, the overloading method occurs at compilation stage
* - method overloading occurs where a method has a similar name to another method within the same class
* - method overloading requires object instantiation
* */