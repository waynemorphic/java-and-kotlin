/*
 * ---- inheritance in java
 * - mechanism in which one object acquires all the properties and behaviours of a parent object
 * - idea is that you can create new classes built upon existing classes
 * - by inheriting from an existing class, you can resue methods and fields of the parent class and add new methods and 
 *   fields to your current class
 * - used for method overriding to achieve runtime polymorphism and for code reusabilty
 * 
 * -- terms used
 * 1. class
 *      - group objects with common properties
 *      - template for creating objects
 * 
 * 2. sub class/child class
 *      - class that inherits the other class
 *      - also referred to as derived/extended class
 * 
 * 3. super class/parent class
 *      - class where subclass/extended class inherits its features
 * 
 * 4. extends
 *      - it indicates that you are making a new class that derives from an existing class
 *      - in other words, extends means, to increase functionality
 * 
 * -- syntax
 *      class SubclassName extends SuperClassName{
 *          methods and fields
 *      }
 * 
 * -- types of class inheritance
 * 1. Single
 * 2. Multilevel
 * 3. Hierarchical
 * *** multiple class inheritance is not allowed in java ie, one class inheriting multiple classes
 * 
 */

package learning;

public class Inheritance {    
    public static void main(String[] args){
        BeneficiaryClass beneficiaryObject = new BeneficiaryClass();
        beneficiaryObject.inherittedMoney();
        beneficiaryObject.money();
    }    
}

    /*
     * ----- singe inheritance -----
     * - happens when a class inherits another class
     * - class BeneficiaryClass inherits the TestingInheritance class
     */

class TestingInheritance{
    void money(){
        System.out.println("John has left behind an inheritance of 300/= shillings");
    }    
}     

class BeneficiaryClass extends TestingInheritance{
    void inherittedMoney(){
        System.out.println("Baby James inherits 300/= from John");
    }
}

/*
 * ----- multilevel inheritance -----
 * - happens when there is a chain of inheritance
 * - class A is the highest class level with the main method
 * - class C inherits from class B 
 * - class D then inherits from class C
 * - we then create a class instance for class D
 * - we then initialize the class D object with the methods created for class C and D
 * 
 * -- example
 * public class A{
 *      public static void main(String[] args){
 *      D dClassInstance = new D();
 * 
 *      dClassInstance.bMethod();
 *      dClassInstance.cMethod();
 *      dClassInstance.dMethod();
 *      }
 * }
 * 
 * public class B{
 *      void bMethod(){
 *          System.out.println("Class B method");
 *      }
 * }
 * 
 * public class C extends B{
 *      void cMethod(){
 *          System.out.println("Class C method");
 *      }
 * }
 * 
 * public class D extends C{
 *      void dMethod(){
 *          System.out.println("Class D method");
 *      }
 * }
 *
 */

/*
* ----- hierarchical inheritance -----
* - happens when two or more classes inherit one class
* - class A is the highest class level with the main method
* - class C inherits from class B
* - class D inherits from class B
*/ 
    

