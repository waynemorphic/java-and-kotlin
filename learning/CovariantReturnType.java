/*
* ---- covariant return type ----
* - the covariant return type specifies that the return type may vary in the same direction as the subclass
* - it is a return type, of an overriding method
* - it only works for non-primitive data types
* - non-primitive data types are;
*       - class
*       - object
*       - string
*       - array
*       - interface
 */

package learning;

import java.lang.reflect.Executable;
import java.security.Signature;

public class CovariantReturnType {
    public static void main(String[] args){
        ExtendedFamily extendedInstance = new ExtendedFamily();
        extendedInstance.familyDetails().print();

        NuclearFamily nuclearInstance = new NuclearFamily();
        nuclearInstance.familyDetails().print();

        SingleFamily singleInstance = new SingleFamily();
        singleInstance.familyDetails().print();
    }
}
class ExtendedFamily{
    ExtendedFamily familyDetails(){
        return this;
    }
    void print(){
        System.out.println("This is the parent class called the ExtendedFamily");
    }
}

class NuclearFamily extends ExtendedFamily{
    @Override
    NuclearFamily familyDetails(){
        return this;
    }
    void print(){
        System.out.println("This class inheritance overrides the return type in the ExtendedFamily method");
    }
}

class SingleFamily extends NuclearFamily{
    @Override
    SingleFamily familyDetails(){
        return this;
    }
    void print(){
        System.out.println("This class overrides the method in the NuclearFamily class");
    }
}