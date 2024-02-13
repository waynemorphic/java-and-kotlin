package programs.java;

import java.util.Scanner;

/*
 * This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"

The elements of a String are called characters. The number of characters in a String is called the length, and it can be 
retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations:

- Sum the lengths of A and B.
- Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
- Capitalize the first letter in A and B and print them on a single line, separated by a space.

Input Format

The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase 
English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input 0

hello
java

Sample Output 0

9
No
Hello Java

Explanation 0

String A is "hello" and B is "java".

A has a length of 5, and B has a length of 4; the sum of their lengths is 9.
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A is not greater than B and the answer is No.

When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".
 */

public class BasicStrings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        int sum = A.length() + B.length();
        System.out.println(sum);

        int compA = A.compareTo(B);
        int compB = B.compareTo(A);

        if (compA > compB){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        String capA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capB = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(capA + " " + capB);
    }
}
