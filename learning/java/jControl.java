/*
 * References
 * https://www.javatpoint.com/object-and-class-in-java
 * https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 * 
 */

package learning;

public class jControl {
    String address;
    public static void main(String[] args) {
        
        // nested if statements
        String address = "Kiambu, Ruiru";

        if (address.endsWith("Ruiru")){
            if (address.contains("Kihunguro")){
                System.out.println("Your estate is Kihunguro");                
            }
            else if (address.contains("ByPass")){
                System.out.println("Your estate is Bypass");
            }
            else {
                System.out.println(address.split(",")[0]);
            }
        }
        /*
         * Here, we have used several string methods like; 
         * a. endsWith()
         * b. contains()
         * c. split()
         */

        //  for each loop
        String[] programmingLanguages = {"Java", "C", "Python"};
        System.out.println("We are printing the programming languages elements in the array");

        for (String language : programmingLanguages){
            System.out.println(language);
        }
        /*
         * The syntax of for each loop is:
         * for (data_type Var : array_name){
         * statements
         * }
         */

        //  while loop

        int n = 0;
        int sum = 0;
        System.out.println("Printing the first five numbers");

        while (n <= 5){
            System.out.println(n);
            n = n + 1;
            sum = sum + n;
        }
        System.out.println("The sum of the first five numbers is " + sum);


        /*
         * While loop is used to iterate a number of statements when number of iterations is unknown in advance
         * syntax is:
         * while (condition){
         * statements
         * }
         */


        // for loop
        System.out.println("Printing the sum of the first seven numbers");
        int i;
        for (i = 0; i <= 7; i++){
            sum = sum + i;
        }
        System.out.println("The sum of the first seven natural numbers is " + sum);


        // do while loop
        int x = 1;
        System.out.println("Printing the first ten odd numbers");
        do {
            System.out.println(x);
            x = x + 2;
        }
        while (x <= 10);
    
        /*
         * - do while checks the condition at the end of the loop after executing the loop statements.
         * - Used when the number of iteration is unknown and have to execute the loop at least once.
         */     

    }
}


