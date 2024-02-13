package programs;

/*
 * Two strings, a and b, are called anagrams if they contain all the same characters in 
 * the same frequencies. For this challenge, the test is not case-sensitive. 
 * For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings a and b consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana

Sample Output 0

Anagrams

Sample Input 1

anagramm
marganaa

Sample Output 1

Not Anagrams
 */

import java.util.Scanner;

public class SimpleCompare {
    static boolean isAnagram(String one, String two){
        boolean anagram = false; 

        if(one.compareToIgnoreCase(two) == 0){
            anagram = true;
            System.out.println("Anagram");
            return anagram;
        }
        System.out.println("Not Anagram");
        return anagram;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String one = scan.next();
        String two = scan.next();
        scan.close();

        System.out.println(SimpleCompare.isAnagram(one, two));
    }
}
