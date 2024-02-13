package programs.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CompareStrings {
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'

    public static String getSmallestAndLargest(String s, int k){
        String smallest = "";
        String largest = "";        
        int len = s.length();
        List<String> strs = new ArrayList<>();

        for (int i = 0; i < len; i++){
            for (int j = i + k; j < len; j++){
                String out = s.substring(i, j);
                if (out.length() == 3){
                    strs.add(out);
                }
            }

            Collections.sort(strs);  
            smallest = strs.get(0);
            largest = strs.get(strs.size() - 1);
        }
        // System.out.println( smallest + "\n" + largest);
        return smallest + "\n" + largest;
    }

    public static String getComparator(String s, int k){
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        int len = s.length();

        for (int i = 1; i < len - k; i++){
            String out = s.substring(i, i + k);
            if (out.compareTo(smallest) < 0){
                smallest = out;
            }
            else if (out.compareTo(largest) > 0){
                largest = out;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            String s = scan.next();
            int k = scan.nextInt();
      
            System.out.println("Method one: " + getSmallestAndLargest(s, k));
            System.out.println("Method 2: " + getComparator(s, k));
            
        } catch (InputMismatchException e) {
            System.out.println("Input should not have spaces: " + e);
        }
        
    }
}