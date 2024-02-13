package programs.java;

/*
 * There is a collection of input strings and a collection of query strings. For each 
 * query string, determine how many times it occurs in the list of input strings. 
 * Return an array of the results.

Example
stringList = ["ab", "ab", "abc"]

queries = ["ab", "abc", "bc"]

There are 2 instances of 'ab', 1 of 'bc' and 0 of 'bc'. For each query, add an element
 to the return array, results = [2, 1, 0].

Function Description

Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in stringList.

matchingStrings has the following parameters:

string stringList[n] - an array of strings to search
string queries[q] - an array of query strings
Returns

int[q]: an array of results for each query
 */

import java.util.*;

public class MatchingStrings {
    public static List<Integer> matchingStrings(List<String> stringList, List<String>queries){
        int count = 0;
        List<Integer> occurence = new ArrayList<>();
        
        for (String q: queries){
            count = Collections.frequency(stringList, q);
            occurence.add(count);
        }
        return occurence;
    }

    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        stringList.add("ab");
        stringList.add("ab");
        stringList.add("abc");

        List<String> queries = new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");

        System.out.println(MatchingStrings.matchingStrings(stringList, queries));
    }
}
