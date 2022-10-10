/*
* ----- Java Abstract classes -----
* - these are classes declared with the abstract keyword
* - they can have abstract and non-abstract methods
* - should be extended and its method implemented
* - abstract classes cannot be instantiated
* - it can have constructors and static methods
* - can have final methods that will force the subclass not to change the method's body
*
* -- abstraction
* - this is hiding the details of implementation and only showing its functionality
* - it lets you focus on what the object does instead of the inner intricacies of how of it does it
* - abstraction is achieved through:
*   1. abstract class
*   2. interface
*
* --- abstract methods
* - abstract methods within abstract classes are declared with abstract keyword and do not have an implementation
* - the methods are however implemented in other sub-classes where the parent class is extended
* - in the subclass where the parent abstract class, with abstract method is extended, it needs to have the
*   implementation of the abstract method and the class made abstract
* - abstract methods SHOULD be in an abstract classes
* -- syntax:
*       abstract void <methodName>(){
*           no method body;
*       }
* */

package learning;

import java.util.Arrays;

public class AbstractClass {
    public static void main(String[] args){
    Brands brandsInstance = new Samsung();

    // calling the abstract and non-abstract methods
        brandsInstance.phoneBrands();
        brandsInstance.brandTypes();
    }
}

/* - for the arrays declared as types Strings, the calls use Arrays.toString() method
*    to resolve the issue of implicit call to array 'toString()'
*    this means that any non string element in the array will be converted to a string
*/
abstract class Brands{
    abstract void phoneBrands();
    void brandTypes(){
        String[] phoneTypes = {"Samsung", "Nokia", "iPhone", "Huawei"};
        System.out.println(Arrays.toString(phoneTypes));
    }
}

class Samsung extends Brands{
    void phoneBrands(){
        String[] samsungPhones = {"Galaxy A series", "Galaxy Note series", "Galaxy fold series"};
        System.out.println(Arrays.toString(samsungPhones));
    }
}
