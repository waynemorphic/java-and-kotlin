package programs;
/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.

Sample Input

madam

Sample Output

Yes
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        String res = scan.next();
        scan.close();
        
        List<String> rev = new ArrayList<>();
        List<String> alphs = new ArrayList<>();
        String[] arr = res.split("");

        for (String i : arr){
            rev.add(i);
            alphs.add(i);
        }
        Collections.reverse(rev);

        if (alphs.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
