/*
 * - aggregation is when a class has entity reference
 * - entity reference is when an object A contains a reference to another object B. This means that object A has a
 *   HAS-A relationship with object B 
 */

package learning;

public class Aggregation{
    public static void main(String[] args){

        Circle circle1 = new Circle();
        double resArea = circle1.circleArea(7);
        System.out.print("The area of the circle is " + (resArea));
    }
}

class MathOperation{
    int square(int n){ // aggregation
        return n * n;
    }
}

class Circle{
    MathOperation operationSquare;
    final double PI = 3.14312;

    // code reusabilty
    double circleArea(int radius){
        operationSquare = new MathOperation();
        int radiusSquare = operationSquare.square(radius);
        return PI * radiusSquare;
    }
}
