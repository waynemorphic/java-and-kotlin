package programs;

import java.util.Scanner;

public class CompareStrings {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";        
        String entry = s.replace(" ", "");
        int len = entry.length();
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i < len; i++){
            String subA = entry.substring(0, k);
            String subB = entry.substring(i, k);
            System.out.println(subA);
            System.out.println(subB);

            if (subA.compareTo(subB) < subB.compareTo(subA)){
                smallest = subA;
                largest = subB;
            }
            else{
                smallest = subB;
                largest = subA;
            }            
        }
        // System.out.println( smallest + "\n" + largest);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}