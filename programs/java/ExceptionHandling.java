package programs.java;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors.
 * The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers x and y as input, you have to compute x/y. 
If x and y are not 32 bit signed integers or if y is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

Sample Input 0:
10
3

Sample Output 0:
3

Sample Input 1:
10
Hello

Sample Output 1:
java.util.InputMismatchException

Sample Input 2:
10
0

Sample Output 2:
java.lang.ArithmeticException: / by zero

Sample Input 3:
23.323
0

Sample Output 3:
java.util.InputMismatchException

 */
public class ExceptionHandling {
    public static void main(String[] args) throws InputMismatchException{
        System.out.println("Enter something");

        try(Scanner scan = new Scanner(System.in)){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int checkMin = Integer.MIN_VALUE;
            int checkMax = Integer.MAX_VALUE;
            scan.close();

            if (x < checkMin || x > checkMax && y < checkMin || y > checkMax){
                throw new Exception();
            }
            else{
                System.out.println(x/y);
            }
        }            
            catch(InputMismatchException e){
                System.out.println("InputMismatchException occurred: " + e);
            }
            catch(Exception f){
                System.out.println("Exception occurred: " + f);
            }                
    }
}
