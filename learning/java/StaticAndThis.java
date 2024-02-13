package learning.java;

public class StaticAndThis {
    /*
    * References
    * -- javatpoint.com
    * -- digitalocean.com/community/tutorials/static-keyword-in-java
    * 
     * ------ the static keyword -----
     * - used for memory management
     * - can be applied with:
     *  - variables
     *  - methods
     *  - blocks
     *  - nested classes
     *  - interface static method
     * - belongs to class than an instance of a class/object
     * 
     * 1. static variables
     * - it is a class variable and does not belong to object/instance of the class
     * - can be used to refer to the common property of all objects (not unique for each object)
     * - static variable gets memory once in the class area at the loading time thus saves memory
     * - if static keyword is not used, the variable will get memory each time the class instance is created
     * - they are used with the final keyword for common resources or constants that can be used by all objects
     * --- syntax 
     *      static <data type> <name>;
     *      <modifier> static <data type> <name>;
     *      - if static variable does not have a private access modifier, it can be accessed with ClassName.variableName
     * 
     * 2. static methods
     * - if static keyword is applied in the declaration of a method, then it is known as a static method
     * - the static method belongs to the class rather than the object of a class
     * - can be invoked without the need for creating an instance of a class
     * - can access static data member and can change its value
     * ---- restrictions
     *      - cannot use non static data member or call non-static method directly
     *      - this and super cannot be used in the static context
     * - java main method is static because the object is not required to call a static method
     * 
     * 3. static block
     * - used to initialize the static data member or static variables of the class
     * - is executed before the main method at the time of classloading
     * - there can be multiple static blocks in a class but its not practical
     * 
     * 4. static class
     * - static keyword can be used with nested classes but not in top level classes
     * ----- syntax
     *       public class <ClassName>{
     *          public static class <StaticClassName>{
     *          }
     *       }
     * 
     * 5. static imports in java
     * - we can import static variables and methods in java to avoid class reference
     * -----syntax
     *      import static <path to the class package(ending with the static class.static variable)>
     *          ie import static learning.ClassName.staticVariableName/staticMethodName
     */


    /* ------ this keyword in java -----
     * - it is a reference variable that refers to the current object
     * - its applications:
     *  - used to refer to current class instance variable
     *  - used to invoke current class method implicitly
     *  - this() can be used to invoke current class constructor
     *  - can be passed as an argument in the method call
     *  - can be passed as an argument in the constructor call
     *  - can be used to return the current class instance from the method
     * 
     */

    /*
     * --- current class instance variables
     */
    class Square{
        int width;
        int height;

        Square(int width, int height){
            this.width = width;
            this.height = height;
        }
        /*
         * - in this program, instance variables/member variables and parameters/local variables are similar
         * - this keyword is used to distinguish between parameters in the constructor and instance variables
         */

        /*
         * --- invoking current class method
         */

        int area(){
            int squareArea = width * height;
            System.out.println(squareArea);
            return squareArea;
        }

        void invokingArea(){
            this.area();
        }
    }
    public static void main(String[] args){
        // class instance of the top level class 
        StaticAndThis myInstance = new StaticAndThis();

        // class instance of the nested class
        Square squareObject = myInstance.new Square(10, 10);
        squareObject.invokingArea();
    }
}
    