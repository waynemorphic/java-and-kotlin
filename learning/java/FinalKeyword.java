/*
* --- final keyword
* - the final keyword can be used with different data types to restrict the user
* - these data types include:
*   1. variables
*   2. parameters
*   3. classes
*   4. methods
*
* --- final variable
* - if a variable is made final, it cannot be changed. This means that, it is made a constant
* - syntax: final <data type> nameOfVariable;
*
* --- final method
* - if a method is made final, you cannot override it
* - a final method can however be inherited
* - syntax: final <data type/void> <method name>;
*
* --- final classes
* - a final class cannot be inherited or rather extended
* - syntax: final class <class name>
*
* - if a class is final, then by default, its methods are also final. No need to add final keyword to
*   the methods.
* */

package learning.java;


public class FinalKeyword {
    public static void main(String[] args){

    }
}

final class ComputerBrands{
    void Hp(){
        final String elitebook = "Hp Elitebook folio";
        final int elitebookPrice = 9000;
    }
}
